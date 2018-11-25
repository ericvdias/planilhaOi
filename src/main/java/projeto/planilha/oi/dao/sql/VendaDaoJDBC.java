/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.planilha.oi.dao.sql;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import projeto.planilha.oi.conexao.ConexaoBD;
import projeto.planilha.oi.dao.metodos.VendaDao;
import projeto.planilha.oi.model.Venda;

/**
 *
 * @author ericvdias
 */
public class VendaDaoJDBC implements VendaDao{

    @Override
    public Venda incluirVenda(Venda venda) {
        
        String sql = "INSERT "
                + "INTO "
                + "tb_venda (nomecliente, cpf, plano, datavenda, consultor, estado)"
                + "VALUES (?,?,?,?,?,?)";
        try {

            PreparedStatement preparacaoDaInstrucao = ConexaoBD.retornaConexao().prepareStatement(sql);

            //preparacaoDaInstrucao.setInt(1, venda.getCodigo());
            preparacaoDaInstrucao.setString(1, venda.getNomeCliente());
            preparacaoDaInstrucao.setString(2, venda.getCpfCliente());
            preparacaoDaInstrucao.setString(3, venda.getPlano());
            preparacaoDaInstrucao.setDate(4, (Date) venda.getDataVenda());
            preparacaoDaInstrucao.setString(5, venda.getConsultor());
            preparacaoDaInstrucao.setString(6, venda.getEstado());
            

            preparacaoDaInstrucao.executeUpdate();

            System.out.println(venda.getCodigo());
            return venda;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        
    }
    
}
