package Test;

import java.sql.*;
public class Demo {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3308/Results";
        String username = "root";
        String password = "";
        String query = " SELECT `student_id`, `first_name`, `last_name` , `result` FROM `Marks` WHERE `result` = 'Pass'";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()){
            int student_id = rs.getInt(1);
            String first_name = rs.getString(2);
            String last_name = rs.getString(3);
            String pass = rs.getString(4);

            System.out.println("Student " + student_id + " :" + first_name + " " + last_name + " " + pass);
        }

        st.close();
        con.close();

    }
}
