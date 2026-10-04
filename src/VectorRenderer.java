public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a Circle as lines (Vector). Radius: " + radius);
    }
    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a Square as lines (Vector). Side: " + side);
    }
}