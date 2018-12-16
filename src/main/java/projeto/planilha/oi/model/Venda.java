package projeto.planilha.oi.model;

import java.util.Date;

/**
 *
 * @author ericvdias
 */
public class Venda {

    private int codigo;
    private String plano;
    private String nomeCliente;
    private String cpfCliente;
    private String consultor;
    private String estado;
    private Date dataVenda;
    private int planoId;

    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", plano=" + plano + ", nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente + ", consultor=" + consultor + ", estado=" + estado + ", dataVenda=" + dataVenda + ", planoId=" + planoId + '}';
    }

    public int getPlanoId() {
        return planoId;
    }

    public void setPlanoId(int planoId) {
        this.planoId = planoId;
    }

    public String getConsultor() {
        return consultor;
    }

    public void setConsultor(String consultor) {
        this.consultor = consultor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    
    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

}
