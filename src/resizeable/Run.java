package resizeable;

public class Run {
    public static void main(String[] args) {
        int number4 = (int) Math.floor(Math.random()*100);
        int number1 = (int) Math.floor(Math.random()*100);
        int number2 = (int) Math.floor(Math.random()*100);
        int number3 = (int) Math.floor(Math.random()*100);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Pink", true, number1);
        shapes[1] = new Rectangle("Black", false, number2, number3);
        shapes[2] = new Square(number4, "Green", false);

        for (Shape display : shapes) {
            System.out.println(display.toString());
        }

        System.out.println();

        for (Shape b : shapes) {
            b.resize(Math.random()*100);
        }

        Shape.show(shapes);
    }
}
