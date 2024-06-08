package hust.soict.program.test.screen.customer.store;

import hust.soict.cybersec.aims.screen.customer.controller.ViewStoreController;
import hust.soict.cybersec.aims.cart.Cart.Cart;
import hust.soict.cybersec.aims.cart.Cart.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application{
	private static Store store;
	private static Cart cart;
	@Override
	public void start(Stage primaryStage) throws Exception {
		final String STORE_FXML_FILE_PATH = "hust/soict/cyber/aims/screen/customer/view/Store.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
		ViewStoreController viewStoreController = new ViewStoreController(store, cart);
		fxmlLoader.setController(viewStoreController);
		Parent root = fxmlLoader.load();
		
		primaryStage.setTitle("Store");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		store = new Store();
		store.input();
		
		launch(args);
	}
	

}
