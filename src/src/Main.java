import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.control.*;

public class Main extends Application  {

    Stage window;
    Button btn1;
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Stupid Title!");

        btn1 = new Button("Click me!");

        StackPane layout1 = new StackPane();
        layout1.getChildren().add(btn1);

        Scene scene1 = new Scene(layout1, 300,300);
        window.setScene(scene1);
        window.show();

    }

}
