package co.co.beans;

import java.util.HashMap;

public class Equipo extends Jugadores {
	private String nombre;
    private String codigo;
    private HashMap<String, Jugadores> jugadores;


    public Equipo(String nombre, String codigo, HashMap<String, Jugadores> jugadores) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.jugadores = jugadores;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public HashMap<String, Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores( HashMap<String, Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

}
