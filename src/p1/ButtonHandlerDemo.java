package p1;

/*
 * Created by emailman on 3/17/2016.
 * Handlers implemented as external classes.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonHandlerDemo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(20);
        pane.setPadding(new Insets(20, 50, 20, 50));

        // Define an UP Button and register a handler for it
        Button btUp = new Button("UP");
        btUp.setPrefWidth(100);
        UpButtonHandler handler1 = new UpButtonHandler();
        btUp.setOnAction(handler1);

        // Define a DOWN Button and register a handler for it
        Button btDown = new Button("DOWN");
        btDown.setPrefWidth(100);
        DownButtonHandler handler2 = new DownButtonHandler();
        btDown.setOnAction(handler2);

        // Add the buttons to the pane
        pane.getChildren().addAll(btUp, btDown);

        // Add the pane to the scene
        Scene scene = new Scene(pane);

        // Setup the stage with the scene and show it
        primaryStage.setTitle("Call Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class UpButtonHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Button Press Detected");
        alert.setHeaderText(null);
        alert.setContentText("UP Button was pressed");
        alert.showAndWait();
    }
}

class DownButtonHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Button Press Detected");
        alert.setHeaderText(null);
        alert.setContentText("DOWN button was pressed");
        alert.showAndWait();
    }
}
