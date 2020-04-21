package DBAccess;

import FunctionLayer.CarportLength;
import FunctionLayer.CarportWidth;
import FunctionLayer.FlatRoofType;
import FunctionLayer.LoginSampleException;

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

    public static List<FlatRoofType> GetAllFlatRoofType() throws LoginSampleException {
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

                int fladttag_id = rs.getInt("fladttag_id");
                String fladttag_type = rs.getString("fladttag_type");
                FlatRoofType flatRoofType = new FlatRoofType(fladttag_id, fladttag_type);
                flatRoofTypeList.add(flatRoofType);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return flatRoofTypeList;


    }
}