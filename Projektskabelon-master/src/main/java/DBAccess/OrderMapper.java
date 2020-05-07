package DBAccess;

import FunctionLayer.LoginSampleException;

import java.sql.*;

public class OrderMapper {


    public static int[] insertCarport(String carport_type, boolean hasToolShed, int user_id, int carport_length_id, int carport_width_id, int carport_tilt_id, int carport_rooftype_id, int toolshed_length_id, int toolshed_width_id) throws LoginSampleException {

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

                    SQL = "INSERT INTO orders (user_id, carport_id, carport_length_id, carport_width_id, carport_rooftype_id) VALUES (?,?,?,?,?)";

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
}