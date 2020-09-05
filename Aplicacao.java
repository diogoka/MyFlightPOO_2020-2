public class Aplicacao {
    public static void main (String args []){
        System.out.println("Em desenvolvimento");
        GerenciadorVoos teste = GerenciadorVoos.getInstance();
        GerenciadorVoos teste2 = GerenciadorVoos.getInstance();
        System.out.println(teste.getInstance());
        System.out.println(teste2.getInstance());

    }

}   