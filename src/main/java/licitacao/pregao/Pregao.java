package licitacao.pregao;
// * @author WilliamSena

import documento.Contrato;
import documento.Proposta;
import empresa.Empresa;
import endereco.Cidade;
import java.util.Date;
import java.util.Set;
import licitacao.Edital;
import licitacao.Fase;
import licitacao.Licitacao;
import licitacao.Modalidade;
import orgaoPublico.OrgaoPublico;
import pessoa.Participante;
import pessoa.Pessoa;

public class Pregao extends Licitacao {
    private String numeroPregao;
    private String descricao;
    private Aquisicao aquisicao;
    private Date dataPregao;
    private Pessoa pregoeiro;
    private Set<Edital> editais;
    private Set<Proposta> propostas;
    private Set<Lance> lances;
    private Set<Participante> colocacao;

    public Pregao(String numero, Date publicacao, String descricao, String tipo, Modalidade modalidade, OrgaoPublico orgao, Cidade cidade, Edital edital, Set<Edital> anexos, Set<Empresa> interessados, Set<Empresa> participantes, Set<Contrato> contrato, Set<Fase> fases, Double limiteLicitacao) {
        super(numero, publicacao, descricao, tipo, modalidade, orgao, cidade, edital, anexos, interessados, participantes, contrato, fases, limiteLicitacao);
    }
    
    
    
}
