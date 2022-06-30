package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    public Main() {
        //metodo contractor aunque no se ocupa
        System.out.println("\nmetodo contractor aunque no se ocupa");
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        //En esta clase van todos los components de la interfaz gráfica
        Parent root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("hello-view.fxml"))));
        primaryStage.setTitle("Hello world!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void init() {
        //este metodo se puede utilizar para ciertas tareas eje: validation con la bd, cargar una conf inicial
        System.out.println("\nMetodo init() ✈");
    }

    public void stop() {
        //Lo utilizamos si queremos cerrar diversos procesos ejemplo: cerrar la connexion a la bd
        System.out.println("Metodo stop()");
    }
}