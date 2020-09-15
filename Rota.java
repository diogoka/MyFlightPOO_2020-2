public class Rota {
    private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	
	public Rota(CiaAerea umaCia, Aeroporto umaOrigem, Aeroporto umDestino, Aeronave umaAeronave) {
		this.cia = umaCia;
		this.origem = umaOrigem;
		this.destino = umDestino;
		this.aeronave = umaAeronave;		
	}	
	
	public CiaAerea getCia() {
		return cia;
	}
	
	public Aeroporto getDestino() {
		return destino;
	}
	
	public Aeroporto getOrigem() {
		return origem;
	}
	
	public Aeronave getAeronave() {
		return aeronave;
	}

	public String toString() {
		return  "CIA: " + getCia() +
				", Origem: " + getOrigem() +
				", Destino: " + getDestino() +
				", Aeronave: " + getAeronave();
	}

}