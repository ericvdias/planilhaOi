/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.planilha.oi.dao.metodos;

import java.util.ArrayList;
import projeto.planilha.oi.model.Plano;

/**
 *
 * @author ericvdias
 */
public interface PlanoDao {
    public ArrayList<Plano> buscarPlanos();
    public Plano incluirPlano(Plano plano);
    public Plano excluirPlano(int codigo);
}
