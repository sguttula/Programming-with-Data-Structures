import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import com.sun.prism.paint.LinearGradient;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Gui extends Application {
	//	public Gui(File arg0) {
	//		super(arg0);
	//		getPixelData();
	//		writeImage(null);
	//	}
	//	public static void main(String[] args) {
	//		String[] options = {"Select image", "Grayscale", "Sepia", "Negative"};
	//		int j = JOptionPane.showOptionDialog(null, message, title, optionType, messageType, icon, options, initialValue)
	//	}
	public void getImage() throws Exception {
		JFileChooser fileChooser = new JFileChooser();
		int hash = fileChooser.showOpenDialog(null);
		if(hash == JFileChooser.APPROVE_OPTION) {
			File read = fileChooser.getSelectedFile();
			Scanner in;
			try {
				in = new Scanner(read);
				while(in.hasNext()) {
					StringBuilder sb = new StringBuilder();
					sb.append(in.nextLine());
					sb.append("\n");
				}
				in.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox h1 = new HBox();			
		Button b1 = new Button("Choose Image");
		b1.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(final ActionEvent e) {
						try {
							File input1 = new File("cat.ppm");
//							File input2 = new File("dog.ppm");
//							File input3 = new File("drink.ppm");
//							File input4 = new File("monalisa.ppm");
//							File input5 = new File("pineapple.ppm");
							getImage();
							Image image1 = SwingFXUtils.toFXImage(ImageIO.read(input1), null);
//							Image image2 = SwingFXUtils.toFXImage(ImageIO.read(input2), null);
//							Image image3 = SwingFXUtils.toFXImage(ImageIO.read(input3), null);
//							Image image4 = SwingFXUtils.toFXImage(ImageIO.read(input4), null);
//							Image image5 = SwingFXUtils.toFXImage(ImageIO.read(input5), null);
							
						} catch (Exception e1) {
							e1.printStackTrace();
						}

					}
				});
		MenuItem mi1 = new MenuItem("Grayscale");
		MenuItem mi2 = new MenuItem("Sepia");
		MenuItem mi3 = new MenuItem("Negative");
		MenuButton mb = new MenuButton("Color Tones", null, mi1, mi2, mi3);
		HBox.setHgrow(b1, Priority.ALWAYS);
		HBox.setHgrow(mb, Priority.ALWAYS);
		b1.setMaxWidth(Double.MAX_VALUE);
		mb.setMaxWidth(Double.MAX_VALUE);
		mb.setAlignment(Pos.CENTER);
		h1 = new HBox(b1, mb);
//		Image image1 = SwingFXUtils.toFXImage(ImageIO.read(input1), null);
//		Image image2 = SwingFXUtils.toFXImage(ImageIO.read(input2), null);
//		Image image3 = SwingFXUtils.toFXImage(ImageIO.read(input3), null);
//		Image image4 = SwingFXUtils.toFXImage(ImageIO.read(input4), null);
//		Image image5 = SwingFXUtils.toFXImage(ImageIO.read(input5), null);
		Scene scene = new Scene(h1, 600, 600);
		primaryStage.setTitle("HW 6");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}