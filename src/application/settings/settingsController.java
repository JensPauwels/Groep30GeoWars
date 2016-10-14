package application.settings;

import application.Client;
import application.Engine;
import com.jfoenix.controls.JFXToggleButton;
import javafx.fxml.FXML;

public class settingsController {
    public JFXToggleButton music,autoSave;
    public Engine instance  = Engine.getInstance();


    @FXML
    public void initialize() {
        music.setSelected(instance.getCurrentUser().getSettings().isMusic());
        autoSave.setSelected(instance.getCurrentUser().getSettings().isAutoSave());
    }

    @FXML
    public void setMusic(){
        instance.getCurrentUser().getSettings().setMusic(music.isSelected());
    }

    @FXML
    public void setAutoSave(){
        instance.getCurrentUser().getSettings().setAutoSave(autoSave.isSelected());
    }


    @FXML
    public void loadGameOptions(){
        Client.loadScreen("gameOptions");
    }

    // in deze class moeten we allemaal settings bedenken oa
    // - Muziek of niet

    //DIT IS PAS UITBREIDNIG
    // - linken aan social media
    // - online/ ofline display
    // - personal records bekijken?
    // - total active gameplay bekijken?
    // - GameName changen? (pas om de maand mogelijk) => no fucking idea hoe je op tijd checkt :p
}
