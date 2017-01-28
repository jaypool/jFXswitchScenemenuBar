package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;




public class Controller {

    @FXML
    private Parent root;

    /**
     * This sends to you to another FXML
     * @param actionEvent
     * @throws IOException
     */
    public void callAnotherFXML(ActionEvent actionEvent) throws IOException {
        Parent another_page_parent = FXMLLoader.load(getClass().getResource("another.fxml"));
        Scene another_page_scene = new Scene(another_page_parent);
        Stage another_stage = (Stage) root.getScene().getWindow();
        another_stage.setScene(another_page_scene);
        another_stage.show();
    }

}
