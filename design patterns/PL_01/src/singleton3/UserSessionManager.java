package singleton3;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;



public class UserSessionManager {
    private static UserSessionManager instance;
    private String session;
    private UserSessionManager(String connectionString) {
        this.session = connectionString;
    }
    public static synchronized UserSessionManager getInstance(String connectionString) {
        if (instance == null) {
            instance = new UserSessionManager(connectionString);
        }
        return instance;
    }

    public String getSessionToken() {
        Random ran = new Random();
        int x = ran.nextInt(99999999);
        // Código para conectar à base de dados usando a connectionString
        return Integer.toString(x);
    }

    public long getLastAccessTime() {
        long date = System.currentTimeMillis();
        return date;
        }

    public void updateLastAccessTime() {
            System.out.println();
    }






}

/*



*/


// Outros métodos da classe



