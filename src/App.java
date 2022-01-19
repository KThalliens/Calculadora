import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    @Override
    //Esta estructura siempre es la misma; lo unico que se cambia es el nombre del archivo FXML.
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader =new FXMLLoader(getClass().getResource("calculadora.fxml"));//instanciando
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        primaryStage.setTitle("calculadora"); //EDITABLE!!! este el nombre del fxml
        primaryStage.setScene(scene);
        primaryStage.show();   




    }
}
