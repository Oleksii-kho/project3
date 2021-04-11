package temp;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Main main = new Main();
        main.d(circle);
        main.d(rectangle);

    }

    public void d (Shape shape) {
        shape.draw();
    }
}
