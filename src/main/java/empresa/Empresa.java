package empresa;
// * @author WilliamSena

import endereco.Endereco;
import java.util.Set;
import telefone.Telefone;
public class Empresa {
    private String CNPJ;
    private String razaoSocial;
    private Set<Telefone> telefones;
    private Endereco endereco;
    private Set<Filial> filiais;
}
