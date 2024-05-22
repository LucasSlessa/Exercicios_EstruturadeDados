
/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) (Univap)
 * Curso: Engenharia da Computação - Data de Entrega: 22/05/2024
 * Autor: Lucas de oliveira lessa
 *
 * Turma: 9UNA Disciplina: Algoritmos Estrutura de Dados - II

 * ***************************************************************************************/


class Celula{
    Object elemento;
    Celula proximo;

    Celula(Object elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    

    

}