package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;

public class UserMapperTest {

    private static Connection testConnection;
    private static String USER = "tue";
    private static String USERPW = "MitPassword1234/";
    private static String DBNAME = "test_carport";
    private static String HOST = "188.166.61.197";

    @Before
    public void setUp() {
        try {
            // awoid making a new connection for each test
            if ( testConnection == null ) {
                String url = String.format( "jdbc:mysql://%s:3306/%s", HOST, DBNAME );
                Class.forName( "com.mysql.cj.jdbc.Driver" );

                testConnection = DriverManager.getConnection( url, USER, USERPW );
                // Make mappers use test 
                Connector.setConnection( testConnection );
            }
            // reset test database
            try ( Statement stmt = testConnection.createStatement() ) {
                stmt.execute( "drop table if exists user" );
                stmt.execute( "create table user like carport.user" );
                stmt.execute( "insert into user VALUES " +
                        "(1, 'jens', 'vej', '40', 'email', 'password', 'by', 'role'), "+
                        "(2, 'Phillip Andersen', 'Tornehegnet 7', '42913009', 'phillip_andersen@hotmail.com', 'Taastrup', '1234', 'customer')");

            }

        } catch ( ClassNotFoundException | SQLException ex ) {
            testConnection = null;
            System.out.println( "Could not open connection to database: " + ex.getMessage() );
        }
    }

    @Test
    public void testSetUpOK() {
        // Just check that we have a connection.
        assertNotNull( testConnection );
    }

    @Test
    public void testLogin01() throws LoginSampleException {
        // Can we log in
        User user = UserMapper.login( "phillip_andersen@hotmail.com", "Taastrup" );
        assertTrue( user != null );
    }

    @Test( expected = LoginSampleException.class )
    public void testLogin02() throws LoginSampleException {
        // We should get an exception if we use the wrong password
        User user = UserMapper.login( "phillip_andersen@hotmail.com", "1234" );
    }

    @Test
    public void testLogin03() throws LoginSampleException {
        // phillip is supposed to be a customer
        User user = UserMapper.login( "phillip_andersen@hotmail.com", "Taastrup" );
        assertEquals( "customer", user.getRole() );
    }

    @Test
    public void testGetUserId(){
        String email = "phillip_andersen@hotmail.com";
        int userId = UserMapper.getUserId(email);
        int userIdExpected = 2;
        assertEquals(userIdExpected, userId);
    }

    @Test
    public void testCreateUser01() throws LoginSampleException {
        // Can we create a new user - Notice, if login fails, this will fail
        // but so would login01, so this is OK
        User original = new User( "king", "uhahvorhemmeligt", "43323213", "king@kong.com", "king1", "København", "king" );
        UserMapper.createUser( original );
        User retrieved = UserMapper.login( "king@kong.com", "king1" );
        assertEquals( "king", retrieved.getRole() );
    }

    @Test
    public void testGetAllUsers() throws LoginSampleException {
      //Vi fylder en liste med alle users
        List<User> userList = UserMapper.getAllUsers();
        // vi tjekker nu om listen har det korrekte antal users
        assertThat(userList, hasSize(2));
    }

}
