package application.game.Components;

import javafx.scene.Node;
import javafx.scene.shape.Circle;

public class Bullet extends Sprite {
    public Bullet(Layer layer, Vector2D location, Vector2D velocity, Vector2D acceleration, double width, double height) {
        super(layer, location, velocity, acceleration, width, height);
    }

    @Override
    public Node createView() {

        Circle circle = new Circle();
        circle.setCenterX(10);
        circle.setCenterY(10);
        circle.setRadius(5.0);
        return circle;
    }

}
