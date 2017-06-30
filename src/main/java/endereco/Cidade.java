
package endereco;

 //* @auhor WilliamSena
import java.util.Set;



public class Cidade {
    private String nome;
    private Estado estado;
    private Set<Bairro> bairros;

    public Cidade(String nome, Estado estado, Pais pais) {
        this.nome = nome;
        this.estado = estado;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
