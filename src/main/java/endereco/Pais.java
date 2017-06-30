package endereco;
// @author WilliamSena

import static java.lang.reflect.Array.set;
import java.util.HashSet;
import java.util.Set;

public class Pais {
    
    private String nome;
    private String sigla;
    private Integer ddi;
    private Set<Estado> estados;

    
    public Pais(String nome, String sigla, Integer ddi) {
        this.nome = nome;
        this.sigla = sigla;
        this.ddi = ddi;
    }

    public Pais() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getDdi() {
        return ddi;
    }

    public void setDdi(Integer ddi) {
        this.ddi = ddi;
    }

    public void getDdi(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public String toString() {
        return "Nome.: " + nome + " - sigla.: " + "ddi.:(" + ddi + ")";
    }
   
    public void mostraEstados(Estado estados){
        
    }
}
