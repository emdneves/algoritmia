/*
3. Crie uma classe chamada "UserSessionManager" para gerir as sessões de utilizadores num sistema.
        A classe UserSessionManager deve possuir um construtor privado e um método estático getInstance para retornar a instância única da classe.
        A classe também deve possuir métodos para obter o token de sessão (random), obter o horário do último acesso e atualizar o horário do último acesso (System.currentTimeMillis()).
        (Ao todo deve desenvolver 6 métodos, incluindo construtor, get e set). Exemplo de main com instância e invocação de métodos.

        UserSessionManager sessionManager = UserSessionManager.getInstance();
        String sessionToken = sessionManager.getSessionToken();
        long lastAccessTime = sessionManager.getLastAccessTime();
        sessionManager.updateLastAccessTime();
 */
package singleton3;
import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager instance;
    private String sessionToken;
    private long lastAccessTime;

    private UserSessionManager() {
        // Construtor privado para evitar instanciação direta
    }

    public static UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager();
        }
        return instance;
    }

    public String getSessionToken() {
        return sessionToken;
    }
    public long getLastAccessTime() {
        return lastAccessTime;
    }

    public void updateLastAccessTime() {
        lastAccessTime = System.currentTimeMillis();
    }

    public void generateSessionToken() {
        // Gera um token de sessão aleatório
        Random random = new Random();
        sessionToken = Long.toString(random.nextLong());
    }
}



