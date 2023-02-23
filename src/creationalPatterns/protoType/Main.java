package creationalPatterns.protoType;

public class Main {

	public static void main(String[] args) {
		Point pt1 = new Point();
		pt1.setX(0).setY(0);
		System.out.println(pt1.draw());
		System.out.println();

		pt1.moveOffset(10, 10);
		System.out.println(pt1.draw());
		System.out.println();

		Point pt2 = (Point) pt1.copy();
		pt2.moveOffset(-10, -10);
		System.out.println(pt1.draw());
		System.out.println(pt2.draw());
		System.out.println();

		Line line1 = new Line();
		line1.setStartPt((Point) pt1.copy()).setEndPt((Point) pt2.copy());
		System.out.println(pt1.draw());
		System.out.println(pt2.draw());
		System.out.println(line1.draw());
		System.out.println();

		line1.moveOffset(10, 10);
		System.out.println(pt1.draw());
		System.out.println(pt2.draw());
		System.out.println(line1.draw());
		System.out.println();

		pt1.setX(0).setY(0);
		pt2.setX(0).setY(10);
		Point pt3 = new Point();
		pt3.setX(10).setY(0);
		Point pt4 = new Point();
		pt4.setX(10).setY(10);

		line1.setStartPt(pt1).setEndPt(pt2);

		Line line2 = new Line();
		line2.setStartPt(pt2).setEndPt(pt4);
		Line line3 = (Line) line1.copy();
		line3.moveOffset(10, 0);
		Line line4 = (Line) line2.copy();
		line4.moveOffset(0, -10);

		Group group = new Group("사각형");
		group.addShape(line1).addShape(line2).addShape(line3).addShape(line4);
		System.out.println(group.draw());

		Group copyGroup = (Group) group.copy();
		copyGroup.moveOffset(10, 10);

		System.out.println(group.draw());
		System.out.println(copyGroup.draw());
	}

}
