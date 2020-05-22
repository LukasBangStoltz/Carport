package DBAccess;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Request;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static org.hamcrest.Matchers.*;
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
            if (testConnection == null) {
                String url = String.format("jdbc:mysql://%s:3306/%s", HOST, DBNAME);
                Class.forName("com.mysql.cj.jdbc.Driver");

                testConnection = DriverManager.getConnection(url, USER, USERPW);
                // Make mappers use test
                Connector.setConnection(testConnection);
            }
            // reset test database
            try (Statement stmt = testConnection.createStatement()) {
                stmt.execute("drop table if exists orders ");
                stmt.execute("create table orders like carport.orders");
                stmt.execute("drop table if exists carport");
                stmt.execute("create table carport like carport.carport");
                stmt.execute("insert into orders (user_id, carport_id, carport_length_id, carport_width_id, carport_rooftype_id) VALUES " +
                        "(1, 1, 1, 1, 1 )");
                stmt.execute("insert into orders (user_id, carport_id, carport_length_id, carport_width_id, carport_rooftype_id) VALUES " +
                        "(2, 2, 2, 2, 2 )");

            }

        } catch (ClassNotFoundException | SQLException ex) {
            testConnection = null;
            System.out.println("Could not open connection to database: " + ex.getMessage());
        }
    }

    @Test
    public void testSetUpOK() {
        // Just check that we have a connection.
        assertNotNull( testConnection );
    }

    @Test
    public void getAllRequestsCustomer() throws LoginSampleException, SQLException, ClassNotFoundException {
        //Tjekker om antal requst passer til en user
        int userId = 1;
        ArrayList<Request> list = (ArrayList<Request>) LogicFacade.getAllRequestsCustomer(userId);
        int expected = 1;
        assertThat(list, hasSize(expected));
    }

    @Test
    public void getAllRequestsAdmin() throws LoginSampleException, SQLException, ClassNotFoundException {

        ArrayList<Request> list = (ArrayList<Request>) LogicFacade.getAllRequestsAdmin();
        int expected = 2;
        assertThat(list, hasSize(expected));
    }

    @Test
    public void authorizeRequest() throws LoginSampleException {
        int[] ids = LogicFacade.insertCarportAndOrder("flatroof", false, 1, 2, 2, 2, 2, 0, 0);
        int orderId = ids[1];

        boolean isAuthorized = LogicFacade.checkIfAuthorized(orderId);
        assertFalse(isAuthorized);
        LogicFacade.authorizeRequest(orderId);
        isAuthorized = LogicFacade.checkIfAuthorized(orderId);
        assertTrue(isAuthorized);
    }

    @Test
    public void buyRequest() throws LoginSampleException {
        int[] ids = LogicFacade.insertCarportAndOrder("flatroof", false, 1, 2, 2, 2, 2, 0, 0);
        int orderId = ids[1];
        boolean isBought = LogicFacade.checkIfBought(orderId);
        assertFalse(isBought);
        LogicFacade.buyRequest(orderId);
        isBought = LogicFacade.checkIfBought(orderId);
        assertTrue(isBought);
    }
}
