package intelipet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.image.Image;


public class App extends Application {

    private static Scene scene;


    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("/vista/inicio/SeleccionPerfil"), 800, 600);
        stage.setTitle("Intelipet | Software de Gestión");
        stage.getIcons().add(new Image("file:src/main/resources/img/logo_intelipet.png"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


    public static void main(String[] args) {
        launch();
    }
}
