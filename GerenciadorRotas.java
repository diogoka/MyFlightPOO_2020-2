import java.util.ArrayList;

public class GerenciadorRotas {

    private ArrayList<Rota> trajetos;

    private static GerenciadorRotas instance;

    private GerenciadorRotas(){
        trajetos = new ArrayList<>();
    }

    public static GerenciadorRotas getInstance(){
        if (instance == null){
            instance = new GerenciadorRotas();
        }
        return instance;
    }

    public void inserir(Rota umaRota){
        trajetos.add(umaRota);
    }

    public Rota pesquisarPorOrigem (Aeroporto umaOrigem){
        for (Rota RT : trajetos) {
            if (RT.getOrigem() == umaOrigem)
                return RT;
        }
        return null;
    }

    public void listar (){
        System.out.println("Lista de Rotas");
        for (Rota RT : trajetos){
            System.out.println(RT.toString());
        }
    


    }    



    
}