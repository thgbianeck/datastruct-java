package br.com.bnck.datastruct.arraylist;

import java.util.Arrays;

/**
 * Classe que implementa uma estrutura de dados de Array dinâmico.
 * Permite operações de adicionar, remover e acessar elementos, além de redimensionamento automático.
 */
public class Array {
    private int[] data;
    private int size;

    /**
     * Construtor que inicializa o array com capacidade inicial de 10 elementos.
     */
    public Array() {
        data = new int[10]; // Tamanho inicial
        size = 0;
    }

    /**
     * Adiciona um novo elemento ao final do array.
     * Se o array estiver cheio, sua capacidade é dobrada.
     *
     * @param value O valor a ser adicionado ao array.
     */
    public void add(int value) {
        if (size == data.length) {
            resize(); // Redimensiona o array se necessário
        }
        data[size++] = value;
    }

    /**
     * Retorna o elemento na posição especificada do array.
     *
     * @param index O índice do elemento a ser retornado.
     * @return O valor do elemento no índice especificado.
     * @throws IndexOutOfBoundsException Se o índice for inválido (fora dos limites do array).
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }
        return data[index];
    }

    /**
     * Remove o elemento na posição especificada do array, movendo os elementos subsequentes para a esquerda.
     *
     * @param index O índice do elemento a ser removido.
     * @throws IndexOutOfBoundsException Se o índice for inválido (fora dos limites do array).
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1]; // Desloca os elementos para a esquerda
        }
        data[--size] = 0; // Opcional: limpa o valor removido
    }

    /**
     * Retorna o número de elementos presentes no array.
     *
     * @return O número de elementos no array.
     */
    public int size() {
        return size;
    }

    /**
     * Redimensiona o array, dobrando sua capacidade atual.
     */
    private void resize() {
        int newCapacity = data.length * 2;
        data = Arrays.copyOf(data, newCapacity);
    }
}
