package sample;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EpisodeOne extends ControllerComponents{

    private int currentPage = 0;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView sunImg;

    @FXML
    private Text episodeOneTextField;

    @FXML
    private Text PersonName;

    @FXML
    private Button nextSceneButton;

    @FXML
    void initialize() {
        episodeOneTextField.setText("Good morning &3^@(!@");
        nextSceneButton.setOnAction(actionEvent -> {
            currentPage += 1;
            sunImg.setFitWidth(sunImg.getFitWidth() + 120);
                       if (currentPage == 1) {
                           episodeOneTextField.setText("J*43b you hear me?");
                       } else if (currentPage == 2) {
                           episodeOneTextField.setText("J@C0B!");
                       } else if (currentPage == 3) {
                           episodeOneTextField.setText("JAcO;! TIME TO WAKE UP JACOB");
                       } else if (currentPage == 4) {
                           PersonName.setText("Jacob");
                           episodeOneTextField.setText("what..i don't want to wake up, come to me later.. zzzzz");
                       } else if (currentPage == 5) {
                           PersonName.setText("Stranger");
                           Image image = new Image("./Frame/file/other/goodMorningSun2.png");
                           episodeOneTextField.setText("Jacob..");
                           sunImg.setImage(image);
                       } else if (currentPage == 6){
                            episodeOneTextField.setText("YOU SON OF A BITCH, GET UP");
                           Image image = new Image("./Frame/file/other/goodMorningSun3.png");
                           sunImg.setImage(image);
                       }
             });
        }
    }


