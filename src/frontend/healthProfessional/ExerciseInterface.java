/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

import backend.pojos.Exercise;
import backend.ws.ExerciseWS;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;

/**
 *
 * @author jorge
 */
public class ExerciseInterface extends javax.swing.JFrame {

    private Logger log = Logger.getLogger(ExerciseInterface.class);
    private ExerciseWS exWS;

    /**
     * Creates new form ExerciseDescription
     */
    public ExerciseInterface(Exercise ex) {
        initComponents();
        setField(ex);
    }

    private void setField(Exercise ex){
        this.jTextFieldName.setText(ex.getName());
        this.jTextFieldStructure.setText(ex.getStructure());
        this.jTextFieldDesignation.setText(ex.getDesignation());

        if (ex.getPicture().equals("profile")) {
            ImageIcon pic = new ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"));
            jLabelPhoto.setIcon(new ImageIcon(pic.getImage().getScaledInstance(
                    jLabelPhoto.getWidth(), jLabelPhoto.getHeight(), Image.SCALE_DEFAULT)));
        } else {
            jLabelPhoto.setIcon(new ImageIcon(getImageFromServer(ex.getPicture(), 90, 90)));
        }
    }

    private Image getImageFromServer(String picture, int with, int heigth) {
        try {
            URL url = new URL("http://localhost/mu-pen-web/imagens/Exercises/" + picture.trim());
            log.debug("\n\tProfile Image: " + url.toString());
            BufferedImage image = ImageIO.read(url);
            ImageIcon pic = new ImageIcon(image);
            return pic.getImage().getScaledInstance(with, heigth, Image.SCALE_DEFAULT);
        } catch (MalformedURLException ex) {
            log.error(ex.getMessage());
            throw new RuntimeException("Erro ao carregar imagem");
        } catch (IOException ex) {
            log.error(ex.getMessage());
            throw new RuntimeException("Erro ao carregar imagem");
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

        jPanelWallpaper = new javax.swing.JPanel();
        jPanelInformation = new javax.swing.JPanel();
        jLabelExercise = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelBirthDate = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jLabelPhoto = new javax.swing.JLabel();
        jTextFieldDesignation = new javax.swing.JTextField();
        jTextFieldStructure = new javax.swing.JTextField();
        jLabelInformation = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jPanelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelExercise.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelExercise.setText("Exercícios");
        jPanelInformation.add(jLabelExercise, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelName.setText("Nome:");
        jPanelInformation.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabelBirthDate.setText("designaçao:");
        jPanelInformation.add(jLabelBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jLabelGender.setText("Estrutura:");
        jPanelInformation.add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jButtonBack.setText("Voltar");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));
        jPanelInformation.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 190, -1));

        jLabelPhoto.setText("                           Imagem do exercício");
        jLabelPhoto.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        jPanelInformation.add(jLabelPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 300, 220));
        jPanelInformation.add(jTextFieldDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 190, -1));
        jPanelInformation.add(jTextFieldStructure, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 190, -1));

        jLabelInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jLabelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setMinimumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setPreferredSize(new java.awt.Dimension(680, 380));
        jPanelInformation.add(jLabelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelWallpaper.add(jPanelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 380));

        jLabelwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed

    }//GEN-LAST:event_jButtonBackActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ExerciseInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ExerciseInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ExerciseInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ExerciseInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ExerciseInterface().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabelBirthDate;
    private javax.swing.JLabel jLabelExercise;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JPanel jPanelWallpaper;
    private javax.swing.JTextField jTextFieldDesignation;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldStructure;
    // End of variables declaration//GEN-END:variables
}
