package singleton2;


public class Logger {
    private static Logger instance;
    private String log;
    private Logger(String connectionString) {

        this.log = connectionString;
    }
    public static synchronized Logger getInstance(String connectionString) {
        if (instance == null) {
            instance = new Logger(connectionString);
        }
        return instance;
    }
    public void log(String String) {
// Código para conectar à base de dados usando a connectionString
        System.out.println("log message: " + log);
    }

// Outros métodos da classe
}


