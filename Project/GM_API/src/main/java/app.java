public class app {
    public static void main(String[] args) {
        System.out.println();
        connection c = new connection(System.getProperty("db.databasename"), System.getProperty("db.username"), System.getProperty("db.password"));
    }
}
