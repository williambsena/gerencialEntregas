package licitacao.pregao;
// * @author WilliamSena

import documento.Contrato;
import empresa.Empresa;
import endereco.Cidade;
import endereco.Endereco;
import java.util.Date;
import java.util.Set;
import licitacao.Edital;
import licitacao.Fase;
import licitacao.Modalidade;
import orgaoPublico.OrgaoPublico;

public class PregaoPresencial extends Pregao {
    private Endereco endereco;

    public PregaoPresencial(Endereco endereco, String numero, Date publicacao, String descricao, String tipo, Modalidade modalidade, OrgaoPublico orgao, Cidade cidade, Edital edital, Set<Edital> anexos, Set<Empresa> interessados, Set<Empresa> participantes, Set<Contrato> contrato, Set<Fase> fases, Double limiteLicitacao) {
        super(numero, publicacao, descricao, tipo, modalidade, orgao, cidade, edital, anexos, interessados, participantes, contrato, fases, limiteLicitacao);
        this.endereco = endereco;
    }
    
}
