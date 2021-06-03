package Java2.Lesson7;
import java.sql.*;
public class ServerApp {
    public static void main(String[] args) {
//        runOld();
        new MyServer();
    }

    private static void runOld() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:users.db");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS users (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "login TEXT NOT NULL, " +
                    "pass TEXT NOT NULL, " +
                    "nick TEXT NOT NULL);");
            stmt.executeUpdate("INSERT INTO users (login, pass, nick) VALUES " +
                    "(  \"login1\", \"pass1\", \"nick1\")," +
                    "(  \"login2\", \"pass2\", \"nick2\")," +
                    "(  \"login3\", \"pass3\", \"nick3\")");
        } catch (SQLException |  ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
}
