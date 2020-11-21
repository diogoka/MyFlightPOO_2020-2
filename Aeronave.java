public class Aeronave implements Imprimivel, Contavel{
    
    private String codigo;
    private String descricao;
    private int capacidade;
    private int totalAeronaves = 0;

    public Aeronave (String umCodigo, String umaDescricao, int umaCapacidade){
        this.codigo = umCodigo;
        this.descricao = umaDescricao;
        this.capacidade = umaCapacidade;
        totalAeronaves++;
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
        return getCodigo() + "-" + getDescricao() + " " + getCapacidade() + " passageiros";
    }

    @Override
    public void imprimir() {
        System.out.println(codigo + " " + descricao);
    }

    @Override
    public void contador() {
        System.out.println("Total de aeronaves: " + totalAeronaves);
    }
}