package AbstractPractice;

public class Main {
    public static void main(String[] args) {
        Rectangle rt = new Rectangle(23,24);
        Circle cr = new Circle(24);
        Triangle tr = new Triangle(23,5);

        double RectangleArea = rt.Calculate();
        double CircleArea = cr.Calculate();
        double TriangleArea = tr.Calculate();

        System.out.printf("\n Area of Rectangle is: %.2f",RectangleArea);
        System.out.printf("\n Area of Circle is: %.2f",CircleArea);
        System.out.printf("\n Area of TriangleArea is: %.2f",TriangleArea);

    }
}
