package DBAccess;

import FunctionLayer.CarportWidth;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Material;
import FunctionLayer.MaterialVariants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasse vi anvender til at opererer med databasen, specielt tabels: materials og material_variants
 */

public class MaterialMapper {

    /**
     *
     * @return List<Material> En liste af Material objekts, altså allt de materialer vi har i vores database i tablet materials
     * @throws LoginSampleException
     */

    public static List<Material> GetMaterials() throws LoginSampleException {
        List<Material> materialList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM materials";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (materialList == null) {
                    materialList = new ArrayList<>();
                }

                int material_id = rs.getInt("material_id");
                String name = rs.getString("name");
                String dimension = rs.getString("dimension");
                String unit = rs.getString("unit");

                Material material = new Material(material_id, name, dimension, unit);
                materialList.add(material);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return materialList;
    }

    /**
     *
     * @return List<MaterialVariants> En liste af MaterialVariants objekts, altså allt de materialer_variants vi har i vores database i tablet materials
     * @throws LoginSampleException
     */

    public static List<MaterialVariants> GetMaterialVariants() throws LoginSampleException {
        List<MaterialVariants> matVariantsList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM material_variants";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (matVariantsList == null) {
                    matVariantsList = new ArrayList<>();
                }

                int materialVariants_id = rs.getInt("mv_id");
                int material_id = rs.getInt("material_id");
                int length = rs.getInt("length");
                int price = rs.getInt("price");

                MaterialVariants materialVariants = new MaterialVariants(materialVariants_id, material_id, length, price);
                matVariantsList.add(materialVariants);


            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return matVariantsList;
    }


}
