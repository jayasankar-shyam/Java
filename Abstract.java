package java_pgms;

abstract class Shape{
	abstract void numberOfSides();
}
class Rectangle extends Shape{
	void numberOfSides() {
		System.out.println("Rectangle has 4 sides");
	}
}
class Triangle extends Shape{
	void numberOfSides() {
		System.out.println("Triangle has 3 sides");
	}
}
class Hexagon extends Shape{
	void numberOfSides() {
		System.out.println("Hexagon has 6 sides");
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		Shape sh;
		sh=new Rectangle();
		sh.numberOfSides();
		sh=new Triangle();
		sh.numberOfSides();
		sh=new Hexagon();
		sh.numberOfSides();
	}

}
