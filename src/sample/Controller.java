package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Controller {
    private String ruta_txt="mi.txt";
    Esquema tabla;
    Progreso prog;
    public Controller() {
        prog = new Progreso();

        try {
            cargar_txt();
            listarRegistro();
        } catch (Exception ex) {
            mensaje("No existe el archivo txt");
        }

        rbc.setSelected(true);
    }
    public void cargar_txt() {
        File ruta = new File(ruta_txt);
        try {

            FileReader fi = new FileReader(ruta);
            BufferedReader bu = new BufferedReader(fi);

            String linea = null;
            while ((linea = bu.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                tabla = new Esquema();
                tabla.setId(Integer.parseInt(st.nextToken()));
                tabla.setTabla(st.nextToken());
                tabla.setColumnas(st.nextElement(toString()));
                prog.agregarRegistro(tabla);
            }
            bu.close();
        } catch (Exception ex) {
            message("Error al cargar archivo: " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

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
        if(test.isEmpty()){
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Agregar esquema");
            alert.setContentText("Existen campos vacíos");
            alert.showAndWait();
        }
        else{
        comboContentUno.add(test);
        esquemaCombo.setItems(comboContentUno);
        // Limpiar textfield para ingresar un nuevo esquema
        esquemaText.setText("");

        }

//        Map<String, Object>



        }



    }





