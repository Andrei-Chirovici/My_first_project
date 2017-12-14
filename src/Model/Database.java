package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {


    public static void Database(String[] args) {

                try
                {
                    // create a mysql database connection
                    String myDriver = "org.gjt.mm.mysql.Driver";
                    String myUrl = "jdbc:mysql://localhost/U:/Computing/SQLiteStudio/StoreMyImages";
                    Class.forName(myDriver);
                    Connection conn = DriverManager.getConnection(myUrl, "root", "");

                    // the mysql insert statement
                    String query = "insert into Users (Username, Password, date_created)";

                    public static void SQLInsert(TextField username, PasswordField passfield) {
                    // create the mysql insert preparedstatement
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    preparedStmt.setString(username, passfield);

                    // execute the preparedstatement
                    preparedStmt.execute();
                }

                    conn.close();
                }
                catch (Exception e)
                {
                    System.err.println("Got an exception!");
                    System.err.println(e.getMessage());
                }

    }

}