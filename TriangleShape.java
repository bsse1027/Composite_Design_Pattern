package compositepattern;

public class TriangleShape extends CompositeDp {
    int x, y, base, height;

    public TriangleShape(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    void addShapes() {
        allShapes.add(new LinePattern(x, y, x, y+height));
        allShapes.add(new LinePattern(x, y, x+base, height));
        allShapes.add(new LinePattern(x, y+height, x+base, height));
    }
}
