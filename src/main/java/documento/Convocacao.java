package documento;
// * @author WilliamSena

import java.util.Date;
import java.util.Set;
import pessoa.Pessoa;

public class Convocacao {
    private String numero;
    private String descricao;
    private Pessoa convocante;
    private Set<Pessoa> convocados;
    private Date dataConvocacao;
    private Date DataCriacao;
}
