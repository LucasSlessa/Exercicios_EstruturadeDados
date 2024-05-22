

/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) (Univap)
 * Curso: Engenharia da Computação - Data de Entrega: 22/05/2024
 * Autor: Lucas de oliveira lessa
 *
 * Turma: 9UNA Disciplina: Algoritmos Estrutura de Dados - II

 * ***************************************************************************************/

class ListaCircular {
    private Celula cursor;
    private int total;

    public ListaCircular(){
        cursor = null;
        total = 0;
    }

    public void proximo(){
        cursor = cursor.proximo;
    }

    public Object getelemento(){
        if(cursor !=null){
            return cursor.elemento;
        }
        return null;

    }

    public boolean ultelemento(){                        //O método verifica se a lista contém apenas um elemento, comparando o cursor com seu próximo nó. 
        return cursor !=null && cursor == cursor.proximo;// Retorna true se houver apenas um elemento na lista.
    }

    public int tamanho(){
        return total;
    }

    public void avanca(int posicao){            //O método avanca desloca o cursor para a posição especificada na lista, chamando o método proximo() repetidamente.
        for(int i=0; i < posicao; i++){
            this.proximo();
        }
    }

    public void adiciona(Object elemento){       //A lista é uma estrutura circular porque cada nó aponta para o próximo nó,                          
        Celula nodo = new Celula(elemento);      //e o último nó aponta de volta para o primeiro nó, formando um ciclo contínuo sem início ou fim definidos.
        if(cursor == null){
            nodo.proximo = nodo;
            cursor = nodo;
        }else {
            nodo.proximo = cursor.proximo;
            cursor.proximo = nodo;
            cursor = nodo;
        }
        total++;
    }

    public void remove(){                      //O método remove elimina o nó imediatamente após o cursor. 
        if(cursor != null){                    // Se a lista tiver apenas um elemento, ele redefine o cursor para null. Caso contrário, ajusta os ponteiros para excluir o nó da lista.
            if(cursor == cursor.proximo){
                cursor = null;
            }else {
                cursor.proximo = cursor.proximo.proximo;
            }
            total --;

        }
    }

    @Override
    public String toString() {
        if (cursor == null) return "[]";
        StringBuilder s = new StringBuilder("[" + this.getelemento());      //O método toString() percorre a lista circular a partir do cursor e coleta todos os elementos em uma string formatada. 
        Celula velhocursor = cursor;                                        //. Ele garante que todos os elementos são incluídos exatamente uma vez, retornando uma representação textual da lista.
        this.proximo();                                         
        while (velhocursor != cursor) {
            s.append(",").append(this.getelemento());
            this.proximo();
        }
        return s.append("]").toString();
    }

    public Celula getCursor() {
        return cursor;
    }

    public void setCursor(Celula cursor) {
        this.cursor = cursor;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    

}



// A classe ListaCircular gerencia uma lista encadeada circular, 
// permitindo operações como adição, remoção, navegação e consulta de elementos. 
// O construtor inicializa a lista atribuindo null ao cursor, indicando que a lista 
// está inicialmente vazia.