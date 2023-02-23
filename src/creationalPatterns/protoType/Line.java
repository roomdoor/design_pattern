package creationalPatterns.protoType;

public class Line implements ProtoType, Shape {

	Point startPt;
	Point endPt;

	public Point getStartPt() {
		return startPt;
	}

	public Line setStartPt(Point startPt) {
		this.startPt = startPt;
		return this;
	}

	public Point getEndPt() {
		return endPt;
	}

	public Line setEndPt(Point endPt) {
		this.endPt = endPt;
		return this;
	}

	@Override
	public Object copy() {
		Line newLine = new Line();
		newLine.startPt = (Point) startPt.copy();
		newLine.endPt = (Point) endPt.copy();
		return newLine;
	}

	@Override
	public String draw() {
		return "LINE(" + this.startPt.draw() + this.endPt.draw() + ")";
	}

	@Override
	public void moveOffset(int dx, int dy) {
		this.startPt.moveOffset(dx, dy);
		this.endPt.moveOffset(dx, dy);
	}
}
