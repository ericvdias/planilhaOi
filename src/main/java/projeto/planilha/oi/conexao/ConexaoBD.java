/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.planilha.oi.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import projeto.planilha.oi.dao.metodos.VendaDao;
import projeto.planilha.oi.dao.sql.VendaDaoJDBC;
import projeto.planilha.oi.model.Venda;
import projeto.planilha.oi.offline.SalvaArquivos;

/**
 *
 * @author ericvdias
 */
public class ConexaoBD {
    
    private static final String URL = "jdbc:mysql://162.241.2.192/ericvd20_conexaotelecom";
    private static final String usuario = "ericvd20_eric";
    private static final String senha = "ericvd";
    private static Connection conexao = null;

    /*
    private static final String URL = "jdbc:postgresql://localhost:5432/conexaotelecom";
    private static final String usuario = "postgres";
    private static final String senha = "estacio@123";
    private static Connection conexao = null;
     */
    public static Connection retornaConexao(Venda venda) {

        if (conexao == null) {

            try {
                conexao = DriverManager.getConnection(URL, usuario, senha);
            } catch (SQLException ex) {
                VendaDaoJDBC vendaDao = new VendaDaoJDBC();
                String path = System.getProperty("user.dir");
                SalvaArquivos vendaOffline = vendaDao.gravaVenda(venda, path);

                ex.printStackTrace();
            }
        }
        return conexao;
    }

    public static Connection retornaConexao() {

        if (conexao == null) {

            try {
                conexao = DriverManager.getConnection(URL, usuario, senha);
            } catch (SQLException ex) {

                ex.printStackTrace();
            }
        }
        return conexao;
    }

}
