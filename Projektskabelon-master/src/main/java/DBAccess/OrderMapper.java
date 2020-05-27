package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Material;
import FunctionLayer.Order;

import java.sql.*;
import java.util.ArrayList;


/**
 * En klasse vi bruger til at opererer med databasen, herunder tabels: carport og orders
 */




public class OrderMapper {

    /**
     *
     * @param carport_type
     * @param hasToolShed
     * @param user_id
     * @param carport_length_id
     * @param carport_width_id
     * @param carport_tilt_id
     * @param carport_rooftype_id
     * @param toolshed_length_id
     * @param toolshed_width_id
     * @return int[] array der består af det genererede carportId på første indeks og det generede orderId på andet indeks.
     * @throws LoginSampleException
     */


    public static int[] insertCarportAndOrder(String carport_type, boolean hasToolShed, int user_id, int carport_length_id, int carport_width_id, int carport_tilt_id, int carport_rooftype_id, int toolshed_length_id, int toolshed_width_id) throws LoginSampleException {

        int orderID;
        int carport_id;
        int[] IDs = new int[2];

        try {

            Connection con = Connector.connection();
            String SQL = "INSERT INTO carport (carport_type, toolshed) VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, carport_type);
            ps.setBoolean(2, hasToolShed);
            ps.executeUpdate();

            ResultSet ids = ps.getGeneratedKeys();

            if (ids.next()) {
                carport_id = ids.getInt(1);
                IDs[0] = carport_id;


                if (carport_type.equals("flatroof")) {

                    SQL = "INSERT INTO orders (user_id, carport_id, carport_length_id, carport_width_id, carport_rooftype_id) " +
                            "VALUES (?,?,?,?,?)";

                    ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);


                    ps.setInt(1, user_id);
                    ps.setInt(2, carport_id);
                    ps.setInt(3, carport_length_id);
                    ps.setInt(4, carport_width_id);
                    ps.setInt(5, carport_rooftype_id);

                    ps.executeUpdate();


                } else {

                    SQL = "INSERT INTO orders (user_id, carport_id, carport_length_id, carport_width_id, carport_tilt_id, carport_rooftype_id) VALUES (?,?,?,?,?,?)";


                    ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);


                    ps.setInt(1, user_id);
                    ps.setInt(2, carport_id);
                    ps.setInt(3, carport_length_id);
                    ps.setInt(4, carport_width_id);
                    ps.setInt(5, carport_tilt_id);
                    ps.setInt(6, carport_rooftype_id);

                    ps.executeUpdate();


                }
            }


            ids = ps.getGeneratedKeys();
            if (ids.next()) {
                orderID = ids.getInt(1);
                IDs[1] = orderID;
                System.out.println(orderID);
            }


        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());

        }

        return IDs;
    }

    /**
     *
     * @param carport_type
     * @param hasToolShed
     * @param user_id
     * @param carport_length_id
     * @param carport_width_id
     * @param carport_tilt_id
     * @param carport_rooftype_id
     * @param toolshed_length_id
     * @param toolshed_width_id
     * @return int[] array der består af det genererede carportId på første indeks og det generede orderId på andet indeks.
     * @throws LoginSampleException
     */

    public static int[] insertCarportWithToolShed(String carport_type, boolean hasToolShed, int user_id, int carport_length_id, int carport_width_id, int carport_tilt_id, int carport_rooftype_id, int toolshed_length_id, int toolshed_width_id) throws LoginSampleException {

        int orderID;
        int carport_id;
        int[] IDs = new int[2];

        try {

            Connection con = Connector.connection();
            String SQL = "INSERT INTO carport (carport_type, toolshed) VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, carport_type);
            ps.setBoolean(2, hasToolShed);
            ps.executeUpdate();

            ResultSet ids = ps.getGeneratedKeys();

            if (ids.next()) {
                carport_id = ids.getInt(1);
                IDs[0] = carport_id;
                System.out.println(carport_id);

                if (carport_type.equals("flatroof")) {

                    SQL = "INSERT INTO orders (user_id, carport_id, carport_length_id, carport_width_id, carport_rooftype_id, toolshed_length_id, toolshed_width_id) VALUES (?,?,?,?,?,?,?)";

                    ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);


                    ps.setInt(1, user_id);
                    ps.setInt(2, carport_id);
                    ps.setInt(3, carport_length_id);
                    ps.setInt(4, carport_width_id);
                    ps.setInt(5, carport_rooftype_id);
                    ps.setInt(6, toolshed_length_id);
                    ps.setInt(7, toolshed_width_id);


                    ps.executeUpdate();


                } else {

                    SQL = "INSERT INTO orders (user_id, carport_id, carport_length_id, carport_width_id, carport_tilt_id, carport_rooftype_id, toolshed_length_id, toolshed_width_id) VALUES (?,?,?,?,?,?,?,?)";


                    ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);


                    ps.setInt(1, user_id);
                    ps.setInt(2, carport_id);
                    ps.setInt(3, carport_length_id);
                    ps.setInt(4, carport_width_id);
                    ps.setInt(5, carport_tilt_id);
                    ps.setInt(6, carport_rooftype_id);
                    ps.setInt(7, toolshed_length_id);
                    ps.setInt(8, toolshed_width_id);

                    ps.executeUpdate();


                }
            }

            ids = ps.getGeneratedKeys();
            if (ids.next()) {
                orderID = ids.getInt(1);
                IDs[1] = orderID;
                System.out.println(orderID);
            }


        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());

        }

        return IDs;
    }

    public static Order getOrder(int orderId) throws LoginSampleException {

        Order order = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders WHERE order_id=?";

            PreparedStatement ps = con.prepareStatement(SQL);

            ps.setInt(1, orderId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int carportLengthId = rs.getInt("carport_length_id");
                int carportWidthId = rs.getInt("carport_width_id");
                int carportTiltId = rs.getInt("carport_tilt_id");
                int carportRoofTypeId = rs.getInt("carport_rooftype_id");
                int toolshedLengthId = rs.getInt("toolshed_length_id");
                int toolshedWidthId = rs.getInt("toolshed_width_id");

                // Carport flad
                if (carportTiltId == 0 && toolshedLengthId == 0) {
                    order = new Order(carportLengthId, carportWidthId, carportRoofTypeId);
                }
                // Carport hældning
                if (carportTiltId != 0 && toolshedLengthId == 0) {
                    order = new Order(carportLengthId, carportWidthId, carportRoofTypeId, carportTiltId);
                }
                // Carport flad med skur
                if (carportTiltId == 0 && toolshedLengthId != 0) {
                    order = new Order(carportLengthId, carportWidthId, carportRoofTypeId, toolshedLengthId, toolshedWidthId);
                } else {
                    // carport hældning med skur
                    order = new Order(carportLengthId, carportWidthId, carportRoofTypeId, carportTiltId, toolshedLengthId, toolshedWidthId);
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }

        return order;

    }

}

