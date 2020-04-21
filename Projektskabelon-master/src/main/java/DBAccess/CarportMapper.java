package DBAccess;

import FunctionLayer.CarportBredde;
import FunctionLayer.LoginSampleException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarportMapper {


    public static List<CarportBredde> GetAllWidths() throws LoginSampleException {
        List<CarportBredde> carportwideList = null;

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
                CarportBredde carportBredde = new CarportBredde(bredde_id, bredde_cm);
                carportwideList.add(carportBredde);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return carportwideList;
    }

}
