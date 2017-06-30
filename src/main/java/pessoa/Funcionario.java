package pessoa;
// * @author WilliamSena
import endereco.Endereco;
import telefone.Telefone;

public class Funcionario extends Pessoa {
    private Double salario ;

    public Funcionario(String nome, Endereco endereco, Telefone telefone, String email, Double salario ) {
        this.salario = salario;
    }
    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    
}
