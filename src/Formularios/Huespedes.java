
package Formularios;
import AccesoAdatos.huespedData;
import Entidades.huesped;
import javax.swing.JOptionPane;

/**
 * @author FacuPro
 */
public class Huespedes extends javax.swing.JInternalFrame {
        int id,estado;
       
    public Huespedes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxDni = new javax.swing.JTextField();
        TxApellidoynom = new javax.swing.JTextField();
        TxDomicilio = new javax.swing.JTextField();
        TxCorreo = new javax.swing.JTextField();
        TxCelular = new javax.swing.JTextField();
        Bbuscar = new javax.swing.JButton();
        Bguardar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();
        Beditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Cestado = new javax.swing.JCheckBox();
        Bsalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("DNI:");

        jLabel2.setText("<html>Nombre y <br>Apellido:</html>");

        jLabel3.setText("Domicilio:");

        jLabel4.setText("Email:");

        jLabel5.setText("N° Celular:");

        jLabel6.setText("Estado");

        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Bguardar.setText("Guardar");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        Beliminar.setText("Eliminar");
        Beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliminarActionPerformed(evt);
            }
        });

        Beditar.setText("Editar    ");
        Beditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditarActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar desde Reserva");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Cestado.setText("Activo");

        Bsalir.setText("Salir");
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });

        jLabel7.setText("AGREGAR HUESPED");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxDomicilio)
                                    .addComponent(TxCorreo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cestado))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxApellidoynom)
                                    .addComponent(TxDni)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(11, 11, 11)))
                        .addGap(18, 18, 18)
                        .addComponent(Bbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(65, 65, 65))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Beditar)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Bsalir))
                            .addComponent(Beliminar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Bbuscar))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxApellidoynom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Cestado))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bguardar)
                    .addComponent(Beditar)
                    .addComponent(Beliminar))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bsalir)
                    .addComponent(jButton1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
         huesped huespedX=new huesped();
         huespedData nuevoH= new huespedData();
         boolean estados=true;
         
          huespedX.setDni(Integer.parseInt(TxDni.getText()));
          huespedX.setApellidoynom(TxApellidoynom.getText());
            huespedX.setDireccion(TxDomicilio.getText());
            huespedX.setCorreo(TxCorreo.getText());
            huespedX.setCelular(TxCelular.getText());
            huespedX.setEstado(Cestado.isSelected()==true);
            
            nuevoH.guardarHuesped(huespedX);
    }//GEN-LAST:event_BguardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        huesped huespedX=new huesped();
         huespedData nuevoH= new huespedData();
         boolean estados=true;
       
          huespedX.setDni(Integer.parseInt(TxDni.getText()));
          huespedX.setApellidoynom(TxApellidoynom.getText());
            huespedX.setDireccion(TxDomicilio.getText());
            huespedX.setCorreo(TxCorreo.getText());
            huespedX.setCelular(TxCelular.getText());
            huespedX.setEstado(Cestado.isSelected()==true);
            
            nuevoH.guardarHuesped(huespedX);
            
            ReservasView.guardarH = huespedX;
            this.dispose();
            
            ReservasView.jNombreH.setText(huespedX.toString());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
         huesped huespedX=new huesped();
         huespedData nuevoH= new huespedData();
      try{
         Integer dni=Integer.parseInt(TxDni.getText());
         huespedX=nuevoH.buscarporDni(dni);
         if(huespedX!=null)
            
            TxApellidoynom.setText(huespedX.getApellidoynom());
            TxDomicilio.setText(huespedX.getDireccion());
            TxCorreo.setText(huespedX.getCorreo());
            TxCelular.setText(huespedX.getCelular());
            
        } catch(NumberFormatException err){
     
         JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido ");
      }
    }//GEN-LAST:event_BbuscarActionPerformed

    @Override
    public String toString() {
        return "Huespedes{" + "TxApellidoynom=" + TxApellidoynom + '}';
    }

    private void BeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditarActionPerformed
         
        //BOTON MODIFICAR
         
         huesped huespedA=new huesped();
         huespedData datosH= new huespedData();
    try{     
        
        Integer auxid= huespedA.getIdHuesped();
        id= auxid;
        Integer dni = Integer.parseInt(TxDni.getText());
         String nom = TxApellidoynom.getText();
         String dom=TxDomicilio.getText();
         String mail=TxCorreo.getText();
         String cel=TxCelular.getText();
            if (nom.isEmpty()|| dom.isEmpty()||mail.isEmpty()||cel.isEmpty()) {
                JOptionPane.showMessageDialog(null, "no deje campos vacios ");
            }
         Boolean estado=Cestado.isSelected();
           
                huespedA.setIdHuesped(id);
                huespedA.setDni(dni);
                huespedA.setApellidoynom(nom);
                huespedA.setDireccion(dom);
                huespedA.setCorreo(mail);
                huespedA.setCelular(cel);
                //huespedA.setEstado(estado);    
                datosH.modificarhuesped(huespedA);
                System.out.println("huespedA"+huespedA);
//            if(huespedA==null){
                //datosH.guardarHuesped(huespedA);
//            }else{ 
//                huespedA.setIdHuesped(id);
//                huespedA.setDni(dni);
//                huespedA.setApellidoynom(nom);
//                huespedA.setDireccion(dom);
//                huespedA.setCorreo(mail);
//                huespedA.setCelular(cel);
                //huespedA.setEstado(estado);
                //datosH.modificarhuesped(huespedA); 
                JOptionPane.showMessageDialog(null, "Huesped Modificado");
         
    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, " AVISO ");
    }
    }//GEN-LAST:event_BeditarActionPerformed

    private void BeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliminarActionPerformed
     
           huesped huespedX=new huesped();
         huespedData nuevoH= new huespedData();
         boolean estados=false;
         
          huespedX.setDni(Integer.parseInt(TxDni.getText()));
            huespedX.setEstado(Cestado.isSelected()==false);
      
                 
            //nuevoH.eliminarhuesped(estados);

        //huespedA.setEstado(false);
    
    }//GEN-LAST:event_BeliminarActionPerformed

    
    
    
    
    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_BsalirActionPerformed
      


   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Bbuscar;
    public javax.swing.JButton Beditar;
    public javax.swing.JButton Beliminar;
    public javax.swing.JButton Bguardar;
    private javax.swing.JButton Bsalir;
    private javax.swing.JCheckBox Cestado;
    public javax.swing.JTextField TxApellidoynom;
    public javax.swing.JTextField TxCelular;
    public javax.swing.JTextField TxCorreo;
    public javax.swing.JTextField TxDni;
    public javax.swing.JTextField TxDomicilio;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

