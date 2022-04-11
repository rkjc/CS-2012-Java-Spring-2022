<<<<<<<< HEAD:10-GUI_javaFXbasics/src/app1/GUIexampleCodeMain.java
package app1;
========
package appBasicsFX;
>>>>>>>> 39028517800b94cfbcb25c456e42cf44e2161b50:10-GUI_javaFXbasics/src/appBasicsFX/GUIexampleCodeMain.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// make sure to add these lines to the
// module-info.java file
//		 requires javafx.controls;
//   requires javafx.base;
//   requires javafx.graphics;
//   exports app; // <-name of the package

public class GUIexampleCodeMain extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			// create a new Text shape
			String strText = "Hello gooey World!\n"
					+ "Time to make some JavaFX GUI's\n"
					+ "sent to you from the GUIexampleCodeMain\n";
			Text messageText = new Text(strText);

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
}

// thanks for the sample code to:
// https://www.tutorialkart.com/javafx/basic-javafx-example-application/