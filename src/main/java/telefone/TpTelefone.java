package telefone;
// * @author WilliamSena
public class TpTelefone {
    private Integer codigo;
    private String descricao;
    private String sigla;
    
    
    public TpTelefone(Integer codigo, String descricao, String sigla) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Tipo De Telefone" + "Código.:" + codigo + " - " + descricao + "-" + sigla;
    }
    
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

}
