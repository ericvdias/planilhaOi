/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.planilha.oi.login;

import projeto.planilha.oi.dao.metodos.VendaDao;
import projeto.planilha.oi.dao.sql.VendaDaoJDBC;
import projeto.planilha.oi.model.Venda;

/**
 *
 * @author ericvdias
 */
public class Principal {

    public static void main(String[] args) {
        Venda venda = incluirVenda();
    }

    private static Venda incluirVenda() {
        VendaDao vendaDao = new VendaDaoJDBC();
        
        Venda venda = new Venda();
        venda.setNomeCliente("Eric");
        venda.setCpfCliente("89975260144");
        venda.setPlano("Familia");
        //venda.setDataVenda(18112018);
        venda.setConsultor("Eric");
        venda.setEstado("MS");
        
        venda = vendaDao.incluirVenda(venda);
        
        return venda;
    }

}
