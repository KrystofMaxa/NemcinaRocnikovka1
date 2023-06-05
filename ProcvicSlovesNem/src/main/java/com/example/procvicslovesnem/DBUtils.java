package com.example.procvicslovesnem;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DBUtils {
    private static Stage stage;
    private static Scene scene;
    private static Parent root;
    public static void changeScene(ActionEvent event, String fxmlFile) {
        try {
            Parent root = FXMLLoader.load(DBUtils.class.getResource(fxmlFile));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
