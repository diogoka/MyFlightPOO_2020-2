import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class Aplicacao {

    private static GerenciadorVoos instanceVoos = GerenciadorVoos.getInstance();
    private static GerenciadorAeronaves instanceAeronaves = GerenciadorAeronaves.getInstance();
    private static GerenciadorAeroportos instanceAeroportos = GerenciadorAeroportos.getInstance();
    private static GerenciadorRotas instanceRotas = GerenciadorRotas.getInstance();
    private static GerenciadorCias instanceCias = GerenciadorCias.getInstance();

    public static void main (String args []){
        //---EM DESENVOLVIMENTO---

        //FUTURAMENTE FAZER MÉTODOS PARA AS INSERÇÕES

        //INSERIR AEROPORTOS
        instanceAeroportos.inserir(new Aeroporto("POA","Salgado Filho"));
        instanceAeroportos.inserir(new Aeroporto("GRU","Guarulhos"));

        //INSERIR CIAS
        instanceCias.inserir(new CiaAerea("G3","Gol Linhas Aéreas"));
        instanceCias.inserir(new CiaAerea("AD","Azul Linhas Aéreas"));

        //INSERIR AERONAVES
        instanceAeronaves.inserir(new Aeronave("733","Boeing 737-300",140));
        instanceAeronaves.inserir(new Aeronave("380","Airbus Industrie A380",644));

        //INSERIR ROTAS
        instanceRotas.inserir(new Rota(instanceCias.pesquisarPorCodigo("G3"), instanceAeroportos.pesquisarPorCod("POA"), instanceAeroportos.pesquisarPorCod("GRU"),
        instanceAeronaves.pesquisar("733")));

        instanceRotas.inserir(new Rota(instanceCias.pesquisarPorCodigo("AD"), instanceAeroportos.pesquisarPorCod("GRU"), instanceAeroportos.pesquisarPorCod("POA"),
        instanceAeronaves.pesquisar("380")));

        //INSERIR VOOS
        instanceVoos.inserir(new Voo(instanceRotas.pesquisarPorOrigemDestino(instanceAeroportos.pesquisarPorCod("POA"),instanceAeroportos.pesquisarPorCod("GRU")),
        LocalDateTime.of(2020, Month.SEPTEMBER, 14, 13, 00, 00), Duration.ofMinutes(90)));

        instanceVoos.inserir(new Voo(instanceRotas.pesquisarPorOrigemDestino(instanceAeroportos.pesquisarPorCod("GRU"),instanceAeroportos.pesquisarPorCod("POA")),
        LocalDateTime.of(2020, Month.SEPTEMBER, 14, 19, 30, 00), Duration.ofMinutes(90)));

        System.out.println("\n");
        //LISTAR VOOS
        instanceVoos.listar();
        System.out.println("\n");
        //LISTAR AERONAVES
        instanceAeronaves.listar();
        System.out.println("\n");
        //LISTAR ROTAS
        instanceRotas.listar();
        System.out.println("\n");
        //LISTAR CIAS
        instanceCias.listar();
        System.out.println("\n");
        //LISTAR AEROPORTOS
        instanceAeroportos.listar();
        System.out.println("\n");

    }

}   