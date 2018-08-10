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
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Title.");

        //Form
        TextField nameInput = new TextField();
        Button btn1 = new Button("Click me!");

        btn1.setOnAction(e-> {
            if(isInt(nameInput.getText()))
                input = nameInput.getText();
            else
                System.out.println("Print a valid number!");
        });


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(nameInput, btn1);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    private boolean isInt(String text){

        try{
            int i = Integer.parseInt(text);
            return true;
        }
        catch (NumberFormatException ex){
            return false;
        }
    }
}
