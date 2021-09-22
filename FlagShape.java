package compositepattern;

public class FlagShape extends CompositeDp {
    int x,y, height, width;

    public FlagShape(int x, int y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    void addShapes() {
        allShapes.add(new RectangleShape(x, y, height, width));
        allShapes.add(new CirclePattern(x+(width/2), y+(height/2), height/3));
    }
}
