package DBAccess;

import FunctionLayer.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarportMapper {


    public static List<CarportWidth> GetAllWidths() throws LoginSampleException {
        List<CarportWidth> carportWidthList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM carport_width";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (carportWidthList == null) {
                    carportWidthList = new ArrayList<>();
                }

                int width_id = rs.getInt("width_id");
                int width_cm = rs.getInt("width_cm");
                CarportWidth carportWidth = new CarportWidth(width_id, width_cm);
                carportWidthList.add(carportWidth);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return carportWidthList;
    }

    public static List<CarportLength> GetAllLengths() throws LoginSampleException {
        List<CarportLength> carportLengthList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM carport_length";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (carportLengthList == null) {
                    carportLengthList = new ArrayList<>();
                }

                int length_id = rs.getInt("length_id");
                int length_cm = rs.getInt("length_cm");
                CarportLength carportLength = new CarportLength(length_id, length_cm);
                carportLengthList.add(carportLength);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return carportLengthList;
    }

    public static List<RoofType> GetAllFlatRoofTypes() throws LoginSampleException {
        List<RoofType> flatRoofTypeList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM rooftype where carport_type = 'flat'";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (flatRoofTypeList == null) {
                    flatRoofTypeList = new ArrayList<>();
                }

                int flatRoof_id = rs.getInt("rooftype_id");
                String flatRoofName = rs.getString("rooftype_name");
                RoofType flatRoofType = new RoofType(flatRoof_id, flatRoofName);
                flatRoofTypeList.add(flatRoofType);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return flatRoofTypeList;
    }

    public static List<RoofType> GetAllRaisedRoofTypes() throws LoginSampleException {
        List<RoofType> raisedRoofTypeList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM rooftype where carport_type = 'raised'";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (raisedRoofTypeList == null) {
                    raisedRoofTypeList = new ArrayList<>();
                }

                int raisedRoof_id = rs.getInt("rooftype_id");
                String raisedRoof_type = rs.getString("rooftype_name");
                RoofType raisedRoofType = new RoofType(raisedRoof_id, raisedRoof_type);
                raisedRoofTypeList.add(raisedRoofType);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return raisedRoofTypeList;
    }

    public static List<RoofTilt> GetAllRaisedRoofDegress() throws LoginSampleException {
        List<RoofTilt> raisedRoofDegressList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM carport_tilt";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (raisedRoofDegressList == null) {
                    raisedRoofDegressList = new ArrayList<>();
                }

                int degreeRoof_id = rs.getInt("tilt_id");
                int raisedRoof_degree = rs.getInt("tilt_degree");
                RoofTilt roofTilt = new RoofTilt(degreeRoof_id, raisedRoof_degree);
                raisedRoofDegressList.add(roofTilt);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return raisedRoofDegressList;
    }

    public static List<ToolShedLength> GetAllToolShedLengths() throws LoginSampleException {
        List<ToolShedLength> toolShedLengthList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM toolshed_length";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (toolShedLengthList == null) {
                    toolShedLengthList = new ArrayList<>();
                }

                int toolShedLength_id = rs.getInt("toolshed_length_id");
                int toolShedLength_cm = rs.getInt("toolshed_length_cm");
                ToolShedLength toolShed = new ToolShedLength(toolShedLength_id, toolShedLength_cm);
                toolShedLengthList.add(toolShed);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return toolShedLengthList;


    }

    public static List<ToolShedWidth> GetAllToolShedWidths() throws LoginSampleException {
        List<ToolShedWidth> toolShedWidthList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM toolshed_width";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (toolShedWidthList == null) {
                    toolShedWidthList = new ArrayList<>();
                }

                int toolShedWidth_id = rs.getInt("toolshed_width_id");
                int toolShedWidth_cm = rs.getInt("toolshed_width_cm");
                ToolShedWidth toolShedWidth = new ToolShedWidth(toolShedWidth_id, toolShedWidth_cm);
                toolShedWidthList.add(toolShedWidth);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return toolShedWidthList;
    }

    public static int getCarportLengthFromId(int carport_length_id) {

        int carport_length = 0;
        try {
            Connection connection = Connector.connection();
            PreparedStatement statement = connection.prepareStatement("Select * from carport_length where length_id = ? ");
            statement.setInt(1, carport_length_id );

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                carport_length = resultSet.getInt("length_cm");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carport_length;
    }

    public static int getCarportWidthFromId(int carport_width_id) {

        int carport_width = 0;
        try {
            Connection connection = Connector.connection();
            PreparedStatement statement = connection.prepareStatement("Select * from carport_width where width_id = ? ");
            statement.setInt(1, carport_width_id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                carport_width = resultSet.getInt("width_cm");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carport_width;
    }

    public static int getToolShedLengthsFromId(int toolshed_length_id) {

        int toolshed_length = 0;
        try {
            Connection connection = Connector.connection();
            PreparedStatement statement = connection.prepareStatement("Select * from toolshed_length where toolshed_length_id = ? ");
            statement.setInt(1, toolshed_length_id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                toolshed_length = resultSet.getInt("toolshed_length_id");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return toolshed_length;
    }

    public static int getToolShedWidthsFromId(int toolshed_width_id) {

        int toolshed_width = 0;
        try {
            Connection connection = Connector.connection();
            PreparedStatement statement = connection.prepareStatement("Select * from toolshed_width where toolshed_width_id = ? ");
            statement.setInt(1, toolshed_width_id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
               toolshed_width = resultSet.getInt("toolshed_width_id");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return toolshed_width;
    }












}