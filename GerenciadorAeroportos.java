import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public static void ordenaPorNome(ArrayList<Aeroporto> Aero){
        Collections.sort(Aero, new Comparator<Aeroporto>() {
            @Override
            public int compare(Aeroporto A1, Aeroporto A2) {
                return A1.getNome().compareTo(A2.getNome());
            }
        });
    }

}
