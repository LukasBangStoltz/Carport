package DBAccess;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import static org.junit.Assert.*;


public class RequestMapperTest {

    private static Connection testConnection;
    private static String USER = "tue";
    private static String USERPW = "MitPassword1234/";
    private static String DBNAME = "test_carport";
    private static String HOST = "188.166.61.197";

    @Before
    public void setUp() throws Exception {
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
                stmt.execute( "drop table if exists orders " );
                stmt.execute( "create table orders like carport.orders" );
                stmt.execute( "insert into orders select * from carport.orders" );
            }

        } catch ( ClassNotFoundException | SQLException ex ) {
            testConnection = null;
            System.out.println( "Could not open connection to database: " + ex.getMessage() );
        }
    }

    @Test
    public void getAllRequestsCustomer() {




    }

    @Test
    public void getAllRequestsAdmin() {




    }

    @Test
    public void authorizeRequest() {



    }

    @Test
    public void buyRequest() {



    }

    @Test
    public void checkIfBought() {





    }
}
