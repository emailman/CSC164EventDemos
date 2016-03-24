package p4;

/*
 * Created by emailman on 3/17/2016.
 * Handlers implemented with lambda expressions
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LambdaExpressionDemo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(20);
        pane.setPadding(new Insets(20, 50, 20, 50));

        // Define an UP Button and register a handler for it
        Button btUp = new Button("UP");
        btUp.setPrefWidth(100);
        btUp.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Button Press Detected");
            alert.setHeaderText(null);
            alert.setContentText("UP Button was pressed");
            alert.showAndWait();
        });

        // Define a DOWN Button and register a handler for it
        Button btDown = new Button("DOWN");
        btDown.setPrefWidth(100);
        btDown.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Button Press Detected");
            alert.setHeaderText(null);
            alert.setContentText("DOWN button was pressed");
            alert.showAndWait();
        });

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