package src;

import javafx.application.*;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.control.*;

import java.util.Observable;

public class Main extends Application {

    Stage window;
    String input;
    ListView<String> listView = new ListView<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Dropdowns");
        Button btn1 = new Button("Click me!");

        listView.getItems().addAll("Molly", "Astrid", "Majken");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        btn1.setOnAction(e -> buttonClicked());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(btn1, listView);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    private void buttonClicked(){
        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();

        for(String m : movies){
            System.out.println(m);
        }
    }
}
