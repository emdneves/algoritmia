package singleton3;

public class Main {
    public static void main(String[] args) {
        UserSessionManager sessionManager = UserSessionManager.getInstance();
        sessionManager.generateSessionToken();

        String sessionToken = sessionManager.getSessionToken();
        long lastAccessTime = sessionManager.getLastAccessTime();

        System.out.println("Session Token: " + sessionToken);
        System.out.println("Last Access Time: " + lastAccessTime);

        sessionManager.updateLastAccessTime();
        lastAccessTime = sessionManager.getLastAccessTime();
        System.out.println("Updated Last Access Time: " + lastAccessTime);
    }
}

