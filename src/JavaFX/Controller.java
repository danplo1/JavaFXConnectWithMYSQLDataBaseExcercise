package JavaFX;

import connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {

    public TextField textField;
    public Label textLabel;

    public void button(ActionEvent actionEvent) throws SQLException {

        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();

        String sql = "INSERT INTO USER VALUES('" + textField.getText() + "')";
        Statement statement = connection.createStatement(); // not working
        statement.executeUpdate(sql);

        sql = "SELECT * FROM USER VALUES";
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){

            textLabel.setText(resultSet.getString(1));

        }



        //wpisanie do kontrolera danych i po zatwierdzeniu buttonem, przesyła dane do bazy danych
        //textLabel.setText(textField.getText());
    }
}
