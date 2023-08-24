package Fila;

public class FilaRedimensionavel<I> {

    private int tamanho;
    private int cabeca;
    private int cauda;
    private Object[] fila;

    public FilaRedimensionavel(int capacidade){
        fila = new Object[capacidade];
        this.tamanho = 0;
        this.cabeca = 0;
        this.cauda = 0;
    }

    public int tamanho(){
        return tamanho;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public boolean estaCheia(){
        return tamanho == fila.length;
    }

    public void enfileirar(I item){
        if(estaCheia()) redimensionar(fila.length * 2);
        fila[cauda] = item;
        cauda = (cauda+1) % fila.length;
        tamanho++;
    }

    public void redimensionar(int novoTamanho){
        Object[] novaFila = new Object[novoTamanho];
        for(int i = 0; i < tamanho; i++){
            novaFila[i] = fila[(cabeca + i) % fila.length];
        }
        fila = novaFila;
        cabeca = 0;
        cauda = tamanho;
    }

    public I desenfileirar(){
        if(estaVazia()) throw new IllegalStateException("A fila está vazia, não tem como desenfileirar.");
        I item = (I) fila[cabeca];
        cabeca = (cabeca+1) % fila.length;
        tamanho--;
        if(fila.length >= 4 && tamanho <= fila.length/4) redimensionar(fila.length/2);
        return item;
    }

    public void percorrer() {
        for (int i = 0; i < tamanho; i++) {
            int index = (cabeca + i) % fila.length;
            System.out.print(fila[index] + " ");
        }
        System.out.println();
    }
}

