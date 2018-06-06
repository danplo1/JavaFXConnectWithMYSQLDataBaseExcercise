package connectivity;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 * Created by Daniel_D'AGE on 06.06.2018.
 */
public class ConnectionClass {

    private Connection connection;

    public Connection getConnection(){

        String dbName ="Connect";
        String userName ="root";
        String password ="";

        try {
            Class.forName("com.mysql.jdbc.Driver"); //katalog jdbc, klasa driver

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/" +dbName,
                    userName,password);


        } catch (Exception e) {
            e.printStackTrace();
        }


        return connection;


    }

}
