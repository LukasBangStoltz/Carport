package DBAccess;

import FunctionLayer.LoginSampleException;

import java.sql.*;

public class OrderMapper {


    public static int insertCarportNoToolShed(String carport_type, int user_id, int carport_length_id, int carport_width_id, int carport_tilt_id, int carport_rooftype_id) throws LoginSampleException {
        int orderID;

        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO carport (carport_type) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, carport_type);
            ps.executeUpdate();

            ResultSet ids = ps.getGeneratedKeys();

            int carport_id = ids.getInt(1);


            SQL = "INSERT INTO ordrer (user_id, carport_id, carport_length_id, carport_width_id, carport_tilt_id, carport_rooftype_id) VALUES (?,?,?,?,?,?)";

            ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);


            ps.setInt(1, user_id);
            ps.setInt(2, carport_id);
            ps.setInt(3, carport_length_id);
            ps.setInt(4, carport_width_id);
            ps.setInt(5,carport_tilt_id);
            ps.setInt(6, carport_rooftype_id);

            ps.executeUpdate();

            ids = ps.getGeneratedKeys();
            orderID = ids.getInt(1);

        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }

        return orderID;
    }
}
