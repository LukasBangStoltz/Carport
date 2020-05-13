package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Request;
import FunctionLayer.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RequestMapper {

    public static List<Request> getAllRequests() throws LoginSampleException, SQLException, ClassNotFoundException {

        List<Request> requestList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders"
                    + "WHERE is_authorized = false";
            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int order_id = rs.getInt("order_id");
                int user_id = rs.getInt("user_id");

                if (requestList == null) {
                    requestList = new ArrayList<>();
                }

                Request r = new Request(order_id, user_id);
                requestList.add(r);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return requestList;
    }
}
