package Test;

import java.sql.*;

public class Insert {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3308/Results";
        String username = "root";
        String password = "";
        String query = "INSERT INTO Marks (student_id, first_name, last_name, result) VALUES (?, ?, ?, ?)";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);

        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, "7");
        statement.setString(2, "MS");
        statement.setString(3, "Dhoni");
        statement.setString(4, "PASS");

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new user was inserted successfully!");
        } else {
            System.out.println("A new user was not inserted successfully!");
        }

        con.close();

    }
}
