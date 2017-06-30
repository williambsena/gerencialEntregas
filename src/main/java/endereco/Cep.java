package endereco;
// * @author WilliamSena

import java.util.Set;

public class Cep {
    private Integer numero;
    private Set<Endereco> enderecos;

    @Override
    public String toString() {
        return "Cep.:" + numero + "Enderecos.:" + enderecos;
    }

    public Cep(Integer numero, Set<Endereco> enderecos) {
        this.numero = numero;
        this.enderecos = enderecos;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
}
