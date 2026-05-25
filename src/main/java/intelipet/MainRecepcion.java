package intelipet;

import controlador.login.LoginRecepcionController;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class MainRecepcion extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/login/LoginRecepcion.fxml"));
        Parent root = (Parent) loader.load();
        LoginRecepcionController loginRecepcionController = loader.getController();
        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image("file:src/main/resources/img/logo_intelipet.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
        loginRecepcionController.handleLogin(new ActionEvent()); // Llamamos al metodo handleLogin() con un evento vacío
    }


    public static void main(String[] args) {
        launch(args); // Este metodo es necesario si estás utilizando JavaFX
    }
}
