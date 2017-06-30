package endereco;
// * @author WilliamSena
public class TipoLogradouro {
    private Integer codigo;
    private String sigla;
    private String nome;

    public TipoLogradouro(Integer codigo, String sigla, String nome) {
        this.codigo = codigo;
        this.sigla = sigla;
        this.nome = nome;
    }
    
    public void defineTipoLogradouro(){
        TipoLogradouro acampamento  = new TipoLogradouro(645,"ACAMP","Acampamento");
        TipoLogradouro acesso       = new TipoLogradouro(1,"AC","Acesso");
        TipoLogradouro adro         = new TipoLogradouro(2,"AD","Acesso");
        TipoLogradouro aeroporto    = new TipoLogradouro(3,"ERA","Aeroporto");
        TipoLogradouro alameda      = new TipoLogradouro(4,"EL","Alameda");
        TipoLogradouro alto         = new TipoLogradouro(5,"AT","Alto");
        TipoLogradouro area         = new TipoLogradouro(472,"AT","Area");
        TipoLogradouro areaEspecial = new TipoLogradouro(654,"AE","Area Especial");
        TipoLogradouro arteria      = new TipoLogradouro(465,"ART","Arteria");
        //TipoLogradouro          = new TipoLogradouro(,"","");
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Tipo de Logradouro.:" + sigla + "Código.:" + codigo  + ", nome=" + nome + '}';
    }
    
    
}
