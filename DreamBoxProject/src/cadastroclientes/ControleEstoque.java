/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroclientes;

/**
 *
 * @author robso
 */
public class ControleEstoque extends javax.swing.JFrame {

    /**
     * Creates new form ControleEstoque
     */
    public ControleEstoque() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        codEstoque = new javax.swing.JLabel();
        nomeProdutoEstoque = new javax.swing.JLabel();
        tipoPapel = new javax.swing.JLabel();
        txtTipoOndaEstoque = new javax.swing.JTextField();
        txtNomePapelEstoque = new javax.swing.JTextField();
        txtCodPapelEstoque = new javax.swing.JTextField();
        descricaoItensExtoque = new javax.swing.JLabel();
        btnConsultarDescricaoEstoq = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cadastroEstoque = new javax.swing.JLabel();
        codMedidas = new javax.swing.JLabel();
        txtCodMedidasEstoque = new javax.swing.JTextField();
        medidasEstoque1 = new javax.swing.JLabel();
        compEstoque1 = new javax.swing.JLabel();
        larguraEstoqueCad = new javax.swing.JLabel();
        txtLagCadastroEstoq = new javax.swing.JTextField();
        txtMedidasCadastroEstoq = new javax.swing.JTextField();
        quantMinimaChapas = new javax.swing.JLabel();
        txtQuantMinimaEstoq = new javax.swing.JTextField();
        btnCadastroEstoque = new javax.swing.JButton();
        btnAlterarCadastroEstoq = new javax.swing.JButton();
        btnConsultarCadEstoq = new javax.swing.JButton();
        btnExcluirCadEstoque = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dream Controle Estoque");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        codEstoque.setForeground(new java.awt.Color(255, 102, 0));
        codEstoque.setText("Código Papel:");

        nomeProdutoEstoque.setForeground(new java.awt.Color(255, 102, 0));
        nomeProdutoEstoque.setText("Nome do Papel:");

        tipoPapel.setForeground(new java.awt.Color(255, 102, 0));
        tipoPapel.setText("Tipo da Onda:");

        txtTipoOndaEstoque.setBackground(new java.awt.Color(204, 204, 204));
        txtTipoOndaEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNomePapelEstoque.setBackground(new java.awt.Color(204, 204, 204));

        txtCodPapelEstoque.setBackground(new java.awt.Color(204, 204, 204));
        txtCodPapelEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        descricaoItensExtoque.setForeground(new java.awt.Color(255, 102, 0));
        descricaoItensExtoque.setText("Descrição das Chapas:");

