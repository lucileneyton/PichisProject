/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Classe pour tester la vérificationd de l'identification

package pichisUI;
import javax.swing.JOptionPane;
import pichisNF.Personnel;
import pichisBD.*;



/**
 *
 * @author Lucile
 */
public class TestIdentification extends javax.swing.JFrame {

    /**
     * Creates new form TestIdentification
     */
    public TestIdentification() {
        initComponents();
        
        //ConnectionBD bd = new ConnectionBD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        validation = new javax.swing.JButton();
        identif = new javax.swing.JTextField();
        mdp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        validation.setText("jButton1");
        validation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validationActionPerformed(evt);
            }
        });

        identif.setText("jTextField1");

        mdp.setText("jTextField2");
        mdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(validation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mdp)
                    .addComponent(identif))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(identif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(mdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(validation)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdpActionPerformed

    private void validationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validationActionPerformed
        // TODO add your handling code here:
        DAOMedecin daom = new DAOMedecin();
        DAOAdministratif daoa = new DAOAdministratif();
        
        
        
        
        if (daom.estMedecin(identif.getText(),mdp.getText())){
           
            if(daom.identification(identif.getText(), mdp.getText())){
                JOptionPane.showMessageDialog(rootPane, "Ok");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Erreur");
            }
        }
            else{
            if(daoa.identification(identif.getText(), mdp.getText())){
                JOptionPane.showMessageDialog(rootPane, "Ok");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Erreur");
            }
                    
                    }
        
        
            
    
    }//GEN-LAST:event_validationActionPerformed

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
            java.util.logging.Logger.getLogger(TestIdentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestIdentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestIdentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestIdentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestIdentification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField identif;
    private javax.swing.JTextField mdp;
    private javax.swing.JButton validation;
    // End of variables declaration//GEN-END:variables
}
