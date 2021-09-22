package compositepattern;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirclePattern implements IShape{

    int x, y, r;

    public CirclePattern(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public Circle draw() {
        Circle circle = new Circle();

        circle.setCenterX(x);
        circle.setCenterY(y);
        circle.setRadius(r);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(1);
        circle.setFill(null);

        return circle;
    }
}
