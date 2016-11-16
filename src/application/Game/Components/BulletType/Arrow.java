package application.Game.Components.BulletType;

import application.Game.Components.Vector2D;
import javafx.scene.layout.Pane;

public class Arrow extends Bullet {

    public Arrow(Pane bp, Vector2D mainLoc, Vector2D mouseLoc) {
        super(bp, mainLoc, mouseLoc);
        this.setDamage(2);
        this.setMaxSpeed(100);


    }

}
