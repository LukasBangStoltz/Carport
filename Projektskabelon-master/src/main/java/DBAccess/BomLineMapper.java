package DBAccess;

import FunctionLayer.PlankMaterial;
import FunctionLayer.LoginSampleException;

import java.sql.*;
import java.util.Map;

public class BomLineMapper {

    public static void insertPlanksToBomLine(Map<PlankMaterial, Integer> flatPlankMatNeeded, int carportId) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO f_styklistelinje (f_carport_id, f_materiale_id, f_længde_cm, f_antal) VALUES (?, ?, ?, ?)";
            for(Map.Entry<PlankMaterial, Integer> map: flatPlankMatNeeded.entrySet()) {


                PreparedStatement ps = con.prepareStatement(SQL);

                ps.setInt(1, carportId);
                ps.setInt(2, map.getKey().getMaterialId());
                ps.setInt(3, map.getKey().getMaterialLength());
                ps.setInt(4, map.getValue());

                ps.executeUpdate();

            }
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
    }

