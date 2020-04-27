package DBAccess;

import FunctionLayer.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MaterialMapper {

    public static Map<Integer, FlatPlankMaterial> GetAllFlatPlanksMat() throws LoginSampleException {
        Map<Integer, FlatPlankMaterial> flatPlankMaterialMap = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM f_materialer_brædt_stolper";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (flatPlankMaterialMap == null) {
                    flatPlankMaterialMap = new HashMap<>();
                }

                int material_id = rs.getInt("f_materiale_id");
                int material_length = rs.getInt("f_std_længde_cm");
                String material_Name = rs.getString("f_materiale_navn");
                String material_Describtion = rs.getString("f_materiale_beskrivelse");

                FlatPlankMaterial materialFlatPlank = new FlatPlankMaterial(material_Name, material_Describtion, material_length);
                flatPlankMaterialMap.put(material_id, materialFlatPlank);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return flatPlankMaterialMap;
    }

    public static Map<Integer, FlatScrewMaterial> GetAllFlatScrewMaterial() throws LoginSampleException {
        Map<Integer, FlatScrewMaterial> flatScrewMaterialMap = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM f_materialer_skruer_beslag";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (flatScrewMaterialMap == null) {
                    flatScrewMaterialMap = new HashMap<>();
                }

                int material_id = rs.getInt("f_materiale_id");
                int material_pcs = rs.getInt("f_stk");
                String material_Name = rs.getString("f_materiale_navn");
                String material_Describtion = rs.getString("f_materiale_beskrivelse");

                FlatScrewMaterial flatScrewMaterial = new FlatScrewMaterial(material_Name, material_Describtion, material_pcs);
                flatScrewMaterialMap.put(material_id, flatScrewMaterial);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return flatScrewMaterialMap;
    }

    public static Map<Integer, RaisedPlankMaterial> GetAllRaisedPlanksMat() throws LoginSampleException {
        Map<Integer, RaisedPlankMaterial> raisedPlankMaterialMap = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM h_materialer_brædt_stolper";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (raisedPlankMaterialMap == null) {
                    raisedPlankMaterialMap = new HashMap<>();
                }

                int material_id = rs.getInt("h_materiale_id");
                int material_length = rs.getInt("h_std_længde_cm");
                String material_Name = rs.getString("h_materiale_navn");
                String material_Describtion = rs.getString("h_materiale_beskrivelse");

                RaisedPlankMaterial raisedPlankMaterial = new RaisedPlankMaterial(material_Name, material_Describtion, material_length);
                raisedPlankMaterialMap.put(material_id, raisedPlankMaterial);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return raisedPlankMaterialMap;
    }


    public static Map<Integer, RaisedScrewMaterial> GetAllRaisedScrewMaterial() throws LoginSampleException {
        Map<Integer, RaisedScrewMaterial> raisedScrewMaterialMap = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM h_materialer_skruer_beslag";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (raisedScrewMaterialMap == null) {
                    raisedScrewMaterialMap = new HashMap<>();
                }

                int material_id = rs.getInt("h_materiale_id");
                int material_pcs = rs.getInt("h_stk");
                String material_Name = rs.getString("h_materiale_navn");
                String material_Describtion = rs.getString("h_materiale_beskrivelse");

                RaisedScrewMaterial raisedScrewMaterial = new RaisedScrewMaterial(material_Name, material_Describtion, material_pcs);
                raisedScrewMaterialMap.put(material_id, raisedScrewMaterial);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return raisedScrewMaterialMap;
    }

    public static Map<Integer, RaisedRoofMaterial> GetAllRaisedRoofMaterial() throws LoginSampleException {
        Map<Integer, RaisedRoofMaterial> raisedScrewMaterialMap = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM h_materialer_tagpakken";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (raisedScrewMaterialMap == null) {
                    raisedScrewMaterialMap = new HashMap<>();
                }

                int material_id = rs.getInt("h_materiale_id");
                int material_pcs = rs.getInt("h_stk");
                String material_Name = rs.getString("h_materiale_navn");
                String material_Describtion = rs.getString("h_materiale_beskrivelse");

                RaisedRoofMaterial raisedRoofMaterial = new RaisedRoofMaterial(material_Name, material_Describtion, material_pcs);
                raisedScrewMaterialMap.put(material_id, raisedRoofMaterial);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return raisedScrewMaterialMap;
    }


}
