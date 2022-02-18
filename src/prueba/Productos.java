
package prueba;

import AppPackage.AnimationClass;
import conexion.Conectar;

import constructores.variablestablas;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DropMode;
import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PERSONAL
 */
public class Productos extends javax.swing.JFrame {
    public Conectar manejador= new Conectar();
    public Conectar c= new Conectar();
    DefaultTableModel diseño = new DefaultTableModel();
    int clic_tabla = 0;
    /**
     * Creates new form ñ
     */
    
    public Productos() {
        initComponents();
        this.setLocationRelativeTo(null);
       
//        this.mostrardtabla();
                
    }
    public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) tablapro.getModel();
        int a = tablapro.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        tb.removeRow(tb.getRowCount()-1);
        } 
        //cargaTicket();
    }
    public void agregar(){

        variablestablas vt = new variablestablas();
        vt.setCodigo(String.valueOf(codigotxt.getText()).charAt(0));
        vt.setNombre(nombretxt.getText());
        vt.setcantidadpro(Integer.parseInt(cantidadtxt.getText()));
        vt.setvalorpro(Integer.parseInt(valortxt.getText()));
        vt.setstockmin(Integer.parseInt(minimotxt.getText()));
        vt.setstockmax(Integer.parseInt(maximotxt.getText()));
        
       
    }
    
    public void mostrardtabla(){
       DefaultTableModel dtm;
       ResultSetMetaData rsmd;
        try{ 
           
            ResultSet sr= c.mostrartabla.executeQuery();
            rsmd=sr.getMetaData();
            ArrayList<Object[]> data =new ArrayList<>();
            while(sr.next()){
                Object[] rows =new Object[rsmd.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i]=sr.getObject(i+1);
                }
                data.add(rows);
            }
             dtm = (DefaultTableModel)this.tablapro.getModel();
             for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
                
            }
             
//            msn="exito";
            
        }catch(SQLException ex){
            ex.printStackTrace();
            
            
        }
    }
    
