/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.planilha.oi.venda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import projeto.planilha.oi.dao.metodos.VendaDao;
import projeto.planilha.oi.dao.sql.VendaDaoJDBC;
import projeto.planilha.oi.model.Venda;

/**
 *
 * @author ericvdias
 */
public class ConsultaVendas extends javax.swing.JPanel {
    VendaDao vendaDao = new VendaDaoJDBC();
    Venda venda = new Venda();
    /**
     * Creates new form ConsultaVendas
     */
    
    public ConsultaVendas() {
        initComponents();
        /*
        DefaultTableModel modeloDeColuna = (DefaultTableModel) tbListaVendas.getModel();
        ArrayList<Venda> listaDeVendas = vendaDao.buscarVendas();

        for (int i = 0; i < listaDeVendas.size(); i++) {
            Venda exibeCliente = listaDeVendas.get(i);
            Object[] linha = new Object[6];
            linha[0] = exibeCliente.getCodigo();
            
            Date dataAtual = new Date();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = dateFormat.format(exibeCliente.getDataVenda());
            linha[1] = dataFormatada;
            
            linha[2] = exibeCliente.getNomeCliente();
            linha[3] = exibeCliente.getCpfCliente();
            linha[4] = exibeCliente.getConsultor();
            linha[5] = exibeCliente.getPlano();
            modeloDeColuna.addRow(linha);

        }
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDinamico = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbListaVendas = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnEditarVenda = new javax.swing.JButton();
        btnExcluirVenda = new javax.swing.JButton();
        btnAdicionarVenda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtCampoBusca = new javax.swing.JTextField();
        btnBuscarVenda = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        panelDinamico.setLayout(new java.awt.BorderLayout());

        tbListaVendas.setBackground(new java.awt.Color(204, 204, 204));
        tbListaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Data", "Nome", "CPF", "Consultor", "Plano"
            }
        ));
        jScrollPane2.setViewportView(tbListaVendas);

        panelDinamico.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnEditarVenda.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-lápis2-32.png"))); // NOI18N
        btnEditarVenda.setToolTipText("Editar");
        btnEditarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVendaActionPerformed(evt);
            }
        });

        btnExcluirVenda.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-apagar-para-sempre-48.png"))); // NOI18N
        btnExcluirVenda.setToolTipText("Excluir");
        btnExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVendaActionPerformed(evt);
            }
        });

        btnAdicionarVenda.setBackground(new java.awt.Color(255, 255, 255));
        btnAdicionarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-adicionar-32.png"))); // NOI18N
        btnAdicionarVenda.setToolTipText("Incluir");
        btnAdicionarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnAdicionarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        panelDinamico.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(786, 80));

        btnBuscarVenda.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/busca2.png"))); // NOI18N
        btnBuscarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtCampoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(388, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCampoBusca))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        panelDinamico.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        add(panelDinamico, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVendaActionPerformed
        if (tbListaVendas.getSelectedRow() >= 0) {
            //==> Pega o cógido do cliente selecionado na tabela <==\\
            String tipo = "update";
            int linha = tbListaVendas.getSelectedRow();

            int codigo = (int) tbListaVendas.getModel().getValueAt(linha, 0);
            //JPanel onde tem a tabela

            //==> Abre a tela de edição, passando o código do cliente <==\\
            LancaVendas adicionarVendas = new LancaVendas(codigo, tipo);
            panelDinamico.removeAll();
            panelDinamico.add(adicionarVendas);
            panelDinamico.validate();
            panelDinamico.repaint();
        } else {
            //JOptionPane.showMessageDialog(null, "Selecione um Planos!");
        }
    }//GEN-LAST:event_btnEditarVendaActionPerformed

    private void btnExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVendaActionPerformed
        /*
        if (tbListaPlanos.getSelectedRow() >= 0) {

            //int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do cliente?", "Excluir Planos!", JOptionPane.YES_NO_OPTION);
            //if (resposta == 0) {
                int linha = tbListaPlanos.getSelectedRow();
                int codigo = (int) tbListaPlanos.getModel().getValueAt(linha, 0);

                //==> Chama o método para excluir o cliente selecionado <==\\
                planoDao.excluirPlano(codigo);

                //==> Faz nova busca, após a exclusão, atualizando a tabela de clientes <==\\
                ((DefaultTableModel) tbListaPlanos.getModel()).setRowCount(0);
                planoDao.buscarPlanos();
                DefaultTableModel modeloDeColuna = (DefaultTableModel) tbListaPlanos.getModel();
                ArrayList<Plano> listaDePlanoss = planoDao.buscarPlanos();

                for (int i = 0; i < listaDePlanoss.size(); i++) {
                    Plano exibePlanos = listaDePlanoss.get(i);
                    String nome = txtCampoBusca.getText();

                    //==> Faz a busca do cliente por qualquer parte do seu nome <==\\
                    if (exibePlanos.getNome().contains(nome)) {

                        Object[] linha1 = new Object[5];

                        linha1[0] = exibePlanos.getCodigo();
                        linha1[1] = exibePlanos.getNome();
                        linha1[2] = exibePlanos.getTelefone();
                        linha1[3] = exibePlanos.getCpfCnpj();
                        linha1[4] = exibePlanos.getEmail(); // Endereco Criar classe.
                        modeloDeColuna.addRow(linha1);
                    }
                }
                //JOptionPane.showMessageDialog(null, "Planos Removido!");
                //}
        } else {
            //JOptionPane.showMessageDialog(null, "Selecione um Planos!");
        }
        */
    }//GEN-LAST:event_btnExcluirVendaActionPerformed

    private void btnAdicionarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarVendaActionPerformed

        String tipo = "insert";

        //==> Faz  uma busca dos clientes para trazer o último código cadastrado <==\\
        int codigoNovoPlanos = 0;
        /*

        */
        //==> Abre a tela para inserir dados do cliente, passando o código e o tipo (insert=novo ou update=atualiza) <==\\
        LancaVendas adicionarVendas = new LancaVendas();
        panelDinamico.removeAll();
        panelDinamico.add(adicionarVendas);
        panelDinamico.validate();
        panelDinamico.repaint();
    }//GEN-LAST:event_btnAdicionarVendaActionPerformed

    private void btnBuscarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVendaActionPerformed
        ((DefaultTableModel) tbListaVendas.getModel()).setRowCount(0);

        vendaDao.buscarVendas();

        DefaultTableModel modeloDeColuna = (DefaultTableModel) tbListaVendas.getModel();
        ArrayList<Venda> listaDeVendas = vendaDao.buscarVendas();

        for (int i = 0; i < listaDeVendas.size(); i++) {
            Venda exibeVenda = listaDeVendas.get(i);
            String nome = txtCampoBusca.getText().toUpperCase();

            //==> Faz a busca do cliente por qualquer parte do seu nome <==\\
            if (exibeVenda.getNomeCliente().contains(nome)) {

                Object[] linha = new Object[5];

                linha[0] = exibeVenda.getCodigo();
                linha[1] = exibeVenda.getDataVenda();
                linha[2] = exibeVenda.getNomeCliente();
                linha[3] = exibeVenda.getConsultor();
                
                

                modeloDeColuna.addRow(linha);
            }
        }
    }//GEN-LAST:event_btnBuscarVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarVenda;
    private javax.swing.JButton btnBuscarVenda;
    private javax.swing.JButton btnEditarVenda;
    private javax.swing.JButton btnExcluirVenda;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelDinamico;
    private javax.swing.JTable tbListaVendas;
    private javax.swing.JTextField txtCampoBusca;
    // End of variables declaration//GEN-END:variables
}
