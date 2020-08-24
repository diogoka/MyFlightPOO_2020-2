public class Aeronave {
    
    private String codigo;
    private String descricao;
    private int capacidade;

    public Aeronave (String umCodigo, String umaDescricao, int umaCapacidade){
        codigo = umCodigo;
        descricao = umaDescricao;
        capacidade = umaCapacidade;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public String toString(){
        return "Dados Aeronave" + codigo + descricao + capacidade;
    }
}