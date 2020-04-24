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
        List<CarportWidth> carportwideList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM carportbredde";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (carportwideList == null) {
                    carportwideList = new ArrayList<>();
                }

                int bredde_id = rs.getInt("bredde_id");
                int bredde_cm = rs.getInt("bredde_cm");
                CarportWidth carportBredde = new CarportWidth(bredde_id, bredde_cm);
                carportwideList.add(carportBredde);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return carportwideList;
    }

    public static List<CarportLength> GetAllLengths() throws LoginSampleException {
        List<CarportLength> carportlengthlist = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM carportlængde";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (carportlengthlist == null) {
                    carportlengthlist = new ArrayList<>();
                }

                int længde_id = rs.getInt("længde_id");
                int længde_cm = rs.getInt("længde_cm");
                CarportLength carportLength = new CarportLength(længde_id, længde_cm);
                carportlengthlist.add(carportLength);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return carportlengthlist;
    }

    public static List<FlatRoofType> GetAllFlatRoofTypes() throws LoginSampleException {
        List<FlatRoofType> flatRoofTypeList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM fladttagtype";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (flatRoofTypeList == null) {
                    flatRoofTypeList = new ArrayList<>();
                }

                int fladttag_id = rs.getInt("fladttagtype_id");
                String fladttag_type = rs.getString("fladttag_type");
                FlatRoofType flatRoofType = new FlatRoofType(fladttag_id, fladttag_type);
                flatRoofTypeList.add(flatRoofType);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return flatRoofTypeList;
    }

    public static List<RaisedRoofType> GetAllRaisedRoofTypes() throws LoginSampleException {
        List<RaisedRoofType> raisedRoofTypeList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM hældningtagtype";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (raisedRoofTypeList == null) {
                    raisedRoofTypeList = new ArrayList<>();
                }

                int raisedRoof_id = rs.getInt("hældningtagtype_id");
                String raisedRoof_type = rs.getString("hældningtag_type");
                RaisedRoofType raisedRoofType = new RaisedRoofType(raisedRoof_id, raisedRoof_type);
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
            String SQL = "SELECT * FROM taghældning";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (raisedRoofDegressList == null) {
                    raisedRoofDegressList = new ArrayList<>();
                }

                int degreeRoof_id = rs.getInt("taghældning_id");
                int raisedRoof_degree = rs.getInt("taghældning_grader");
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
            String SQL = "SELECT * FROM skurlængde";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (toolShedLengthList == null) {
                    toolShedLengthList = new ArrayList<>();
                }

                int toolShedLength_id = rs.getInt("skurlængde_id");
                int toolShedLength_cm = rs.getInt("skurlængde_cm");
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
            String SQL = "SELECT * FROM skurbredde";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (toolShedWidthList == null) {
                    toolShedWidthList = new ArrayList<>();
                }

                int toolShedWidth_id = rs.getInt("skurbredde_id");
                int toolShedWidth_cm = rs.getInt("skurbredde_cm");
                ToolShedWidth toolShedWidth = new ToolShedWidth(toolShedWidth_id, toolShedWidth_cm);
                toolShedWidthList.add(toolShedWidth);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return toolShedWidthList;


    }





}