package projeto.planilha.oi.offline;

import java.io.FileWriter;

/**
 *
 * @author ericvdias
 */
public class SalvaArquivos {

    String caminhoVenda;

    public void gravaVenda(String nomeCliente, float totalVenda, String diretorio, String dataVenda) {
        caminhoVenda = diretorio + "\\src\\projeto.planilha.oi.offline\\Venda.txt";

        //Grava as vendas no arquivo .txt
        FileWriter gravaArquivoTxt;

        //pegaUltCodigoVenda();
//        retornaProxCodigo.pegaUltCodigoVenda(caminhoVenda);
        try {
            gravaArquivoTxt = new FileWriter(caminhoVenda, true);

            //String venda = (novoCodigo + " | " + nomeCliente + " | " + totalVenda + "\n");
            String venda = (nomeCliente + " | " + totalVenda + " | " + dataVenda + "\n");
            gravaArquivoTxt.write(venda);

            gravaArquivoTxt.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
