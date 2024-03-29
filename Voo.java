import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {

    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;

	public Voo(Rota umaRota, Duration umaDuracao) {
		this.rota = umaRota;		
		this.duracao = umaDuracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public Voo(LocalDateTime datahora, Status status){
		this.datahora = datahora;
		this.status = status;
	}
	
	public Voo(Rota umaRota, LocalDateTime umaDatahora, Duration umaDuracao) {
		this.rota = umaRota;
		this.datahora = umaDatahora;
		this.duracao = umaDuracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}
	
	public Rota getRota() {
		return rota;
	}
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public Duration getDuracao() {
		return duracao;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status novo) {
		this.status = novo;
	}

	public String toString() {
		return  "Voo {"+
				"Data e Hora: " + getDatahora() +
				", Rota{" + getRota() +
				"}, Status: " + getStatus() +
				"}";
	}

}