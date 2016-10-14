package application.singlePlayer;

import application.Client;
import javafx.fxml.FXML;

import java.io.IOException;

public class SinglePlayerController {

    @FXML
    public void initialize() {
        //uitzoeken hoe we hier een andere static void main args aan kunnen linken => is dit uberhaupt wel mogelijk? googlen of navragen bij docenten
        // bedoeling zou zijn om de Java Class SinglePLayer hier in uit te voeren (deze extend gameApplication van FXGL)
    }

    @FXML
    private void loadGameOptions() throws IOException {
        Client.loadScreen("gameOptions");
        //popup screen maken die zegt ben je zeker als je wilt stoppen => indien van nee popup weg indien van wel => volgende question als hij wilt saven
    }
}
