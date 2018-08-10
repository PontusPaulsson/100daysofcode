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
    CheckBox chkBox1;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Checkboxes");



        //Checkbox
         chkBox1 = new CheckBox("Bacon");

        //Form
        Button btn1 = new Button("Click me!");
        btn1.setOnAction(e->{
                if(chkBox1.isSelected())
                    System.out.println("You want bacon.");
                else
                    System.out.println("You dont want bacon.");
        });


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(btn1, chkBox1);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
}
