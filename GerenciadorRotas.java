import java.util.ArrayList;

public class GerenciadorRotas {

    private ArrayList<Rota> rotas;

    private static GerenciadorRotas instance;

    private GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

    public static GerenciadorRotas getInstance(){
        if (instance == null){
            instance = new GerenciadorRotas();
        }
        return instance;
    }

    public void inserir(Rota umaRota){
        rotas.add(umaRota);
    }

    public Rota pesquisarPorOrigem (Aeroporto umaOrigem){
        for (Rota RT : rotas) {
            if (RT.getOrigem() == umaOrigem)
                return RT;
        }
        return null;
    }

    public Rota pesquisarPorDestino (Aeroporto umDestino){
        for (Rota RT : rotas) {
            if (RT.getDestino() == umDestino)
                return RT;
        }
        return null;
    }

    public Rota pesquisarPorOrigemDestino (Aeroporto umaOrigem, Aeroporto umDestino){
        for (Rota RT : rotas) {
            if (RT.getOrigem() == umaOrigem && RT.getDestino() == umDestino)
                return RT;
        }
        return null;
    }

    public void listar (){
        System.out.println("Lista de Rotas:");
        for (Rota RT : rotas){
            System.out.println(RT.toString());
        }
    


    }    



    
}