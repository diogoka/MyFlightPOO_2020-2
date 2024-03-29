public class Aeroporto implements Comparable<Aeroporto>{
    
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
        return getCodigo() + "-" + getNome();
    }

    @Override
    public int compareTo(Aeroporto outroAeroporto) {
        return this.nome.compareTo(outroAeroporto.nome);
    }
}