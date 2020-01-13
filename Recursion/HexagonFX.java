package HW1;
import HW1.HexDriver;
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon; 
import javafx.stage.Stage;  
public class HexagonFX extends Application { 
   @Override 
   public void start(Stage stage) {
	   Pane pne = new Pane();
	   Polygon hexagon = new Polygon();
	   Polygon hexagon2 = new Polygon();
		Polygon hexagon3 = new Polygon();
		Polygon hexagon4 = new Polygon();
		Polygon hexagon5 = new Polygon();
		Polygon hexagon6 = new Polygon();
		Polygon hexagon7 = new Polygon();
	   pne.getChildren().add(hexagon);
      hexagon.getPoints().addAll(new Double[]{ 
 		  
    		  
    		  
    		  
    		   200.0, 50.0, 
    		   400.0, 50.0, 
    		   450.0, 150.0,          
    		   400.0, 250.0, 
    		   200.0, 250.0,                   
    		   150.0, 150.0,
		   
		   
//		   300.0, 50.0, 
//   		   450.0, 50.0, 
//   		   450.0, 150.0,          
//   		   500.0, 250.0, 
//   		   500.0, 250.0,                   
//		   200.0, 150.0
                   // 546, 569
         
      }); 
      hexagon2.getPoints().addAll(new Double[]{ 
     		  
    		  
    		  
    		
                  // 546, 569
        
     }); 
      hexagon.setFill(Color.WHITE);
      hexagon.setStroke(Color.BLACK);
      hexagon2.setFill(Color.BLUE);
      hexagon2.setStroke(Color.BLACK);
      final double width = 600 , height = 600;
      double centerWidth = width / 2, centerHeight = height / 2;
      double radius = Math.min(width, height);
      int a = 6;
      double width2[] = new double[a];
      double height2[] = new double[a];
      
//      for(int i = 0 ; i < 6 ; i++) {
//    	  width[i] = 
//      }
      Group root = new Group(hexagon); 
      Group root2 = new Group(hexagon2);
      Scene scene = new Scene(root, 600, 600);
      Scene scene2 = new Scene(root2, 600, 600);
      stage.setTitle("Hexagons");
      stage.setScene(scene2);
      stage.setScene(scene);
      
      stage.show(); 
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
}