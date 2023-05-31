package singleton1;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection connection = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydatabase");
        connection.connect();
        connection.disconnect();

        DatabaseConnection connection2 = DatabaseConnection.getInstance("jdbc:mysql://localhost:3800/myNewDB");
        connection2.connect();
        connection2.disconnect();

    }
}