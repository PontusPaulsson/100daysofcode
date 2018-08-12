package src;

import com.sun.javafx.scene.control.behavior.TreeViewBehavior;
import com.sun.xml.internal.bind.v2.runtime.property.PropertyFactory;
import javafx.application.*;
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
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("TreeView");

        //File menu
        Menu fileMenu = new Menu("File");

        //Menu items
        fileMenu.getItems().add(new MenuItem("New Project...")); //... means that a new window (stage) will be opened.
        fileMenu.getItems().add(new MenuItem("New Module..."));
        fileMenu.getItems().add(new MenuItem("Import Project..."));

        //Main menubar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);

        layout = new BorderPane();
        layout.setTop(menuBar); //Add menubar to the top of the layout - Use instead of getChildren().addAll.

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }
}
