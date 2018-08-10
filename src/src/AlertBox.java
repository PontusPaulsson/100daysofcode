import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.control.*;

public class AlertBox {

    public static void display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label(message);
        Button closeButton = new Button("Close the alertbox!");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);

        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        //

    }

}
