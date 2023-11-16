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
public class Paciente extends Persona{
    private int nroDocumento;
    private String celular;
    private String obrasocial;
    
    
    public Paciente(){
        this.setId(0);
        this.setApellido("");
        this.setNombre("");
        this.setFechaNac(null);
        this.setNroDocumento(0);
        this.setCelular("");
    }
    
    public Paciente(int id, String apellido, String nombres, Date fechNac, String estado,
             int nroDoc, String cel, String obrasocial){
        super(id, apellido, nombres, fechNac, estado);
        this.setObrasocial(obrasocial);
        this.setNroDocumento(nroDoc);
        this.setCelular(cel);
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getObrasocial() {
        return obrasocial;
    }

    public void setObrasocial(String obrasocial) {
        this.obrasocial = obrasocial;
    }
    
}
