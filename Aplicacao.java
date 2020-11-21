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
        instanceAeroportos.inserir(new Aeroporto("BSB","Jucelino Kubitschek"));
        instanceAeroportos.inserir(new Aeroporto("CGH","Congonhas"));
        instanceAeroportos.inserir(new Aeroporto("GIG","Galeão"));
        instanceAeroportos.inserir(new Aeroporto("SSA","Eduardo Magalhães"));
        instanceAeroportos.inserir(new Aeroporto("FLN","Hercílio Luz"));
        instanceAeroportos.inserir(new Aeroporto("VCP","Viracopos"));
        instanceAeroportos.inserir(new Aeroporto("CWB","Afonso Pena"));
        instanceAeroportos.inserir(new Aeroporto("CNF","Confins"));




        //INSERIR CIAS
        instanceCias.inserir(new CiaAerea("GLO","Gol Linhas Aéreas"));
        instanceCias.inserir(new CiaAerea("AZU","Azul Linhas Aéreas"));
        instanceCias.inserir(new CiaAerea("TAM","Latam"));
        instanceCias.inserir(new CiaAerea("AV","Avianca"));
        instanceCias.inserir(new CiaAerea("AAL","American Air"));
        instanceCias.inserir(new CiaAerea("TAP","Cia Aerea Portugal"));


        //INSERIR AERONAVES
        instanceAeronaves.inserir(new Aeronave("733","Boeing 737-300",140));
        instanceAeronaves.inserir(new Aeronave("380","Airbus Industrie A380",644));
        instanceAeronaves.inserir(new Aeronave("320","Airbus A320",240));
        instanceAeronaves.inserir(new Aeronave("980","DC-9/MD-80",172));
        instanceAeronaves.inserir(new Aeronave("777","Boeing 777",550));
        instanceAeronaves.inserir(new Aeronave("180","Embraer E-Jets",144));
        instanceAeronaves.inserir(new Aeronave("727","Boeing 727",144));
        instanceAeronaves.inserir(new Aeronave("330","Airbus A330",300));




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

        //INSERIR VOO_ESCALA


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