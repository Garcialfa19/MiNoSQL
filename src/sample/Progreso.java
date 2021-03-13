package sample;

import java.util.ArrayList;

public class Progreso {
    private ArrayList<Object> a = new ArrayList<Object>();

    public Progreso() {
    }

    public Progreso(ArrayList<Object> a) {
        this.a = a;
    }

    public void agregarRegistro(Esquema tabla) {
        this.a.add(tabla);
    }

    public void modificarRegistro(int i, Esquema tabla) {
        this.a.set(i, tabla);
    }

    public void eliminarRegistro(int i) {
        this.a.remove(i);
    }

    public Esquema obtenerRegistro(int i) {
        return (Esquema) a.get(i);
    }

    public int cantidadRegistro() {
        return this.a.size();
    }

    public int buscaId(int id) {
        for (int i = 0; i < cantidadRegistro(); i++) {
            if (id == obtenerRegistro(i).getId()) {
                return i;
            }
        }
        return -1;
    }

}

