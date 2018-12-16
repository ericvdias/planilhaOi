/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.planilha.oi.dao.sql;

import java.util.ArrayList;
import projeto.planilha.oi.dao.metodos.PlanoDao;
import projeto.planilha.oi.model.Plano;

/**
 *
 * @author ericvdias
 */
public class PlanoDaoJDBC implements PlanoDao{

    @Override
    public ArrayList<Plano> buscarPlanos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
