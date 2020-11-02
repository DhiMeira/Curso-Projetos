/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ValidarCampos;
import Model.BancoDadosFichas;
import Model.ConexaoBanco;

import Model.Ficha;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dhii
 */
public class CriaFichaInternal extends javax.swing.JInternalFrame {

    public ValidarCampos sv = new ValidarCampos();
    BancoDadosFichas bd = new BancoDadosFichas();
    
    public CriaFichaInternal() {
        initComponents();
        DefaultTableModel df = (DefaultTableModel)jtFichas.getModel();
        jtFichas.setRowSorter(new TableRowSorter(df));
        ReadLista();
    }
    public void ReadLista(){
         DefaultTableModel df = (DefaultTableModel)jtFichas.getModel();
         df.setNumRows(0);
         for(Ficha f : BancoDadosFichas.ListaFichas()){
             
             df.addRow(new Object[]{f.getId(),f.getNome(),f.getTipoFicha(),f.getPv(),f.getCa(),f.getAtaque()});
         }
    
    
    }
    public void LimparCampos(){
    
               txtNfNome.setText("");
               txtNfFor.setText("");
               txtNfCon.setText("");
               txtNfDes.setText("");
               txtNfInt.setText("");
               txtNfSab.setText("");
               txtNfCar.setText("");
               txtNfPv.setText("");
               txtNfCa.setText("");
               txtNfAtk.setText("");     
               cbTipo.setSelectedItem(0);

    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtFichas = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNfNome = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNfFor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNfCon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNfDes = new javax.swing.JTextField();
        txtNfInt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNfCar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNfSab = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNfPv = new javax.swing.JTextField();
        txtNfCa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNfAtk = new javax.swing.JTextField();

        jLabel11.setText("Tipo de ficha:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum Tipo", "Personagem", "NPC" }));
        cbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoItemStateChanged(evt);
            }
        });
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jtFichas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "TIPO", "PV", "CA", "ATK"
            }
        ));
        jtFichas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtFichasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtFichasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtFichasMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jtFichas);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(125, 125, 125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNfNome)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel5.setText("FOR:");

        jLabel6.setText("CON:");

        jLabel7.setText("DES:");

        jLabel8.setText("INT:");

        jLabel10.setText("CAR:");

        jLabel9.setText("SAB:");

        jLabel2.setText("PV:");

        jLabel3.setText("CA:");

        jLabel4.setText("ATK:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNfFor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(7, 7, 7)
                                .addComponent(txtNfDes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNfCon))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(9, 9, 9)
                                .addComponent(txtNfInt)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNfCar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNfSab)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNfPv))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNfCa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNfAtk)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNfFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNfCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNfCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtNfPv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNfAtk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNfDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNfInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNfSab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNfCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if(!sv.IsCampoVazio(txtNfNome.getText())&&!sv.IsCampoVazio(txtNfFor.getText())&&!sv.IsCampoVazio(txtNfCon.getText())&&!sv.IsCampoVazio(txtNfDes.getText())&&!sv.IsCampoVazio(txtNfInt.getText())
            &&!sv.IsCampoVazio(txtNfSab.getText())&&!sv.IsCampoVazio(txtNfCar.getText())&&!sv.IsCampoVazio(txtNfPv.getText())&&!sv.IsCampoVazio(txtNfCa.getText())
            &&!sv.IsCampoVazio(txtNfAtk.getText())&&cbTipo.getSelectedIndex()!=0){

            sv.TratarDadosFicha(txtNfNome.getText(), txtNfFor.getText(), txtNfCon.getText(), txtNfDes.getText(), txtNfInt.getText(), txtNfSab.getText(), txtNfCar.getText(), txtNfPv.getText(), txtNfCa.getText(), txtNfAtk.getText(), cbTipo.getSelectedIndex());
            ReadLista();
            LimparCampos();

        }else{
            JOptionPane.showMessageDialog(null, "Campos invalidos");
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoItemStateChanged

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed

    private void jtFichasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFichasMouseClicked
        DefaultTableModel df = (DefaultTableModel)jtFichas.getModel();
        ArrayList<Ficha> fichas = new ArrayList();
        fichas=BancoDadosFichas.ListaFichas();

        if(jtFichas.getSelectedRow()!=-1){
            int indice=(int) jtFichas.getValueAt(jtFichas.getSelectedRow(),0);
            for(Ficha f : fichas){
                if(f.getId()==indice){

                    txtNfNome.setText(f.getNome());
                    txtNfFor.setText(f.getForca());
                    txtNfCon.setText(f.getConstituicao());
                    txtNfDes.setText(f.getDestreza());
                    txtNfInt.setText(f.getInteligencia());
                    txtNfSab.setText(f.getSabedoria());
                    txtNfCar.setText(f.getCarisma());
                    txtNfPv.setText(f.getPv());
                    txtNfCa.setText(f.getCa());
                    txtNfAtk.setText(f.getAtaque());
                    /*if(jtFichas.getValueAt(jtFichas.getSelectedRow(),2).equals("Personagem")){
                        cbTipo.setSelectedIndex(1);
                    }else if(jtFichas.getValueAt(jtFichas.getSelectedRow(),2).equals("NPC")){
                        cbTipo.setSelectedIndex(2);
                    }else{
                        cbTipo.setSelectedIndex(0);
                    }
                    */if(f.getTipoFicha().equals("")){
                        cbTipo.setSelectedItem(0);
                    }
                    cbTipo.setSelectedItem(f.getTipoFicha());

                }

            }
        }
    }//GEN-LAST:event_jtFichasMouseClicked

    private void jtFichasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFichasMousePressed

        int a=0;

    }//GEN-LAST:event_jtFichasMousePressed

    private void jtFichasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFichasMouseReleased

    }//GEN-LAST:event_jtFichasMouseReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        BancoDadosFichas bd = new BancoDadosFichas();

        Ficha fichaAtualizada= new Ficha();

        if(jtFichas.getSelectedRow()!=-1){
            fichaAtualizada.setNome(txtNfNome.getText());
            fichaAtualizada.setTipoFicha((String) cbTipo.getSelectedItem());
            fichaAtualizada.setForca(txtNfFor.getText());
            fichaAtualizada.setConstituicao(txtNfCon.getText());
            fichaAtualizada.setDestreza(txtNfDes.getText());
            fichaAtualizada.setInteligencia(txtNfInt.getText());
            fichaAtualizada.setSabedoria(txtNfSab.getText());
            fichaAtualizada.setCarisma(txtNfCar.getText());
            fichaAtualizada.setPv(txtNfPv.getText());
            fichaAtualizada.setCa(txtNfCa.getText());
            fichaAtualizada.setAtaque(txtNfAtk.getText());
            fichaAtualizada.setId((int) jtFichas.getValueAt(jtFichas.getSelectedRow(),0));

            bd.AtualizarFicha(fichaAtualizada);
            LimparCampos();
            ReadLista();
            JOptionPane.showMessageDialog(null, "Ficha Atualizada com sucesso!");

        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        BancoDadosFichas bd = new BancoDadosFichas();

        if(jtFichas.getSelectedRow()!=-1){
            bd.DeletaFicha((int) jtFichas.getValueAt(jtFichas.getSelectedRow(),0));
            LimparCampos();
            ReadLista();
            JOptionPane.showMessageDialog(null, "Ficha apagada com sucesso!");

        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtFichas;
    private javax.swing.JTextField txtNfAtk;
    private javax.swing.JTextField txtNfCa;
    private javax.swing.JTextField txtNfCar;
    private javax.swing.JTextField txtNfCon;
    private javax.swing.JTextField txtNfDes;
    private javax.swing.JTextField txtNfFor;
    private javax.swing.JTextField txtNfInt;
    private javax.swing.JTextField txtNfNome;
    private javax.swing.JTextField txtNfPv;
    private javax.swing.JTextField txtNfSab;
    // End of variables declaration//GEN-END:variables
}
