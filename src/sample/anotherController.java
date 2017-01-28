package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class anotherController {

    // create @FXML viewable variable
    @FXML
    private Parent root;

    /**
     * this sends you back to the original FXML
     * @param actionEvent
     * @throws IOException
     */
    public void goBackToOriginalFXML(ActionEvent actionEvent) throws IOException {
        Parent another_page_parent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene another_page_scene = new Scene(another_page_parent);
        Stage another_stage = (Stage) root.getScene().getWindow();
        another_stage.setScene(another_page_scene);
        another_stage.show();
    }
}
