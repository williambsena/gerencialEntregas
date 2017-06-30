package endereco;
// @author WilliamSena

import java.util.Set;

public class Bairro {
    private String nome;
    private Cidade cidade;
    private Set<Endereco> enderecos;

    @Override
    public String toString() {
        return "Bairro.:" + nome + " Cidade.:" + cidade + "Endereços.:" + enderecos;
    }

    public Bairro(String nome, Cidade cidade, Set<Endereco> enderecos) {
        this.nome = nome;
        this.cidade = cidade;
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
    
    }
    
