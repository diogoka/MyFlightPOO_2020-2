public class Aeroporto {
    
    private String codigo;
    private String nome;

    public Aeroporto (String umCodigo, String umNome){
        codigo = umCodigo;
        nome = umNome;        
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

       public String toString(){
        return "Dados do Aeroporto" + codigo + nome;
    }  

}