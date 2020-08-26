public class Aeroporto {
    
    private String codigo;
    private String nome;
    private Geo loc;

    public Aeroporto (String umCodigo, String umNome){
        this.codigo = umCodigo;
        this.nome = umNome;        
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public Geo getLocal(){
        return loc;
    }

       public String toString(){
        return "Dados do Aeroporto" + codigo + nome;
    }  

}