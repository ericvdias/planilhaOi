/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.planilha.oi.dao.sql;

import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.planilha.oi.conexao.ConexaoBD;
import projeto.planilha.oi.dao.metodos.PlanoDao;
import projeto.planilha.oi.model.Plano;

/**
 *
 * @author ericvdias
 */
public class PlanoDaoJDBC implements PlanoDao {

    @Override
    public ArrayList<Plano> buscarPlanos() {

        ArrayList<Plano> listaDePlano = new ArrayList<>();
        ArrayList list = new ArrayList();
        String SQL = "select nome from tb_plano";
        try {
            PreparedStatement SQLPreparada = ConexaoBD.retornaConexao().prepareStatement(SQL);
            ResultSet resultado = SQLPreparada.executeQuery();

            while (resultado.next()) {
                Plano plano = new Plano();
                plano.setNome(resultado.getString("nome"));
                listaDePlano.add(plano);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaDePlano;
    }

    @Override
    public Plano incluirPlano(Plano plano) {
        
        String sql = "INSERT "
                + "INTO "
                + "tb_plano (nome, tipo, categoria)"
                + "VALUES (?,?,?)";
        try {

            PreparedStatement preparacaoDaInstrucao = ConexaoBD.retornaConexao().prepareStatement(sql);

            //preparacaoDaInstrucao.setInt(1, venda.getCodigo());
            preparacaoDaInstrucao.setString(1, plano.getNome());
            preparacaoDaInstrucao.setString(2, plano.getTipo());
            preparacaoDaInstrucao.setString(3, plano.getCategoria());
            

            preparacaoDaInstrucao.executeUpdate();
            
            return plano;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Plano excluirPlano(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
