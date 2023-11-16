/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author OBREGON
 */
public class Persona {
    private int id;
    private String apellido;
    private String nombre;
    private Date fechaNac;
    private String estado;

    public Persona(int id, String apellido, String nombre, Date fechaNac, String estado) {
        this.setId(id);
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setFechaNac(fechaNac);
        this.setEstado(estado);
        
    }

    public Persona() {
        this.setId(0);
        this.setApellido("");
        this.setNombre("");
        this.setFechaNac(null);
        this.setEstado("");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
