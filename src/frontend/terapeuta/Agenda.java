/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

/**
 *
 * @author jorge
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
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

        jPanelFundo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabelAgenda = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(718, 540));
        getContentPane().setLayout(null);

        jPanelFundo.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelFundo.setLayout(null);

        jPanel2.setMaximumSize(new java.awt.Dimension(680, 380));
        jPanel2.setLayout(null);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(65, 214));

        jPanel1.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel1.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel1.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"
            }
        ));
        jTable2.setMaximumSize(new java.awt.Dimension(105, 275));
        jTable2.setPreferredSize(new java.awt.Dimension(105, 275));
        jTable2.setRowHeight(55);
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 580, 300);

        jTabbedPane1.addTab("Janeiro", jPanel1);

        jPanel3.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel3.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(65, 214));
        jTabbedPane1.addTab("Fevereiro", jPanel3);

        jPanel4.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel4.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel4.setPreferredSize(new java.awt.Dimension(65, 214));
        jTabbedPane1.addTab("Março", jPanel4);

        jPanel5.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel5.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel5.setPreferredSize(new java.awt.Dimension(65, 214));
        jTabbedPane1.addTab("Abril", jPanel5);

        jPanel6.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel6.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel6.setPreferredSize(new java.awt.Dimension(65, 214));
        jTabbedPane1.addTab("Maio", jPanel6);

        jPanel7.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel7.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel7.setPreferredSize(new java.awt.Dimension(65, 214));
        jTabbedPane1.addTab("Junho", jPanel7);

        jPanel8.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel8.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel8.setPreferredSize(new java.awt.Dimension(65, 214));
        jTabbedPane1.addTab("Julho", jPanel8);

        jPanel9.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel9.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel9.setPreferredSize(new java.awt.Dimension(65, 214));
        jTabbedPane1.addTab("Agosto", jPanel9);

        jPanel10.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel10.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel10.setPreferredSize(new java.awt.Dimension(65, 214));
        jTabbedPane1.addTab("Setembro", jPanel10);

        jPanel11.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel11.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel11.setPreferredSize(new java.awt.Dimension(65, 214));
        jTabbedPane1.addTab("Outubro", jPanel11);

        jPanel12.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel12.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel12.setPreferredSize(new java.awt.Dimension(65, 214));
        jTabbedPane1.addTab("Novembro", jPanel12);

        jPanel13.setMaximumSize(new java.awt.Dimension(65, 214));
        jPanel13.setMinimumSize(new java.awt.Dimension(65, 214));
        jPanel13.setPreferredSize(new java.awt.Dimension(65, 214));
        jTabbedPane1.addTab("Dezembro", jPanel13);

        jPanel2.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 30, 600, 340);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2013", "2014", "2015", "2016", "2017" }));
        jComboBox1.setSelectedIndex(2);
        jComboBox1.setMinimumSize(new java.awt.Dimension(100, 20));
        jComboBox1.setPreferredSize(new java.awt.Dimension(60, 20));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(600, 10, 70, 20);

        jLabelAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jPanel2.add(jLabelAgenda);
        jLabelAgenda.setBounds(0, 0, 678, 380);

        jPanelFundo.add(jPanel2);
        jPanel2.setBounds(10, 110, 680, 380);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        jLabelFundo.setText("jLabel1");
        jLabelFundo.setMaximumSize(new java.awt.Dimension(700, 500));
        jLabelFundo.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanelFundo.add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 700, 500);

        getContentPane().add(jPanelFundo);
        jPanelFundo.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
