package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Request;
import FunctionLayer.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * En klasse der opererer på databasen, specielt tabel: order
 */


public class RequestMapper {

    /**
     *
     * @param userId
     * @return List<Request> En liste af Request objekter ud fra et givent userId
     * @throws LoginSampleException
     * @throws SQLException
     * @throws ClassNotFoundException
     */

    public static List<Request> getAllRequestsCustomer(int userId) throws LoginSampleException, SQLException, ClassNotFoundException {

        List<Request> requestList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders WHERE user_id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);

            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int order_id = rs.getInt("order_id");
                int user_id = rs.getInt("user_id");
                boolean is_authorized = rs.getBoolean("is_authorized");
                boolean is_bought = rs.getBoolean("is_bought");

                if (requestList == null) {
                    requestList = new ArrayList<>();
                }

                Request r = new Request(order_id, user_id, is_authorized, is_bought);
                requestList.add(r);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return requestList;
    }

    /**
     *
     * @return List<Request> En liste af Request objekter med alle ordre/requests fra databasen.
     * @throws LoginSampleException
     * @throws SQLException
     * @throws ClassNotFoundException
     */

    public static List<Request> getAllRequestsAdmin() throws LoginSampleException, SQLException, ClassNotFoundException {

        List<Request> requestList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders";
            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int order_id = rs.getInt("order_id");
                int user_id = rs.getInt("user_id");
                boolean isAuthorized = rs.getBoolean("is_authorized");

                if (requestList == null) {
                    requestList = new ArrayList<>();
                }

                Request r = new Request(order_id, user_id, isAuthorized);
                requestList.add(r);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return requestList;
    }

    /**
     * Metode vi bruger til at godkende en ordre ud fra et givent ordreId
     * @param orderId
     * @throws LoginSampleException
     */

    public static void authorizeRequest(int orderId) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE orders SET is_authorized = true where order_id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, orderId);

            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    /**
     * Metode vi bruger til at godkende et køb fra kundens side
     * @param orderId
     * @throws LoginSampleException
     */

    public static void buyRequest(int orderId) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE orders SET is_bought = true where order_id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, orderId);

            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }

    }

    /**
     *
     * @param orderId
     * @return boolean som enten returnere true eller false, alt efter om et givent ordre er købt eller ej
     */

    public static boolean checkIfBought(int orderId) {

        boolean isBought = false;
        try {
            Connection connection = Connector.connection();
            PreparedStatement statement = connection.prepareStatement("Select * from orders where order_id = ?");
            statement.setInt(1, orderId);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                isBought = resultSet.getBoolean("is_bought");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isBought;

    }

    /**
     * Metode vi bruge til at tjekke om en ordre er godkendt eller ej
     * @param orderId
     * @return boolean som enten returnere true eller false, alt efter om et givent ordre er godkendt eller ej
     */
    public static boolean checkIfAuthorized (int orderId){

        boolean isAuthorized = false;
        try {
            Connection connection = Connector.connection();
            PreparedStatement statement = connection.prepareStatement("Select * from orders where order_id = ?");
            statement.setInt(1, orderId);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                isAuthorized = resultSet.getBoolean("is_authorized");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isAuthorized;

    }

}
