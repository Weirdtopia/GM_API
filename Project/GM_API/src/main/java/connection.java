import java.sql.Connection;
import java.sql.DriverManager;
public class connection {
    private String databaseName;
    private String username;
    private String password;

    public connection(String databaseName, String username, String password) {
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + this.databaseName,
                    this.username, this.password);
        }catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}
