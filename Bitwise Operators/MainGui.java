import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainGui extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Gui root1  = new Gui();
		Scene scene = new Scene(root1, 500, 500);
		//scene.getStylesheets().add("application/application.css");
		primaryStage.setTitle("HW 6");
		primaryStage.setScene(scene);
		primaryStage.show();
		root1.start();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
