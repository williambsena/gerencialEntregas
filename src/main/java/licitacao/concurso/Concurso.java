/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licitacao.concurso;

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

/**
 *
 * @author WilliamSena
 */
public class Concurso extends Licitacao {
    
    public Concurso(String numero, Date publicacao, String descricao, String tipo, Modalidade modalidade, OrgaoPublico orgao, Cidade cidade, Edital edital, Set<Edital> anexos, Set<Empresa> interessados, Set<Empresa> participantes, Set<Contrato> contrato, Set<Fase> fases, Double limiteLicitacao) {
        super(numero, publicacao, descricao, tipo, modalidade, orgao, cidade, edital, anexos, interessados, participantes, contrato, fases, limiteLicitacao);
    }
    
}
