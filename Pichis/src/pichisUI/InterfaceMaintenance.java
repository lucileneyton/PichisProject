package pichisUI;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pichisNF.Administratif;
import pichisNF.Maintenance;
import pichisNF.Medecin;
import pichisNF.fonctions;

public class InterfaceMaintenance extends javax.swing.JFrame {

    private DefaultListModel<pichisNF.Administratif> modeleListeAdministratif;
    private DefaultListModel<pichisNF.Administratif> modeleListeAdministratifRecherche;
    private DefaultListModel<pichisNF.Maintenance> modeleListeMaintenance;
    private DefaultListModel<pichisNF.Maintenance> modeleListeMaintenanceRecherche;
    private DefaultListModel<pichisNF.Medecin> modeleListeMedecin;
    private DefaultListModel<pichisNF.Medecin> modeleListeRecherche;
    private Maintenance m;

    private GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    private Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();
    private int width = (int) (maximumWindowBounds.width - 0.015 * maximumWindowBounds.width);
    private int height = (int) (maximumWindowBounds.height - 0.02 * maximumWindowBounds.height);

    /**
     * Constructeur de l'interface Maintenance
     *
     * @param m Personnel de maintenance qui s'est identifié à la connexion
     */
    public InterfaceMaintenance(Maintenance m) {

        this.m = m;
        initComponents();
        pichisBD.DAOAdministratif daoAdministratif = new pichisBD.DAOAdministratif();
        pichisBD.DAOMaintenance daoMaintenance = new pichisBD.DAOMaintenance();
        pichisBD.DAOMedecin daoMedecin = new pichisBD.DAOMedecin();

        //Définit un titre pour notre fenêtre
        setTitle("PICHIS Maintenance");

        //Nous demandons maintenant à notre objet de se positionner au centre
        setLocationRelativeTo(null);

        //Termine le processus lorsqu'on clique sur la croix rouge
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(maximumWindowBounds.width, maximumWindowBounds.height);
        this.pack();

        //Remplissage de la liste du personnel administratif
        modeleListeAdministratif = new DefaultListModel<pichisNF.Administratif>();
        for (int i = 0; i < daoAdministratif.consulterListeAdministratif().size(); i++) {
            modeleListeAdministratif.addElement(daoAdministratif.consulterListeAdministratif().get(i));
        }
        listeAdministratif.setModel(modeleListeAdministratif);

        //Remplissage de la liste du personnel de maintenance
        modeleListeMaintenance = new DefaultListModel<pichisNF.Maintenance>();
        for (int i = 0; i < daoMaintenance.consulterListeMaintenance().size(); i++) {
            modeleListeMaintenance.addElement(daoMaintenance.consulterListeMaintenance().get(i));
        }
        listeMaintenance.setModel(modeleListeMaintenance);

        //Remplissage de la liste des practiciens hospitaliers
        modeleListeMedecin = new DefaultListModel<pichisNF.Medecin>();
        for (int i = 0; i < daoMedecin.consulterListeMedecin().size(); i++) {
            modeleListeMedecin.addElement(daoMedecin.consulterListeMedecin().get(i));
        }
        listeMedecin.setModel(modeleListeMedecin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InterfaceMaintenance = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRecherche = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeMedecin = new javax.swing.JList();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listeAdministratif = new javax.swing.JList();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listeMaintenance = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        InterfaceMaintenance.setBackground(new java.awt.Color(229, 229, 229));
        InterfaceMaintenance.setPreferredSize(new java.awt.Dimension(width, height));
        InterfaceMaintenance.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(1550, 165));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Images/iconmonstr-wrench-9-icon-64.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        jLabel9.setText(m.getPrenom());

        jLabel10.setFont(new java.awt.Font("Garamond", 0, 36)); // NOI18N
        jLabel10.setText(m.getNom());

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 0, 37)); // NOI18N
        jLabel11.setText("Personnel de maintenance");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Images/iconmonstr-logout-3-icon-64.png"))); // NOI18N
        jLabel15.setText("Déconnexion");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.setIconTextGap(0);
        jLabel15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(51, 51, 51))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel15)))
                .addGap(34, 34, 34))
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(230, 230, 230));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setPreferredSize(new java.awt.Dimension(1550, 60));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel1.setText("Rechercher un membre du personnel :");
        jPanel6.add(jLabel1);

        jTextFieldRecherche.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jTextFieldRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRechercheKeyReleased(evt);
            }
        });
        jPanel6.add(jTextFieldRecherche);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Images/iconmonstr-magnifier-5-icon-32.png"))); // NOI18N
        jPanel6.add(jLabel7);

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        InterfaceMaintenance.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Practiciens Hospitaliers"));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        listeMedecin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        listeMedecin.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N
        listeMedecin.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listeMedecin.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listeMedecinValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listeMedecin);

        jPanel9.add(jScrollPane1);

        jPanel1.add(jPanel9);

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Personnel Administratif"));
        jPanel18.setLayout(new javax.swing.BoxLayout(jPanel18, javax.swing.BoxLayout.LINE_AXIS));

        listeAdministratif.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        listeAdministratif.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N
        listeAdministratif.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listeAdministratif.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listeAdministratifValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listeAdministratif);

        jPanel18.add(jScrollPane3);

        jPanel1.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Personnel du service de Maintenance"));
        jPanel19.setLayout(new javax.swing.BoxLayout(jPanel19, javax.swing.BoxLayout.LINE_AXIS));

        listeMaintenance.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        listeMaintenance.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N
        listeMaintenance.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listeMaintenance.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listeMaintenanceValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listeMaintenance);

        jPanel19.add(jScrollPane4);

        jPanel1.add(jPanel19);

        jPanel7.add(jPanel1, java.awt.BorderLayout.CENTER);

        jButton1.setText("Ajouter un membre du personnel");
        jButton1.setPreferredSize(new java.awt.Dimension(189, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, java.awt.BorderLayout.PAGE_END);

        InterfaceMaintenance.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(InterfaceMaintenance);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AjoutPersonnel ajout = new AjoutPersonnel(this, m);
        ajout.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.dispose();
        new Identification();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void listeMedecinValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listeMedecinValueChanged
        if (listeMedecin.getSelectedValue() != null) {
            Medecin medecin = (Medecin) listeMedecin.getSelectedValue();
            JOptionPane.showMessageDialog(null, "Identifiant : " + medecin.getId() + "    Mot de passe : " + medecin.getMotDePasse() + "\n Service : " + medecin.getSpecialite().getSpecialite(), "Informations sur " + medecin.getPrenom() + " " + medecin.getNom().toUpperCase(), JOptionPane.INFORMATION_MESSAGE);
            listeMedecin.clearSelection();
        }
    }//GEN-LAST:event_listeMedecinValueChanged

    private void listeAdministratifValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listeAdministratifValueChanged
        if (listeAdministratif.getSelectedValue() != null) {
            Administratif administratif = (Administratif) listeAdministratif.getSelectedValue();
            JOptionPane.showMessageDialog(null, "Identifiant : " + administratif.getId() + "    Mot de passe : " + administratif.getMotDePasse(), "Informations sur " + administratif.getPrenom() + " " + administratif.getNom().toUpperCase(), JOptionPane.INFORMATION_MESSAGE);
            listeAdministratif.clearSelection();
        }
    }//GEN-LAST:event_listeAdministratifValueChanged

    private void listeMaintenanceValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listeMaintenanceValueChanged
        if (listeMaintenance.getSelectedValue() != null) {
            Maintenance maintenance = (Maintenance) listeMaintenance.getSelectedValue();
            JOptionPane.showMessageDialog(null, "Identifiant : " + maintenance.getId() + "    Mot de passe : " + maintenance.getMotDePasse(), "Informations sur " + maintenance.getPrenom() + " " + maintenance.getNom().toUpperCase(), JOptionPane.INFORMATION_MESSAGE);
            listeMaintenance.clearSelection();
        }
    }//GEN-LAST:event_listeMaintenanceValueChanged

    private void jTextFieldRechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRechercheKeyReleased
        //Recherche dans la liste du personnel administratif
        if (!jTextFieldRecherche.getText().isEmpty()) {
            ArrayList listePersonnelAdministratif = new ArrayList();

            for (int i = 0; i < modeleListeAdministratif.getSize(); i++) {

                listePersonnelAdministratif.add(modeleListeAdministratif.get(i).getNom());

            }

            ArrayList listePersonnelAdministratifRecherchee = fonctions.recherche(listePersonnelAdministratif, jTextFieldRecherche.getText());

            modeleListeAdministratifRecherche = new DefaultListModel<Administratif>();
            for (int i = 0; i < modeleListeAdministratif.getSize(); i++) {

                for (int j = 0; j < listePersonnelAdministratifRecherchee.size(); j++) {
                    if (listePersonnelAdministratifRecherchee.get(j).equals(modeleListeAdministratif.get(i).getNom()) && !modeleListeAdministratifRecherche.contains(modeleListeAdministratif.elementAt(i))) {
                        modeleListeAdministratifRecherche.addElement(modeleListeAdministratif.elementAt(i));
                    }

                }
            }

            listeAdministratif.setModel(modeleListeAdministratifRecherche);
        } else {
            listeAdministratif.setModel(modeleListeAdministratif);
        }

        //Recherche dans la liste du personnel médical
        if (!jTextFieldRecherche.getText().isEmpty()) {
            ArrayList listePersonnelMedical = new ArrayList();

            for (int i = 0; i < modeleListeMedecin.getSize(); i++) {

                listePersonnelMedical.add(modeleListeMedecin.get(i).getNom());

            }

            ArrayList listePersonnelMedicalRecherchee = fonctions.recherche(listePersonnelMedical, jTextFieldRecherche.getText());

            modeleListeRecherche = new DefaultListModel<Medecin>();
            for (int i = 0; i < modeleListeMedecin.getSize(); i++) {

                for (int j = 0; j < listePersonnelMedicalRecherchee.size(); j++) {
                    if (listePersonnelMedicalRecherchee.get(j).equals(modeleListeMedecin.get(i).getNom()) && !modeleListeRecherche.contains(modeleListeMedecin.elementAt(i))) {
                        modeleListeRecherche.addElement(modeleListeMedecin.elementAt(i));
                    }

                }
            }

            listeMedecin.setModel(modeleListeRecherche);
        } else {
            listeMedecin.setModel(modeleListeMedecin);
        }

        //Recherche dans la liste du personnel maintenance
        if (!jTextFieldRecherche.getText().isEmpty()) {
            ArrayList listePersonnelMaintenance = new ArrayList();

            for (int i = 0; i < modeleListeMaintenance.getSize(); i++) {

                listePersonnelMaintenance.add(modeleListeMaintenance.get(i).getNom());

            }

            ArrayList listePersonnelMaintenanceRecherchee = fonctions.recherche(listePersonnelMaintenance, jTextFieldRecherche.getText());

            modeleListeMaintenanceRecherche = new DefaultListModel<Maintenance>();
            for (int i = 0; i < modeleListeMaintenance.getSize(); i++) {

                for (int j = 0; j < listePersonnelMaintenanceRecherchee.size(); j++) {
                    if (listePersonnelMaintenanceRecherchee.get(j).equals(modeleListeMaintenance.get(i).getNom()) && !modeleListeMaintenanceRecherche.contains(modeleListeMaintenance.elementAt(i))) {
                        modeleListeMaintenanceRecherche.addElement(modeleListeMaintenance.elementAt(i));
                    }

                }
            }

            listeMaintenance.setModel(modeleListeMaintenanceRecherche);
        } else {
            listeMaintenance.setModel(modeleListeMaintenance);
        }
    }//GEN-LAST:event_jTextFieldRechercheKeyReleased

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
            java.util.logging.Logger.getLogger(InterfaceMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InterfaceMaintenance;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextFieldRecherche;
    private javax.swing.JList listeAdministratif;
    private javax.swing.JList listeMaintenance;
    private javax.swing.JList listeMedecin;
    // End of variables declaration//GEN-END:variables
}
