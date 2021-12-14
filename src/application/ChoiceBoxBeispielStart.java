package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class ChoiceBoxBeispielStart extends Application {

	private Stage grundStage;
	//
    private AnchorPane grundPane;

	@Override
	public void start(Stage pPrimaryStage) throws IOException
	{
		this.grundStage = pPrimaryStage;
		grundStage.setTitle("keine Statistik");
        FXMLLoader lLoader = new FXMLLoader();
        lLoader.setLocation(ChoiceBoxBeispielStart.class.getResource("ChoiceBoxBeispielView.fxml"));
        grundPane = lLoader.load();

        Scene lScene = new Scene(grundPane);
        grundStage.setScene(lScene);
        grundStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
