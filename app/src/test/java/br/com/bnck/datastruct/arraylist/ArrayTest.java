package br.com.bnck.datastruct.arraylist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Classe de testes para a estrutura de dados Array.
 * Verifica as operações de adicionar, remover, acessar elementos e redimensionamento.
 */
@DisplayName("Testes da Classe Array")
class ArrayTest {

    private Array array;

    /**
     * Configura um novo Array antes de cada teste.
     */
    @BeforeEach
    void setUp() {
        array = new Array();
    }

    @Test
    @DisplayName("Dado que adiciono elementos ao array, Quando recupero os elementos, Então devo obter os valores adicionados.")
    void dadoQueAdicionoElementosAoArray_QuandoRecuperoOsElementos_EntãoDevoObterOsValoresAdicionados() {
        // Adiciona elementos ao array
        array.add(10);
        array.add(20);
        array.add(30);

        // Verifica se os elementos foram adicionados corretamente
        assertEquals(10, array.get(0));
        assertEquals(20, array.get(1));
        assertEquals(30, array.get(2));
    }

    @Test
    @DisplayName("Dado que removo um elemento do array, Quando recupero os elementos restantes, Então o array deve estar atualizado corretamente.")
    void dadoQueRemovoUmElementoDoArray_QuandoRecuperoOsElementosRestantes_EntãoOArrayDeveEstarAtualizadoCorretamente() {
        // Adiciona elementos ao array
        array.add(10);
        array.add(20);
        array.add(30);

        // Remove o elemento no índice 1
        array.remove(1);

        // Verifica o tamanho do array após a remoção
        assertEquals(2, array.size());
        // Verifica os elementos restantes
        assertEquals(10, array.get(0));
        assertEquals(30, array.get(1));

        // Verifica se uma exceção é lançada ao acessar um índice fora dos limites
        IndexOutOfBoundsException thrown = assertThrows(IndexOutOfBoundsException.class, () -> array.get(2));
        assertEquals("Índice fora dos limites", thrown.getMessage());
    }

    @Test
    @DisplayName("Dado que verifico o tamanho do array, Quando adiciono elementos, Então o tamanho deve ser atualizado corretamente.")
    void dadoQueVerificoOTamanhoDoArray_QuandoAdicionoElementos_EntãoOTamanhoDeveSerAtualizadoCorretamente() {
        // Verifica o tamanho inicial do array
        assertEquals(0, array.size());

        // Adiciona elementos ao array e verifica o tamanho
        array.add(10);
        assertEquals(1, array.size());
        array.add(20);
        assertEquals(2, array.size());
    }

    @Test
    @DisplayName("Dado que tento acessar um índice fora dos limites, Quando tento acessar o elemento, Então uma exceção deve ser lançada.")
    void dadoQueTentoAcessarUmIndiceForaDosLimites_QuandoTentoAcessarOElemento_EntãoUmaExcecaoDeveSerLancada() {
        // Tenta acessar um índice inválido e verifica se uma exceção é lançada
        IndexOutOfBoundsException thrown = assertThrows(IndexOutOfBoundsException.class, () -> array.get(0));
        assertEquals("Índice fora dos limites", thrown.getMessage());
    }

    @Test
    @DisplayName("Dado que tento remover um índice fora dos limites, Quando tento remover o elemento, Então uma exceção deve ser lançada.")
    void dadoQueTentoRemoverUmIndiceForaDosLimites_QuandoTentoRemoverOElemento_EntãoUmaExcecaoDeveSerLancada() {
        // Tenta remover um índice inválido e verifica se uma exceção é lançada
        IndexOutOfBoundsException thrown = assertThrows(IndexOutOfBoundsException.class, () -> array.remove(0));
        assertEquals("Índice fora dos limites", thrown.getMessage());
    }

    @Test
    @DisplayName("Dado que adiciono mais elementos do que a capacidade inicial, Quando o array é redimensionado, Então todos os elementos devem ser mantidos.")
    void dadoQueAdicionoMaisElementosDoQueACapacidadeInicial_QuandoOArrayERedimensionado_EntãoTodosOsElementosDevemSerMantidos() {
        // Adiciona mais elementos que a capacidade inicial para forçar o redimensionamento
        for (int i = 0; i < 15; i++) {
            array.add(i);
        }

        // Verifica o tamanho do array após o redimensionamento
        assertEquals(15, array.size());
        // Verifica se os elementos foram mantidos corretamente
        assertEquals(0, array.get(0));
        assertEquals(14, array.get(14));
    }
}
