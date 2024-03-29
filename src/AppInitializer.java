import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = this.getClass().getResource("/view/DashBoardForm.fxml");
        Parent root = FXMLLoader.load(resource);

        Scene scene =new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Git Home Work");
        primaryStage.show();

    }
}
