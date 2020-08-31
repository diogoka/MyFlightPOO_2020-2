import java.util.ArrayList;

public class GerenciadorAeronaves {
   
    private ArrayList<Aeronave> Aeronaves;

    public static GerenciadorAeronaves instance;

    private GerenciadorAeronaves (){
        Aeronaves = new ArrayList<>();
    }

    public static GerenciadorAeronaves getInstance(){
        if (instance == null){
            instance = new GerenciadorAeronaves();
        }
        return instance;
    }

    public void inserir(Aeronave umaAeronave){
        Aeronaves.add(umaAeronave);
    }

    public Aeronave pesquisar(String umCodigo){
        for (Aeronave Aero : Aeronaves){
            if (Aero.getCodigo() == umCodigo){
                return Aero;
            }
        }
        return null;
    }

    public void listar(){
        System.out.println("Lista de Aeronaves");
        for (Aeronave Aero : Aeronaves){
            System.out.println(Aero.toString());
        }
    }

    
}