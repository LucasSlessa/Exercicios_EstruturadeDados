
/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) (Univap)
 * Curso: Engenharia da Computação - Data de Entrega: 22/05/2024
 * Autor: Lucas de oliveira lessa
 *
 * Turma: 9UNA Disciplina: Algoritmos Estrutura de Dados - II

 * ***************************************************************************************/


public class Jogadores {
    String nome;
    int posicao;

    public Jogadores(String nome, int posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return nome + " (Posição: " + posicao + ")";
    }
}
