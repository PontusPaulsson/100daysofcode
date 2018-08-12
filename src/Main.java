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
    TableView tableView;
    Button addBtn;
    TextField nameField;
    TextField priceField;
    TextField quantityField;
    ObservableList<Product> products = FXCollections.observableArrayList();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("TreeView");

        //Textfield for Name
        nameField = new TextField("Name");

        //Textfield for Price
        priceField = new TextField("Price");

        //Textfield for Quantity
        quantityField = new TextField("Quantity");



        //Add btn
        addBtn = new Button("Add");
        addBtn.setOnAction(e -> {
            Product p = new Product(nameField.getText(), Double.parseDouble(priceField.getText()), Integer.parseInt(quantityField.getText()));
            tableView.setItems(addProduct(p));

        });

        //Name column
        TableColumn<Product, String> name = new TableColumn<>("Name");
        name.setMinWidth(200);
        name.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<Product, String> price = new TableColumn<>("Price");
        price.setMinWidth(200);
        price.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity column
        TableColumn<Product, String> quantity = new TableColumn<>("Quantity");
        quantity.setMinWidth(200);
        quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));


        tableView = new TableView();
        tableView.setEditable(false);
        tableView.setItems(getProduct());
        tableView.getColumns().addAll(name, price, quantity); //add columns to tableview

        VBox layout = new VBox();
        layout.getChildren().addAll(tableView, nameField, priceField, quantityField, addBtn); //add tableview to layout

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    //Get all of the products
    public ObservableList<Product> getProduct(){
        products.add(new Product("Dell", 500.00, 100));
        products.add(new Product("Soundsystem", 99.00, 100));
        products.add(new Product("Apple", 0.99, 100));
        products.add(new Product("Toilet", 99, 100));
        products.add(new Product("NCorn", 1.49, 100));

        return products;
    }
    public ObservableList<Product> addProduct(Product product){
        products.add(new Product(product.getName(), product.getPrice(), product.getQuantity()));

        return products;
    }
}
