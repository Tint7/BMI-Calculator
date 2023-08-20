package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage Stage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("BMI.fxml"));
		Stage.setScene(new Scene(root));
		Stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
