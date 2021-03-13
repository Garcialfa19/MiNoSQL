package sample;

public class Esquema {
    String tabla;
    int id;
    String [] columnas;
    public Esquema(){}

    public Esquema(String tabla, int id, String[] columnas) {
        this.tabla = tabla;
        this.id = id;
        this.columnas = columnas;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }
}
