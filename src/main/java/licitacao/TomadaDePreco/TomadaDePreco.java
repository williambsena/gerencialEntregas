/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licitacao.TomadaDePreco;

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
// * @author WilliamSena

public class TomadaDePreco extends Licitacao {
    private Date                recebimentoPropostas;
    //private Set<Participante>   interessados;
    private Set<Condicao>       condicoes;
    private Set<Qualificacao>   qualificacoes;
    // ************************************************************************************
    // * limiteLicitacao Serviços de engenharia = 1.500.000,00                            *
    // * limiteLicitacao compras e serviços não referidos no inciso anterior = 650.000,00 *
    // ************************************************************************************
    
    public TomadaDePreco(String numero, Date publicacao, String descricao, String tipo, Modalidade modalidade, OrgaoPublico orgao, Cidade cidade, Edital edital, Set<Edital> anexos, Set<Empresa> interessados, Set<Empresa> participantes, Set<Contrato> contrato, Set<Fase> fases, Double limiteLicitacao) {
        super(numero, publicacao, descricao, tipo, modalidade, orgao, cidade, edital, anexos, interessados, participantes, contrato, fases, limiteLicitacao);
    }
    
    public void ValidaCadastroParticipantes(){
        
    }
    
    public void ValidaCondicoes(){
        
    }

    
    
    
}

