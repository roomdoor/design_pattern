package creationalPatterns.protoType;

import java.util.ArrayList;
import java.util.List;

public class Group implements ProtoType, Shape {

	private List<Shape> shapes = new ArrayList<>();

	private String name;

	public Group(String name) {
		this.name = name;
	}

	public Group addShape(Shape shape) {
		this.shapes.add(shape);
		return this;
	}

	@Override
	public Object copy() {
		Group newGroup = new Group(name);
		for (Shape value : shapes) {
			ProtoType shape = (ProtoType) value;
			newGroup.addShape((Shape) shape.copy());
		}

		return newGroup;
	}

	@Override
	public String draw() {
		StringBuilder sb = new StringBuilder(name + "(");

		for (int i = 0; i < this.shapes.size(); i++) {
			sb.append(shapes.get(i).draw());
			if (shapes.size() - 1 != i) {
				sb.append(" ");
			}
		}

		sb.append(")");
		return  sb.toString();
	}

	@Override
	public void moveOffset(int dx, int dy) {
		for (Shape s : this.shapes) {
			s.moveOffset(dx, dy);
		}
	}
}
