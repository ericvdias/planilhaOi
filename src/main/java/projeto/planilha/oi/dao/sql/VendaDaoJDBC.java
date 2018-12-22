/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.planilha.oi.dao.sql;

import java.io.FileWriter;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import projeto.planilha.oi.conexao.ConexaoBD;
import projeto.planilha.oi.dao.metodos.VendaDao;
import projeto.planilha.oi.model.Venda;
import projeto.planilha.oi.offline.SalvaArquivos;

/**
 *
 * @author ericvdias
 */
public class VendaDaoJDBC implements VendaDao {

    @Override
    public Venda incluirVenda(Venda venda) {

        String sql = "INSERT "
                + "INTO "
                + "tb_venda (nomecliente, cpf, plano, datavenda, consultor, estado)"
                + "VALUES (?,?,?,?,?,?)";
        try {

            PreparedStatement preparacaoDaInstrucao = ConexaoBD.retornaConexao(venda).prepareStatement(sql);

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

    @Override
    public ArrayList<Venda> buscarVendas() {
        ArrayList<Venda> listaDeVenda = new ArrayList<>();
        String SQL = "SELECT * FROM tb_venda";
        try {
            PreparedStatement SQLPreparada = ConexaoBD.retornaConexao().prepareStatement(SQL);

            ResultSet resultado = SQLPreparada.executeQuery();

            while (resultado.next()) {

                Venda venda = new Venda();
                venda.setCodigo(resultado.getInt("codigo"));
                venda.setNomeCliente(resultado.getString("nomecliente"));
                venda.setCpfCliente(resultado.getString("cpf"));
                venda.setPlano(resultado.getString("plano"));
                venda.setDataVenda(resultado.getDate("datavenda"));
                venda.setConsultor(resultado.getString("consultor"));
                venda.setEstado(resultado.getString("estado"));
                venda.setPlanoId(resultado.getInt("planoid"));

                listaDeVenda.add(venda);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaDeVenda;
    }

    @Override
    public Venda excluirVenda(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venda buscarVenda(int codigo) {
        Venda venda = new Venda();
        String SQL = "SELECT * FROM tb_venda where codigo = ?";
        try {
            PreparedStatement preparacaoDaInstrucao = ConexaoBD.retornaConexao().prepareStatement(SQL);
            preparacaoDaInstrucao.setInt(1, codigo);

            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {

                venda = vendaObjeto(resultado);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return venda;
    }

    private Venda vendaObjeto(ResultSet resultado) throws SQLException {
        Venda venda = new Venda();
        try {
            venda.setCodigo(resultado.getInt("codigo"));
            venda.setNomeCliente(resultado.getString("nomecliente"));
            venda.setCpfCliente(resultado.getString("cpf"));
            venda.setPlano(resultado.getString("plano"));
            venda.setDataVenda(resultado.getDate("datavenda"));
            venda.setConsultor(resultado.getString("consultor"));
            venda.setEstado(resultado.getString("estado"));
            venda.setPlanoId(resultado.getInt("planoid"));
            System.out.println(venda.toString());
            return venda;

        } catch (SQLException ex) {
            throw new SQLException("Erro na Conversão");
        }
    }

    @Override
    public SalvaArquivos gravaVenda(Venda venda, String diretorio) {
        String caminhoVenda = diretorio + "\\src\\main\\java\\projeto\\planilha\\oi\\offline\\Venda.txt";
        String vendaOffline = (venda.getNomeCliente()+";"+venda.getCpfCliente()+";"+venda.getPlano()+";"+(Date) venda.getDataVenda()+";"+venda.getConsultor()+";"+venda.getEstado()+"\n") ;
        
        //Grava as vendas no arquivo .txt
        FileWriter gravaArquivoTxt;
        
        try {
            gravaArquivoTxt = new FileWriter(caminhoVenda, true);
            gravaArquivoTxt.write(vendaOffline);
            gravaArquivoTxt.close();

        } catch (Exception e) {
            System.out.println("Não gravou");
            e.printStackTrace();

        }

        return null;
    }

}
