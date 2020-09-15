import java.util.ArrayList;

public class GerenciadorAeroportos {
    
    private ArrayList<Aeroporto> aeroportos;

    private static GerenciadorAeroportos instance;

    private GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public static GerenciadorAeroportos getInstance(){
        if (instance == null){
            instance = new GerenciadorAeroportos();
        }
        return instance;
    }

    public void inserir(Aeroporto umAeroporto){
        aeroportos.add(umAeroporto);
    }

    public Aeroporto pesquisarPorCod(String cod){
        for(Aeroporto aeroporto : aeroportos){
            if(aeroporto.getCodigo() == cod)
                return aeroporto;
        }
        return null;
    }

    public void listar(){
        System.out.println("Aeroportos:");
        for(Aeroporto aeroporto : aeroportos){
            System.out.println(aeroporto.toString());
        }
    }

}
