/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author hp 14
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNpalabras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTaviso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        cmbHacer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        cmbNuevo = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Periodico Informador ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cual es el numero de palabras");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtNpalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionListener(evt);
            }
        });
        txtNpalabras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNpalabrasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNpalabras, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Centimetros de su aviso");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, -1));

        txtTaviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionListener(evt);
            }
        });
        txtTaviso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTavisoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTaviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cuantos Colores Levara");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionListener(evt);
            }
        });
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        jPanel2.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 110, -1));

        cmbHacer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbHacer.setText("Consultar Cuanto Cuesta");
        cmbHacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHacerActionPerformed(evt);
                ActionListener(evt);
            }
        });
        jPanel2.add(cmbHacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Su Aviso Clasificado Tiene Un Valor De ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 240, -1));

        txtValor.setEditable(false);
        jPanel2.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 110, -1));

        cmbNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbNuevo.setText("Nueva Consulta ");
        cmbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(cmbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbHacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHacerActionPerformed
        String total;
        int palabras,tamaño,color,p,t,c,valor;
        
        if (txtNpalabras.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite El Numero de Palabras ","error", JOptionPane.ERROR_MESSAGE);
         txtNpalabras.requestFocusInWindow();}
        else if (txtTaviso.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite El Tamaño ","error", JOptionPane.ERROR_MESSAGE);
         txtTaviso.requestFocusInWindow();}
        else if (txtColor.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite Cuantos Colores ","error", JOptionPane.ERROR_MESSAGE);
         txtColor.requestFocusInWindow();}
        else {
        palabras=Integer.parseInt(txtNpalabras.getText());
        tamaño=Integer.parseInt(txtTaviso.getText());
        color=Integer.parseInt(txtColor.getText());
       p=20000*palabras;
       t=15000*tamaño;
       c=25000*color;
       valor=p+t+c;
       
       total=String.valueOf(valor);
        txtValor.setText("$"+total);
        
        }
        
    }//GEN-LAST:event_cmbHacerActionPerformed

    private void txtNpalabrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNpalabrasKeyTyped
       char c=evt.getKeyChar(); 
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtNpalabrasKeyTyped

    private void txtTavisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTavisoKeyTyped
        char c=evt.getKeyChar(); 
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtTavisoKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        char c=evt.getKeyChar(); 
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtColorKeyTyped

    private void cmbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNuevoActionPerformed
        txtNpalabras.setText("");
        txtTaviso.setText("");
        txtColor.setText("");
        txtValor.setText("");
        txtNpalabras.requestFocusInWindow();
    }//GEN-LAST:event_cmbNuevoActionPerformed

    private void ActionListener(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionListener
       ((JComponent) evt.getSource()).transferFocus();
    }//GEN-LAST:event_ActionListener

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbHacer;
    private javax.swing.JButton cmbNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNpalabras;
    private javax.swing.JTextField txtTaviso;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
