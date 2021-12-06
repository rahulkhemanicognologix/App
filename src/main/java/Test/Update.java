package Test;

import java.sql.*;

public class Update {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3308/Results";
        String username = "root";
        String password = "";
        String query = " Update Marks SET student_id=?, result=? WHERE last_name = ?";

     //    Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, "8");
        statement.setString(2, "Fail");
        statement.setString(3, "Dhoni");


        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated>0){
            System.out.println("User Updated Finally");
        }


    }
}




