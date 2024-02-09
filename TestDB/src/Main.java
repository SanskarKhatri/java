import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\sanskar\\Desktop\\Java\\databases\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " TEXT, " +
                    COLUMN_PHONE + " INTEGER, " +
                    COLUMN_EMAIL + " TEXT" +
                    ")");
            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                    " (" +
                        COLUMN_NAME + ", " +
                        COLUMN_PHONE + ", " +
                        COLUMN_EMAIL +
                    ") " +
                    "VALUES ('Sanskar',6363720158,'sanskarapkhatri@gmail.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                    " (" +
                    COLUMN_NAME + ", " +
                    COLUMN_PHONE + ", " +
                    COLUMN_EMAIL +
                    ") " +
                    "VALUES ('Joe',1234567890,'joe@gmail.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                    " (" +
                    COLUMN_NAME + ", " +
                    COLUMN_PHONE + ", " +
                    COLUMN_EMAIL +
                    ") " +
                    "VALUES ('Jane',1234567891,'jane@gmail.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS +
                    " (" +
                    COLUMN_NAME + ", " +
                    COLUMN_PHONE + ", " +
                    COLUMN_EMAIL +
                    ") " +
                    "VALUES ('Fido',1234567892,'dog@gmail.com')");
            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=1324567890" +
                    " WHERE " + COLUMN_NAME + "='Jane'");
//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while(results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }
            results.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: "+ e.getMessage());
            e.printStackTrace();
        }
    }
}