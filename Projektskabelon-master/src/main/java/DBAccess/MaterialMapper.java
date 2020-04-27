package DBAccess;

import FunctionLayer.CarportWidth;
import FunctionLayer.LoginSampleException;
import FunctionLayer.MaterialFlat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MaterialMapper {

    public static Map<Integer,MaterialFlat> GetAllFlatMaterial() throws LoginSampleException {
        Map<Integer,MaterialFlat> flatMaterialMap = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM f_materialeliste";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (flatMaterialMap == null) {
                    flatMaterialMap = new HashMap<>();
                }

                int material_id = rs.getInt("f_materiale_id");
                int material_length = rs.getInt("f_std_længde_cm");
                String material_Name = rs.getString("f_materialenavn");
                String material_Describtion = rs.getString("f_materiale_beskrivelse");

                MaterialFlat materialFlat = new MaterialFlat(material_Describtion, material_Name, material_length);
                flatMaterialMap.put(material_id,materialFlat);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return flatMaterialMap;
    }

}
