import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXTest extends Application {

    @Override
    public void start(Stage stage) {
        Label message = new Label("JavaFX is working!");

        StackPane root = new StackPane(message);
        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("CSD-402 JavaFX Test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}