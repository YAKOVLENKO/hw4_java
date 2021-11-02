import org.flywaydb.core.Flyway;
import org.jetbrains.annotations.NotNull;

public class DataBase {

    public static final @NotNull String CONNECTION = "";
    public static final @NotNull String DB_NAME = "";
    public static final @NotNull String  USERNAME = "";
    public static final @NotNull String PASSWORD = "";

    public static void main(String[] args) {
        final Flyway flyway = Flyway
                .configure()
                .dataSource(CONNECTION + DB_NAME, USERNAME, PASSWORD)
                .locations("db")
                .load();
        flyway.clean();;
        flyway.migrate();
        System.out.println("Successful");
    }
}
