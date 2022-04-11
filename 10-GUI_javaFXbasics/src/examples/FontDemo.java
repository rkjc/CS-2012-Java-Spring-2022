package examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FontDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    // Create a pane to hold the circle 
    Pane pane = new StackPane();
    
    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.setRadius(70);
    circle.setStroke(Color.BLACK); 
    //using Color Class
    circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
    //circle.setFill(new Color(1.0, 0.0, 0.1, 0.5));
    //circle.setFill(Color.rgb(255, 255, 0));
    
    pane.getChildren().add(circle); // Add circle to the pane

    // Create a label and set its properties
    Label label = new Label("JavaFX");
    label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
    pane.getChildren().add(label);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 400, 400);
    primaryStage.setTitle("FontDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  

  public static void main(String[] args) {
    launch(args);
  }
}
