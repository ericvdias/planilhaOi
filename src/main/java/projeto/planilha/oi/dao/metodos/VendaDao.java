package projeto.planilha.oi.dao.metodos;

import java.util.ArrayList;
import projeto.planilha.oi.model.Venda;
import projeto.planilha.oi.offline.SalvaArquivos;

/**
 *
 * @author ericvdias
 */
public interface VendaDao {
    public ArrayList<Venda> buscarVendas();
    public Venda buscarVenda(int codigo);
    public Venda incluirVenda(Venda venda);
    public Venda excluirVenda(int codigo);
    public SalvaArquivos gravaVenda(Venda venda, String diretorio);
}
