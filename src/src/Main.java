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
    Scene scene;
    String input;
    ChoiceBox<String> choiceBox = new ChoiceBox<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Dropdowns");
        Button btn1 = new Button("Click me!");
        btn1.setOnAction(e ->{
            System.out.println(choiceBox.getValue());
        });



        //getItems returns the ObservableList object which can add items to
        choiceBox.getItems().addAll("Apples", "Bananas", "Oranges", "Watermelons");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(btn1, choiceBox);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
}
