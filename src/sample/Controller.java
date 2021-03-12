package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {
    /*  David Garcia
    Jueves 11 de Marzo
 */

//Esto que viene crea los objetos que componen la interface grafica

    // esquema HBox
    @FXML private ComboBox esquemaCombo;
    @FXML private TextField esquemaText;
    @FXML private Button nuevoEsquemaButton;
    @FXML private Button borrarEsquemaButton;

    // tabla HBox
    @FXML private ComboBox tablaCombo;
    @FXML private TextField tablaText;
    @FXML private Button nuevaTablaButton;
    @FXML private Button borrarTablaButton;

    // Busqueda HBox
    @FXML private ComboBox columnaCombo;
    @FXML private TextField busquedaText;
    @FXML private Button buscarButton;
    @FXML private Button borrarButton;
    @FXML private Button cargarButton;

    public void nuevoEsquemaButton (ActionEvent event) {
    }


}
