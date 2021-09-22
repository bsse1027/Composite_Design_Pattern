package compositepattern;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("Composite Pattern");
        VBox vBox = new VBox();
        vBox.setStyle("-fx-background-color: #8fbc8f;");
        vBox.setAlignment(Pos.CENTER);

        Button line = new Button("Primary Line");
        Button circle = new Button("Primary Circle");
        Button rectangle = new Button("Composite Rectangle");
        Button flag = new Button("Composite Flag");
        Button triangle = new Button("Composite Triangle");

        line.setStyle("-fx-background-color: \n" +
                "        linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),\n" +
                "        linear-gradient(#020b02, #3a3a3a),\n" +
                "        linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),\n" +
                "        linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),\n" +
                "        linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);\n" +
                "    -fx-background-insets: 0,1,4,5,6;\n" +
                "    -fx-background-radius: 9,8,5,4,3;\n" +
                "    -fx-padding: 15 30 15 30;\n" +
                "    -fx-font-family: \"Helvetica\";\n" +
                "    -fx-font-size: 18px;\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-text-fill: white;\n" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
        circle.setStyle("-fx-background-color: \n" +
                "        linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),\n" +
                "        linear-gradient(#020b02, #3a3a3a),\n" +
                "        linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),\n" +
                "        linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),\n" +
                "        linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);\n" +
                "    -fx-background-insets: 0,1,4,5,6;\n" +
                "    -fx-background-radius: 9,8,5,4,3;\n" +
                "    -fx-padding: 15 30 15 30;\n" +
                "    -fx-font-family: \"Helvetica\";\n" +
                "    -fx-font-size: 18px;\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-text-fill: white;\n" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");

        rectangle.setStyle("-fx-background-color: \n" +
                "        linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),\n" +
                "        linear-gradient(#020b02, #3a3a3a),\n" +
                "        linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),\n" +
                "        linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),\n" +
                "        linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);\n" +
                "    -fx-background-insets: 0,1,4,5,6;\n" +
                "    -fx-background-radius: 9,8,5,4,3;\n" +
                "    -fx-padding: 15 30 15 30;\n" +
                "    -fx-font-family: \"Helvetica\";\n" +
                "    -fx-font-size: 18px;\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-text-fill: white;\n" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");

        flag.setStyle("-fx-background-color: \n" +
                "        linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),\n" +
                "        linear-gradient(#020b02, #3a3a3a),\n" +
                "        linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),\n" +
                "        linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),\n" +
                "        linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);\n" +
                "    -fx-background-insets: 0,1,4,5,6;\n" +
                "    -fx-background-radius: 9,8,5,4,3;\n" +
                "    -fx-padding: 15 30 15 30;\n" +
                "    -fx-font-family: \"Helvetica\";\n" +
                "    -fx-font-size: 18px;\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-text-fill: white;\n" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");

        triangle.setStyle("-fx-background-color: \n" +
                "        linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),\n" +
                "        linear-gradient(#020b02, #3a3a3a),\n" +
                "        linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),\n" +
                "        linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),\n" +
                "        linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);\n" +
                "    -fx-background-insets: 0,1,4,5,6;\n" +
                "    -fx-background-radius: 9,8,5,4,3;\n" +
                "    -fx-padding: 15 30 15 30;\n" +
                "    -fx-font-family: \"Helvetica\";\n" +
                "    -fx-font-size: 18px;\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-text-fill: white;\n" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");

        EventHandler<ActionEvent> lineEvent = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AnchorPane anchorPaneLine = new AnchorPane();

                anchorPaneLine.getChildren().add(new LinePattern(200,200,300,200).draw());

                stage.setScene(new Scene(anchorPaneLine, 500, 500));
            }
        };

        EventHandler<ActionEvent> circleEvent = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AnchorPane anchorPaneCircle = new AnchorPane();

                anchorPaneCircle.getChildren().add(new CirclePattern(250,250,100).draw());

                stage.setScene(new Scene(anchorPaneCircle, 500, 500));
            }
        };

        EventHandler<ActionEvent> RectangleEvent = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AnchorPane anchorPaneRectangle = new AnchorPane();

                anchorPaneRectangle.getChildren().add(new RectangleShape(200,200,200,100).draw());

                stage.setScene(new Scene(anchorPaneRectangle, 500, 500));
            }
        };

        EventHandler<ActionEvent> TriangleEvent = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Button b= new Button("Back");

                AnchorPane anchorPaneTriangle = new AnchorPane();

                anchorPaneTriangle.getChildren().add(new TriangleShape(200,200,300, 200).draw());

                stage.setScene(new Scene(anchorPaneTriangle, 500, 500));
            }
        };

        EventHandler<ActionEvent> FlagEvent = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AnchorPane anchorPaneFlag = new AnchorPane();

                anchorPaneFlag.getChildren().add(new FlagShape(100,100,120, 100).draw());

                stage.setScene(new Scene(anchorPaneFlag, 500, 500));
            }
        };

        line.setOnAction(lineEvent);
        circle.setOnAction(circleEvent);
        rectangle.setOnAction(RectangleEvent);
        flag.setOnAction(FlagEvent);
        triangle.setOnAction(TriangleEvent);
        Button button = new Button("Back");

        vBox.getChildren().addAll(
                line, circle , triangle, rectangle, flag);
        vBox.setSpacing(15);

        stage.setScene(new Scene(vBox, 500, 500));
        stage.show();
    }


    public static void main(String[] args) {
        // Launch
        launch(args);
    }
}
