/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lista5;

import javax.swing.JOptionPane;

/**
 *
 * @author pmoda
 */
public class CadPasseio extends javax.swing.JFrame {

    /**
     * Creates new form CadPasseio
     */
    private static CadPasseio cP;
    private CadPasseio() {
        initComponents();
    }
    public static CadPasseio getcP(){
        if(cP==null){
            cP=new CadPasseio();
        }
        return cP;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastrar = new javax.swing.JButton();
        txtModelo = new javax.swing.JLabel();
        txtQtdRodas = new javax.swing.JLabel();
        txtPotencia = new javax.swing.JLabel();
        cxQtdPistoes = new javax.swing.JTextField();
        cxQtdRodas = new javax.swing.JTextField();
        txtDataCad = new javax.swing.JLabel();
        cxDataCad = new javax.swing.JTextField();
        txtQtdPistoes = new javax.swing.JLabel();
        cxCor = new javax.swing.JTextField();
        cxQtdPassageiro = new javax.swing.JTextField();
        cxPotencia = new javax.swing.JTextField();
        cxPlaca = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        txtPlaca = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        cxMarca = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        txtCor = new javax.swing.JLabel();
        txtMarca = new javax.swing.JLabel();
        txtQtdPassageiro = new javax.swing.JLabel();
        cxModel = new javax.swing.JTextField();
        txtVelocMax = new javax.swing.JLabel();
        cxVelocMax = new javax.swing.JTextField();
        btLimpar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veiculo de Passeio");

        btCadastrar.setText("Cadastrar!");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        txtModelo.setText("Modelo");

        txtQtdRodas.setText("Quant. Rodas");

        txtPotencia.setText("Potencia");

        txtDataCad.setText("Data de Cadastro");

        cxDataCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDataCadActionPerformed(evt);
            }
        });

        txtQtdPistoes.setText("Quant. Pistões");

        cxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCorActionPerformed(evt);
            }
        });

        cxPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPlacaActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar!");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        txtPlaca.setText("Placa");

        btExcluir.setText("Excluir!");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSair.setText("Sair!");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        txtCor.setText("Cor");

        txtMarca.setText("Marca");

        txtQtdPassageiro.setText("Quantidade de Passageiros");

        txtVelocMax.setText("Velocidade Max");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdRodas)
                    .addComponent(txtQtdPistoes)
                    .addComponent(txtDataCad)
                    .addComponent(txtQtdPassageiro)
                    .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVelocMax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cxQtdRodas)
                    .addComponent(cxMarca)
                    .addComponent(cxPlaca)
                    .addComponent(cxQtdPistoes)
                    .addComponent(cxQtdPassageiro)
                    .addComponent(cxDataCad)
                    .addComponent(cxCor, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(cxPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(cxModel)
                    .addComponent(cxVelocMax))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarca)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo)
                            .addComponent(cxModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor)
                    .addComponent(cxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdRodas)
                    .addComponent(cxQtdRodas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdPistoes)
                    .addComponent(cxQtdPistoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPotencia)
                    .addComponent(cxPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVelocMax)
                    .addComponent(cxVelocMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQtdPassageiro)
                    .addComponent(cxQtdPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataCad)
                    .addComponent(cxDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btExcluir)
                        .addComponent(btAlterar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSair)
                        .addComponent(btLimpar)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        insPasseio();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void cxDataCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDataCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxDataCadActionPerformed

    private void cxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCorActionPerformed

    private void cxPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPlacaActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        deletarPasseio();
    }//GEN-LAST:event_btExcluirActionPerformed
    
    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        altPasseio();
    }//GEN-LAST:event_btAlterarActionPerformed

    public void limpar(){
        cxPlaca.setText("");
        cxMarca.setText("");
        cxModel.setText("");
        cxCor.setText("");
        cxQtdRodas.setText("");
        cxQtdPistoes.setText("");
        cxPotencia.setText("");
        cxVelocMax.setText("");
        cxQtdPassageiro.setText("");
        cxDataCad.setText("");
    };
    /**
     * @param args the command line arguments
     */
    public Passeio insPasseio(){
        Passeio c= new Passeio(null, null, null, null, 0, 0, null, null, 0);
        c.setPlaca(cxPlaca.getText());
        c.setMarca(cxMarca.getText());
        String modelo= cxModel.getText();
        c.setModelo(modelo);
        c.setCor(cxCor.getText());
        c.setQtdRoda(Integer.parseInt(cxQtdRodas.getText()));
        c.setVelocMax(Integer.parseInt(cxVelocMax.getText()));
        int qtdPistoes= Integer.parseInt(cxQtdPistoes.getText());
        int Potencia= Integer.parseInt(cxPotencia.getText());
        Motor motor=new Motor(0,0);
        motor.setPotencia(Potencia);
        motor.setQtdPistoes(qtdPistoes);
        c.setMotor(motor);
        c.setDataCadastro(cxDataCad.getText());
        c.setQtdPassageiro(Integer.parseInt(cxQtdPassageiro.getText()));
        c = Banco.getBanco().addPasseio(c);
        
        if(c != null){
            JOptionPane.showMessageDialog(
                    null,
                    "Veiculo cadastrado com sucesso!",
                    "Cadastro de Veiculo",
                    1
            );
        }
        else{
           JOptionPane.showMessageDialog(
                null,
                "Placa duplicada!, Não foi possivel realizar o Cadastro",
                "Placa",
                1
            );
        }
        return c;
    }
    public void deletarPasseio(){
        Passeio p = new Passeio(null, null, null, null, 0, 0, null, null, 0);
        p.setPlaca(cxPlaca.getText());
        Banco.getBanco().delPasseio(p);
    }    
    public void altPasseio(){
        Passeio c= new Passeio(null, null, null, null, 0, 0, null, null, 0);
        deletarPasseio();
        c = insPasseio();
        if(c != null){
            JOptionPane.showMessageDialog(
                    null,
                    "Um veiculo com a placa selecionada foi encontrado e seu formulario foi alterado conforme as informações fornecidas!",
                    "Alteração",
                    1
            );
        }
        else{
           JOptionPane.showMessageDialog(
                null,
                "Nenhum veiculo com a placa selecionada foi encontrado.",
                "Alteração",
                1
            );
        }
        
    };
    public static void CadPasseio(String args[]) {
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
            java.util.logging.Logger.getLogger(CadPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadPasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JToggleButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCor;
    private javax.swing.JTextField cxDataCad;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModel;
    private javax.swing.JTextField cxPlaca;
    private javax.swing.JTextField cxPotencia;
    private javax.swing.JTextField cxQtdPassageiro;
    private javax.swing.JTextField cxQtdPistoes;
    private javax.swing.JTextField cxQtdRodas;
    private javax.swing.JTextField cxVelocMax;
    private javax.swing.JLabel txtCor;
    private javax.swing.JLabel txtDataCad;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtPlaca;
    private javax.swing.JLabel txtPotencia;
    private javax.swing.JLabel txtQtdPassageiro;
    private javax.swing.JLabel txtQtdPistoes;
    private javax.swing.JLabel txtQtdRodas;
    private javax.swing.JLabel txtVelocMax;
    // End of variables declaration//GEN-END:variables
}