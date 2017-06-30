//@author WilliamSena
package licitacao.concorrencia;

import java.util.Date;

public class Requisito {
    private String numero;
    private String descricao;
    private String requisito;
    private Date   dataRequisito;
    private Boolean status;

    
    public Requisito(String numero, String descricao, String requisito, Date dataRequisito, Boolean status) {
        this.numero = numero;
        this.descricao = descricao;
        this.requisito = requisito;
        this.dataRequisito = dataRequisito;
        this.status = status;
    }

    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public Date getDataRequisito() {
        return dataRequisito;
    }

    public void setDataRequisito(Date dataRequisito) {
        this.dataRequisito = dataRequisito;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
}
