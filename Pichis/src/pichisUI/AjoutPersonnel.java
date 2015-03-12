/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisUI;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import pichisNF.Administratif;
import pichisNF.DPI;
import pichisNF.Maintenance;
import pichisNF.Medecin;
import pichisNF.Services;
import pichisNF.Specialite;
import pichisNF.TypeServices;

/**
 *
 * @author Johann
 */
public class AjoutPersonnel extends javax.swing.JFrame {

    /**
     * Creates new form AjoutPersonnel
     */
    public AjoutPersonnel() {
        initComponents();
        int x = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - (int) this.getSize().getWidth() / 2;
        int y = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - (int) this.getSize().getHeight() / 2;
        this.setLocation(x, y);

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
        labelIdentifiant = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        champIdentifiant = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        champMdp = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        labelTitre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitre.setText("Ajout d'un membre du personnel");
        jPanel1.add(labelTitre, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNom.setText("Nom");

        labelPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPrenom.setText("Prénom");

        labelIdentifiant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelIdentifiant.setText("Identifiant");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Administratif","Maintenance","Practicien Hospitalier"}));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Type");

        champIdentifiant.setEditable(false);
        champIdentifiant.setBackground(new java.awt.Color(204, 204, 204));
        champIdentifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champIdentifiantActionPerformed(evt);
            }
        });

        jLabel2.setText("Spécialité");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(Specialite.values()));
        jComboBox2.setEnabled(false);
        jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox2FocusGained(evt);
            }
        });

        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ajouter un membre");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Mot de passe");

        jButton3.setText("Générer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(champMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPrenom)
                                    .addComponent(labelIdentifiant))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(champIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(champPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelNom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(champNom, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(champNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNom))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(champPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrenom))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(champIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdentifiant)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(champMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() == 2) {
            jComboBox2.setEnabled(true);
        } else {
            jComboBox2.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void champIdentifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champIdentifiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champIdentifiantActionPerformed

    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained

    }//GEN-LAST:event_jComboBox1FocusGained

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane fenetre = new JOptionPane();
        // NOM
        if (champNom.getText().isEmpty() == false) {
            //PRENOM
            if (champPrenom.getText().isEmpty() == false) {
                //IDENTIFIANT
                if (champIdentifiant.getText().isEmpty() == false && champIdentifiant.getText().equals(champNom.getText().toLowerCase() + champPrenom.getText().toLowerCase().charAt(0))) {
                    //MOT DE PASSE
                    if (champMdp.getText().isEmpty() == false) {

                        JOptionPane jop = new JOptionPane();
                        String[] buttons = {"Oui", "Non"};
                        int reply = JOptionPane.showOptionDialog(null, "Voulez-vous confirmer l'ajout du membre du personnel " + champPrenom.getText() + " " + champNom.getText() + " ? ", "Confirmation", JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);

                        if (reply == 0) {

                            // Ajout personnel administratif
                            if (jComboBox1.getSelectedIndex() == 0) {
                                Administratif a = new Administratif(champIdentifiant.getText(), champNom.getText(), champPrenom.getText(), champMdp.getText());
                            }

                            // Ajout personnel de maintenance
                            if (jComboBox1.getSelectedIndex() == 1) {
                                Maintenance ma = new Maintenance(champIdentifiant.getText(), champNom.getText(), champPrenom.getText(), champMdp.getText());
                            }

                            // Ajout practicien hospitalier
                            if (jComboBox1.getSelectedIndex() == 0) {
                                Specialite sp = (Specialite) jComboBox2.getSelectedItem();
                                TypeServices ts = TypeServices.CLINIQUE;

                                if (jComboBox2.getSelectedItem().equals(Specialite.RADIOLOGUE)) {
                                    ts = TypeServices.MEDICO_TECHNIQUE;
                                }

                                Services service = new Services(ts, sp);
                                Medecin me = new Medecin(champIdentifiant.getText(), champNom.getText(), champPrenom.getText(), champMdp.getText(), service);
                                //pichisBD.DAOMedecin daoMedecin = new pichisBD.DAOMedecin();
                                //daoMedecin.ajoutMedecin(me.getId(), me.getNom(), me.getPrenom(), me.getMotDePasse(), me.getSpecialite());
                            }
                            jop.hide();
                            this.dispose();
                        }

                    } else {
                        fenetre.showMessageDialog(null, "Veuillez entrer un mot de passe");
                    }
                } else {
                    if (champIdentifiant.getText().isEmpty() == true) {
                        fenetre.showMessageDialog(null, "Veuillez générer un identifiant");
                    } else {
                        fenetre.showMessageDialog(null, "Cet identifiant ne correspond pas au nom et au prénom renseigné. Veuillez regénérer un identifiant");
                    }

                }
            } else {
                fenetre.showMessageDialog(null, "Veuillez entrer un prénom");
            }
        } else {
            fenetre.showMessageDialog(null, "Veuillez entrer un nom");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Êtes vous sûr de vouloir annuler ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusGained

    }//GEN-LAST:event_jComboBox2FocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //Génération de l'identifiant (Nom + première lettre du prénom)
        String id;
        if (champNom.getText().isEmpty() == false && champPrenom.getText().isEmpty() == false) {
            id = champNom.getText().toLowerCase().replace(" ", "") + champPrenom.getText().toLowerCase().replace(" ", "").charAt(0);
            champIdentifiant.setText(id);
        } else {
            JOptionPane fenetre = new JOptionPane();
            champIdentifiant.setText("");
            if (champNom.getText().isEmpty() == false) {
                fenetre.showMessageDialog(null, "Veuillez remplir le champs nom");
            }
            if (champPrenom.getText().isEmpty() == false) {
                fenetre.showMessageDialog(null, "Veuillez remplir le champs prénom");
            }

        }


    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutPersonnel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField champIdentifiant;
    private javax.swing.JTextField champMdp;
    private javax.swing.JTextField champNom;
    private javax.swing.JTextField champPrenom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelIdentifiant;
    private javax.swing.JLabel labelNom;
    private javax.swing.JLabel labelPrenom;
    private javax.swing.JLabel labelTitre;
    // End of variables declaration//GEN-END:variables
}
