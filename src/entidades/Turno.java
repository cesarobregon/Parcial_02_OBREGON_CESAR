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
public class Turno {
    private int nro;
    private Date fecha;
    private Paciente paciente;

    public Turno(){
        this.setNro(0);
        this.setFecha(null);
        this.setPaciente(new Paciente());
    }

    public Turno(int nro, Date fecha, Paciente p){
        this.setNro(nro);
        this.setFecha(fecha);
        this.setPaciente(p);
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fechaTurno) {
        this.fecha = fechaTurno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
