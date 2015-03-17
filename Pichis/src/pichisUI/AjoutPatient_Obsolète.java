/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisUI;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import pichisNF.DPI;

/**
 *
 * @author molit_000
 */
public class AjoutPatient_Obsolète extends javax.swing.JFrame {

    InterfaceAdministratif interfaceAdmin;

    /**
     * Creates new form AjoutPatient
     */
    public AjoutPatient_Obsolète(InterfaceAdministratif interfaceAdmin) {
        initComponents();

        setLocationRelativeTo(null);
        this.setResizable(false);

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.toFront();
        this.setAlwaysOnTop(true);
        this.setFocusable(true);
        this.setState(Frame.NORMAL);

        int x = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - (int) this.getSize().getWidth() / 2;
        int y = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - (int) this.getSize().getHeight() / 2;
        this.setLocation(x, y);

        champIPP.setText(DPI.CreerIpp());
        this.interfaceAdmin = interfaceAdmin;
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
        labelNom = new javax.swing.JLabel();
        champNom = new javax.swing.JTextField();
        labelPrenom = new javax.swing.JLabel();
        champPrenom = new javax.swing.JTextField();
        labelDateNaissance = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelSexe = new javax.swing.JLabel();
        labelAdresse = new javax.swing.JLabel();
        boutonHomme = new javax.swing.JRadioButton();
        boutonFemme = new javax.swing.JRadioButton();
        champAdresse = new javax.swing.JTextField();
        labelIPP = new javax.swing.JLabel();
        champIPP = new javax.swing.JTextField();
        boutonValider = new javax.swing.JButton();
        boutonAnnuler = new javax.swing.JButton();
        champJour = new javax.swing.JTextField();
        champMois = new javax.swing.JTextField();
        champAnnee = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        labelTitre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitre.setText("Ajout d'un Patient");
        jPanel1.add(labelTitre, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNom.setText("Nom");

        labelPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPrenom.setText("Prénom");

        labelDateNaissance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDateNaissance.setText("Date de naissance");

        jLabel4.setText("/");

        jLabel6.setText("/");

        labelSexe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelSexe.setText("Sexe");

        labelAdresse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelAdresse.setText("Adresse");

        boutonHomme.setText("H");
        boutonHomme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonHommeActionPerformed(evt);
            }
        });

        boutonFemme.setText("F");
        boutonFemme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonFemmeActionPerformed(evt);
            }
        });

        champAdresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champAdresseActionPerformed(evt);
            }
        });
        champAdresse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                champAdresseKeyPressed(evt);
            }
        });

        labelIPP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelIPP.setText("IPP");

        champIPP.setEditable(false);
        champIPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champIPPActionPerformed(evt);
            }
        });

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

        champJour.setText("Jour");
        champJour.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                champJourFocusGained(evt);
            }
        });
        champJour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champJourActionPerformed(evt);
            }
        });

        champMois.setText("Mois");
        champMois.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                champMoisFocusGained(evt);
            }
        });
        champMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champMoisActionPerformed(evt);
            }
        });

        champAnnee.setText("Annee");
        champAnnee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                champAnneeFocusGained(evt);
            }
        });
        champAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champAnneeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(labelPrenom)
                                            .addGap(83, 83, 83))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(labelNom)
                                            .addGap(100, 100, 100)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(labelIPP)
                                        .addGap(107, 107, 107)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(champNom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(champPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(champIPP, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelDateNaissance)
                                .addGap(26, 26, 26)
                                .addComponent(champJour, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(champMois, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(champAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(boutonAnnuler)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                                        .addComponent(boutonValider))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(labelAdresse)
                                        .addGap(82, 82, 82)
                                        .addComponent(champAdresse)))
                                .addGap(8, 8, 8)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelSexe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boutonHomme)
                        .addGap(35, 35, 35)
                        .addComponent(boutonFemme)
                        .addGap(72, 72, 72))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIPP)
                    .addComponent(champIPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNom)
                    .addComponent(champNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrenom)
                    .addComponent(champPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(champMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(champAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(labelSexe))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boutonHomme)
                            .addComponent(boutonFemme))))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdresse)
                    .addComponent(champAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonValider)
                    .addComponent(boutonAnnuler))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

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

    private void boutonHommeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonHommeActionPerformed
        if (boutonFemme.isSelected()) {
            boutonFemme.setSelected(false);
        }
    }//GEN-LAST:event_boutonHommeActionPerformed

    private void boutonFemmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonFemmeActionPerformed
        if (boutonHomme.isSelected()) {
            boutonHomme.setSelected(false);
        }
    }//GEN-LAST:event_boutonFemmeActionPerformed

    private void champAdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champAdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champAdresseActionPerformed

    private void boutonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAnnulerActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Êtes vous sûr de vouloir annuler ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_boutonAnnulerActionPerformed

    private void boutonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonValiderActionPerformed
        JOptionPane fenetre = new JOptionPane();
        String sexe = "";
        pichisNF.DateSimple date;
        // IPP
        if (champIPP.getText().length() == 9) {
            // NOM
            if (champNom.getText().isEmpty() == false) {
                //PRENOM
                if (champPrenom.getText().isEmpty() == false) {
                    //SEXE
                    if (boutonHomme.isSelected() || boutonFemme.isSelected()) {
                        //ADRESSE
                        if (champAdresse.getText().isEmpty() == false) {
                            date = new pichisNF.DateSimple(champJour.getText(), champMois.getText(), champAnnee.getText());
                            if (boutonHomme.isSelected()) {
                                //pichisNF.DPI p = new DPI(champIPP.getText(), champNom.getText(), champPrenom.getText(),"M", date, champAdresse.getText());
                                sexe = "H";
                            } else {
                                sexe = "F";
                            }
                            pichisBD.DAODPI dpi = new pichisBD.DAODPI();
                            dpi.ajout(champIPP.getText(), champNom.getText(), champPrenom.getText(), sexe, date, champAdresse.getText());
                            //Ajouter message de confirmation
                            this.dispose();
                           
                            interfaceAdmin.miseAJour();

                        } else {
                            fenetre.showMessageDialog(null, "Veuillez entrer l'adresse du patient");
                        }
                    } else {
                        fenetre.showMessageDialog(null, "Veuillez déterminer le sexe du patient");
                    }

                } else {
                    fenetre.showMessageDialog(null, "Veuillez entrer un prénom");
                }
            } else {
                fenetre.showMessageDialog(null, "Veuillez entrer un nom");
            }
        } else {
            fenetre.showMessageDialog(null, "Veuillez entrer un IPP correct");
        }

    }//GEN-LAST:event_boutonValiderActionPerformed

    private void champIPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champIPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champIPPActionPerformed

    private void champJourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champJourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champJourActionPerformed

    private void champMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champMoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champMoisActionPerformed

    private void champAnneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champAnneeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champAnneeActionPerformed

    private void champJourFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_champJourFocusGained
        champJour.setText("");
    }//GEN-LAST:event_champJourFocusGained

    private void champMoisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_champMoisFocusGained
        champMois.setText("");
    }//GEN-LAST:event_champMoisFocusGained

    private void champAnneeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_champAnneeFocusGained
        champAnnee.setText("");
    }//GEN-LAST:event_champAnneeFocusGained

    private void champAdresseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_champAdresseKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boutonValiderActionPerformed(null);
        }     // TODO add your handling code here:
    }//GEN-LAST:event_champAdresseKeyPressed

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
            java.util.logging.Logger.getLogger(AjoutPatient_Obsolète.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutPatient_Obsolète.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutPatient_Obsolète.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutPatient_Obsolète.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAnnuler;
    private javax.swing.JRadioButton boutonFemme;
    private javax.swing.JRadioButton boutonHomme;
    private javax.swing.JButton boutonValider;
    private javax.swing.JTextField champAdresse;
    private javax.swing.JTextField champAnnee;
    private javax.swing.JTextField champIPP;
    private javax.swing.JTextField champJour;
    private javax.swing.JTextField champMois;
    private javax.swing.JTextField champNom;
    private javax.swing.JTextField champPrenom;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAdresse;
    private javax.swing.JLabel labelDateNaissance;
    private javax.swing.JLabel labelIPP;
    private javax.swing.JLabel labelNom;
    private javax.swing.JLabel labelPrenom;
    private javax.swing.JLabel labelSexe;
    private javax.swing.JLabel labelTitre;
    // End of variables declaration//GEN-END:variables
}
