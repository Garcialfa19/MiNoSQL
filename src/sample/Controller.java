package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

public class Controller {

    int counter = 0;
    String count = String.valueOf(counter);
    ObservableList<String> comboContentUno=
            FXCollections.observableArrayList();


    // Esquema
    @FXML private ComboBox<String> esquemaCombo;
    @FXML private TextField esquemaText;
    @FXML private Button nuevoEsquemaButton;
    @FXML private Button borrarEsquemaButton;

    // Tabla
    @FXML private HBox TablaHBox;
    @FXML private ComboBox<?> tablaCombo;
    @FXML private TextField tablaText;
    @FXML private Button nuevaTablaButton;
    @FXML private Button borrarTablaButton;

    //Busqueda

    @FXML private ComboBox<?> columnaCombo;
    @FXML private TextField busquedaText;
    @FXML private Button buscarButton;
    @FXML private Button borrarButton;

    @FXML
    private Button cargarButton;

    String test;

    @FXML
    void nuevoEsquemaButton(MouseEvent event) {
        test = esquemaText.getText();
        comboContentUno.add(test);
        esquemaCombo.setItems(comboContentUno);
//        Limpiar textfield para ingresar un nuevo esquema
//        Map<String, Object>


        // prueba GitHub


    }





}