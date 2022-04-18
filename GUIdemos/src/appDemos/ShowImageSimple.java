package appDemos;

import java.net.URISyntaxException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowImageSimple extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new StackPane();   // Create a pane to hold the image views
		pane.setPadding(new Insets(5, 5, 5, 5));

		try {
			// Image image = new Image("mapIcon.gif");
			Image image = new Image(getClass().getResource("mapIcon.gif").toURI().toString());

			pane.getChildren().add(new ImageView(image));

			Scene scene = new Scene(pane); // Create a scene and place it in the stage
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage

		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
