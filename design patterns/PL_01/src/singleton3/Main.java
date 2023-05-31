package singleton3;

public class Main {
    public static void main(String[] args) {

        UserSessionManager sessionManager = UserSessionManager.getInstance("conexão 1");


    //    String sessionToken = sessionManager.getSessionToken();
        System.out.println("session token: " + sessionManager.getSessionToken());

    //    long lastAccessTime = sessionManager.getLastAccessTime();
        System.out.println("session date: " +  sessionManager.getLastAccessTime());

        sessionManager.updateLastAccessTime();

    }
}

