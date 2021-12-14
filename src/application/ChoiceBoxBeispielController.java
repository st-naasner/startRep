package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;



public class ChoiceBoxBeispielController 
{

	
	public ObservableList<Beispiel> listeVollerBeispiele = FXCollections.observableArrayList(); 
	
	@FXML
    private TextField tfZahl;

    @FXML
    private TextField tfString;

    @FXML
    private Button btBeispielauswählen;

    @FXML
    private ChoiceBox<Beispiel> cbBeispiel;

    @FXML
    void zeigenBeispiel(ActionEvent event) 
    {
        Beispiel gewaehltesBeispiel = cbBeispiel.getSelectionModel().getSelectedItem();
        tfString.setText(gewaehltesBeispiel.getName());
        tfZahl.setText(String.valueOf(gewaehltesBeispiel.getWert()));
    }
    /**
     * Hier werden alle Einstellungen vorgenommen
     * 1. BeispielListe gefüllt
     * 2. ChoiceBox eingestellt
     */
    public void initialize()
   { 
    
     eintragenBeispiel();
     
     cbBeispiel.getItems().addAll(listeVollerBeispiele);
     //cbBeispiel.setValue(cbBeispiel.getItems().get(0));
     cbBeispiel.setConverter(new StringConverter<Beispiel>() 
     {
        @Override
        public String toString(Beispiel pBeispiel)
        {
            if(pBeispiel==null)
            	return "bitte W�hlen";
            else
            	return String.valueOf(pBeispiel.getName());   //+ ... .getName(); 
        }

        @Override
        public Beispiel fromString(String string)
        {
           return null;
        }
     });
   }
    
    public void eintragenBeispiel()
    {
    	 Beispiel bsp1 = new Beispiel(10, "Beispiel_1");
         Beispiel bsp2 = new Beispiel(20,"Beispiel_2");
         listeVollerBeispiele.add(bsp1);
         listeVollerBeispiele.add(bsp2);
         listeVollerBeispiele.add(new Beispiel(30,"Beispiel_3"));
    }
}
