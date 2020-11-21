public class CiaAerea {
    
    private String codigo;
    private String nome;
    private static int totalCias = 0;

    public CiaAerea (String umCodigo, String umNome){
        this.codigo = umCodigo;
        this.nome = umNome;
        totalCias++;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public String toString() {
		return getCodigo() + "-" + getNome();
	}

	public int getTotalCias(){
        return  totalCias;
    }
  
}