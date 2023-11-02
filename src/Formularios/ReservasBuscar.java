
package Formularios;

import AccesoAdatos.Conexion;
import AccesoAdatos.huespedData;
import AccesoAdatos.reservaData;
import Entidades.huesped;
import Entidades.reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author FacuPro
 */
public class ReservasBuscar extends javax.swing.JInternalFrame {
        
   private Connection con =null;
    PreparedStatement ps;
    ResultSet rs;
    
     DefaultTableModel FTreserva =new DefaultTableModel();
     reservaData rd = new reservaData();
     boolean est;
    
    private ArrayList<huesped> listaH;
    
    huesped huespedA=new huesped();
    huespedData hd =new huespedData();

    public ReservasBuscar() {
        con=Conexion.getConnection();
        initComponents();
        inicioTablas ();
        cargoTablaR();
        huespedA=new huesped();
        hd =new huespedData();
        listaH = (ArrayList<huesped>)hd.listarhuesped();
        rd =new reservaData();
  
        huespedA.setIdHuesped(0);
        
        Chuespedes.addItem(listaH.toString());
       //huespedA.setApellidoynom("Huesped")
       ///.listarhuespedes(listaH);
    }
    
    public void inicioTablas (){
    FTreserva.addColumn("Nombre");
    FTreserva.addColumn("ID Reserva");
    FTreserva.addColumn("N° Habitacion");
    FTreserva.addColumn("ID Huesped");
    FTreserva.addColumn("Fecha CheckIn");
    FTreserva.addColumn("Fecha CheckOut");
    FTreserva.addColumn("Personas");
    FTreserva.addColumn("Importe");
    FTreserva.addColumn("Estado");
    
    tListaR.setModel(FTreserva);
    }
    
    public void cargoTablaR(){
   reservaData reda = new reservaData();
   for(reserva re: reda.buscarTodos())
       FTreserva.addRow(new Object[]{re.getIdHuesped(),re.getIdReserva(),re.getNrohabitacion().getNumero(),re.getIdHuesped().getIdHuesped(),
            re.getFechaEntrada(),re.getFechaSalida(),re.getPersonas(),re.getImporteTotal(),re.isEstado()});
       
   }
  
    private void cargarHuespedes(){
        
      
        
    }
   
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tListaR = new javax.swing.JTable();
        Chuespedes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        tListaR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Reserva", "N° Habitacion", "ID Huesped", "Chekin", "Chekout", "N° Personas", "Importe Total", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tListaR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tListaRMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tListaR);

        Chuespedes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("LISTA RESERVAS POR HUESPED");

        BotonBuscar.setText("BUSCAR");

        bEliminar.setText("ELIMINAR");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Chuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(bSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(239, 239, 239))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Chuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEliminar)
                    .addComponent(bSalir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
     this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void tListaRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tListaRMouseClicked
        int filaSeleccionada=tListaR.getSelectedRow();
     boolean est=(boolean) FTreserva.getValueAt(filaSeleccionada, 8);
     
    }//GEN-LAST:event_tListaRMouseClicked

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        
        ps=null;
        try {
            String sql ="DELETE FROM reserva WHERE idReserva=?" ;
            ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            int filaSel=tListaR.getSelectedRow();
            int id = (int) FTreserva.getValueAt(filaSel, 1);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Reserva Eliminada");
            
        } catch (Exception e) {
            System.err.println("error"+e);
        }
//        reserva res =new reserva();
//        reservaData rd = new reservaData();
//       rd.eliminar(res.getIdReserva(), false);
        
       
    }//GEN-LAST:event_bEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JComboBox<String> Chuespedes;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tListaR;
    // End of variables declaration//GEN-END:variables
}
