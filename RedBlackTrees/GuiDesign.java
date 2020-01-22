package hw4trees;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
public class GuiDesign extends Application {
	@Override
	public void start(Stage primaryStage) {
		RBTree<Integer> tree = new RBTree<>(); 
		BorderPane pane = new BorderPane();
		BTView view = new BTView(tree); // 
		pane.setCenter(view);
		TextField tfKey = new TextField();
		tfKey.setPrefColumnCount(3);
		tfKey.setAlignment(Pos.BASELINE_RIGHT);
		Button btInsert = new Button("Insert");
		Button btDelete = new Button("Delete");
		HBox hBox = new HBox(5);
		hBox.getChildren().addAll(new Label("Enter a key: "),
				tfKey, btInsert, btDelete);
		hBox.setAlignment(Pos.CENTER);
		pane.setBottom(hBox);
		btInsert.setOnAction(e -> {
			int key = Integer.parseInt(tfKey.getText());
			if (tree.search(key)) { 
				view.displayTree();
				view.setStatus("The key " + "'" + key + "'" + " is in the tree already");
			} else {
				tree.insert(key);
				view.displayTree();
				view.setStatus("The key " + "'" + key + "'" + " has been added to the tree");
			}
		});
		btDelete.setOnAction(e -> {
			int key = Integer.parseInt(tfKey.getText());
			if (!tree.search(key)) { 
				view.displayTree();
				view.setStatus("The key " + "'" + key + "'" + " is currently not in the tree");
			} else {
				tree.delete(key); 
				view.displayTree();
				view.setStatus("The key " + "'" + key + "'" + " has been removed from the tree");
			}
		});
		Scene scene = new Scene(pane, 600, 600);
		primaryStage.setTitle("RBTree Animation");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}