        btnConsultarDescricaoEstoq.setForeground(new java.awt.Color(255, 102, 0));
        btnConsultarDescricaoEstoq.setText("Consultar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tipoPapel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTipoOndaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btnConsultarDescricaoEstoq, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeProdutoEstoque)
                                    .addComponent(codEstoque))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodPapelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomePapelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(descricaoItensExtoque)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(descricaoItensExtoque)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codEstoque)
                    .addComponent(txtCodPapelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeProdutoEstoque)
                    .addComponent(txtNomePapelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoPapel)
                    .addComponent(txtTipoOndaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarDescricaoEstoq))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cadastroEstoque.setForeground(new java.awt.Color(255, 102, 0));
        cadastroEstoque.setText("Cadastro Medidas de Chapas:");

        codMedidas.setForeground(new java.awt.Color(255, 102, 0));
        codMedidas.setText("Código Medidas:");

        txtCodMedidasEstoque.setBackground(new java.awt.Color(204, 204, 204));
        txtCodMedidasEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        medidasEstoque1.setDisplayedMnemonic('D');
        medidasEstoque1.setForeground(new java.awt.Color(255, 102, 0));
        medidasEstoque1.setText("Medidas:");

        compEstoque1.setForeground(new java.awt.Color(255, 102, 0));
        compEstoque1.setText("Comprimento:");

        larguraEstoqueCad.setForeground(new java.awt.Color(255, 102, 0));
        larguraEstoqueCad.setText("Largura:");

        txtLagCadastroEstoq.setBackground(new java.awt.Color(204, 204, 204));
        txtLagCadastroEstoq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtMedidasCadastroEstoq.setBackground(new java.awt.Color(204, 204, 204));
        txtMedidasCadastroEstoq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMedidasCadastroEstoq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedidasCadastroEstoqActionPerformed(evt);
            }
        });

        quantMinimaChapas.setForeground(new java.awt.Color(255, 102, 0));
        quantMinimaChapas.setText("Estoque Mínimo de Chapas:");

        txtQuantMinimaEstoq.setBackground(new java.awt.Color(204, 204, 204));
        txtQuantMinimaEstoq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnCadastroEstoque.setForeground(new java.awt.Color(255, 102, 0));
        btnCadastroEstoque.setText("Salvar");

        btnAlterarCadastroEstoq.setForeground(new java.awt.Color(255, 102, 0));
        btnAlterarCadastroEstoq.setText("Alterar");

        btnConsultarCadEstoq.setForeground(new java.awt.Color(255, 102, 0));
        btnConsultarCadEstoq.setText("Consultar");
        btnConsultarCadEstoq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCadEstoqActionPerformed(evt);
            }
        });

        btnExcluirCadEstoque.setForeground(new java.awt.Color(255, 102, 0));
        btnExcluirCadEstoque.setText("Excluir");

        btnFechar.setForeground(new java.awt.Color(255, 102, 0));
        btnFechar.setText("Sair");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(codMedidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodMedidasEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(compEstoque1)
                                    .addComponent(larguraEstoqueCad))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtLagCadastroEstoq)
                                        .addComponent(txtMedidasCadastroEstoq, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(medidasEstoque1)))
                            .addComponent(quantMinimaChapas)
                            .addComponent(txtQuantMinimaEstoq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterarCadastroEstoq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultarCadEstoq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluirCadEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastroEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastroEstoque)
                .addGap(129, 129, 129))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cadastroEstoque)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codMedidas)
                            .addComponent(txtCodMedidasEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(medidasEstoque1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compEstoque1)
                            .addComponent(txtMedidasCadastroEstoq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(larguraEstoqueCad)
                            .addComponent(txtLagCadastroEstoq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantMinimaChapas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantMinimaEstoq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnCadastroEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarCadastroEstoq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultarCadEstoq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirCadEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFechar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Cadastros Estoques");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMedidasCadastroEstoqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedidasCadastroEstoqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedidasCadastroEstoqActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnConsultarCadEstoqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCadEstoqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarCadEstoqActionPerformed

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
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCadastroEstoq;
    private javax.swing.JButton btnCadastroEstoque;
    private javax.swing.JButton btnConsultarCadEstoq;
    private javax.swing.JButton btnConsultarDescricaoEstoq;
    private javax.swing.JButton btnExcluirCadEstoque;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel cadastroEstoque;
    private javax.swing.JLabel codEstoque;
    private javax.swing.JLabel codMedidas;
    private javax.swing.JLabel compEstoque1;
    private javax.swing.JLabel descricaoItensExtoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel larguraEstoqueCad;
    private javax.swing.JLabel medidasEstoque1;
    private javax.swing.JLabel nomeProdutoEstoque;
    private javax.swing.JLabel quantMinimaChapas;
    private javax.swing.JLabel tipoPapel;
    private javax.swing.JTextField txtCodMedidasEstoque;
    private javax.swing.JTextField txtCodPapelEstoque;
    private javax.swing.JTextField txtLagCadastroEstoq;
    private javax.swing.JTextField txtMedidasCadastroEstoq;
    private javax.swing.JTextField txtNomePapelEstoque;
    private javax.swing.JTextField txtQuantMinimaEstoq;
    private javax.swing.JTextField txtTipoOndaEstoque;
    // End of variables declaration//GEN-END:variables
}
