package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {

	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	@FXML
	private Label labelResult;

	@FXML
	private Button btTeste;
	@FXML
	private Button btSum;
	@FXML
	private Button btAll;

	@FXML
	private ComboBox<Person> comboboxPerson;

	private ObservableList<Person> obsList;
	
	@FXML
	private void onBtall() {
		for(Person person : comboboxPerson.getItems()) {
			System.out.println(person);			
		}		
	}
	
	@FXML
	private void onComboBoxPersonAction() {
		Person person = comboboxPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}

	@FXML
	public void onBtTestAction() {
		Alerts.showAlert("Alert title", null, "Hello", Alert.AlertType.INFORMATION);
	}

	@FXML
	public void onBtSumAction() {
		double number1 = Double.valueOf(txtNumber1.getText());
		double number2 = Double.valueOf(txtNumber2.getText());
		double sum = number1 + number2;

		labelResult.setText(String.format("%.2f", sum));
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldDouble(txtNumber2);
		Constraints.setTextFieldMaxLength(txtNumber1, 12);
		Constraints.setTextFieldMaxLength(txtNumber2, 12);

		List<Person> list = new ArrayList<>();

		list.add(new Person(1, "dvc", "teste@teste"));
		list.add(new Person(2, "dvc2", "teste2@teste"));
		list.add(new Person(3, "dvc3", "teste3@teste"));

		obsList = FXCollections.observableArrayList(list);
		comboboxPerson.setItems(obsList);

		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};
		comboboxPerson.setCellFactory(factory);
		comboboxPerson.setButtonCell(factory.call(null));

	}

}
