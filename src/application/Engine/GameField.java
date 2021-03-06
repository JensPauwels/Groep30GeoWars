package application.Engine;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXProgressBar;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by jens on 03/12/2016.
 */
public class GameField {

    private Pane playfield;
    private Label highscoreLabel, livesLabel, waveLabel, activatedPowerupLabel;
    private JFXButton stop = new JFXButton(" ");
    private JFXButton pause = new JFXButton(" ");
    private JFXProgressBar bossHealth = new JFXProgressBar();



    public GameField(){
        this.playfield = new Pane();
        playfield.setMinWidth(800);
        playfield.setMinHeight(600);
        playfield.setId("gameScreen");
        highscoreLabel = new Label("0");
        waveLabel = new Label("1");
        livesLabel = new Label("3");
        activatedPowerupLabel = new Label();
        activatedPowerupLabel.setVisible(false);
        this.playfield.getChildren().addAll(highscoreLabel, livesLabel, waveLabel,stop,pause, activatedPowerupLabel,bossHealth);
        highscoreLabel.setLayoutX(100);
        highscoreLabel.setLayoutY(20);
        livesLabel.setLayoutX(300);
        livesLabel.setLayoutY(20);
        waveLabel.setLayoutX(550);
        waveLabel.setLayoutY(20);
        activatedPowerupLabel.setLayoutX(350);
        activatedPowerupLabel.setLayoutY(100);
        stop.setLayoutX(720);
        stop.setMinSize(70,50);
        stop.setFocusTraversable(false);
        pause.setFocusTraversable(false);
        pause.setLayoutX(680);
        pause.setMinSize(30,50);
        bossHealth.setVisible(false);


    }


    public Pane getScreen(){
        return this.playfield;
    }

    public Button getStop() {
        return stop;
    }

    public Button getPause() { return pause;}

    public void updateHighscore(int highscore){
        highscoreLabel.setText(Integer.toString(highscore));
    }

    public void updateWaves(int waves){
        waveLabel.setText(Integer.toString(waves));
    }

    public void updateLives(int lives){
        livesLabel.setText(Integer.toString(lives));
    }

    public void setActivatedPowerupLabel(String tekst){
        activatedPowerupLabel.setText("Activated Powerup: " + tekst);
        activatedPowerupLabel.setVisible(true);
    }
    public void setActivatedPowerupLabelInvisible(){
        activatedPowerupLabel.setVisible(false);
    }

    public Boolean getActivatedPowerupLabel(){

        return activatedPowerupLabel.isVisible();};

    public JFXProgressBar getBossHealth(){
        return bossHealth;
    }

}
