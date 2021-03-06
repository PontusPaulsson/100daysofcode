package src;

/*import com.sun.javafx.scene.control.behavior.TreeViewBehavior;
import com.sun.xml.internal.bind.v2.runtime.property.PropertyFactory;*/
import com.sun.corba.se.impl.logging.POASystemException;
import javafx.application.*;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.control.*;

import javax.print.DocFlavor;
import java.util.Observable;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("This is just a title.");

        //Input and labels
        TextField userInput = new TextField();
        userInput.setMaxWidth(200);

        Label firstLabel = new Label("Welcome to the site ");
        Label secondLabel = new Label("");

        HBox bottomText = new HBox(firstLabel, secondLabel);
        bottomText.setAlignment(Pos.CENTER);


        VBox vBox = new VBox(10, userInput, bottomText);
        vBox.setAlignment(Pos.CENTER);

        secondLabel.textProperty().bind(userInput.textProperty()); //bind the secondLabel to userInput.textProperty so whenever it changes it will update the label.

        Scene scene = new Scene(vBox, 300, 250);
        window.setScene(scene);
        window.show();

    }
}
