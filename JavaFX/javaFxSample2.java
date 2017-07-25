
package javafxapplication;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {
    
    @Override
    public void start(Stage primaryStage)
    {
      StackPane pane =new StackPane();//create StackPane
      pane.getChildren().add(new Button("haid hou"));//add button to StackPane and set text for  the button
      Scene scene = new Scene(pane,200,60);
      primaryStage.setTitle("StackPane Test");
      primaryStage.setScene(scene);
      primaryStage.show();
     
     Stage stage = new Stage();
     Circle circle =new Circle();
     circle.setCenterX(100);
     circle.setCenterY(100);
     circle.setRadius(50);
     circle.setStroke(Color.LIGHTPINK);
     circle.setFill(Color.BLUE);
     
     Pane pane1 =  new Pane();
     pane1.getChildren().add(circle);
     Scene scene1 = new Scene(pane1,200,200);
     stage.setTitle("SHOW CIRCLE");
     stage.setScene(scene1);
     stage.show();
     
    }
   
    
    public static void main(String[] args) {
     Application.launch(args);
    }
    
}
