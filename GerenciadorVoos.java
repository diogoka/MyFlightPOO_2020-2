import java.util.ArrayList;
import java.time.LocalDate;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    private static GerenciadorVoos instance;

    private GerenciadorVoos(){
        voos = new ArrayList<>();
    }

    public static GerenciadorVoos getInstance(){
        if (instance == null){
            instance = new GerenciadorVoos();
        }
        return instance;
    }

    public void inserir(Voo umVoo){
        voos.add(umVoo);
    }

    public Voo pesquisarPorData(LocalDate umaData){
        for(Voo vooData : voos){
            if(vooData.getDatahora().toLocalDate() == umaData)
                return vooData;
        }
        return null;
    }

    public void listar(){
        System.out.println("Voos");
        for(Voo voo : voos){
            System.out.println(voo.toString());
        }
    }
}