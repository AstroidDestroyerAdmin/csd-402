
/*
 * Author: Orlando Camacho
 * Course: CSD-402 Java for Programmers
 * Assignment: 11.2 - JavaFX HBox and VBox
 * Date: October 11, 2026
 *
 * Description:
 * This program demonstrates how HBox arranges
 * buttons horizontally and VBox arranges
 * controls vertically in a JavaFX application.
 *
 * GitHub:
 * https://github.com/AstroidDestroyerAdmin/csd-402
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXLayoutDemo extends Application {

    @Override
    public void start(Stage stage) {

        // Create the application title.
        Label title = new Label("JavaFX HBox and VBox Demo");

        // HBox arranges buttons from left to right.
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);

        Button home = new Button("Home");
        Button about = new Button("About");
        Button contact = new Button("Contact");

        hbox.getChildren().addAll(home, about, contact);

        // VBox arranges items from top to bottom.
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);

        Label message = new Label("Select an option:");
        Button option1 = new Button("Option 1");
        Button option2 = new Button("Option 2");

        vbox.getChildren().addAll(message, option1, option2);

        // Add actions to demonstrate event handling.
        home.setOnAction(e ->
            message.setText("Home selected!"));

        about.setOnAction(e ->
            message.setText("About selected!"));

        contact.setOnAction(e ->
            message.setText("Contact selected!"));

        option1.setOnAction(e ->
            message.setText("Option 1 selected!"));

        option2.setOnAction(e ->
            message.setText("Option 2 selected!"));

        // Combine both layouts into one main container.
        VBox mainLayout = new VBox(20);
        mainLayout.setPadding(new Insets(20));
        mainLayout.setAlignment(Pos.CENTER);

        mainLayout.getChildren().addAll(title, hbox, vbox);

        // Create the scene and display the window.
        Scene scene = new Scene(mainLayout, 450, 300);

        stage.setTitle("JavaFX Layout Demonstration");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
