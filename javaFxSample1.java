
package javafxapplication;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {
    
    @Override
    public void start(Stage primaryStage)
    {
     Button btOK = new Button("OK");
     Scene scene = new Scene(btOK, 200,250);
     primaryStage.setTitle("myjava i");
     primaryStage.setScene(scene);
     primaryStage.show();
     
     Stage stage = new Stage();
     stage.setTitle("2 STAGE");
     stage.setScene(new Scene(new Button("new"), 500, 600));
     stage.show();
    }
   
    
    public static void main(String[] args) {
     Application.launch(args);
    }
    
}
