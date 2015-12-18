package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy)throws IllegalRectangle {
		super(newx, newy);
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

}