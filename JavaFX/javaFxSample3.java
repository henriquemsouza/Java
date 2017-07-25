
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
 
     Pane pane1 =  new Pane();
     Stage stage = new Stage();
     
     Circle circle =new Circle();
     circle.centerXProperty().bind(pane1.widthProperty().divide(2));
     circle.centerYProperty().bind(pane1.heightProperty().divide(2));
     circle.setRadius(50);
     circle.setStroke(Color.LIGHTPINK);
     circle.setFill(Color.BLUE);
     
   
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
