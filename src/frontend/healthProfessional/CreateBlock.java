/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

import backend.pojos.Block;
import backend.pojos.Domain;
import backend.pojos.Exercise;
import backend.pojos.Patient;
import backend.pojos.SubDomain;
import backend.ws.DomainWS;
import backend.ws.ExerciseWS;
import backend.ws.PatientWS;
import backend.ws.SubDomainWS;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author jorge
 */
public class CreateBlock extends javax.swing.JFrame {

    /**
     * Creates new form PrescribeSession
     */
    private Logger log = Logger.getLogger(CreateBlock.class);
    private DefaultTableModel tableModelSel;
    private DefaultTableModel tableModelPro;
    private DomainWS dWS;
    private List<Domain> dList;
    private SubDomainWS sdWS;
    private List<SubDomain> sdList;
    private ExerciseWS exWS;
    private List<Exercise> exList;

    public CreateBlock() {
        initComponents();
        dWS = new DomainWS();
        dList = dWS.getAllDomains();
        sdWS = new SubDomainWS();
        exWS = new ExerciseWS();
        drawDomainCombo();
        drawSubDomainCombo();
        drawPropExerTable();
    }

    private void drawDomainCombo() {
        try {
            for (Domain d : dList) {
                jComboBoxDomain.addItem(d.getName());
            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
            JOptionPane.showMessageDialog(CreateBlock.this, "Erro ao carregar a tabela dos \ndominios",
                    "Erro  Domínio", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void drawSubDomainCombo() {
        try {
            int index = jComboBoxDomain.getSelectedIndex();
            sdList = sdWS.getSubDomainByDomain(dList.get(index).getIdDomain());
            for (SubDomain sd : sdList) {
                jComboBoxSubDomain.addItem(sd.getName());
            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
            JOptionPane.showMessageDialog(CreateBlock.this, "Erro ao carregar a tabela dos \nsub-dominios",
                    "Erro  Sub Domínios", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void drawPropExerTable() {
        try {
            tableModelPro = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int i, int i1) {
                    return false;
                }
            };
            jTableProposenExercises.setModel(tableModelPro);
            tableModelPro.addColumn("Exercícios Propostos");

            int index = jComboBoxSubDomain.getSelectedIndex();
            exList = exWS.getExerciseBySubDomain(sdList.get(index).getIdSubDomain());
            for (Exercise ex : exList) {
                tableModelPro.addRow(new Object[]{ex.getName()});
            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
            JOptionPane.showMessageDialog(CreateBlock.this, "Erro ao carregar a tabela dos \nexercícios propostos",
                    "Erro  Exercícios propostos", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void drawSelecExerTable() {
        try {
            tableModelSel = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int i, int i1) {
                    return false;
                }
            };
            jTableSelectedExercises.setModel(tableModelSel);
            tableModelSel.addColumn("Exercícios Selecionados");

        } catch (Exception ex) {
            log.error(ex.getMessage());
            JOptionPane.showMessageDialog(CreateBlock.this, "Erro ao carregar a tabela dos \nexercícios selecionados",
                    "Erro  Exercícios selecionados", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private Exercise getExerciseSelAtTable() {
        return exList.get(jTableSelectedExercises.getSelectedRow());
    }
    
    private Exercise getExerciseProAtTable() {
        return exList.get(jTableProposenExercises.getSelectedRow());
    }
//     private Block loadBlockFromPanel() {
//        String warn = validator();
//        if (!warn.isEmpty()) {
//            throw new RuntimeException("Preencha o(s) seguintes dado(s): " + warn);
//        }
//        String name = jTextFieldName.getText();
//        String description = jTextAreaDescription.getText();
//
//
//        return new Block(name, description);
//    }
//    private String validator() {
//        StringBuilder warns = new StringBuilder();
//        warns.append(jTextFieldName.getText().isEmpty() ? "Nome, " : "");
//        warns.append(jTextAreaDescription.getText().isEmpty() ? "Descriçao, " : "");
//
//        if (!warns.toString().isEmpty()) {
//            warns.delete(warns.toString().length() - 2, warns.toString().length());
//            warns.append("!");
//        }
//
//        return warns.toString();
//    }
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
        jLabelCreateBlock = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelDiscription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabelDomain = new javax.swing.JLabel();
        jLabelSubDomain = new javax.swing.JLabel();
        jComboBoxDomain = new javax.swing.JComboBox();
        jComboBoxSubDomain = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSelectedExercises = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProposenExercises = new javax.swing.JTable();
        jButtonBack = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonSelect = new javax.swing.JButton();
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

        jLabelCreateBlock.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelCreateBlock.setText("Criar bloco");
        jPanelInformation.add(jLabelCreateBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelName.setText("Nome:");
        jPanelInformation.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));
        jPanelInformation.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 230, -1));

        jLabelDiscription.setText("Descrição:");
        jPanelInformation.add(jLabelDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        jPanelInformation.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 230, 60));

        jLabelDomain.setText("Dominio:");
        jPanelInformation.add(jLabelDomain, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabelSubDomain.setText("Sub-domínio:");
        jPanelInformation.add(jLabelSubDomain, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jComboBoxDomain.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDomainActionPerformed(evt);
            }
        });
        jPanelInformation.add(jComboBoxDomain, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 230, -1));

        jComboBoxSubDomain.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSubDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSubDomainActionPerformed(evt);
            }
        });
        jPanelInformation.add(jComboBoxSubDomain, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 230, -1));

        jTableSelectedExercises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Exercícios Selecionados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSelectedExercises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSelectedExercisesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableSelectedExercises);

        jPanelInformation.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 260, 140));

        jTableProposenExercises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Exercícios Propostos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProposenExercises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProposenExercisesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProposenExercises);

        jPanelInformation.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 260, 140));

        jButtonBack.setText("Voltar");
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        jButtonSave.setText("Guardar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        jButtonSelect.setText("<>");
        jButtonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 70, -1));

        jLabelInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jPanelInformation.add(jLabelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        jPanelWallpaper.add(jPanelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 380));

        jLabelwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSubDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSubDomainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSubDomainActionPerformed

    private void jComboBoxDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDomainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDomainActionPerformed

    private void jButtonSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectActionPerformed
        // TODO add your handling code here:
        tableModelSel.addRow(new Object[]{jTableProposenExercises.getSelectedRow()});
        tableModelSel.removeRow(jTableSelectedExercises.getSelectedRow());
        tableModelPro.addRow(new Object[]{jTableSelectedExercises.getSelectedRow()});
        tableModelPro.removeRow(jTableProposenExercises.getSelectedRow());

    }//GEN-LAST:event_jButtonSelectActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTableProposenExercisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProposenExercisesMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            new ExerciseProfile(getExerciseProAtTable()).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jTableProposenExercisesMouseClicked

    private void jTableSelectedExercisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSelectedExercisesMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            new ExerciseProfile(getExerciseSelAtTable()).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jTableSelectedExercisesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSelect;
    private javax.swing.JComboBox jComboBoxDomain;
    private javax.swing.JComboBox jComboBoxSubDomain;
    private javax.swing.JLabel jLabelCreateBlock;
    private javax.swing.JLabel jLabelDiscription;
    private javax.swing.JLabel jLabelDomain;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSubDomain;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JPanel jPanelWallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableProposenExercises;
    private javax.swing.JTable jTableSelectedExercises;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
