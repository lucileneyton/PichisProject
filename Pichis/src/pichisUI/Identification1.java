/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisUI;


import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import pichisBD.*;
import pichisNF.Personnel;

/**
 *
 * @author Matilas
 */
public class Identification1 extends javax.swing.JFrame {

    /**
     * Creates new form PICHIS_Manager
     */
    GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();
    int width = (int) (maximumWindowBounds.width - 0.015 * maximumWindowBounds.width);
    int height = (int) (maximumWindowBounds.height - 0.02 * maximumWindowBounds.height);

    public Identification1() {
        initComponents();
        this.setVisible(true);

        //Définit un titre pour notre fenêtre
        setTitle("PICHISManager");
        //Définit sa taille : 400 pixels de large et 100 pixels de haut
        //setSize(1365, 765);
        //this.setResizable(false);
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

        PanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanneauEntreeDesChamps = new pichisUI.FenetreIdentification();
        identifiant = new javax.swing.JTextField();
        mdp = new javax.swing.JPasswordField();
        BoutonDeConnexion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        messageErreur = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        PanelPrincipal.setBackground(new java.awt.Color(187, 195, 187));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(width, height));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Images/Princeton_Plainsboro_Wallpaper_by_PencilshadeTest.png"))); // NOI18N
        jLabel1.setText("j");

        PanneauEntreeDesChamps.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        identifiant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identifiant.setText("");
        identifiant.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        Font font1 = new Font(Font.DIALOG_INPUT, Font.ITALIC, 20);

        identifiant.setFont(font1);
        identifiant.setHorizontalAlignment(JTextField.CENTER);

        mdp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mdp.setText("");
        mdp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        Font font2 = new Font(Font.DIALOG_INPUT, Font.ITALIC, 20);

        mdp.setFont(font1);
        mdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpActionPerformed(evt);
            }
        });
        mdp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mdpKeyPressed(evt);
            }
        });
        KeyListener  k = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        mdp.addKeyListener(k);

        BoutonDeConnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Images/Connaxion.png")));
        BoutonDeConnexion.setText("");
        BoutonDeConnexion.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                tentativeDeConnexion();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }

            @Override
            public void mouseExited(MouseEvent e) {

                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        }
    );
    BoutonDeConnexion.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            BoutonDeConnexionMouseClicked(evt);
        }
    });

    jLabel4.setForeground(new java.awt.Color(170, 0, 0));
    jLabel4.setText("Identifiant");

    jLabel5.setForeground(new java.awt.Color(170, 0, 0));
    jLabel5.setText("Mot de passe ");

    messageErreur.setForeground(new java.awt.Color(255, 51, 0));
    messageErreur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    messageErreur.setText("jLabel16");
    messageErreur.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    messageErreur.setVisible(false);

    javax.swing.GroupLayout PanneauEntreeDesChampsLayout = new javax.swing.GroupLayout(PanneauEntreeDesChamps);
    PanneauEntreeDesChamps.setLayout(PanneauEntreeDesChampsLayout);
    PanneauEntreeDesChampsLayout.setHorizontalGroup(
        PanneauEntreeDesChampsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(PanneauEntreeDesChampsLayout.createSequentialGroup()
            .addGap(104, 104, 104)
            .addGroup(PanneauEntreeDesChampsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanneauEntreeDesChampsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mdp, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(identifiant))
                .addGroup(PanneauEntreeDesChampsLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(PanneauEntreeDesChampsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanneauEntreeDesChampsLayout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addComponent(messageErreur, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BoutonDeConnexion)
            .addContainerGap())
    );
    PanneauEntreeDesChampsLayout.setVerticalGroup(
        PanneauEntreeDesChampsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(PanneauEntreeDesChampsLayout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel5)
            .addGap(5, 5, 5)
            .addComponent(mdp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
            .addGroup(PanneauEntreeDesChampsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(BoutonDeConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanneauEntreeDesChampsLayout.createSequentialGroup()
                    .addComponent(messageErreur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())))
    );

    jLabel2.setFont(new java.awt.Font("Garamond", 0, 85)); // NOI18N
    jLabel2.setText("Bienvenue    ");

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Images/logo4.png"))); // NOI18N

    javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
    PanelPrincipal.setLayout(PanelPrincipalLayout);
    PanelPrincipalLayout.setHorizontalGroup(
        PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(PanelPrincipalLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGroup(PanelPrincipalLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PanneauEntreeDesChamps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(32, 32, 32))
    );
    PanelPrincipalLayout.setVerticalGroup(
        PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(PanelPrincipalLayout.createSequentialGroup()
            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelPrincipalLayout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addComponent(PanneauEntreeDesChamps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelPrincipalLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel1)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    getContentPane().add(PanelPrincipal);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpActionPerformed

    }//GEN-LAST:event_mdpActionPerformed

    private void BoutonDeConnexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoutonDeConnexionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonDeConnexionMouseClicked

    private void mdpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mdpKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tentativeDeConnexion();
        } else {
            if (mdp.getText().length() == 0) {
                messageErreur.setVisible(false);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_mdpKeyPressed

    public void ouvrirInterfaceMedecin() {
        InterfaceServiceClinique i = new InterfaceServiceClinique();
        i.setVisible(true);
    }

    public void ouvrirInterfaceAdministratif() {
        InterfaceAdministratif i = new InterfaceAdministratif();
        i.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(Identification1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Identification1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Identification1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Identification1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Identification1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BoutonDeConnexion;
    private javax.swing.JPanel PanelPrincipal;
    private pichisUI.FenetreIdentification PanneauEntreeDesChamps;
    private javax.swing.JTextField identifiant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField mdp;
    private javax.swing.JLabel messageErreur;
    // End of variables declaration//GEN-END:variables

    private void tentativeDeConnexion() {
        DAOMedecin daom = new DAOMedecin();
        DAOAdministratif daoa = new DAOAdministratif();

        if (identifiant.getText().isEmpty() || mdp.getText().isEmpty()) {
            messageErreur.setVisible(true);
            messageErreur.setText("Remplir tous les champs.");
        } else {

            if (daom.estMedecin(identifiant.getText(), mdp.getText())) {

                if (daom.identification(identifiant.getText(), mdp.getText())) {
                    this.dispose();
                    ouvrirInterfaceMedecin();
                } else {
                    messageErreur.setVisible(true);
                    messageErreur.setText("Informations de connexion inconnues. Les vérifier.");

                }
            } else {
                if (daoa.identification(identifiant.getText(), mdp.getText())) {
                    this.dispose();
                    ouvrirInterfaceAdministratif();

                } else {
                    messageErreur.setVisible(true);
                    messageErreur.setText("Informations de connexion inconnues. Les vérifier.");
                }

            }
        }

    }
}
