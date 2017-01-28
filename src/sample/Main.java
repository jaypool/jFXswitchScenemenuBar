package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * In this demo I show how to switch to another scene from a menu bar item.
 * Now, it does not use one menu bar for all the scenes. There is a tutorial
 * online somewhere that covers this, but to me that doesn't matter.
 *
 * Simply call the main container (parent) root, make it visible with @FXML
 * and then go and use it. Read the comments in the controllers for more info.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
