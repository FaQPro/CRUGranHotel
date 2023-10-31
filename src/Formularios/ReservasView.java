
package Formularios;

import AccesoAdatos.*;
import Entidades.*;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author FacuPro
 */
public class ReservasView extends javax.swing.JInternalFrame {
    public static huesped guardarH;
   
    public static double precio;
    public static double precioFinalF;
    DefaultTableModel formatoTablaTipos=new DefaultTableModel();
    DefaultTableModel formatoTablaHab=new DefaultTableModel();
    huesped huespedR = new huesped();
    huesped idhuesped = new huesped();
    huespedData hd = new huespedData();
    habitacion habitacionR=new habitacion();
    habitacion Nhabitacion=new habitacion();
    tipodehabitacion tipoHabitacion = new tipodehabitacion();
    habitacionData habData=new habitacionData();
    tipoDeHabitacionData tipoHData = new tipoDeHabitacionData();
    reserva nuevaReserva = new reserva();
    reservaData reserData = new reservaData();
    Date fechaChekIn;
    Date fechaChekOut;
    double precioH;
    int numeroH,idR;
    public String estadoPalabra;
    boolean estadoH=true;
  
  
    public ReservasView() {
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
        formatoTablaTipos.addColumn("Precio por noche");
        
    TbTipohabitacion.setModel(formatoTablaTipos);
        //Tabla mostrar las habitaciones disponibles
        
        formatoTablaHab.addColumn("Numero");
        formatoTablaHab.addColumn("Tipo");
        formatoTablaHab.addColumn("Piso");
        formatoTablaHab.addColumn("Estado");
        
        TbHabitaciones.setModel(formatoTablaHab);
        
        
}

 private void CargarDatostipo(){
        
        tipoDeHabitacionData thd =new tipoDeHabitacionData();
        for(tipodehabitacion th : thd.todoslostipos())
            
        formatoTablaTipos.addRow(new Object[]{th.getCodigo(),th.getTipo(),th.getCapacidad(),
            th.getCantcamas(),th.getTipocamas(),th.getPrecio()});
        
//        int codigoTipoH= TbTipohabitacion.getSelectedRow();
//        System.out.println("codigoTipoH"+codigoTipoH);
//        double precioFinalF = (Double)formatoTablaTipos.getValueAt(codigoTipoH, 5);
//        System.out.println("preciolistaTipoH"+precioFinalF);
        
    }
 
 public void cargoDatosHab(int codigoTipoh){
    formatoTablaHab.setRowCount(0);
    ArrayList<habitacion> ListadoCompleto=new ArrayList<>();
    ListadoCompleto=habData.listarHabitacionesTipo(codigoTipoh);
    for(habitacion hab:ListadoCompleto){
        estadoH=hab.isEstado();
        if(estadoH==true){
            estadoPalabra="DISPONIBLE";
            
        }else {
            estadoPalabra="NO DISPONIBLE";
        }
        formatoTablaHab.addRow(new Object[]{hab.getNumero(),hab.getTipohabitacion().getTipo(),hab.getPiso(),estadoPalabra});
 
    }
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fechaIn = new com.toedter.calendar.JDateChooser();
        fechaOut = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbTipohabitacion = new javax.swing.JTable();
        Sdias = new javax.swing.JSpinner();
        Spersonas = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbHabitaciones = new javax.swing.JTable();
        BagregarH = new javax.swing.JButton();
        BguardarR = new javax.swing.JButton();
        Lprecio = new javax.swing.JLabel();
        jNombreH = new javax.swing.JLabel();
        BuscarH = new javax.swing.JButton();
        TxdniH = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Bsalir = new javax.swing.JButton();

        jLabel1.setText("Dias / Noches:");

        jLabel2.setText("Personas:");

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
        TbTipohabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbTipohabitacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbTipohabitacion);

        TbHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Tipo", "Piso", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Boolean.class
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
        TbHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TbHabitaciones);

        BagregarH.setText("Agregar Huesped");
        BagregarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarHActionPerformed(evt);
            }
        });

        BguardarR.setText("Gurardar Reserva");
        BguardarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarRActionPerformed(evt);
            }
        });

        Lprecio.setText("Precio: ");

        jNombreH.setText("Huesped, Nombre ");

        BuscarH.setText("Buscar Huesped");
        BuscarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarHActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular Precio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI Huesped:");

        Bsalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lprecio)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BguardarR)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BagregarH)
                                        .addGap(82, 82, 82)
                                        .addComponent(jNombreH))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel3)
                                        .addGap(39, 39, 39)
                                        .addComponent(TxdniH, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BuscarH, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Sdias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Spersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sdias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(Spersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BagregarH)
                    .addComponent(jNombreH)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarH)
                    .addComponent(TxdniH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lprecio)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BguardarR)
                    .addComponent(Bsalir))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BagregarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarHActionPerformed
         
        Huespedes vh=new Huespedes();
        vh.setVisible(true);
        Menu.Escritorio.add(vh);
        Menu.Escritorio.moveToFront(vh);
        
        
        
    
        
     
    }//GEN-LAST:event_BagregarHActionPerformed

    private void BguardarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarRActionPerformed
        //OBTENGO FECHAS
        java.sql.Date fechaChekIn = new java.sql.Date (fechaIn.getDate().getTime());
        java.sql.Date fechaChekOut = new java.sql.Date (fechaOut.getDate().getTime());
        
        //OBTENGO DIAS PERSONAS Y PRECIO FINAL
        int dias,personas;
        dias = (int) Sdias.getValue();
        //OBTENGO codigo TIPO DE HABITACION 
        int filaSeleccionada=TbTipohabitacion.getSelectedRow();
        int tipoHabitacion = (int) TbTipohabitacion.getValueAt(filaSeleccionada, 0);
       
        double precioFinalF = (Double)formatoTablaTipos.getValueAt(filaSeleccionada, 5);
        double preciofinal =dias*precioFinalF;
        personas = (int) Spersonas.getValue();
        
        //obtengo N de habitacion disponible de LISTA
        int numeroH=TbHabitaciones.getSelectedRow();
        int habi =(int) formatoTablaHab.getValueAt(numeroH, 0);
        System.out.println("habitR num "+habi);
        this.habitacionR=habData.buscarHabitacion(habi);

        // AGREGO HUESPED POR DNI
        
        int idH=guardarH.getIdHuesped();
        huesped h1 =new huesped();
        //System.out.println("id huesped"+idH);
        
        //huespedR=hd.buscarporDni(34031678);
        //huesped idhuesped = (huesped) huespedR.getIdHuesped();
        System.out.println("hab"+this.habitacionR);
        System.out.println("huesp"+guardarH);
        reserva nuevaReserva = new reserva(this.habitacionR,guardarH, fechaChekIn, fechaChekOut, personas, preciofinal,true);
        // reservaData reserData = new reservaData();
        reserData.guardarReserva(nuevaReserva);
        //habitacion nrohabitacion, huesped idHuesped, Date FechaEntrada, Date FechaSalida, int personas, double ImporteTotal, boolean estado
        // reserData.guardarReserva(nuevaReserva);

    }//GEN-LAST:event_BguardarRActionPerformed

    private void TbTipohabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbTipohabitacionMouseClicked
     
     int filaSeleccionada=TbTipohabitacion.getSelectedRow();
     int codigoH=(int) formatoTablaTipos.getValueAt(filaSeleccionada, 0);
        //System.out.println("codigoTipoHab"+codigoH);
     double precioH = (Double) formatoTablaTipos.getValueAt(filaSeleccionada, 5);
     precio = precioH;
     cargoDatosHab(codigoH);
  
    }//GEN-LAST:event_TbTipohabitacionMouseClicked

    private void TbHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbHabitacionesMouseClicked
        int numeroH=TbHabitaciones.getSelectedRow();
        int habitacionR=(int) formatoTablaHab.getValueAt(numeroH, 0);
        
    }//GEN-LAST:event_TbHabitacionesMouseClicked

    private void BuscarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarHActionPerformed

       // huespedR=hd.buscarporDni(guardarH.getDni());

    }//GEN-LAST:event_BuscarHActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //calculo precio final y lo muestro en label
        int dias;
        dias = (int) Sdias.getValue();
        int filaSeleccionada=TbTipohabitacion.getSelectedRow();
        double precioFinalF = (Double)formatoTablaTipos.getValueAt(filaSeleccionada, 5);
        double preciofinal =dias*precioFinalF;
        Lprecio.setText(preciofinal+"");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BagregarH;
    private javax.swing.JButton BguardarR;
    private javax.swing.JButton Bsalir;
    private javax.swing.JButton BuscarH;
    private javax.swing.JLabel Lprecio;
    private javax.swing.JSpinner Sdias;
    private javax.swing.JSpinner Spersonas;
    private javax.swing.JTable TbHabitaciones;
    public static javax.swing.JTable TbTipohabitacion;
    private javax.swing.JTextField TxdniH;
    private com.toedter.calendar.JDateChooser fechaIn;
    private com.toedter.calendar.JDateChooser fechaOut;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jNombreH;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}


