/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import java.util.TreeMap;

/**
 *
 * @author OBREGON
 */
public class Profesional extends Persona {

    private int nroMatricula;
    private TreeMap<Integer, Especialidad> especialidades;

    public Profesional(int id, String apellido, String nombres, Date fechNac, String estado,
            int nroMatricula, TreeMap<Integer, Especialidad> espList) {
        super(id, apellido, nombres, fechNac, estado);
        this.setNroMatricula(nroMatricula);
        this.setEspecialidades(espList);
    }

    public int getNroMatriculo() {
        return nroMatricula;
    }

    public void setNroMatricula(int nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public TreeMap<Integer, Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(TreeMap<Integer, Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public void agendarTurno(Especialidad esp, Turno t) {
        if (getEspecialidades() == null) {
            setEspecialidades(new TreeMap<Integer, Especialidad>());
        }
        if (getEspecialidades().containsKey(esp.getId())) {
            Especialidad espProfesional = getEspecialidades().get(esp.getId());

            int nroOrdenSiguiente = espProfesional.getTurnos().size() + 1;
            t.setNro(nroOrdenSiguiente);

            espProfesional.getTurnos().add(t);
        } else {
            getEspecialidades().put(esp.getId(), esp);

            Especialidad espProfesional = getEspecialidades().get(esp.getId());

            int nroOrdenSiguiente = espProfesional.getTurnos().size() + 1;
            t.setNro(nroOrdenSiguiente);

            espProfesional.getTurnos().add(t);
        }
    }

    public void listarTurnosPorEspecialidad() {
        System.out.println("Profesional:" + toString());
        System.out.println("--------------------------------------");
        for (Especialidad espList : getEspecialidades().values()) {
            System.out.println("Especialidad:" + espList.getNombre().trim());
            System.out.println("--------------------------------------");
            for (int indexTurno = 0; indexTurno < espList.getTurnos().size(); indexTurno++) {
                Turno t = espList.getTurnos().get(indexTurno);
                System.out.println("Turno Nro:" + t.getNro() + " Para: " + t.getPaciente().toString());
            }
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("");
        }
    }
}
