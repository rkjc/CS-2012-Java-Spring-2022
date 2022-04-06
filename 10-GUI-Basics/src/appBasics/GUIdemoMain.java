package appBasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// make sure to add these lines to the
// module-info.java file
//	 requires javafx.controls;
//   requires javafx.base;
//   requires javafx.graphics;
//   exports app; // <-name of the package

public class GUIdemoMain extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

    @Override
    public void start(Stage primaryStage) { // the 'Stage' is the Window that will be opened on the desktop
        try {
            // create a new Text (Text is subclass of Shape)
            Text messageText = new Text("Hello gooey World!\nfrom GUIdemoMain\nin 10-GUI-Basics Project");
             
            // stack page (StackPane is subclass Parent)
            StackPane root = new StackPane();
             
            // add Text shape to Stack Pane
            root.getChildren().add(messageText);
            
            // Scene is subclass of Stage
            Scene scene = new Scene(root,400,400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}


// thanks for the sample code to:
// https://www.tutorialkart.com/javafx/basic-javafx-example-application/




