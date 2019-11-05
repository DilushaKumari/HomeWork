package controller;

import DB.DBConnection;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddCustomerController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public Button btnSave;



    public void btnSave_OnAction(ActionEvent actionEvent) {
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            PreparedStatement insertQuery = connection.prepareStatement("INSERT INTO customer VALUES(?,?,?)");
            insertQuery.setString(1,txtId.getText());
            insertQuery.setString(2,txtName.getText());
            insertQuery.setString(3,txtAddress.getText());
            int affectedRow = insertQuery.executeUpdate();
            if(affectedRow>0){
                new Alert(Alert.AlertType.INFORMATION,"New Customer Added Successfully...").show();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
