package intelipet;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class SeleccionPerfilController {


    @FXML
    private void handleAbrirDireccion() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/vista/login/LoginDireccion.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src/main/resources/img/logo_intelipet.png"));
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    private void handleAbrirRecepcion() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/login/LoginRecepcion.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src/main/resources/img/logo_intelipet.png"));
        stage.setScene(scene);
        stage.show();
    }

}
