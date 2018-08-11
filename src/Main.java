package src;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.control.*;

public class Main extends Application {

    Stage window;
    String input;
    ComboBox comboBox = new ComboBox();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Dropdowns");
        Button btn1 = new Button("Click me!");


        //getItems returns the ObservableList object which can add items to
        comboBox.getItems().addAll("Apples", "Bananas", "Oranges", "Watermelons");
        comboBox.setOnAction(e -> System.out.println("User selected: " + comboBox.getValue()));

        comboBox.setPromptText("Select your favorite movie.");
        comboBox.setEditable(true);

        btn1.setOnAction(e -> printMovie());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(btn1, comboBox);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    private void printMovie(){
        System.out.println(comboBox.getValue());
    }
}
