/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author OBREGON
 */
public class Especialidad {
    private int id;
    private String nombre;
    private ArrayList<Turno> turnos;
    
    public Especialidad(){
        this.setId(0);
        this.setNombre("");
        this.setTurnos(new ArrayList<Turno>());
    }
    
    public Especialidad(int id, String nombre, ArrayList<Turno> turnos){
        this.setId(id);
        this.setNombre(nombre);
        this.setTurnos(turnos);
    }
    
    public Especialidad(int id, String nombre){
        this.setId(id);
        this.setNombre(nombre);
        this.setTurnos(new ArrayList<Turno>());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }  
}
