import java.time.Duration;
import java.time.LocalDateTime;

public class VooVariasEscalas extends VooEscalas{

    public enum Status{CONFIRMADO, ATRASADO, CANCELADO};

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Rota rotaFinal;
    private VooEscalas.Status status;

    public VooVariasEscalas(Rota rotaInicio, Rota rotaFim, LocalDateTime umaDataeHora, Duration umaDuracao){
        super(rotaInicio, rotaFim, umaDataeHora, umaDuracao);
        this.status = VooEscalas.Status.CONFIRMADO; //default é confirmado.
    }

    public Rota getRotaInicial(){
        return rota;
    }

    public Rota getRotaFinal(){
        return rotaFinal;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setStatus(VooEscalas.Status novo) {
        this.status = novo;
    }

    @Override
    public String toString() {
        return  "Voo {"+
                "Data e Hora: " + getDatahora() +
                ", Rota Inicial{" + getRotaInicial() +
                ", Rota Final{" + getRotaFinal() +
                "}, Status: " + getStatus() +
                "}";
    }








}
