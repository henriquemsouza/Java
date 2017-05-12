
package javafxbook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class LoginApp extends Application {
    @Override
public void start(Stage stage) throws Exception{
    AnchorPane pane = new AnchorPane();
    pane.setPrefSize(400, 300);
    
    TextField txLogin = new TextField();
    txLogin.setPromptText("Digite aqui seu login");
    txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
    txLogin.setLayoutY(50);
    PasswordField txSenha = new PasswordField();
    txSenha.setPromptText("Digite aqui sua senha");
    txSenha.setLayoutX((pane.getWidth() - txSenha.getWidth()) / 2);
    txSenha.setLayoutY(100);
    Button btEntrar = new Button("Entrar");
    btEntrar.setLayoutX((pane.getWidth() - btEntrar.getWidth()) / 2);
    btEntrar.setLayoutY(150);
    Button btSair = new Button("Sair");
    btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
    btSair.setLayoutY(200);
    pane.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);
    pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
    
    Scene scene = new Scene(pane);
    stage.setScene(scene);
    stage.show();
    
    
    
}
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
