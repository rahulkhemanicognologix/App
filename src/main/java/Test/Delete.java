package Test;

import java.sql.*;

public class Delete {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3308/Results";
        String username = "root";
        String password = "";
        String query = " Delete from MARKS where student_id = ?";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, "7");

        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println(" User Deleted");
        }
    }
}