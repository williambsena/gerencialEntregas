package endereco;

import java.util.Set;

/**
 *
 * @author WilliamSena
 */
public class Estado {
    private String nome;
    private String uf;
    private Pais pais;
    private Set<Cidade> cidades;
   
    public Estado(String nome, String uf, Pais pais) {
        this.nome = nome;
        this.uf = uf;
        this.pais = pais;
    }

    public Estado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Nome.:" + nome + ", UF.:" + uf + "Pais.:" + pais.getNome() ;
    }

    
    
    
}
