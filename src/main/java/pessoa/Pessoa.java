package pessoa;
// * @author WilliamSena
import endereco.Endereco;
import java.util.Date;
import java.util.Set;
import telefone.Telefone;

public class Pessoa  {
    private String          nome;
    private String          sobreNome;
    private Date            dataNascimento;
    private String          cpf;
    private String          rg;
    private String          sexo;
    private Set<Profissao>  profissoes;  
    private Set<Endereco>   enderecos;
    private Set<Telefone>   telefones;
    private Set<String>     emails;

}