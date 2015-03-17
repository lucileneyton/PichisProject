/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisUI;

import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import pichisBD.DAOMedecin;
import pichisNF.DPI;
import pichisNF.DateSimple;

/**
 *
 * @author molit_000
 */
public class AjoutSejour extends javax.swing.JFrame {
    
    private DPI patient;
    private DAOMedecin daoMedecin;
    /**
     * Creates new form AjoutSejour
     */
    public AjoutSejour(pichisNF.DPI patientActuel) {       
        patient = patientActuel;
        daoMedecin = new DAOMedecin();
        initComponents();
        int x = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2 - (int)this.getSize().getWidth()/2;
        int y = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2 - (int)this.getSize().getHeight()/2;
        this.setLocation(x, y);
        
        champJourEntree.setText("" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        champMoisEntree.setText("" + (Calendar.getInstance().get(Calendar.MONTH) + 1) );
        champAnneeEntree.setText("" + Calendar.getInstance().get(Calendar.YEAR));
        
        DateSimple dateEntree = new DateSimple(champJourEntree.getText(), champMoisEntree.getText(), champAnneeEntree.getText());
        
        jTextFieldPatient.setText(patient.getIpp());
        champNumeroSejour.setText(patient.getDma().genererNumeroSejour(dateEntree));
        
        String[] tab = new String[daoMedecin.consulterListeMedecin().size()];
        for(int i=0; i<tab.length; i++){
           tab[i] = "" + i; //daoMedecin.consulterListeMedecin().get(i).toString();
        }
        for(int i =0; i<tab.length;i++){
            comboBoxNomPh.setModel(new javax.swing.DefaultComboBoxModel(tab));
        }
        
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
        labelTitre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelNumeroSejour = new javax.swing.JLabel();
        champNumeroSejour = new javax.swing.JTextField();
        labelNomPh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelAdresse = new javax.swing.JLabel();
        labelDateEntree = new javax.swing.JLabel();
        boutonValider = new javax.swing.JButton();
        boutonAnnuler = new javax.swing.JButton();
        champJourEntree = new javax.swing.JTextField();
        champMoisEntree = new javax.swing.JTextField();
        champAnneeEntree = new javax.swing.JTextField();
        comboBoxNomPh = new javax.swing.JComboBox();
        jLabelPatient = new javax.swing.JLabel();
        jTextFieldPatient = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        labelTitre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitre.setText("Ajout d'un Séjour");
        jPanel1.add(labelTitre, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelNumeroSejour.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNumeroSejour.setText("Numéro de séjour");

        champNumeroSejour.setEditable(false);
        champNumeroSejour.setBackground(new java.awt.Color(204, 204, 204));

        labelNomPh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNomPh.setText("Nom du PH");

        jLabel4.setText("/");

        jLabel6.setText("/");

        labelAdresse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        labelDateEntree.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDateEntree.setText("Date d'entrée");

        boutonValider.setText("Valider");
        boutonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonValiderActionPerformed(evt);
            }
        });

        boutonAnnuler.setText("Annuler");
        boutonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAnnulerActionPerformed(evt);
            }
        });

        champJourEntree.setEditable(false);
        champJourEntree.setBackground(new java.awt.Color(204, 204, 204));
        champJourEntree.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                champJourEntreeFocusGained(evt);
            }
        });
        champJourEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champJourEntreeActionPerformed(evt);
            }
        });

        champMoisEntree.setEditable(false);
        champMoisEntree.setBackground(new java.awt.Color(204, 204, 204));
        champMoisEntree.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                champMoisEntreeFocusGained(evt);
            }
        });
        champMoisEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champMoisEntreeActionPerformed(evt);
            }
        });

        champAnneeEntree.setEditable(false);
        champAnneeEntree.setBackground(new java.awt.Color(204, 204, 204));
        champAnneeEntree.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                champAnneeEntreeFocusGained(evt);
            }
        });
        champAnneeEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champAnneeEntreeActionPerformed(evt);
            }
        });

        comboBoxNomPh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        jLabelPatient.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPatient.setText("Patient ");

        jTextFieldPatient.setEditable(false);
        jTextFieldPatient.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumeroSejour)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(boutonAnnuler)
                            .addGap(202, 202, 202)
                            .addComponent(boutonValider))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(labelAdresse)
                                    .addGap(143, 143, 143))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(labelNomPh)
                                    .addGap(81, 81, 81)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboBoxNomPh, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(champNumeroSejour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addGap(33, 33, 33)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDateEntree)
                            .addComponent(jLabelPatient))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(champJourEntree, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(champMoisEntree, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(champAnneeEntree, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPatient))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPatient)
                    .addComponent(jTextFieldPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateEntree)
                    .addComponent(champJourEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(champMoisEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(champAnneeEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroSejour)
                    .addComponent(champNumeroSejour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomPh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxNomPh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(labelAdresse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonValider)
                    .addComponent(boutonAnnuler))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void champAnneeEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champAnneeEntreeActionPerformed

    }//GEN-LAST:event_champAnneeEntreeActionPerformed

    private void champAnneeEntreeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_champAnneeEntreeFocusGained

    }//GEN-LAST:event_champAnneeEntreeFocusGained

    private void champMoisEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champMoisEntreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champMoisEntreeActionPerformed

    private void champMoisEntreeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_champMoisEntreeFocusGained

    }//GEN-LAST:event_champMoisEntreeFocusGained

    private void champJourEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champJourEntreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champJourEntreeActionPerformed

    private void champJourEntreeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_champJourEntreeFocusGained

    }//GEN-LAST:event_champJourEntreeFocusGained

    private void boutonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAnnulerActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Êtes vous sûr de vouloir annuler ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_boutonAnnulerActionPerformed

    private void boutonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonValiderActionPerformed
        
    }//GEN-LAST:event_boutonValiderActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutSejour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutSejour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutSejour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutSejour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAnnuler;
    private javax.swing.JButton boutonValider;
    private javax.swing.JTextField champAnneeEntree;
    private javax.swing.JTextField champJourEntree;
    private javax.swing.JTextField champMoisEntree;
    private javax.swing.JTextField champNumeroSejour;
    private javax.swing.JComboBox comboBoxNomPh;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelPatient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldPatient;
    private javax.swing.JLabel labelAdresse;
    private javax.swing.JLabel labelDateEntree;
    private javax.swing.JLabel labelNomPh;
    private javax.swing.JLabel labelNumeroSejour;
    private javax.swing.JLabel labelTitre;
    // End of variables declaration//GEN-END:variables
}
