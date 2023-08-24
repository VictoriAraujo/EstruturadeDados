package Fila;

public class Main {

    public static void main(String [] args){
        FilaRedimensionavel fila = new FilaRedimensionavel(2);
        fila.enfileirar("Maria");
        fila.enfileirar("Luiz");
        fila.enfileirar("Carlos");
        fila.enfileirar("Jorge");
        fila.enfileirar("Victoria");
        fila.enfileirar("Josy");
        fila.percorrer();
        fila.desenfileirar();
        fila.desenfileirar();
        fila.enfileirar("Miguel");
        fila.percorrer();
    }
}
