/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import util.Util;
import controllers.AlunoController;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Aluno;


public class CadastroAlunoUI extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CadastroAlunoUI() {
        initComponents();
        componentesClear();
        dataListUpdate();
        clearErrorMessage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabelWarningMessages = new javax.swing.JLabel();
        jLabelFormTitle = new javax.swing.JLabel();
        jButtonReturnToMainMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dadosProblemasjTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idURIjTextField = new javax.swing.JTextField();
        addAlunoBtn = new javax.swing.JButton();
        limparBtn = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nomeShowLabel = new javax.swing.JLabel();
        idURIShowLabel = new javax.swing.JLabel();
        pontosExtrasShowLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dadosjTable = new javax.swing.JTable();
        jLabelFormTitle1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameCadastroUsuariosUI"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWarningMessages.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelWarningMessages.setForeground(new java.awt.Color(255, 51, 51));
        jLabelWarningMessages.setText("ddd");
        jLabelWarningMessages.setFocusable(false);
        jLabelWarningMessages.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelWarningMessages, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, 447, -1));

        jLabelFormTitle.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelFormTitle.setForeground(new java.awt.Color(0, 153, 255));
        jLabelFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFormTitle.setText("Problemas Resolvidos");
        getContentPane().add(jLabelFormTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 710, 48));

        jButtonReturnToMainMenu.setText("Voltar");
        jButtonReturnToMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonReturnToMainMenuMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonReturnToMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, -1));

        dadosProblemasjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dadosProblemasjTable.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(dadosProblemasjTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 1160, 410));

        jLabel1.setText("ID URI:");

        addAlunoBtn.setText("Adicionar Aluno");
        addAlunoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addAlunoBtnMouseClicked(evt);
            }
        });

        limparBtn.setText("Limpar");
        limparBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limparBtnMouseClicked(evt);
            }
        });

        jButtonDelete.setText("Deletar");
        jButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idURIjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addAlunoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limparBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDelete)
                .addGap(233, 233, 233))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idURIjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(addAlunoBtn)
                    .addComponent(limparBtn)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 420, 40));

        jLabel20.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel20.setText("Nome:");

        jLabel23.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel23.setText("ID URI");

        jLabel25.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel25.setText("Pontos Extras:");

        nomeShowLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        nomeShowLabel.setText("Nome:");

        idURIShowLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        idURIShowLabel.setText("Bairro:");

        pontosExtrasShowLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        pontosExtrasShowLabel.setText("Bairro:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pontosExtrasShowLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeShowLabel)))
                        .addContainerGap(430, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idURIShowLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(idURIShowLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(nomeShowLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pontosExtrasShowLabel)
                    .addComponent(jLabel25))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 700, 240));

        dadosjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "C.P.F."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        dadosjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dadosjTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(dadosjTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 413, 300));

        jLabelFormTitle1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelFormTitle1.setForeground(new java.awt.Color(0, 153, 255));
        jLabelFormTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFormTitle1.setText("Alunos");
        getContentPane().add(jLabelFormTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1090, 48));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        clearErrorMessage();
    }//GEN-LAST:event_formMouseMoved

    private void jButtonReturnToMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReturnToMainMenuMouseClicked
        Util.abreTela(this, new MenuPrincipal(true));
    }//GEN-LAST:event_jButtonReturnToMainMenuMouseClicked

    private void limparBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparBtnMouseClicked
        componentesClear();
    }//GEN-LAST:event_limparBtnMouseClicked

    private void addAlunoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAlunoBtnMouseClicked
        try {
            AlunoController.cadastrarAluno(idURIjTextField.getText());
            componentesClear();
            dataListUpdate();
        } catch (Exception ex) {
            showError(ex.getMessage());
        }
    }//GEN-LAST:event_addAlunoBtnMouseClicked

    private void jButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMouseClicked
        int rowSelected = dadosjTable.getSelectedRow();
        if (rowSelected != -1 && Util.apagaRegistro()) {
            AlunoController.removerAlunoPorId((String) dadosjTable.getValueAt(rowSelected, 0));
            dataListUpdate();
            componentesClear();
        }

    }//GEN-LAST:event_jButtonDeleteMouseClicked

    private void dadosjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dadosjTableMouseClicked
       int rowSelected = dadosjTable.getSelectedRow();
        Aluno alunoTemp = AlunoController.getAlunoPorId(
                (String)dadosjTable.getValueAt(rowSelected, 0));
        idURIShowLabel.setText(alunoTemp.getIdUri());        
        nomeShowLabel.setText(alunoTemp.getNome());        
        pontosExtrasShowLabel.setText(String.format("%.2f", alunoTemp.getPontosExtras()));
        dataListProblemaUpdate(alunoTemp);
    }//GEN-LAST:event_dadosjTableMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroAlunoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroAlunoUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAlunoBtn;
    private javax.swing.JTable dadosProblemasjTable;
    private javax.swing.JTable dadosjTable;
    private javax.swing.JLabel idURIShowLabel;
    private javax.swing.JTextField idURIjTextField;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonReturnToMainMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabelFormTitle;
    private javax.swing.JLabel jLabelFormTitle1;
    private javax.swing.JLabel jLabelWarningMessages;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton limparBtn;
    private javax.swing.JLabel nomeShowLabel;
    private javax.swing.JLabel pontosExtrasShowLabel;
    // End of variables declaration//GEN-END:variables

    private void componentesClear() {
        
        idURIjTextField.setText(null);
      
        idURIShowLabel.setText(null);
       
        nomeShowLabel.setText(null);
       
        pontosExtrasShowLabel.setText(null);
        
        String[][] modelTemp;
        modelTemp = new String[0][8];        
        String[] headersTemp;
        headersTemp = new String[8];
        headersTemp[0] = "ID";
        headersTemp[1] = "Descrição";
        headersTemp[2] = "Level";
        headersTemp[3] = "Ranking";
        headersTemp[4] = "Submissão";
        headersTemp[5] = "Linguagem";
        headersTemp[6] = "Tempo";
        TableModel tableModelTemp;
        tableModelTemp = new DefaultTableModel(modelTemp, headersTemp);        
        dadosProblemasjTable.setModel(tableModelTemp);
    }

    private void dataListUpdate() {
        try {
            dadosjTable.setModel(AlunoController.getListModel());
        } catch (Exception e) {
            showError("Erro Na Listagem de Alunos");
        }
        
    }
    private void dataListProblemaUpdate(Aluno alunoTemp) {
        try {
            dadosProblemasjTable.setModel(AlunoController.getListProblemaModel(alunoTemp));
        } catch (Exception e) {
            showError("Erro Na Listagem de Problemas");
        }
        
    }

    private void showError(String errorMessage) {
        jLabelWarningMessages.setText(errorMessage);
        jLabelWarningMessages.setVisible(true);
    }

    private void clearErrorMessage() {
        jLabelWarningMessages.setVisible(false);
    }
}
