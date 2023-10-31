
package Formularios;

import AccesoAdatos.habitacionData;
import AccesoAdatos.tipoDeHabitacionData;
import Entidades.habitacion;
import Entidades.tipodehabitacion;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**

 * @author FacuPro
 */
public class habitaciones extends javax.swing.JInternalFrame {
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public habitaciones() {
        initComponents();
        armarCabecera();
        
    }
    private void armarCabecera(){
        
        
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("Capacidad");
        modeloTabla.addColumn("Cantidad de Camas");
        modeloTabla.addColumn("Tipo de Camas");
        modeloTabla.addColumn("Precio");
        TbTipohabitacion.setModel(modeloTabla);
    }
    private void CargarDatos(){
        
        tipoDeHabitacionData thd =new tipoDeHabitacionData();
        for(tipodehabitacion th : thd.todoslostipos())
            
        modeloTabla.addRow(new Object[]{th.getCodigo(),th.getTipo(),th.getCapacidad(),
            th.getCantcamas(),th.getTipocamas(),th.getPrecio()});
    
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbTipohabitacion = new javax.swing.JTable();
        TxNumero = new javax.swing.JTextField();
        TxPiso = new javax.swing.JTextField();
        Bguardar = new javax.swing.JButton();
        Btipo = new javax.swing.JButton();
        BEstado = new javax.swing.JToggleButton();

        jLabel2.setText("Estado: ");

        jLabel3.setText("N° Habitacion:");

        jLabel4.setText("Piso:");

        TbTipohabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Tipo", "Capacidad", "Cantidad Camas", "Tipo Camas", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TbTipohabitacion);

        Bguardar.setText("Guardar");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        Btipo.setText("Tipo de Habitacion");
        Btipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtipoActionPerformed(evt);
            }
        });

        BEstado.setText("ACTIVA");
        BEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BEstado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bguardar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxPiso)
                                    .addComponent(TxNumero)
                                    .addComponent(Btipo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btipo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BEstado))
                .addGap(18, 18, 18)
                .addComponent(Bguardar)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel formatoTabla=new DefaultTableModel();
    boolean estadoh;
    
    private void BEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEstadoActionPerformed
        BEstado.setText("ACTIVA");
        estadoh=true;
        BEstado.setBackground(Color.GREEN);
        BEstado.setForeground(Color.BLACK);        
    }//GEN-LAST:event_BEstadoActionPerformed

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        int numH=Integer.parseInt(TxNumero.getText());
        tipodehabitacion tipoH=new tipodehabitacion();
        habitacion habi=new habitacion();
        habitacionData habData=new habitacionData();
        int filaseleccionada=TbTipohabitacion.getSelectedRow();
        int codigoThab=(Integer) TbTipohabitacion.getValueAt(filaseleccionada, 0);
        String tipoThab=(String) TbTipohabitacion.getValueAt(filaseleccionada,1);
        int capaThab=(Integer) TbTipohabitacion.getValueAt(filaseleccionada,2);
        int cantCamaThab=(Integer) TbTipohabitacion.getValueAt(filaseleccionada,3);
        String tipoCamaThab=(String) TbTipohabitacion.getValueAt(filaseleccionada,4);
        double precioThab=(Double) TbTipohabitacion.getValueAt(filaseleccionada,5);
        tipoH.setCodigo(codigoThab);
        tipoH.setTipo(tipoThab);
        tipoH.setCapacidad(capaThab);
        tipoH.setCantcamas(cantCamaThab);
        tipoH.setTipocamas(tipoCamaThab);
        tipoH.setPrecio(precioThab);
        int pisoH=Integer.parseInt(TxPiso.getText());
        habi.setNumero(numH);
        habi.setTipohabitacion(tipoH);
        habi.setPiso(pisoH);
        habi.setEstado(estadoh);
        System.out.println("Estado habitacion "+estadoh);
        habData.guardarHabitacion(habi);
    }//GEN-LAST:event_BguardarActionPerformed

    private void BtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtipoActionPerformed

       CargarDatos();
    }//GEN-LAST:event_BtipoActionPerformed
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BEstado;
    private javax.swing.JButton Bguardar;
    private javax.swing.JButton Btipo;
    private javax.swing.JTable TbTipohabitacion;
    private javax.swing.JTextField TxNumero;
    private javax.swing.JTextField TxPiso;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
