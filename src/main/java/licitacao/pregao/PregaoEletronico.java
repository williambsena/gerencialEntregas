
package licitacao.pregao;
// * @author WilliamSena

import documento.Contrato;
import empresa.Empresa;
import endereco.Cidade;
import java.util.Date;
import java.util.Set;
import licitacao.Cadastro;
import licitacao.Credenciamento;
import licitacao.Edital;
import licitacao.Fase;
import licitacao.Modalidade;
import orgaoPublico.OrgaoPublico;
import site.Site;

public class PregaoEletronico extends Pregao {
    private Site site;
    private Set<Cadastro> cadastros;
    private Set<Credenciamento> credemciamentos;

    public PregaoEletronico(Site site, Set<Cadastro> cadastros, Set<Credenciamento> credemciamentos, String numero, Date publicacao, String descricao, String tipo, Modalidade modalidade, OrgaoPublico orgao, Cidade cidade, Edital edital, Set<Edital> anexos, Set<Empresa> interessados, Set<Empresa> participantes, Set<Contrato> contrato, Set<Fase> fases, Double limiteLicitacao) {
        super(numero, publicacao, descricao, tipo, modalidade, orgao, cidade, edital, anexos, interessados, participantes, contrato, fases, limiteLicitacao);
        this.site = site;
        this.cadastros = cadastros;
        this.credemciamentos = credemciamentos;
    }
    
    
}
