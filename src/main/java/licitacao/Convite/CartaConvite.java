
package licitacao.Convite;
// * @author WilliamSena

import documento.Contrato;
import empresa.Empresa;
import endereco.Cidade;
import endereco.TipoLogradouro;
import java.util.Date;
import java.util.Set;
import licitacao.Fase;
import licitacao.Edital;
import licitacao.Licitacao;
import licitacao.Modalidade;
import orgaoPublico.ComissaoOrganizadora;
import orgaoPublico.OrgaoPublico;
import pessoa.Participante;

public class CartaConvite extends Licitacao {
    private String numero;
    private Date   data;
    private Set<Participante> convidados;
    private ComissaoOrganizadora administracao;
    
// limiteLicitacao para Serviços de engenharia = 150.000,00
// limiteLicitacao para compras e serviços não referidos no inciso anterior = 80.000,00

    public CartaConvite(String numero, Date publicacao, String descricao, String tipo, Modalidade modalidade, OrgaoPublico orgao, Cidade cidade, Edital edital, Set<Edital> anexos, Set<Empresa> interessados, Set<Empresa> participantes, Set<Contrato> contrato, Set<Fase> fases, Double limiteLicitacao) {
        super(numero, publicacao, descricao, tipo, modalidade, orgao, cidade, edital, anexos, interessados, participantes, contrato, fases, limiteLicitacao);
    }
    
    
    

    
}
