
package Formularios;

/**
 * @author FacuPro
 */
public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Mhuesped = new javax.swing.JMenu();
        alta = new javax.swing.JMenuItem();
        lista = new javax.swing.JMenuItem();
        Mhabitaciones = new javax.swing.JMenu();
        tipoH = new javax.swing.JMenuItem();
        altaH = new javax.swing.JMenuItem();
        verH = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Mreserva = new javax.swing.JMenu();
        cargarR = new javax.swing.JMenuItem();
        buscarR = new javax.swing.JMenuItem();
        Mconsultas = new javax.swing.JMenu();
        usuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        Mhuesped.setText("Huesped");

        alta.setText("alta / baja / modificar");
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });
        Mhuesped.add(alta);

        lista.setText("mostrar listado");
        lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaActionPerformed(evt);
            }
        });
        Mhuesped.add(lista);

        jMenuBar1.add(Mhuesped);

        Mhabitaciones.setText("Habitaciones");

        tipoH.setText("crear tipo");
        tipoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoHActionPerformed(evt);
            }
        });
        Mhabitaciones.add(tipoH);

        altaH.setText("alta");
        altaH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaHActionPerformed(evt);
            }
        });
        Mhabitaciones.add(altaH);

        verH.setText("ver");
        verH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verHActionPerformed(evt);
            }
        });
        Mhabitaciones.add(verH);

        jMenuItem1.setText("modificar / eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Mhabitaciones.add(jMenuItem1);

        jMenuBar1.add(Mhabitaciones);

        Mreserva.setText("Reserva");

        cargarR.setText("cargar");
        cargarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarRActionPerformed(evt);
            }
        });
        Mreserva.add(cargarR);

        buscarR.setText("buscar eliminar");
        buscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarRActionPerformed(evt);
            }
        });
        Mreserva.add(buscarR);

        jMenuBar1.add(Mreserva);

        Mconsultas.setText("Consultas");

        usuarios.setText("usuarios");
        Mconsultas.add(usuarios);

        jMenuBar1.add(Mconsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Huespedes vh=new Huespedes();
        vh.jButton1.setVisible(false);
        vh.setVisible(true);
        Escritorio.add(vh);
        Escritorio.moveToFront(vh);
    }//GEN-LAST:event_altaActionPerformed

    private void verHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verHActionPerformed
       Escritorio.removeAll();
       Escritorio.repaint();
       ListarHabitaciones listarHabs=new ListarHabitaciones();
        listarHabs.setVisible(true);
        Escritorio.add(listarHabs);
        Escritorio.moveToFront(listarHabs);
    }//GEN-LAST:event_verHActionPerformed

    private void altaHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaHActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
       habitaciones altaHab = new habitaciones();
       
        altaHab.setVisible(true);
        Escritorio.add(altaHab);
        Escritorio.moveToFront(altaHab);
    }//GEN-LAST:event_altaHActionPerformed

    private void cargarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarRActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ReservasView vh=new ReservasView();
        vh.setVisible(true);
        Escritorio.add(vh);
        Escritorio.moveToFront(vh);
    }//GEN-LAST:event_cargarRActionPerformed

    private void buscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarRActionPerformed
       Escritorio.removeAll();
        Escritorio.repaint();
        ReservasBuscar vr=new ReservasBuscar();
        vr.setVisible(true);
        Escritorio.add(vr);
        Escritorio.moveToFront(vr);
    }//GEN-LAST:event_buscarRActionPerformed

    private void tipoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoHActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        tipodeHab tipoHab = new tipodeHab();
       
        tipoHab.setVisible(true);
        Escritorio.add(tipoHab);
        Escritorio.moveToFront(tipoHab);
    }//GEN-LAST:event_tipoHActionPerformed

    private void listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ListarHuespedes li = new ListarHuespedes();
       
        li.setVisible(true);
        Escritorio.add(li);
        Escritorio.moveToFront(li);
    }//GEN-LAST:event_listaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       Escritorio.removeAll();
        Escritorio.repaint();
        TipoHabVer tp = new TipoHabVer();
       
        tp.setVisible(true);
        Escritorio.add(tp);
        Escritorio.moveToFront(tp);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu Mconsultas;
    private javax.swing.JMenu Mhabitaciones;
    private javax.swing.JMenu Mhuesped;
    private javax.swing.JMenu Mreserva;
    private javax.swing.JMenuItem alta;
    private javax.swing.JMenuItem altaH;
    private javax.swing.JMenuItem buscarR;
    private javax.swing.JMenuItem cargarR;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem lista;
    private javax.swing.JMenuItem tipoH;
    private javax.swing.JMenuItem usuarios;
    private javax.swing.JMenuItem verH;
    // End of variables declaration//GEN-END:variables
}
