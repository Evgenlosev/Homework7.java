package Java2.Lesson7;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class BaseAuthService implements AuthService {

    private class Entry {
        private String login;
        private String pass;
        private String nick;

        public Entry(String login, String pass, String nick) {
            this.login = login;
            this.pass = pass;
            this.nick = nick;
        }

        public void change(String newNick) {
            this.nick = newNick;
        }
    }

    private final List<Entry> entries = new ArrayList<>();


    @Override
    public void start() {
        try {
            System.out.println("Сервис аутентификации запущен");
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:users.db");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT login, pass, nick FROM users");
            while (rs.next()) {
                entries.add(new Entry(
                        rs.getString("login"),
                        rs.getString("pass"),
                        rs.getString("nick")));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void stop() {
        System.out.println("Сервис аутентификации остановлен");
    }
    public BaseAuthService() {
//        entries = new ArrayList<>();
//        entries.add(new Entry("login1", "pass1", "nick1"));
//        entries.add(new Entry("login2", "pass2", "nick2"));
//        entries.add(new Entry("login3", "pass3", "nick3"));
    }
    @Override
    public String getNickByLoginPass(String login, String pass) {
        for (Entry o : entries) {
            if (o.login.equals(login) && o.pass.equals(pass)) return o.nick;
        }
        return null;
    }

    @Override
    public boolean nickChange (String oldNick, String newNick) {
        for (Entry o : entries) {
            if (o.nick.equals(newNick)) {
                return false;
            }
        }
        for (Entry e : entries) {
            if (e.nick.equals(oldNick)) {
                try {
                    Connection conn = DriverManager.getConnection("jdbc:sqlite:users.db");
                    PreparedStatement pstm = conn.prepareStatement("UPDATE users SET nick = ? WHERE nick = ?;");
                    pstm.setString(1, newNick);
                    pstm.setString(2, oldNick);
                    pstm.execute();
                    e.change(newNick);
                    return true;
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return false;
    }
}
