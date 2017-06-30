//https://portal.conlicitacao.com.br/o-que-e-licitacao/introducao/
package licitacao.concorrencia;
// * @author WilliamSena

import documento.Contrato;
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

public class Concorrencia extends Licitacao {
    private Date                faseDeHabilidade;
    private Set<Requisito>      requisitos;

    // limiteLicitacao para Serviços de engenharia >= 1.500.000,00
    // limiteLicitacao para compras e serviços não referidos no inciso anterior >= 650.000,00

    public Concorrencia(String numero, Date publicacao, String descricao, String tipo, Modalidade modalidade, OrgaoPublico orgao, Cidade cidade, Edital edital, Set<Edital> anexos, Set<Empresa> interessados, Set<Empresa> participantes, Set<Contrato> contrato, Set<Fase> fases, Double limiteLicitacao) {
        super(numero, publicacao, descricao, tipo, modalidade, orgao, cidade, edital, anexos, interessados, participantes, contrato, fases, limiteLicitacao);
    }
    

    
    public Date getFaseDeHabilidade() {
        return faseDeHabilidade;
    }

    public void setFaseDeHabilidade(Date faseDeHabilidade) {
        this.faseDeHabilidade = faseDeHabilidade;
    }

    public Set<Requisito> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(Set<Requisito> requisitos) {
        this.requisitos = requisitos;
    }

  
    
    
}
