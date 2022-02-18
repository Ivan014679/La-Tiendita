/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import AppPackage.AnimationClass;
import AppPackage.AnimationClass;
import conexion.Conectar;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JFrame {
    
   private Connection connection = null;
   private Statement s = null;
   public Conectar manejador = new Conectar();
   
    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) tablausu.getModel();
        int a = tablausu.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        tb.removeRow(tb.getRowCount()-1);
        } 
        //cargaTicket();
    }
   
     public void mostrardtablausuarios(){
       DefaultTableModel dtm;
       ResultSetMetaData rsmd;
        try{ 
           
            ResultSet sr= manejador.mostrarusu.executeQuery();
            rsmd=sr.getMetaData();
            ArrayList<Object[]> data =new ArrayList<>();
            while(sr.next()){
                Object[] rows =new Object[rsmd.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i]=sr.getObject(i+1);
                }
                data.add(rows);
            }
             dtm = (DefaultTableModel)this.tablausu.getModel();
             for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
                
            }
             
//            msn="exito";
            
        }catch(SQLException ex){
            ex.printStackTrace();
            
            
        }
    }


   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        bocciones = new javax.swing.JLabel();
        jlhome = new javax.swing.JLabel();
        crearusu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bminimizar = new javax.swing.JLabel();
        bquitar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablausu = new javax.swing.JTable();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(715, 428));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(715, 428));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(673, 342));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(400, 376));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(100, 32));
        jPanel7.setPreferredSize(new java.awt.Dimension(50, 426));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bocciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/icons8_Menu_32px_1.png"))); // NOI18N
        bocciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boccionesMouseClicked(evt);
            }
        });
        jPanel7.add(bocciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 22));

        jlhome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/inicio.png"))); // NOI18N
        jlhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlhomeMouseClicked(evt);
            }
        });
        jPanel7.add(jlhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 50, 40, 30));

        crearusu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearusu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/provedor1.png"))); // NOI18N
        crearusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearusuMouseClicked(evt);
            }
        });
        jPanel7.add(crearusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 70, 110, 50));

        jPanel5.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(273, 376));
        jPanel1.setPreferredSize(new java.awt.Dimension(410, 348));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setMinimumSize(new java.awt.Dimension(273, 435));
        jPanel4.setPreferredSize(new java.awt.Dimension(276, 435));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        bminimizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bminimizarMouseMoved(evt);
            }
        });
        bminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bminimizarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bminimizarMouseExited(evt);
            }
        });
        jPanel4.add(bminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        bquitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        bquitar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bquitarMouseMoved(evt);
            }
        });
        bquitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bquitarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bquitarMouseExited(evt);
            }
        });
        jPanel4.add(bquitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Editar usuario");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 185, 20));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Constraseña");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nombre.setBorder(null);
        jPanel4.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 180, 30));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 180, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/Enter_OFF.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setEnabled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/Enter_ON.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/Enter_ON.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 118, 34));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Nombre");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/icons8_Key_32px.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/icons8_customer_32px_1.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, 40));

        contraseña.setBorder(null);
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        jPanel4.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 150, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Cedula");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        cedula.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cedula.setBorder(null);
        cedula.setEnabled(false);
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        jPanel4.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 180, 20));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 180, 20));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Telefono");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, 20));

        telefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        telefono.setBorder(null);
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        jPanel4.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 180, 20));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 167, 10));

        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/usuarios.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Usuarios");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        tablausu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablausu.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        tablausu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Telefono", "contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablausu.setToolTipText("");
        tablausu.setGridColor(new java.awt.Color(255, 255, 255));
        tablausu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablausuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablausu);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 300, 190));

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bminimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bminimizarMouseMoved
        bminimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_bminimizarMouseMoved

    private void bminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bminimizarMouseClicked
        this.setState(Menu.ICONIFIED);
    }//GEN-LAST:event_bminimizarMouseClicked

    private void bminimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bminimizarMouseExited
        bminimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_bminimizarMouseExited

    private void bquitarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bquitarMouseMoved
        bquitar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_bquitarMouseMoved

    private void bquitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bquitarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result= JOptionPane.showConfirmDialog(null,"Desea Salir","Exit", dialog);
        if(result==0){
            System.exit(0);
        }
    }//GEN-LAST:event_bquitarMouseClicked

    private void bquitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bquitarMouseExited
        bquitar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_bquitarMouseExited

    private void boccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boccionesMouseClicked
        AnimationClass producto= new AnimationClass();
        producto.jLabelXRight(-40, 10, 10, 5, jlhome);

    

        AnimationClass home= new AnimationClass();
        home.jLabelXRight(-40, 10, 10, 5, jlhome);

        //<-------------
        AnimationClass productoi= new AnimationClass();
        productoi.jLabelXLeft(10, -40, 10, 5, jlhome);

    

        AnimationClass homer= new AnimationClass();
        homer.jLabelXLeft(10, -40, 10, 5, jlhome);
    }//GEN-LAST:event_boccionesMouseClicked

    private void jlhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlhomeMouseClicked
       new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jlhomeMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
//        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      eliminar();
      
      
      
      if(cedula.getText().isEmpty()|| nombre.getText().isEmpty()|| telefono.getText().isEmpty()||contraseña.getText().isEmpty()|| cedula.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Tienes algún campo vacío." ,"Error",JOptionPane.ERROR_MESSAGE);
      }else {
        manejador.editarUsuario(cedula.getText(), nombre.getText(), telefono.getText(),contraseña.getText(), cedula.getText());
        JOptionPane.showMessageDialog(rootPane,"Exito al editar usuario.");
        cedula.setText("");
        nombre.setText("");
        telefono.setText("");
        contraseña.setText("");
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cedulaActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_cedulaKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_telefonoKeyTyped

    private void crearusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearusuMouseClicked
        // TODO add your handling code here:
        new CrearUsu2().setVisible(true);
    }//GEN-LAST:event_crearusuMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
//        new CrearUsu().setVisible(true);
//        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        mostrardtablausuarios();
    }//GEN-LAST:event_formWindowActivated

    private void tablausuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablausuMouseClicked
         int i=tablausu.getSelectedRow();
        cedula.setText((String)(tablausu.getValueAt(i, 0)));
        nombre.setText((String)(tablausu.getValueAt(i, 1)));
        telefono.setText((String)(tablausu.getValueAt(i, 2)));
        contraseña.setText((String)(tablausu.getValueAt(i, 3)));
        jButton1.setEnabled(true);
        
    }//GEN-LAST:event_tablausuMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bminimizar;
    private javax.swing.JLabel bocciones;
    private javax.swing.JLabel bquitar;
    private javax.swing.JTextField cedula;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel crearusu;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlhome;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tablausu;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
