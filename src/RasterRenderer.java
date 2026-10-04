public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a Circle as pixels (Raster). Radius: " + radius);
    }
    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a Square as pixels (Raster). Side: " + side);
    }
}