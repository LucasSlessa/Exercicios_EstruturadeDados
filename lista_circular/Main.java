
/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) (Univap)
 * Curso: Engenharia da Computação - Data de Entrega: 22/05/2024
 * Autor: Lucas de oliveira lessa
 *
 * Turma: 9UNA Disciplina: Algoritmos Estrutura de Dados - II

 * ***************************************************************************************/


public class Main {
    public static void main(String[] args) {

        //uso da lista 1
        //-------------------------------------
        ListaCircular lista = new ListaCircular();
        lista.adiciona("Alice");
        lista.adiciona("Bob");
        lista.adiciona("Charlie");
        lista.adiciona("Diana");
        lista.adiciona("Eve");

        System.out.println(lista.toString());   
        //-------------------------------------

        //uso2
        //-------------------------------------
        String s[] = {"M", "A", "C"};
        for(int i = 0; i <= s.length - 1; i++) {
            lista.adiciona(s[i]);
        }
        lista.remove();
        System.out.println(lista.getelemento());
        System.out.println(lista);
        //-------------------------------------
    }

}

// 10) Análise e respostas às questões.
// a) Após a inserção dos elementos na lista, ao pegar um elemento da lista sem realizar nenhuma outra operação, qual será o resultado?

// Resposta: O resultado será o último elemento inserido na lista, pois o cursor está apontando para ele.

// b) Ao deslocar a referência da célula para o próximo, qual será o comportamento da estrutura?

// Resposta: A referência do cursor será movida para o próximo nó na lista, mantendo a estrutura circular intacta.

// c) Construir um programa que insira 5 nomes em uma lista e faça a varredura da lista, comentando o resultado. //uso da lista 1


// d) Qual o resultado da implementação abaixo, justifique sua resposta. //uso2
// Resposta: Após a execução, o cursor apontará para o último elemento ("C"). A lista exibida será ["M", "A"] porque o método remove elimina o nó imediatamente após o cursor. O getelement retornará "C".


