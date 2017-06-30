package licitacao;
// * @author WilliamSena
import java.util.Date;

public class Cadastro {
    private String codigo;
    private String descricao;
    private Date dataCadastro;
    private Date dateValidade;

    public Cadastro(String codigo, String descricao, Date dataCadastro, Date dateValidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
        this.dateValidade = dateValidade;
    }

    @Override
    public String toString() {
        return  codigo + " - " + descricao + "Data de Cadastro.:" + dataCadastro + "Validade.:" + dateValidade;
    }
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDateValidade() {
        return dateValidade;
    }

    public void setDateValidade(Date dateValidade) {
        this.dateValidade = dateValidade;
    }
    
    
}
