package atm;

import java.sql.*;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/atm", "root", "root123");

//        String sql = "insert into users(user_id, user_name, user_psw) values (1, 'Samikshya Timalsina', 'user123')";
//        Statement stm = con.createStatement();
//        stm.execute(sql);
//        con.close();

//        String sql = "select * from users";
//        Statement stm = con.createStatement();
//        ResultSet rs = stm.executeQuery(sql);
//
//        while(rs.next()){
//            System.out.println("ID "+ rs.getInt("user_id"));
//            System.out.println("Username "+ rs.getString("user_name"));
//            System.out.println("Password "+ rs.getString("user_psw"));
//        }

        String sql = "Update users set user_psw = 'test123' where user_id = '1'";
        Statement stm = con.createStatement();
        stm.execute(sql);
        System.out.println("Success");

        String sql1 = "select * from users";
        Statement stm2 = con.createStatement();
        ResultSet rs = stm.executeQuery(sql1);

        while (rs.next()) {
            System.out.println("ID " + rs.getInt("user_id"));
            System.out.println("Username " + rs.getString("user_name"));
            System.out.println("Password " + rs.getString("user_psw"));
        }
    }
}
