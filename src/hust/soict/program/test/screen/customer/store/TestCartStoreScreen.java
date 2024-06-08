package hust.soict.program.test.screen.customer.store;

import hust.soict.cybersec.aims.cart.Cart.Cart;
import hust.soict.cybersec.aims.cart.Cart.Store;
import hust.soict.cybersec.aims.screen.customer.controller.CartController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestCartStoreScreen extends Application {
    private static Store store;
    private static Cart cart;

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String CART_FXML_FILE_PATH = "/AimsProject/hust/soict/ict/aims/screen/customer/view/Cart.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource(CART_FXML_FILE_PATH));
        CartController cartController = new CartController(store, cart);
        fxmlLoader.setController(cartController);
        Parent root = fxmlLoader.load();

        primaryStage.setTitle("Cart");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        cart = new Cart();
        store = new Store();
        store.input();
        launch(args);
    }
}