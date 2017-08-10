package ch03.sec03;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class CancelAction extends Application implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {

        System.out.println("Oh noes!");
    }

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button cancelButton = new Button("Cancel");

        cancelButton.setOnAction(new CancelAction());

        StackPane stackPane = new StackPane();

        stackPane.getChildren().add(cancelButton);

        primaryStage.setScene(new Scene(stackPane, 300, 250));

        primaryStage.show();
    }
}
