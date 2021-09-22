package compositepattern;

public class RectangleShape extends CompositeDp {

    int x, y, height, width;

    public RectangleShape(int x, int y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    void addShapes() {
        allShapes.add(new LinePattern(x,y, x+width, y));
        allShapes.add(new LinePattern(x,y, x, y+height));
        allShapes.add(new LinePattern(x+width,y, x+width, y+height));
        allShapes.add(new LinePattern(x,y+height, x+width, y+height));
    }
}
