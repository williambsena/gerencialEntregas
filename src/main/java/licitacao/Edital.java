package licitacao;

// * @author WilliamSena

import documento.Clausula;
import documento.Proposta;
import endereco.Endereco;
import java.util.Date;
import java.util.Set;
import licitacao.TomadaDePreco.Condicao;

public class Edital {
    private Integer     numero;
    private Date        dtPlublicacao;         //Data de Publicação do Edital
    private String      descircao;
    private String      instrucao;  
    private Date        dtValidadeEdital;        //Validade do Edtial
    private Endereco    localEntrega;      //Endereco De Entrega
    private Date        dtCompeticao;          //Data de Referencia da Licitação
    
    private Set<Clausula> clausulas;
    private Set<Condicao> condicoes;
    private String motivoCancel;        //Motivo de Inativação
    private Date dtImpugnacao;          //Data de Inativação
}