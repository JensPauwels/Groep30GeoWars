package application.Models.BulletType;

import application.Models.Sprite;
import application.Models.Vector2D;
import javafx.scene.Node;
import javafx.scene.layout.Pane;


public abstract class Bullet extends Sprite {

    private Vector2D destination;
    private int damage;
    private int randomInt;

    public Bullet(Pane bp,Vector2D location,int randomInt){
        super(bp,location,25,12.5);
        this.randomInt = randomInt;


    }

    public Bullet(Pane bp, Vector2D location, Vector2D mouseLoc,int randomInt) {
        super(bp, location, 25, 12.5);
        setDestination(location, mouseLoc);
        this.randomInt = randomInt;
    }

    public int getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(int randomInt) {
        this.randomInt = randomInt;
    }

    @Override
    public abstract Node createView();

    public Vector2D getDestination() {
        return this.destination;
    }

    public boolean outOfDestination() {
        return (getLocation().getY() > 650 || getLocation().getY() < -20 || getLocation().getX() > 820 || getLocation().getX() < -20);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDestination(Vector2D mainLoc, Vector2D mouseLoc) {
        double a = (mouseLoc.getY() - mainLoc.getY()) / (mouseLoc.getX() - mainLoc.getX());
        double b = mouseLoc.getY() - (a * mouseLoc.getX());
        double destinationX = 815;
        if (mainLoc.getX() > mouseLoc.getX()) {destinationX = -15;}
        double destinationY = (a * destinationX) + b;
        this.destination = new Vector2D(destinationX, destinationY);
    }



}
