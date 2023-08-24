package Pilha;

public class Main {

    public static void main(String[] args) {
        PilhaRedimensionavel pilha = new PilhaRedimensionavel(2);

        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar("Maria");
        System.out.println("Elementos da pilha:");
        pilha.percorrer();
        pilha.desempilhar();
        System.out.println("Elementos atualizados da pilha:");
        pilha.percorrer();
    }
}

