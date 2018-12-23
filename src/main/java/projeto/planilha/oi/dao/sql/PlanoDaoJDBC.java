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
        System.out.println("plano DAO");
        ArrayList<Plano> listaDePlano = new ArrayList<>();
        ArrayList list = new ArrayList();
        String SQL = "select nome from tb_plano";
        try {
            PreparedStatement SQLPreparada = ConexaoBD.retornaConexao().prepareStatement(SQL);

            ResultSet resultado = SQLPreparada.executeQuery();

            while (resultado.next()) {

                Plano plano = new Plano();
                //plano.setCodigo(resultado.getInt("codigo"));
                plano.setNome(resultado.getString("nome"));
                //plano.setTipo(resultado.getString("tipo"));
                //plano.setCategoria(resultado.getString("categoria"));
                System.out.println(resultado.getString("nome"));
                listaDePlano.add(plano);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaDePlano;
    }

    @Override
    public Plano incluirPlano(Plano plano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Plano excluirPlano(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
