package documento;
// * @author WilliamSena

import java.util.Date;
import java.util.Set;
import pessoa.Participante;

public class Convite {
    private String numero;
    private String convidante;
    private Date dataGeracao;
    private Set<Participante> convidados;
    private Date dataConvite;
    
    
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getConvidante() {
        return convidante;
    }

    public void setConvidante(String convidante) {
        this.convidante = convidante;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public Set<Participante> getConvidados() {
        return convidados;
    }

    public void setConvidados(Set<Participante> convidados) {
        this.convidados = convidados;
    }

    public Date getDataConvite() {
        return dataConvite;
    }

    public void setDataConvite(Date dataConvite) {
        this.dataConvite = dataConvite;
    }
    
    
}
