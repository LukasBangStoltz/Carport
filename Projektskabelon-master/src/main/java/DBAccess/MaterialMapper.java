package DBAccess;

import FunctionLayer.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaterialMapper {

    public static ArrayList<FlatPlankMaterial> GetAllFlatPlanksMat() throws LoginSampleException {
        ArrayList<FlatPlankMaterial> flatPlankMaterialList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM f_materialer_brædt_stolper";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (flatPlankMaterialList == null) {
                    flatPlankMaterialList = new ArrayList<>();
                }

                int material_id = rs.getInt("f_materiale_id");
                int material_length = rs.getInt("f_std_længde_cm");
                String material_Name = rs.getString("f_materiale_navn");
                String material_Describtion = rs.getString("f_materiale_beskrivelse");

                FlatPlankMaterial materialFlatPlank = new FlatPlankMaterial(material_Name, material_Describtion, material_length, material_id);
                flatPlankMaterialList.add(materialFlatPlank);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return flatPlankMaterialList;
    }

    public static ArrayList<FlatScrewMaterial> GetAllFlatScrewMaterial() throws LoginSampleException {
        ArrayList<FlatScrewMaterial> flatScrewMaterialList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM f_materialer_skruer_beslag";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (flatScrewMaterialList == null) {
                    flatScrewMaterialList = new ArrayList<>();
                }

                int material_id = rs.getInt("f_materiale_id");
                int material_pcs = rs.getInt("f_stk");
                String material_Name = rs.getString("f_materiale_navn");
                String material_Describtion = rs.getString("f_materiale_beskrivelse");

                FlatScrewMaterial flatScrewMaterial = new FlatScrewMaterial(material_Name, material_Describtion, material_pcs, material_id);
                flatScrewMaterialList.add(flatScrewMaterial);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return flatScrewMaterialList;
    }

    public static ArrayList<RaisedPlankMaterial> GetAllRaisedPlanksMat() throws LoginSampleException {
        ArrayList<RaisedPlankMaterial> raisedPlankMaterialList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM h_materialer_brædt_stolper";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (raisedPlankMaterialList == null) {
                    raisedPlankMaterialList = new ArrayList<>();
                }

                int material_id = rs.getInt("h_materiale_id");
                int material_length = rs.getInt("h_std_længde_cm");
                String material_Name = rs.getString("h_materiale_navn");
                String material_Describtion = rs.getString("h_materiale_beskrivelse");

                RaisedPlankMaterial raisedPlankMaterial = new RaisedPlankMaterial(material_Name, material_Describtion, material_length, material_id);
                raisedPlankMaterialList.add(raisedPlankMaterial);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return raisedPlankMaterialList;
    }


    public static ArrayList<RaisedScrewMaterial> GetAllRaisedScrewMaterial() throws LoginSampleException {
        ArrayList<RaisedScrewMaterial> raisedScrewMaterialList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM h_materialer_skruer_beslag";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (raisedScrewMaterialList == null) {
                    raisedScrewMaterialList = new ArrayList<>();
                }

                int material_id = rs.getInt("h_materiale_id");
                int material_pcs = rs.getInt("h_stk");
                String material_Name = rs.getString("h_materiale_navn");
                String material_Describtion = rs.getString("h_materiale_beskrivelse");

                RaisedScrewMaterial raisedScrewMaterial = new RaisedScrewMaterial(material_Name, material_Describtion, material_pcs, material_id);
                raisedScrewMaterialList.add(raisedScrewMaterial);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return raisedScrewMaterialList;
    }

    public static ArrayList<RaisedRoofMaterial> GetAllRaisedRoofMaterial() throws LoginSampleException {
        ArrayList<RaisedRoofMaterial> raisedScrewMaterialList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM h_materialer_tagpakken";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (raisedScrewMaterialList == null) {
                    raisedScrewMaterialList = new ArrayList<>();
                }

                int material_id = rs.getInt("h_materiale_id");
                int material_pcs = rs.getInt("h_stk");
                String material_Name = rs.getString("h_materiale_navn");
                String material_Describtion = rs.getString("h_materiale_beskrivelse");

                RaisedRoofMaterial raisedRoofMaterial = new RaisedRoofMaterial(material_Name, material_Describtion, material_pcs, material_id);
                raisedScrewMaterialList.add(raisedRoofMaterial);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return raisedScrewMaterialList;
    }


}
