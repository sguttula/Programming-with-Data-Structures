package hw3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\Sidgu_000\\Desktop\\"
				+ "college\\year2\\springsemester2017\\cs2013\\"
				+ "lab3file.txt");
		Scanner sc = new Scanner(file);
		String qwerty1 = " " + sc.nextLine();
		String qwerty2 = " " + sc.nextLine();
		String qwerty3 = " " + sc.nextLine();
		sc.nextLine();
		System.out.println(qwerty1 + qwerty2 + qwerty3);
		while(sc.hasNext()) {
			String space = sc.nextLine();
			String [] qwerty = space.split(",");
			for(int i = 0 ; i < qwerty.length ; i++) {
				System.out.println(qwerty[i]);
			}
		}	
		launch(args); 
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane chart = new BorderPane();
		Scene sc = new Scene(chart, 820, 580);
		primaryStage.setTitle("Test");
		sc.getStylesheets().add("gui/application.css");
		HBox one = new HBox();
		one.getStyleClass().add("hbox1");
		Label l = new Label("Test");		
		one.getChildren().add(l);
		GridPane gridsp = new GridPane();
		//		HBox two = new HBox();
		//		two.getStyleClass().add("hbox2");
		//		String get = input.getText();
		//		Button b = new Button("Find Problems");
		//		two.getChildren().add(b);
		for (int i = 0; i <= 11; i++) {
			for (int j = 0; j <= 11; j++) {
				String qwerty = null;
				if (i == 0) {
					qwerty = " Linked ";	
					HBox three = new HBox();
					Button grids = new Button(qwerty);
					grids.setMinWidth(75);
					grids.setMinHeight(50);
					grids.getStyleClass().add("colums2");
					three.getChildren().add(grids);
					gridsp.add(grids, j, i);		
				}
				else if (j == 0) {
					qwerty = " Eye Color ";	
					VBox four = new VBox();
					Button grids2 = new Button(qwerty);
					grids2.setMinWidth(75);
					grids2.setMinHeight(50);
					grids2.getStyleClass().add("colums2");
					four.getChildren().add(grids2);
					gridsp.add(grids2, j, i);
				}
				else if(i == 10) {
					qwerty = " List ";	
					VBox four = new VBox();
					Label grids2 = new Label(qwerty);
					grids2.getStyleClass().add("colums2");
					//four.setBackground(java.awt.Color.RED);
					four.getChildren().add(grids2);
					gridsp.add(grids2, j, i);
				}
				else if(j == 10) {
					qwerty = " Age ";	
					//HBox three = new HBox();
					Label grids = new Label(qwerty);
					//					grids.setMinWidth(75);
					//					grids.setMinHeight(50);
					grids.getStyleClass().add("colums2");
					//three.getChildren().add(grids);
					gridsp.add(grids, j, i);
				}
				else if(i == 5) {
					qwerty = " ^ ";	
					VBox four = new VBox();
					Label grids2 = new Label(qwerty);
					grids2.getStyleClass().add("colums2");
					//four.setBackground(java.awt.Color.RED);
					four.getChildren().add(grids2);
					gridsp.add(grids2, j, i);
				}
				else if(j == 5) {
					qwerty = " --> ";	
					VBox four = new VBox();
					Label grids2 = new Label(qwerty);
					grids2.getStyleClass().add("colums2");
					//four.setBackground(java.awt.Color.RED);
					four.getChildren().add(grids2);
					gridsp.add(grids2, j, i);
				}
//				else if(i == 5 && j == 5) {
//					qwerty = " * ";	
//					VBox four = new VBox();
//					Label grids2 = new Label(qwerty);
//					grids2.getStyleClass().add("colums2");
//					//four.setBackground(java.awt.Color.RED);
//					four.getChildren().add(grids2);
//					gridsp.add(grids2, j, i);
//				}
				
				else {
					qwerty = " Profession ";
					Label grids = new Label(qwerty);
					grids.getStyleClass().add("colums2");
					gridsp.add(grids, j, i);
				}
				Label label = new Label(qwerty);
				label.setMinWidth(75);
				label.setMinHeight(50);

				if(i == 10) {
					label.getStyleClass().add("columns");
				}
				else if(j == 10) {
					label.getStyleClass().add("columns");
				}
				else if(i == 0) {
					label.getStyleClass().add("columns");
				}
				else if(j == 0) {
					label.getStyleClass().add("columns");
				}
				else if(j == 5) {
					label.getStyleClass().add("columns");
				}
				else if(i == 5) {
					label.getStyleClass().add("columns");
				}
				else {
					label.getStyleClass().add("gridpane");
				}
				if(qwerty.equals(" -> " + j + " <- ") || qwerty.equals(" -> " + i + " <- ")) {
					label.getStyleClass().add("columns2");
				}
				gridsp.add(label, j, i); 
				chart.setTop(one);
				//chart.setCenter(two);
				chart.setCenter(gridsp);
				primaryStage.setScene(sc);
				primaryStage.show();
				//chart.qwerty();
			}
		}

	}
}

