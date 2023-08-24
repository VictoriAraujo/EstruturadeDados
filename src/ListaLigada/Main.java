package ListaLigada;

public class Main {
    public static void main(String[]args){
        ListaLigada lista = new ListaLigada();
        lista.adicionar("Maria");
        lista.adicionar("Luiz");
        lista.adicionar("Victoria");
        lista.adicionar("Carlos");
        System.out.println("Tamanho: "+lista.getTamanho());
        lista.remover("Luiz");
        lista.remover("CARLOS");
        lista.remover("Maria");
        lista.remover("Victoria");
        System.out.println("Tamanho Atualizado: "+lista.getTamanho());
        for (int i = 0; i < lista.getTamanho();i++){
            System.out.println(lista.get(i).getValor());
        }
    }
}
