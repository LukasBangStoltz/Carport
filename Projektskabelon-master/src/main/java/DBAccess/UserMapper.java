package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Material;
import FunctionLayer.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of UserMapper is to...
 *
 * @author kasper
 */
public class UserMapper {

    public static void createUser(User user) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO user (name, adress, phonenumber, email, password, city, role) VALUES (?, ?, ?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getName());
            ps.setString(2, user.getAdress());
            ps.setString(3, user.getPhoneNumber());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getPassword());
            ps.setString(6, user.getCity());
            ps.setString(7, user.getRole());

            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            user.setId(id);

        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static User login(String email, String password) throws LoginSampleException {
        User user;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM user "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String role = rs.getString("role");
                int id = rs.getInt("user_id");
                String name = rs.getString("name");
                String adress = rs.getString("adress");
                String phoneNumber = rs.getString("phonenumber");
                String city = rs.getString("city");
                user = new User(name,adress,phoneNumber,email,password,city,role);
                user.setId(id);
                return user;
            } else {
                throw new LoginSampleException("Brugeren findes ikke");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }

    }
    public static int getUserId(String email) {

        int user_id = 0;
        try {
            Connection connection = Connector.connection();
            PreparedStatement statement = connection.prepareStatement("Select user_id from user where email = ?");
            statement.setString(1, email);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                user_id = resultSet.getInt("user_id");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user_id;
    }

    public static List<User> getAllUsers() throws LoginSampleException {
        List<User> userList = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM user";

            PreparedStatement ps = con.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (userList == null) {
                    userList = new ArrayList<>();
                }


                String name = rs.getString("name");
                String adress = rs.getString("adress");
                String phoneNumber = rs.getString("phonenumber");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String city = rs.getString("city");
                String role = rs.getString("role");


                User user = new User(name, adress, phoneNumber, email, password, city, role);
                userList.add(user);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return userList;
    }














}
