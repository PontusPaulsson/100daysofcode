import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.control.*;

public class Main extends Application {

    Stage window;
    Button btn1;
    Button btn2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Stupid Title!");

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        btn1 = new Button("Close program");
        btn1.setOnAction(e -> closeProgram());

        VBox layout1 = new VBox();
        layout1.getChildren().addAll(btn1);
        layout1.setAlignment(Pos.CENTER);
        Scene scene1 = new Scene(layout1, 300, 300);
        window.setScene(scene1);
        window.show();

    }

    private void closeProgram(){
        Boolean answer = ConfirmBox.display("Title", "Sure you want to close the window.");
        if(answer){
            System.out.println("File is saved.");
            window.close();
        }
    }

}
