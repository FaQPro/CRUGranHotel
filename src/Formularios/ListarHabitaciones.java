
package Formularios;

import AccesoAdatos.habitacionData;
import Entidades.habitacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author FacuPro
 */
public class ListarHabitaciones extends javax.swing.JInternalFrame {
DefaultTableModel formatoHabitacionesComp=new DefaultTableModel();
    habitacionData habData=new habitacionData();
    String estadoPalabra;
    boolean estadoH;
  
    public ListarHabitaciones() {
        initComponents();
        inicializoTabla();
        cargoDatos();
    }
public void inicializoTabla(){
    formatoHabitacionesComp.addColumn("Disponibilidad");
    formatoHabitacionesComp.addColumn("Numero");
    formatoHabitacionesComp.addColumn("Piso");
    formatoHabitacionesComp.addColumn("Tipo");
    formatoHabitacionesComp.addColumn("Capacidad");
    formatoHabitacionesComp.addColumn("Cantidad Camas");
    formatoHabitacionesComp.addColumn("Tipo de camas");
    formatoHabitacionesComp.addColumn("Precio");
    jTablaHabitaciones.setModel(formatoHabitacionesComp);
    
}
public void cargoDatos(){
    formatoHabitacionesComp.setRowCount(0);
    ArrayList<habitacion> ListadoCompleto=new ArrayList<>();
    ListadoCompleto=habData.listarHabitacion();
    for(habitacion hab:ListadoCompleto){
        estadoH=hab.isEstado();
        if(estadoH==true){
            estadoPalabra="DISPONIBLE";
            
        }else {
            estadoPalabra="NO DISPONIBLE";
        }
        formatoHabitacionesComp.addRow(new Object[]{estadoPalabra,hab.getNumero(),hab.getPiso(),hab.getTipohabitacion().getTipo(),hab.getTipohabitacion().getCapacidad(),hab.getTipohabitacion().getCantcamas(),hab.getTipohabitacion().getTipocamas(),hab.getTipohabitacion().getPrecio()});
        
        
        
    }
}
public void buscoHab(int numeroHab){
    habitacion habi=new habitacion();
    habi=habData.buscarHabitacion(numeroHab);
    formatoHabitacionesComp.setRowCount(0);
    estadoH=habi.isEstado();
    if(estadoH==true){
        estadoPalabra="DISPONIBLE";
    }
    else {
        estadoPalabra="NO DISPONIBLE";
    }
        
    formatoHabitacionesComp.addRow(new Object[]{estadoPalabra,habi.getNumero(),habi.getPiso(),habi.getTipohabitacion().getTipo(),habi.getTipohabitacion().getCapacidad(),habi.getTipohabitacion().getCantcamas(),habi.getTipohabitacion().getTipocamas(),habi.getTipohabitacion().getPrecio()});
    
    
}    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTnumeroH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaHabitaciones = new javax.swing.JTable();
        Buscar = new javax.swing.JButton();

        jLabel1.setText("Listado Completo de Habitaciones");

        jLabel2.setText("Ingrese N° de Habitacion:");

        jTablaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Tipo Habitacion", "Piso", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaHabitaciones);

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTnumeroH, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Buscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTnumeroH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String textoHab= jTnumeroH.getText();
    if (textoHab.isEmpty()){
        cargoDatos();
        return;
    }
        
    int numeroHabitacion;
    try{
        numeroHabitacion=Integer.parseInt(jTnumeroH.getText());
        
    }catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(this,"Por favor, ingrese un numero válido");
        return;
    }
    if(numeroHabitacion<=0){
        JOptionPane.showMessageDialog(this,"Por favor, ingrese un número de habitación válido");
        return;
    }
    try{
        buscoHab(numeroHabitacion);
    }catch (NullPointerException ex){
        
    }
    
                  
    }//GEN-LAST:event_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTablaHabitaciones;
    public javax.swing.JTextField jTnumeroH;
    // End of variables declaration//GEN-END:variables
}

