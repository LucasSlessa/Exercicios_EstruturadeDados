
/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) (Univap)
 * Curso: Engenharia da Computação - Data de Entrega: 22/05/2024
 * Autor: Lucas de oliveira lessa
 *
 * Turma: 9UNA Disciplina: Algoritmos Estrutura de Dados - II   
 * ***************************************************************************************/

 
public class ex12   {

 public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        
        
        lista.adiciona(new Jogadores("Jogador 1", 1));
        lista.adiciona(new Jogadores("Jogador 2", 2));
        lista.adiciona(new Jogadores("Jogador 3", 3));
        lista.adiciona(new Jogadores("Jogador 4", 4));
        lista.adiciona(new Jogadores("Jogador 5", 5));

       
        System.out.println("Lista inicial de jogadores:");
        System.out.println(lista);

        
        rodizio(lista);

      
        System.out.println("Lista após o rodízio:");
        System.out.println(lista);
    }

   
    public static void rodizio(ListaCircular lista) {
        
        Jogadores levantador = new Jogadores("Levantador", 0);
        lista.adiciona(levantador);
        lista.avanca(5);
        lista.remove();;

        for (int i = 0; i < lista.tamanho(); i++) {
            Jogadores jogador = (Jogadores) lista.getelemento();
            jogador.posicao = (jogador.posicao % 5) + 1;
            lista.proximo();
        }

       ;
        lista.adiciona(levantador);
    }
}
