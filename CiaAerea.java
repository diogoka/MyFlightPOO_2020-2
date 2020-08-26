public class CiaAerea {
    
    private String codigo;
    private String nome;

    public CiaAerea (String umCodigo, String umNome){
        this.codigo = umCodigo;
        this.nome = umNome;        
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

       public String toString(){
        return "Dados da Companhia Aérea" + codigo + nome;
    }    
}