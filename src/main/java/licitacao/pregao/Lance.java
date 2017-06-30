
package licitacao.pregao;
// * @author WilliamSena

import empresa.Empresa;
import java.util.Date;
import pessoa.Pessoa;

class Lance {
    private Integer numero;
    private Empresa autor;
    private Double valorLance;
    private Date dataLance;
    private Boolean valido;

    public Lance(Integer numero, Empresa autor, Double valorLance, Date dataLance, Boolean valido) {
        this.numero = numero;
        this.autor = autor;
        this.valorLance = valorLance;
        this.dataLance = dataLance;
        this.valido = valido;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Empresa getAutor() {
        return autor;
    }

    public void setAutor(Empresa autor) {
        this.autor = autor;
    }

    public Double getValorLance() {
        return valorLance;
    }

    public void setValorLance(Double valorLance) {
        this.valorLance = valorLance;
    }

    public Date getDataLance() {
        return dataLance;
    }

    public void setDataLance(Date dataLance) {
        this.dataLance = dataLance;
    }

    public Boolean getValido() {
        return valido;
    }

    public void setValido(Boolean valido) {
        this.valido = valido;
    }
    
    
}
