package app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUIbuttonDemoMain extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			// set title
			primaryStage.setTitle("New Button and its Action Listener");
			// create a new Button shape
			Button btn = new Button();
			// set text inside button
			btn.setText("Display Message");

			// action event
			EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					btn.setText("Hi there! You clicked the button!");
				}
			};

			// when button is pressed
			btn.setOnAction(event);

			// stack pane
			StackPane root = new StackPane();

			// add button to Stack Pane
			root.getChildren().add(btn);

			Scene scene = new Scene(root, 400, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// thanks for the sample code to:
// https://www.tutorialkart.com/javafx/create-new-button-and-set-action-listener-in-javafx/
// and  https://www.geeksforgeeks.org/javafx-button-with-examples/ 