//    private void limpiartabla(){
//        while (tablapro.getRowCount() > 0) 
//        {
//        diseño.removeRow(0);
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bminimizar = new javax.swing.JLabel();
        bquitar = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapro = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        bocciones = new javax.swing.JLabel();
        jlhome = new javax.swing.JLabel();
        jlproductos = new javax.swing.JLabel();
        jlproveedor = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        codigotxt = new javax.swing.JTextField();
        cantidadtxt = new javax.swing.JTextField();
        minimotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        maximotxt = new javax.swing.JTextField();
        nombretxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        valortxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(673, 342));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(273, 376));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(bminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 2, -1, -1));

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
        jPanel3.add(bquitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 2, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/checklist-1295319_960_720 (1).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Productos");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 130));

        tablapro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablapro.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        tablapro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nom", "Cont", "Valor", "Max", "Min"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tablapro.setToolTipText("");
        tablapro.setGridColor(new java.awt.Color(255, 255, 255));
        tablapro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablapro);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, 260));

        jPanel2.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 376));
        jPanel4.setLayout(new java.awt.BorderLayout());

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
        jPanel7.add(jlhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 130, 40, 30));

        jlproductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/producto_1.png"))); // NOI18N
        jlproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlproductosMouseClicked(evt);
            }
        });
        jPanel7.add(jlproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 50, 40, 30));

        jlproveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prueba/imagenes/provedor1.png"))); // NOI18N
        jlproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlproveedorMouseClicked(evt);
            }
        });
        jPanel7.add(jlproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 90, 40, 30));

        jPanel4.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setEnabled(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigotxt.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        codigotxt.setBorder(null);
        codigotxt.setEnabled(false);
        codigotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigotxtActionPerformed(evt);
            }
        });
        jPanel6.add(codigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 43));

        cantidadtxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cantidadtxt.setBorder(null);
        cantidadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadtxtActionPerformed(evt);
            }
        });
        jPanel6.add(cantidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 180, 30));

        minimotxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        minimotxt.setBorder(null);
        minimotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimotxtActionPerformed(evt);
            }
        });
        jPanel6.add(minimotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 180, 43));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Codigo");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Cantidad");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Stock Minimo");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 259, -1, -1));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 10));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 240, 170, 10));
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 335, 180, 13));

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
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 118, 34));

        jPanel8.add(jPanel6);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setEnabled(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        maximotxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        maximotxt.setBorder(null);
        jPanel5.add(maximotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 43));

        nombretxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nombretxt.setBorder(null);
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });
        jPanel5.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 43));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Nombre");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 64, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Valor");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Stock Máximo");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 167, 30));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 20));

        valortxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        valortxt.setBorder(null);
        valortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valortxtActionPerformed(evt);
            }
        });
        jPanel5.add(valortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 30));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, 10));

        jPanel8.add(jPanel5);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigotxtActionPerformed

    private void cantidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadtxtActionPerformed

    private void minimotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimotxtActionPerformed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

    private void bminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bminimizarMouseClicked
        this.setState(Menu.ICONIFIED);
    }//GEN-LAST:event_bminimizarMouseClicked

    private void bquitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bquitarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result= JOptionPane.showConfirmDialog(null,"Desea Salir","Exit", dialog);
        if(result==0){
            System.exit(0);
        }
    }//GEN-LAST:event_bquitarMouseClicked

    private void bquitarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bquitarMouseMoved
        bquitar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_bquitarMouseMoved

    private void bquitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bquitarMouseExited
        bquitar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_bquitarMouseExited

    private void bminimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bminimizarMouseMoved
      bminimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_bminimizarMouseMoved

    private void bminimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bminimizarMouseExited
       bminimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_bminimizarMouseExited

    private void boccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boccionesMouseClicked
        AnimationClass producto= new AnimationClass();
        producto.jLabelXRight(-40, 10, 10, 5, jlproductos);
        
        AnimationClass proveedor= new AnimationClass();
        proveedor.jLabelXRight(-40, 10, 10, 5, jlproveedor);
        
        AnimationClass home= new AnimationClass();
        home.jLabelXRight(-40, 10, 10, 5, jlhome);
        
       
        //<-------------
         AnimationClass productoi= new AnimationClass();
        productoi.jLabelXLeft(10, -40, 10, 5, jlproductos);
        
        
        AnimationClass proveedorr= new AnimationClass();
        proveedorr.jLabelXLeft(10, -40, 10, 5, jlproveedor);
        
        AnimationClass homer= new AnimationClass();
        homer.jLabelXLeft(10, -40, 10, 5, jlhome);
    }//GEN-LAST:event_boccionesMouseClicked

    private void jlhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlhomeMouseClicked
       new Menu().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jlhomeMouseClicked

    private void jlproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlproductosMouseClicked
       new AgregarNuevoProducto2().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jlproductosMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void valortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valortxtActionPerformed

    private void tablaproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproMouseClicked
        int i=tablapro.getSelectedRow();
        codigotxt.setText((String)(tablapro.getValueAt(i, 0)));
        nombretxt.setText((String)(tablapro.getValueAt(i, 1)));
        cantidadtxt.setText(""+(int) tablapro.getValueAt(i,2));
        valortxt.setText(""+ (int)(tablapro.getValueAt(i, 3)));
        maximotxt.setText(""+ (int)(tablapro.getValueAt(i, 4)));
        minimotxt.setText(""+ (int)(tablapro.getValueAt(i, 5)));
        jButton1.setEnabled(true);
    }//GEN-LAST:event_tablaproMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminar();  
        manejador.editarProcducto(codigotxt.getText(), nombretxt.getText(), Integer.parseInt(cantidadtxt.getText()), Integer.parseInt(valortxt.getText()), Integer.parseInt(maximotxt.getText()), Integer.parseInt(minimotxt.getText()),codigotxt.getText());
         JOptionPane.showMessageDialog(rootPane,"Exito al editar producto.");
         codigotxt.setText("");
        nombretxt.setText("");
        cantidadtxt.setText("");
        valortxt.setText("");
        maximotxt.setText("");
        minimotxt.setText("");
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jlproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlproveedorMouseClicked
        new agregarProo().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jlproveedorMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        mostrardtabla();     
    }//GEN-LAST:event_formWindowActivated
                                                                         
                              
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bminimizar;
    private javax.swing.JLabel bocciones;
    private javax.swing.JLabel bquitar;
    private javax.swing.JTextField cantidadtxt;
    private javax.swing.JTextField codigotxt;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlhome;
    private javax.swing.JLabel jlproductos;
    private javax.swing.JLabel jlproveedor;
    private javax.swing.JTextField maximotxt;
    private javax.swing.JTextField minimotxt;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTable tablapro;
    private javax.swing.JTextField valortxt;
    // End of variables declaration//GEN-END:variables
}
