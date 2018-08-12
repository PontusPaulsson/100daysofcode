package src;

import com.sun.javafx.scene.control.behavior.TreeViewBehavior;
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
    TreeView<String> treeView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("TreeView");

        TreeItem<String> root, camilla, pontus;
        //root - container for branches
        root =  new TreeItem<>();
        root.setExpanded(true); //When you start the program everything is collapsed.
        //camilla
        camilla = makeBranch("Camilla", root);
        makeBranch("Sveriges Radio", camilla);

        //Pontus
        pontus = makeBranch("Pontus", root);
        makeBranch("CGI", pontus);

        //Create tree
        treeView = new TreeView<>(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedItemProperty()
                .addListener((v, oldValue, newValue) -> {
                   if(newValue != null){
                       System.out.println(newValue.getValue());
                   }
                });

        StackPane layout = new StackPane();
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().add(treeView); // A little bit different

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    public TreeItem<String> makeBranch(String name, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(name);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }

}
