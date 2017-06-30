package pessoa;
// * @author WilliamSena

import documento.Certificado;
import endereco.Endereco;
import java.util.Set;
import licitacao.Cadastro;
import telefone.Telefone;

public class Participante extends Pessoa{
    private String codigo;
    private Set<Cadastro> cadastros;
    private Set<Certificado> certificados;

    public Participante(String codigo, Set<Cadastro> cadastros, Set<Certificado> certificados, String nome, Endereco endereco, Telefone telefone, String email) {
        this.codigo = codigo;
        this.cadastros = cadastros;
        this.certificados = certificados;
    }

    @Override
    public String toString() {
        return  codigo + "Cadastros(" + cadastros + ")" + "Certificados(" + certificados + ')';
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Set<Cadastro> getCadastros() {
        return cadastros;
    }

    public void setCadastros(Set<Cadastro> cadastros) {
        this.cadastros = cadastros;
    }

    public Set<Certificado> getCertificados() {
        return certificados;
    }

    public void setCertificados(Set<Certificado> certificados) {
        this.certificados = certificados;
    }

    
    
    
}
