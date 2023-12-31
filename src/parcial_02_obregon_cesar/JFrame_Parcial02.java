/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parcial_02_obregon_cesar;

import entidades.Especialidad;
import entidades.Paciente;
import entidades.Profesional;
import entidades.Recurso;
import entidades.Turno;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

/**
 *
 * @author OBREGON
 */
public class JFrame_Parcial02 extends javax.swing.JFrame {

    public static ArrayList<Paciente> crearPacientes() {
        //Array de pacientes
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

        //se crean los pacientes
        Paciente paciente1 = new Paciente(505, "FERNANDEZ", "AGOSTINA", new Date(), "Activo",
                28092833, "CEL:15xxxxxx", "INSSSEP");
        pacientes.add(paciente1);
        Paciente paciente2 = new Paciente(495, "OBREGON", "CESAR", new Date(), "Activo",
                44331143, "3875533085", "INSSSEP");
        pacientes.add(paciente2);
        Paciente paciente3 = new Paciente(347, "FERNANDEZ", "CARLOS", new Date(), "Inactivo",
                25631143, "387345435", "");
        pacientes.add(paciente3);
        Paciente paciente4 = new Paciente(455, "GARCIA", "LUCIANA", new Date(), "Inactivo",
                44842143, "323433085", "");
        pacientes.add(paciente4);
        Paciente paciente5 = new Paciente(935, "ROMERO", "VALENTIN", new Date(), "Activo",
                39531143, "832533085", "INSSSEP");
        pacientes.add(paciente5);

        return pacientes;
    }

    public static ArrayList<Profesional> crearProfesionales() {
        //ArrayList de profesionales
        ArrayList<Profesional> profesionales = new ArrayList<Profesional>();

        Profesional p1 = new Profesional(0, "GODOY", "HECTOR", new Date(), "Activo",
                1000221, new TreeMap<Integer, Especialidad>());
        profesionales.add(p1);

        Profesional p2 = new Profesional(1, "ALVAREZ", "PEDRO", new Date(), "Activo",
                30100221, new TreeMap<Integer, Especialidad>());
        profesionales.add(p2);
        Profesional p3 = new Profesional(2, "GONZALEZ", "MARCOS", new Date(), "Activo",
                63500221, new TreeMap<Integer, Especialidad>());
        profesionales.add(p3);
        Profesional p4 = new Profesional(3, "GOMEZ", "ALBERTO", new Date(), "Activo",
                75240221, new TreeMap<Integer, Especialidad>());
        profesionales.add(p4);

        return profesionales;
    }

    public static ArrayList<Especialidad> crearEspecialidades() {
        //Array de especialidades
        ArrayList<Especialidad> especialidades = new ArrayList<Especialidad>();
        //Se crean las especialidades
        Especialidad esp1 = new Especialidad(190, "Pediatria");
        especialidades.add(esp1);
        Especialidad esp2 = new Especialidad(191, "Radiologia");
        especialidades.add(esp2);
        Especialidad esp3 = new Especialidad(187, "Cardiologia");
        especialidades.add(esp3);
        Especialidad esp4 = new Especialidad(93, "Gastroenterologia");
        especialidades.add(esp4);
        Especialidad esp5 = new Especialidad(188, "Dermatologia");
        especialidades.add(esp5);

        return especialidades;
    }

    /**
     * Creates new form JFrame_Parcial02
     */
    public JFrame_Parcial02() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ejercicio2 = new javax.swing.JButton();
        ejercicio3 = new javax.swing.JButton();
        ejercicio4 = new javax.swing.JButton();
        ejercicio5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Parcial 02 - Obregon Cesar");

