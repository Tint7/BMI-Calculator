package application;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIController implements Initializable
{
	@FXML
	private TextField weightp;
	@FXML
	private TextField heightft;
	@FXML
	private TextField heightin;
	@FXML
	private Button clear;
	@FXML
	private Button calculate;
	@FXML
	private Label lblbmi;
	@FXML
	private Boolean b=false;
	public void Calculate()
	{
		double p = Double.valueOf(weightp.getText());
		double hf = Double.valueOf(heightft.getText());
		if (heightin.getText().isEmpty()&&heightin.getText()!=null) 
		{
			
		}
		double hin = Double.valueOf(heightin.getText());
		hin = hin+(hf*12);
		double bmi = p*703/(hin*hin);
		DecimalFormat df = new DecimalFormat(".000");
		lblbmi.setText(String.valueOf(df.format(bmi)));
		clear.setOnMouseClicked(event ->{
			weightp.setText(null);
			heightft.setText(null);
			heightin.setText(null);
		}
		);
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		// TODO Auto-generated method stub
		
	}
	
}
