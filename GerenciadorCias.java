import java.util.ArrayList;

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

    public CiaAerea pesquisar (String umCodigo){
        for(CiaAerea CIA : Companhias){
            if(CIA.getCodigo() == umCodigo){
                return CIA;
            }                
        }
        return null;
    }

    public void listar(){
        System.out.println("Cadastro das Companhias Aereas");
        for (CiaAerea CIA : Companhias){
            System.out.println(CIA.toString());
        }

    }


    
}