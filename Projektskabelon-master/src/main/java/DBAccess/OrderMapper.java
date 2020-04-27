package DBAccess;

import FunctionLayer.LoginSampleException;

import java.sql.*;

public class OrderMapper{


   public static void insertFlatCarport(int length, int width, int roofMat) throws LoginSampleException {
       try {
           Connection con = Connector.connection();
           String SQL = "INSERT INTO f_samletcarport (f_længde_id, f_bredde_id, f_tagtype_id) VALUES (?, ?, ?)";
           PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
           ps.setInt( 1, length);
           ps.setInt( 2, width );
           ps.setInt( 3, roofMat );
           ps.executeUpdate();
           ResultSet ids = ps.getGeneratedKeys();

           if (ids.next()){



           int id = ids.getInt( 1 );
           int customer_id = 1;
           SQL = "INSERT INTO ordre (f_carport_id, bruger_id) VALUES (?, ?)";

           ps = con.prepareStatement( SQL);
           ps.setInt( 1, id);
           ps.setInt(2, customer_id);
           ps.executeUpdate();


           }

       } catch ( SQLException | ClassNotFoundException ex ) {
           throw new LoginSampleException( ex.getMessage() );
       }
    }
}
