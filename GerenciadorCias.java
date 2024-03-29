import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GerenciadorCias {

    private ArrayList<CiaAerea> Companhias;

    private static GerenciadorCias instance;

    private GerenciadorCias(){
        Companhias = new ArrayList<>();
    }

    public static GerenciadorCias getInstance(){
        if (instance == null){
            instance = new GerenciadorCias();
        }
        return instance;
    }

    public void inserir(CiaAerea umaCiaAerea){
        Companhias.add(umaCiaAerea);
    }

    public CiaAerea pesquisarPorCodigo (String umCodigo){
        for(CiaAerea CIA : Companhias){
            if(CIA.getCodigo() == umCodigo){
                return CIA;
            }                
        }
        return null;
    }

    public CiaAerea pesquisarPorNome (String umNome){
        for(CiaAerea CIA : Companhias){
            if(CIA.getNome() == umNome){
                return CIA;
            }                
        }
        return null;
    }


    public void listar(){
        System.out.println("Companhias Aéreas Cadastradas: ");
        for (CiaAerea CIA : Companhias){
            System.out.println(CIA.toString());
        }

    }

    public static void ordenaPorNome(ArrayList<CiaAerea> Cia){
        Collections.sort(Cia, new Comparator<CiaAerea>() {
            @Override
            public int compare(CiaAerea C1, CiaAerea C2) {
                return C1.getNome().compareTo(C2.getNome());
            }
        });
    }


    
}