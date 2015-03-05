/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisUI;

import javax.swing.JFrame;

/**
 *
 * @author Johann
 */
public class InterfaceAdministratif extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceAdministratif
     */
    public InterfaceAdministratif() {
        initComponents();
        
        pichisNF.DPI patientActuel;
        
        //Définit un titre pour notre fenêtre
        setTitle("PICHIS Administratif");
        //Définit sa taille : 400 pixels de large et 100 pixels de haut
        //setSize(1365, 765);
        this.setResizable(false);
        //Nous demandons maintenant à notre objet de se positionner au centre
        setLocationRelativeTo(null);
        //Termine le processus lorsqu'on clique sur la croix rouge
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.pack();
        this.setDefaultLookAndFeelDecorated(true);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InterfaceAdministratif = new javax.swing.JPanel();
        panelTitre = new javax.swing.JPanel();
        PanelBarreTitre = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        boutonDeconnection = new javax.swing.JButton();
        boutonPreferences = new javax.swing.JButton();
        panelBarreRecherche = new javax.swing.JPanel();
        labelRecherche = new javax.swing.JLabel();
        jTextFieldRecherche = new javax.swing.JTextField();
        LabelBoutonRecherche = new javax.swing.JLabel();
        panelListe = new javax.swing.JPanel();
        scrollPaneListePatient = new javax.swing.JScrollPane();
        listeDePatients = new javax.swing.JList();
        boutonAjouter = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        ongletFichePatient = new javax.swing.JTabbedPane();
        panelFichePatient = new javax.swing.JPanel();
        ongletSejour = new javax.swing.JPanel();
        jScrollSejours = new javax.swing.JScrollPane();
        listeSejours = new javax.swing.JList();
        panelSejour = new javax.swing.JPanel();
        labelDateEntree = new javax.swing.JLabel();
        champJourEntree = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        champMoisEntree = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        champAnneeEntree = new javax.swing.JTextField();
        labelDateSortie = new javax.swing.JLabel();
        champJourSortie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        champMoisSortie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        champAnneeSortie = new javax.swing.JTextField();
        labelNumeroSejour = new javax.swing.JLabel();
        champNumeroSejour = new javax.swing.JTextField();
        labelPhResponsable = new javax.swing.JLabel();
        champPhResponsable = new javax.swing.JTextField();
        ongletLocalisation = new javax.swing.JPanel();
        ongletLettreSortie = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);

        InterfaceAdministratif.setBackground(new java.awt.Color(229, 229, 229));
        InterfaceAdministratif.setLayout(new java.awt.BorderLayout());

        panelTitre.setLayout(new java.awt.BorderLayout());

        PanelBarreTitre.setBackground(new java.awt.Color(255, 255, 255));
        PanelBarreTitre.setPreferredSize(new java.awt.Dimension(1550, 165));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Images/noun_43356_cc1.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        jLabel9.setText("Pat");

        jLabel10.setFont(new java.awt.Font("Garamond", 0, 36)); // NOI18N
        jLabel10.setText("Hibulaire ");

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 0, 37)); // NOI18N
        jLabel11.setText("Personnel administratif");

        boutonDeconnection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Images/iconmonstr-logout-3-icon-64.png"))); // NOI18N
        boutonDeconnection.setToolTipText("");
        boutonDeconnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonDeconnectionActionPerformed(evt);
            }
        });

        boutonPreferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Images/iconmonstr-wrench-20-icon-64.png"))); // NOI18N

        javax.swing.GroupLayout PanelBarreTitreLayout = new javax.swing.GroupLayout(PanelBarreTitre);
        PanelBarreTitre.setLayout(PanelBarreTitreLayout);
        PanelBarreTitreLayout.setHorizontalGroup(
            PanelBarreTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarreTitreLayout.createSequentialGroup()
                .addComponent(image)
                .addGroup(PanelBarreTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBarreTitreLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(PanelBarreTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelBarreTitreLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 511, Short.MAX_VALUE)
                .addComponent(boutonPreferences, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(boutonDeconnection)
                .addGap(44, 44, 44))
        );
        PanelBarreTitreLayout.setVerticalGroup(
            PanelBarreTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBarreTitreLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBarreTitreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelBarreTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBarreTitreLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel11))
                    .addGroup(PanelBarreTitreLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(PanelBarreTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boutonDeconnection, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boutonPreferences, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(34, 34, 34))
        );

        panelTitre.add(PanelBarreTitre, java.awt.BorderLayout.PAGE_START);

        panelBarreRecherche.setBackground(new java.awt.Color(230, 230, 230));
        panelBarreRecherche.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelBarreRecherche.setPreferredSize(new java.awt.Dimension(1550, 60));
        panelBarreRecherche.setLayout(new javax.swing.BoxLayout(panelBarreRecherche, javax.swing.BoxLayout.LINE_AXIS));

        labelRecherche.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        labelRecherche.setText("Rechercher un patient :");
        panelBarreRecherche.add(labelRecherche);

        jTextFieldRecherche.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jTextFieldRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRechercheActionPerformed(evt);
            }
        });
        panelBarreRecherche.add(jTextFieldRecherche);

        LabelBoutonRecherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Images/iconmonstr-magnifier-5-icon-32.png"))); // NOI18N
        panelBarreRecherche.add(LabelBoutonRecherche);

        panelTitre.add(panelBarreRecherche, java.awt.BorderLayout.PAGE_END);

        InterfaceAdministratif.add(panelTitre, java.awt.BorderLayout.PAGE_START);

        panelListe.setBorder(javax.swing.BorderFactory.createTitledBorder("Patients"));
        panelListe.setLayout(new java.awt.BorderLayout());

        listeDePatients.setBackground(new java.awt.Color(204, 204, 204));
        listeDePatients.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        listeDePatients.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N
        listeDePatients.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Sophie Stiquet", "Leo Pars", "Jean Foupasune", "Jean Neymar", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollPaneListePatient.setViewportView(listeDePatients);

        panelListe.add(scrollPaneListePatient, java.awt.BorderLayout.CENTER);

        boutonAjouter.setText("Ajouter un patient");
        boutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAjouterActionPerformed(evt);
            }
        });
        panelListe.add(boutonAjouter, java.awt.BorderLayout.PAGE_END);

        InterfaceAdministratif.add(panelListe, java.awt.BorderLayout.WEST);
        panelListe.getAccessibleContext().setAccessibleName("");

        panelFichePatient.setLayout(new java.awt.BorderLayout());
        ongletFichePatient.addTab("Fiche du patient", panelFichePatient);

        ongletSejour.setLayout(new java.awt.BorderLayout());

        listeSejours.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Sejour1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollSejours.setViewportView(listeSejours);

        ongletSejour.add(jScrollSejours, java.awt.BorderLayout.LINE_START);

        labelDateEntree.setText("Date d'entrée");

        champJourEntree.setEditable(false);
        champJourEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champJourEntreeActionPerformed(evt);
            }
        });

        jLabel1.setText("/");

        champMoisEntree.setEditable(false);

        jLabel2.setText("/");

        champAnneeEntree.setEditable(false);

        labelDateSortie.setText("Date de Sortie");

        champJourSortie.setEditable(false);

        jLabel3.setText("/");

        champMoisSortie.setEditable(false);

        jLabel4.setText("/");

        champAnneeSortie.setEditable(false);

        labelNumeroSejour.setText("Numéro de séjour");

        champNumeroSejour.setEditable(false);

        labelPhResponsable.setText("Nom du PH responsable");

        champPhResponsable.setEditable(false);

        javax.swing.GroupLayout panelSejourLayout = new javax.swing.GroupLayout(panelSejour);
        panelSejour.setLayout(panelSejourLayout);
        panelSejourLayout.setHorizontalGroup(
            panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSejourLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelSejourLayout.createSequentialGroup()
                            .addGroup(panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelDateEntree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelDateSortie, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(panelSejourLayout.createSequentialGroup()
                            .addComponent(labelNumeroSejour)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelSejourLayout.createSequentialGroup()
                        .addComponent(labelPhResponsable)
                        .addGap(21, 21, 21)))
                .addGroup(panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSejourLayout.createSequentialGroup()
                        .addComponent(champPhResponsable)
                        .addGap(565, 565, 565))
                    .addGroup(panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSejourLayout.createSequentialGroup()
                                .addComponent(champJourSortie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(champMoisSortie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(champAnneeSortie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(466, 466, 466))
                            .addGroup(panelSejourLayout.createSequentialGroup()
                                .addComponent(champNumeroSejour, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(480, 480, 480)))
                        .addGroup(panelSejourLayout.createSequentialGroup()
                            .addComponent(champJourEntree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(champMoisEntree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(champAnneeEntree, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(466, 466, 466)))))
        );
        panelSejourLayout.setVerticalGroup(
            panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSejourLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateEntree)
                    .addComponent(champJourEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(champMoisEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(champAnneeEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateSortie)
                    .addComponent(champJourSortie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(champMoisSortie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(champAnneeSortie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroSejour)
                    .addComponent(champNumeroSejour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSejourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhResponsable)
                    .addComponent(champPhResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        ongletSejour.add(panelSejour, java.awt.BorderLayout.CENTER);

        ongletFichePatient.addTab("Séjours", ongletSejour);

        javax.swing.GroupLayout ongletLocalisationLayout = new javax.swing.GroupLayout(ongletLocalisation);
        ongletLocalisation.setLayout(ongletLocalisationLayout);
        ongletLocalisationLayout.setHorizontalGroup(
            ongletLocalisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1102, Short.MAX_VALUE)
        );
        ongletLocalisationLayout.setVerticalGroup(
            ongletLocalisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        ongletFichePatient.addTab("Localisation", ongletLocalisation);

        javax.swing.GroupLayout ongletLettreSortieLayout = new javax.swing.GroupLayout(ongletLettreSortie);
        ongletLettreSortie.setLayout(ongletLettreSortieLayout);
        ongletLettreSortieLayout.setHorizontalGroup(
            ongletLettreSortieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1102, Short.MAX_VALUE)
        );
        ongletLettreSortieLayout.setVerticalGroup(
            ongletLettreSortieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        ongletFichePatient.addTab("Lettre de sortie", ongletLettreSortie);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ongletFichePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 1107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ongletFichePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ongletFichePatient.getAccessibleContext().setAccessibleName("Fiche du patient");

        InterfaceAdministratif.add(panelPrincipal, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InterfaceAdministratif, javax.swing.GroupLayout.PREFERRED_SIZE, 1559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InterfaceAdministratif, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRechercheActionPerformed

    private void boutonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAjouterActionPerformed
        AjoutPatient ajout = new AjoutPatient();
        ajout.setVisible(true);
    }//GEN-LAST:event_boutonAjouterActionPerformed

    private void boutonDeconnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonDeconnectionActionPerformed
        this.dispose();
        new Identification();
    }//GEN-LAST:event_boutonDeconnectionActionPerformed

    private void champJourEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champJourEntreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champJourEntreeActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceAdministratif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdministratif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdministratif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdministratif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceAdministratif().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InterfaceAdministratif;
    private javax.swing.JLabel LabelBoutonRecherche;
    private javax.swing.JPanel PanelBarreTitre;
    private javax.swing.JButton boutonAjouter;
    private javax.swing.JButton boutonDeconnection;
    private javax.swing.JButton boutonPreferences;
    private javax.swing.JTextField champAnneeEntree;
    private javax.swing.JTextField champAnneeSortie;
    private javax.swing.JTextField champJourEntree;
    private javax.swing.JTextField champJourSortie;
    private javax.swing.JTextField champMoisEntree;
    private javax.swing.JTextField champMoisSortie;
    private javax.swing.JTextField champNumeroSejour;
    private javax.swing.JTextField champPhResponsable;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollSejours;
    private javax.swing.JTextField jTextFieldRecherche;
    private javax.swing.JLabel labelDateEntree;
    private javax.swing.JLabel labelDateSortie;
    private javax.swing.JLabel labelNumeroSejour;
    private javax.swing.JLabel labelPhResponsable;
    private javax.swing.JLabel labelRecherche;
    private javax.swing.JList listeDePatients;
    private javax.swing.JList listeSejours;
    private javax.swing.JTabbedPane ongletFichePatient;
    private javax.swing.JPanel ongletLettreSortie;
    private javax.swing.JPanel ongletLocalisation;
    private javax.swing.JPanel ongletSejour;
    private javax.swing.JPanel panelBarreRecherche;
    private javax.swing.JPanel panelFichePatient;
    private javax.swing.JPanel panelListe;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSejour;
    private javax.swing.JPanel panelTitre;
    private javax.swing.JScrollPane scrollPaneListePatient;
    // End of variables declaration//GEN-END:variables
}
