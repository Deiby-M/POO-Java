package co.com.bussineslogic;
import co.co.beans.Jugadores;
import co.co.beans.Persona;
import co.co.beans.Equipo;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
	
	public static void main(String[] args) {
	//Jugadores
	ArrayList<Persona>persona = new ArrayList<Persona>();
	Jugadores Uno = new Jugadores("98726", persona);
	Jugadores Dos = new Jugadores("773773",persona);
    Jugadores Tres = new Jugadores("123123",persona);	
		
	HashMap<String, Jugadores> jugadores;
	jugadores = new HashMap<String, Jugadores>();
	jugadores.put("1", Uno);
	jugadores.put("2", Dos);
	jugadores.put("3", Tres);
	
	//Equipos
	Equipo Barcelona = new Equipo("Barcelona", "234678", jugadores);
	Equipo Real = new Equipo("Real", "23278", jugadores);
	Equipo Nacional = new Equipo("Nacional","23422",jugadores);
	System.out.println("Jugador: ");
	System.out.println(jugadores.get("2").getCodigo());
	
	ArrayList<Equipo>equipo = new ArrayList<Equipo>();
	equipo.add(Barcelona);
	equipo.add(Real);
	equipo.add(Nacional);
	
	System.out.println("Equipos: ");
	for(int i=0; i<equipo.size();i++) {
		System.out.println(equipo.get(i).getNombre());
	}
	
	
	//Persona
	Persona Alejo = new Persona("Alejo","jara");
	Persona Jose = new Persona("Jose","P");
	Persona Andres = new Persona("Andres","Lop");
	persona.add(Andres);
	persona.add(Jose);
	persona.add(Alejo);
	
	System.out.println("Personas: ");
	for(int i=0; i<persona.size();i++) {
		System.out.println(persona.get(i).getNombre());
	}
	
	
	
	

	}

}
