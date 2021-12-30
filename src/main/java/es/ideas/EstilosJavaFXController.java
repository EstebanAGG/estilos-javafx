package es.ideas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class EstilosJavaFXController implements Initializable {

    @FXML
    private Button btnId;
    @FXML
    private CheckBox cbId;
    @FXML
    private ComboBox<?> cmbId;
    @FXML
    private Label lblId;
    @FXML
    private AnchorPane anpBase;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        /**
         * Prueba del método getTypeSelector
         */
        System.out.println("---------PRUEBA getTypeSelector------------");
        System.out.println("Botón: " + btnId.getTypeSelector());
        System.out.println("Check Box: "+cbId.getTypeSelector());
        System.out.println("ComboBox: "+cmbId.getTypeSelector());
        System.out.println("Etiqueta: "+lblId.getTypeSelector());
        System.out.println("AnchorPane: " + anpBase.getTypeSelector());
        
        /**
         * Prueba de la propiedad styleClass
         */
        System.out.println("---------PRUEBA styleClass------------");
        System.out.println("Clases Botón: "+ btnId.getStyleClass().toString());
        System.out.println("Clases Check Box: "+cbId.getStyleClass());
        System.out.println("Clases ComboBox: "+cmbId.getStyleClass());
        System.out.println("Clases Clases Etiqueta: " +lblId.getStyleClass());
        System.out.println("Clases AnchorPane: " + anpBase.getStyleClass());
        
        /**
         * Prueba de la id de un elemento
         */
        System.out.println("---------PRUEBA id------------");
        System.out.println("Id Botón: "+ btnId.getId());
        System.out.println("Id Check Box: "+cbId.getId());
        System.out.println("Id ComboBox: "+cmbId.getId());
        System.out.println("Id Clases Etiqueta: " +lblId.getId());
        System.out.println("Id AnchorPane: " + anpBase.getId());
    }

}