        ejercicio2.setText("Ejercicio 2");
        ejercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejercicio2ActionPerformed(evt);
            }
        });

        ejercicio3.setText("Ejercicio 3");
        ejercicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejercicio3ActionPerformed(evt);
            }
        });

        ejercicio4.setText("Ejercicio 4");
        ejercicio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejercicio4ActionPerformed(evt);
            }
        });

        ejercicio5.setText("Ejercicio 5");
        ejercicio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejercicio5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ejercicio2)
                            .addComponent(ejercicio4))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ejercicio3)
                            .addComponent(ejercicio5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ejercicio2)
                    .addComponent(ejercicio3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ejercicio4)
                    .addComponent(ejercicio5))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ejercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejercicio2ActionPerformed

        ArrayList<Paciente> pacientes = crearPacientes();
        ArrayList<Profesional> profesionales = crearProfesionales();
        ArrayList<Especialidad> especialidades = crearEspecialidades();

        //se crean los turnos
        Turno t1 = new Turno();
        t1.setFecha(new Date(2023, 9, 12));
        t1.setPaciente(pacientes.get(0));
        profesionales.get(0).agendarTurno(especialidades.get(1), t1);

        Turno t2 = new Turno();
        t2.setFecha(new Date());
        t2.setPaciente(pacientes.get(1));
        profesionales.get(1).agendarTurno(especialidades.get(1), t2);

        Turno t3 = new Turno();
        t3.setFecha(new Date());
        t3.setPaciente(pacientes.get(2));
        profesionales.get(2).agendarTurno(especialidades.get(2), t3);

        Turno t4 = new Turno();
        t4.setFecha(new Date());
        t4.setPaciente(pacientes.get(3));
        profesionales.get(3).agendarTurno(especialidades.get(4), t4);

        for (int index = 0; index < especialidades.size(); index++) {
            Especialidad esp = especialidades.get(index);

            for (int indext = 0; indext < esp.getTurnos().size(); indext++) {
                Turno t = esp.getTurnos().get(indext);
                // 29 de agosto 2023
                Date hoy12 = new Date(2023, 9, 12);
                boolean igual = t.getFecha() == hoy12;
                if (t.getFecha().equals(hoy12)) {
                    System.out.println(t.getNro() + "-" + t.getPaciente().getNombre() + " " + t.getPaciente().getApellido());
                }

            }
        }


    }//GEN-LAST:event_ejercicio2ActionPerformed

    private void ejercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejercicio3ActionPerformed
        ArrayList<Paciente> pacientes = crearPacientes();
        ArrayList<Especialidad> especialidades = crearEspecialidades();

        Turno t1 = new Turno();
        t1.setNro(1);
        t1.setFecha(new Date());
        t1.setPaciente(pacientes.get(0));

        especialidades.get(2).getTurnos().add(t1);

        Turno t2 = new Turno();
        t2.setNro(1);
        t2.setFecha(new Date());
        t2.setPaciente(pacientes.get(3));

        especialidades.get(1).getTurnos().add(t2);

        for (int indexp = 0; indexp < especialidades.size(); indexp++) {
            Especialidad esp = especialidades.get(indexp);
            ArrayList<Turno> turnos = esp.getTurnos();
            System.out.println("Turnos en " + esp.getNombre());
            for (int index = 0; index < turnos.size(); index++) {
                System.out.println("Nombre: " + turnos.get(index).getPaciente().getNombre() + " "
                        + turnos.get(index).getPaciente().getApellido());
            }
            System.out.println("--------------------");
        }


    }//GEN-LAST:event_ejercicio3ActionPerformed

    private void ejercicio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejercicio4ActionPerformed


    }//GEN-LAST:event_ejercicio4ActionPerformed

    private void ejercicio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejercicio5ActionPerformed
        ArrayList<Recurso> recursos = new ArrayList<Recurso>();
        Recurso r1 = new Recurso(01, "Televisor");
        recursos.add(r1);
        Recurso r2 = new Recurso(02, "Cama 1 Plaza");
        recursos.add(r2);
        Recurso r3 = new Recurso(03, "Cama 2 Plazas");
        recursos.add(r3);
        Recurso r4 = new Recurso(04, "Silla");
        recursos.add(r4);
        Recurso r5 = new Recurso(05, "Cama 1 Plaza");
        recursos.add(r5);
        Recurso r6 = new Recurso(06, "Televisor");
        recursos.add(r6);
        Recurso r7 = new Recurso(07, "Cama 2 Plazas");
        recursos.add(r7);
        Recurso r8 = new Recurso(8, "Cama 1 Plaza");
        recursos.add(r8);
        Recurso r9 = new Recurso(9, "Televisor");
        recursos.add(r9);
        Recurso r10 = new Recurso(10, "Computadora");
        recursos.add(r10);

        //se cuentan los recursos
        int cant_tel = 0;
        int cant_cama1 = 0;
        for (Recurso r : recursos) {
            if (r.getNombre() == "Televisor") {
                cant_tel += 1;
            } else if (r.getNombre() == "Cama 1 Plaza") {
                cant_cama1 += 1;
            } else {
                continue;
            }
        }
        System.out.println("Hay " + cant_cama1 + " Camas de 1 plaza y " + cant_tel + " Televisores en el edificio.");
    }//GEN-LAST:event_ejercicio5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Parcial02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Parcial02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Parcial02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Parcial02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Parcial02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ejercicio2;
    private javax.swing.JButton ejercicio3;
    private javax.swing.JButton ejercicio4;
    private javax.swing.JButton ejercicio5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
