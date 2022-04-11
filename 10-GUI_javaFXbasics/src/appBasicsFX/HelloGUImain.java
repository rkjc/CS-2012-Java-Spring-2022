package appBasicsFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class HelloGUImain extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// create a new Text shape
			Text messageText = new Text("Hello World! Lets learn JavaFX.");

			// stack page
			StackPane root = new StackPane();

			// add Text shape to Stack Pane
			root.getChildren().add(messageText);

			Scene scene = new Scene(root, 400, 400);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}