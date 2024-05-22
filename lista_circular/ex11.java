
/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) (Univap)
 * Curso: Engenharia da Computação - Data de Entrega: 22/05/2024
 * Autor: Lucas de oliveira lessa
 *
 * Turma: 9UNA Disciplina: Algoritmos Estrutura de Dados - II

 * ***************************************************************************************/

import java.util.Random;

public class ex11 {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        Random random = new Random();
        
    
        int n = random.nextInt(496) + 5;
        System.out.println("Adicionando " + n + " números aleatórios na lista:");
        for (int i = 0; i < n; i++) {
            int numero = random.nextInt(496) + 5;
            lista.adiciona(numero);
            System.out.print(numero + " ");
        }
        System.out.println();

    
        int ultimoNumero = random.nextInt(496) + 5;
        lista.adiciona(ultimoNumero);
        System.out.println("Último número adicionado: " + ultimoNumero);

        System.out.println("Lista: " + lista);

    
        System.out.println("Verificando divisores do último número (" + ultimoNumero + "):");
        verificarDivisores(lista, ultimoNumero);
    }

    public static void verificarDivisores(ListaCircular lista, int ultimoNumero) {
        if (lista.tamanho() == 0) return;
        Celula atual = lista.getCursor().proximo;
        do {
            int valor = (int) atual.elemento;
            if (ultimoNumero % valor == 0) {
                System.out.println(valor + " é divisor de " + ultimoNumero);
            }
            atual = atual.proximo;
        } while (atual != lista.getCursor().proximo);
    }
}
