/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuOpciones;

import FormPrincipal.jPrincipalSFB;
import Juegos.CulturaGeneralN1;
import Juegos.PrincipalPPT;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerson AgY
 */
public class menuPrincipal extends javax.swing.JFrame {

    public String ruta = "/music/";
    public Clip clip2;

    public menuPrincipal() {
        initComponents();
        sonido("musicaPrincipal");
        ImageIcon icono = new ImageIcon("src/images/mundo rojo.jpg");
        setIconImage(icono.getImage());
        setSize(900, 800);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    public void sonido(String archivo) {
        try {
            clip2 = AudioSystem.getClip();
            clip2.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip2.start();

        } catch (Exception e) {

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

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonCULTURA = new javax.swing.JButton();
        jButtonPPT = new javax.swing.JButton();
        jLabelTITULO = new javax.swing.JLabel();
        jLabelFONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/albert.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 280, 103, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cristo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(690, 50, 87, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estatua.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 40, 120, 130);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/machu.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(550, 490, 110, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/musica.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 600, 84, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pintor.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 480, 100, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tesla.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(610, 290, 80, 90);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/torre.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 110, 110, 110);

        jButtonCULTURA.setBackground(new java.awt.Color(255, 255, 0));
        jButtonCULTURA.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButtonCULTURA.setText("CULTURA GENERAL");
        jButtonCULTURA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCULTURAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCULTURA);
        jButtonCULTURA.setBounds(320, 340, 200, 40);

        jButtonPPT.setBackground(new java.awt.Color(255, 255, 0));
        jButtonPPT.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButtonPPT.setText("YAN - KEN - PO");
        jButtonPPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPPTActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPPT);
        jButtonPPT.setBounds(320, 410, 200, 40);

        jLabelTITULO.setBackground(new java.awt.Color(255, 255, 0));
        jLabelTITULO.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabelTITULO.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTITULO.setText("¿QUÉ DESEAS JUGAR?");
        getContentPane().add(jLabelTITULO);
        jLabelTITULO.setBounds(320, 270, 210, 40);

        jLabelFONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFONDO);
        jLabelFONDO.setBounds(0, 0, 900, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPPTActionPerformed

        PrincipalPPT v = new PrincipalPPT();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonPPTActionPerformed

    private void jButtonCULTURAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCULTURAActionPerformed
        CulturaGeneralN1 ver = new CulturaGeneralN1();
        ver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCULTURAActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCULTURA;
    private javax.swing.JButton jButtonPPT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFONDO;
    private javax.swing.JLabel jLabelTITULO;
    // End of variables declaration//GEN-END:variables
}
