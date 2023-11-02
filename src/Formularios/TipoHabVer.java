
package Formularios;

import AccesoAdatos.Conexion;
import AccesoAdatos.tipoDeHabitacionData;
import Entidades.tipodehabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FacuPro
 */
public class TipoHabVer extends javax.swing.JInternalFrame {
    private Connection con =null;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel formatoTablaTipos=new DefaultTableModel();
    
    
    
    public TipoHabVer() {
        con=Conexion.getConnection();
        initComponents();
        inicializoTablas();
        CargarDatostipo();
    }
public void inicializoTablas(){
            //Tabla tipos de habitaciones
        formatoTablaTipos.addColumn("Codigo");
        formatoTablaTipos.addColumn("Tipo de Habitacion");
        formatoTablaTipos.addColumn("Capacidad");
        formatoTablaTipos.addColumn("Cantidad de Camas");
        formatoTablaTipos.addColumn("Tipo de camas");
        formatoTablaTipos.addColumn("Precio");
        tabTipoh.setModel(formatoTablaTipos);
}
 private void CargarDatostipo(){
        
        tipoDeHabitacionData thd =new tipoDeHabitacionData();
        for(tipodehabitacion th : thd.todoslostipos())
            
        formatoTablaTipos.addRow(new Object[]{th.getCodigo(),th.getTipo(),th.getCapacidad(),
            th.getCantcamas(),th.getTipocamas(),th.getPrecio()});   
    }
        
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabTipoh = new javax.swing.JTable();
        bEditar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txcodigo = new javax.swing.JTextField();
        txtipo = new javax.swing.JTextField();
        txcapacidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txcamacant = new javax.swing.JTextField();
        txtiposcama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txprecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        belim = new javax.swing.JButton();

        jLabel1.setText("Lista Tipo de Habitaciones");

        tabTipoh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Tipo", "Capacidad", "Camas Cantidad", "Tipo de Camas", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabTipoh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTipohMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabTipoh);

        bEditar.setText("Editar");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo");

        jLabel3.setText("Tipo");

        jLabel4.setText("Capacidad");

        jLabel5.setText("Cantidad Camas");

        jLabel6.setText("Tipo de Camas");

        jLabel7.setText("Precio");

        belim.setText("Eliminar");
        belim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtipo, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(txcodigo)
                                    .addComponent(txcapacidad)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel2)))
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txcamacant)
                                            .addComponent(txtiposcama)
                                            .addComponent(txprecio))))))))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(belim, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txcamacant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtiposcama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalir)
                    .addComponent(bEditar)
                    .addComponent(belim))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void tabTipohMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTipohMouseClicked
        
        try {
           int fila =  tabTipoh.getSelectedRow();
           Integer codigo= (Integer) formatoTablaTipos.getValueAt(fila, 0);
           
           ps=con.prepareStatement("SELECT Codigo,Tipo,Capacidad,Cantidadcamas,Tipocamas,Precio FROM tipodehabitacion WHERE Codigo=?");
           ps.setInt(1, codigo);
           rs=ps.executeQuery();
           
           while (rs.next()){
               txcodigo.setText(String.valueOf(rs.getInt("Codigo")));
               txtipo.setText(rs.getString("Tipo"));
               txcapacidad.setText(String.valueOf(rs.getInt("Capacidad")));
               txcamacant.setText(String.valueOf(rs.getInt("Cantidadcamas")));
               txtiposcama.setText(rs.getString("Tipocamas"));
               txprecio.setText(String.valueOf(rs.getDouble("Precio")));
           }
           
        } catch (Exception e) {
            System.err.println("ERROR"+e);
        }
    }//GEN-LAST:event_tabTipohMouseClicked

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        PreparedStatement ps1 = null;
        
        try {
            ps1=con.prepareStatement("UPDATE tipodehabitacion SET Codigo=?,Tipo=?,Capacidad=?,Cantidadcamas=?,Tipocamas=?,Precio=? WHERE Codigo=?");
            ps1.setInt(1, Integer.parseInt(txcodigo.getText()));
            ps1.setString(2, txtipo.getText());
            ps1.setInt(3,Integer.parseInt(txcapacidad.getText()));
            ps1.setInt(4, Integer.parseInt(txcamacant.getText()));
            ps1.setString(5, txtiposcama.getText());
            ps1.setDouble(6, Double.parseDouble(txprecio.getText()));
            ps1.setInt(7, Integer.parseInt(txcodigo.getText()));
            
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Editado con exito");
            
        } catch (Exception e) {
            System.err.println("ERROR"+e);
            
        }
    }//GEN-LAST:event_bEditarActionPerformed

    private void belimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belimActionPerformed
       PreparedStatement ps1 = null;
        
        try {
            ps1=con.prepareStatement("DELETE FROM tipodehabitacion WHERE Codigo=?");
            ps1.setInt(1, Integer.parseInt(txcodigo.getText()));
            
            
            ps1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Habitacion Eliminada con exito");
            
        } catch (Exception e) {
            System.err.println("ERROR"+e);
            
        }
    }//GEN-LAST:event_belimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton belim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabTipoh;
    private javax.swing.JTextField txcamacant;
    private javax.swing.JTextField txcapacidad;
    private javax.swing.JTextField txcodigo;
    private javax.swing.JTextField txprecio;
    private javax.swing.JTextField txtipo;
    private javax.swing.JTextField txtiposcama;
    // End of variables declaration//GEN-END:variables
}
