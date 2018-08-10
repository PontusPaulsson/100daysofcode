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
    Button btn2;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Stupid Title!");

        btn1 = new Button("Show AlertBox!");
        btn1.setOnAction(e -> AlertBox.display("AlertBox", "This is an alertbox."));

        btn2 = new Button("Show ConfirmaBox");
        btn2.setOnAction(e -> System.out.println(ConfirmBox.display("ConfirmationBox", "Are you sure?")));

        VBox layout1 = new VBox();
        layout1.getChildren().addAll(btn1, btn2);

        Scene scene1 = new Scene(layout1, 300,300);
        window.setScene(scene1);
        window.show();

    }

}
