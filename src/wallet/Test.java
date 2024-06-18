package wallet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/wallet","myuser","mypassword");

//        public static void main(String[] args) throws ClassNotFoundException, SQLException {
//            Class.forName("org.postgresql.Driver");
//            Connection con = DriverManager.getConnection("jdbc:postgres://localhost:5432/atm", "root", "root123");
//
//
//        }
        String sql = "insert into users(name, mobile_number) values ('Samikshya Timalsina','9849898410')";

        Statement stm = con.createStatement();

        stm.execute(sql);

        con.close();

    }
}
