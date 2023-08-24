package Pilha;

import java.util.EmptyStackException;

public class PilhaRedimensionavel<T> {
    private Object[] pilha;
    private int tamanho;

    public PilhaRedimensionavel(int comprimento) {
        this.pilha = new Object[comprimento];
        this.tamanho = 0;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int tamanho(){
        return tamanho;
    }

    public void empilhar(T item){
        if(tamanho==pilha.length) redimensionar(pilha.length * 2);
        pilha[tamanho++] = item;
    }

    public T desempilhar() {
        if (estaVazia()) throw new EmptyStackException();
        T item = (T) pilha[--tamanho];
        if (tamanho > 0 && tamanho <= (pilha.length) / 4) redimensionar(pilha.length / 2);
        return item;
    }

    public T topo(){
        if(estaVazia()) throw new EmptyStackException();
        return (T) pilha[tamanho-1];
    }

    public void redimensionar(int novoComprimento){
        Object[] novaPilha = new Object[novoComprimento];
        for(int i = 0; i<tamanho; i++) novaPilha[i] = pilha[i];
        this.pilha = novaPilha;
    }
    public void percorrer() {
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }
    protected Object[] getPilha(){
        return pilha;
    }
}

