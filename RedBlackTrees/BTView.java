package hw4trees;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
public class BTView extends Pane {
	private RBTree<Integer> pane = new RBTree<>();
	private double r;
	private double l;
	BTView(RBTree<Integer> redBlack) {
		this.pane = redBlack;
		setStatus("Tree is currently empty, insert a key.");
	}
	public void setStatus(String msg) {
		getChildren().add(new Text(40, 40, msg));
	}
	public void displayTree() {
		l = 50;
		this.getChildren().clear();
		if (pane.getRoot() != null) {
			displayTree(pane.getRoot(), getWidth() / 2, l,
					getWidth() / 4);
		}
	}
	private void displayTree
	(RBTree.Node<Integer> root,
			double formationH,
			double formationV,
			double hGap) {
		if (root.left != null) {
			getChildren().add(new Line
					(formationH - hGap, formationV + l,
					formationH, formationV));
			displayTree(root.left,
					formationH - hGap, formationV + l,
					hGap / 2);
		}
		if (root.right != null) {
			getChildren().add(new Line
					(formationH + hGap, formationV + l,
							formationH, formationV));
			displayTree(root.right,
					formationH + hGap, formationV + l,
					hGap / 2);
		}
		r = 25;
		Circle circle = new Circle(formationH, formationV, r);
		Circle c1 = new Circle(formationH, formationV, r);
		getChildren().addAll(c1, new Text
				(formationH - 4, formationV + 4,
						root.node + ""));
		circle.setFill(Color.RED);
		circle.setStroke(Color.BLACK);
		getChildren().addAll(circle, new Text
				(formationH - 4, formationV + 4,
						root.node + ""));
		
		c1.setFill(Color.BLACK);
		c1.setStroke(Color.WHITE);
	}
}