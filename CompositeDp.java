package compositepattern;

import javafx.scene.Group;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeDp implements IShape{

    Group groupList;
    List<IShape> allShapes = new ArrayList<>();
    abstract void addShapes();

    public Group draw() {
        groupList = new Group();
        addShapes();
        for (IShape shapes: allShapes) {
            groupList.getChildren().add( (Node) shapes.draw() );
        }
        return groupList;
    }
}
