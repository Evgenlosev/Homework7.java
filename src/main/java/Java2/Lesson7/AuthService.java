package Java2.Lesson7;

public interface AuthService {
    void start();
    String getNickByLoginPass(String login, String pass);
    boolean nickChange(String oldNick, String newNick);
    void stop();

}
