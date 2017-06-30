
package licitacao;

// * @author WilliamSena]

import empresa.Empresa;
import licitacao.pregao.Pregao;
import endereco.Cidade;
import java.util.Date;
import java.util.Set;
import orgaoPublico.OrgaoPublico;
import documento.Contrato;

    
public class Licitacao {
    private String          numeroLicitacao;
    private Date            publicacao;
    private String          descricao;
    private String          tipo;
    private Modalidade      modalidade;
    private OrgaoPublico    orgao;
    private Cidade          cidade;
    private Edital          edital;
    private Set<Edital>     anexos;
    private Set<Empresa>    interessados;
    private Set<Empresa>    participantes;
    private Set<Contrato>   contratos;
    private Set<Fase>       fases;
    private Double          limiteLicitacao;

    public Licitacao(String numero, Date publicacao, String descricao, String tipo, Modalidade modalidade, OrgaoPublico orgao, Cidade cidade, Edital edital, Set<Edital> anexos, Set<Empresa> interessados, Set<Empresa> participantes, Set<Contrato> contrato, Set<Fase> fases, Double limiteLicitacao) {
        this.numeroLicitacao = numero;
        this.publicacao = publicacao;
        this.descricao = descricao;
        this.tipo = tipo;
        this.modalidade = modalidade;
        this.orgao = orgao;
        this.cidade = cidade;
        this.edital = edital;
        this.anexos = anexos;
        this.interessados = interessados;
        this.participantes = participantes;
        this.fases = fases;
        this.limiteLicitacao = limiteLicitacao;
    }

    public void defineLimite(){
        this.setLimiteLicitacao(Double.MIN_NORMAL);
    }
    
    public String getNumero() {
        return numeroLicitacao;
    }

    public void setNumero(String numero) {
        this.numeroLicitacao = numero;
    }

    public Date getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Date publicacao) {
        this.publicacao = publicacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public OrgaoPublico getOrgao() {
        return orgao;
    }

    public void setOrgao(OrgaoPublico orgao) {
        this.orgao = orgao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Edital getEdital() {
        return edital;
    }

    public void setEdital(Edital edital) {
        this.edital = edital;
    }

    public Set<Edital> getAnexos() {
        return anexos;
    }

    public void setAnexos(Set<Edital> anexos) {
        this.anexos = anexos;
    }

    public Set<Empresa> getInteressados() {
        return interessados;
    }

    public void setInteressados(Set<Empresa> interessados) {
        this.interessados = interessados;
    }

    public Set<Empresa> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Empresa> participantes) {
        this.participantes = participantes;
    }


    public Set<Fase> getFases() {
        return fases;
    }

    public void setFases(Set<Fase> fases) {
        this.fases = fases;
    }

    public Double getLimiteLicitacao() {
        return limiteLicitacao;
    }

    public void setLimiteLicitacao(Double limiteLicitacao) {
        this.limiteLicitacao = limiteLicitacao;
    }

   
   
}

