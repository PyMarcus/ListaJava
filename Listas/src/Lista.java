public class Lista {
    static int[] item; //static, pois são atributos de classe e não objetos.
    static int primeiro, ultimo;


    //cria lista vazia
    public static void lista(int tam){
        item = new int[tam];
        primeiro = 0;
        ultimo = primeiro; //como primeiro e ultimo são iguais, pressupoe-se que o vetor estará vazio (indices, nao valores)
    }

    //insere item na lista final
    public static void insere(int x){

            if(ultimo >= item.length){//tamanho de item deve ser menor que ultimo
                System.out.println("Lista cheia!");
            }
            else{
                item[ultimo] = x;
                ultimo += 1;
            }
    }

    //testa se ha elementos no vetor
    public static boolean vazio(){
        return primeiro == ultimo; //se true, está
    }

    //imprime elementos da lista do primeiro ao último(ultimo - 1)
    public static void imprime(){
        for(int i = 0; i < item.length; i++){
            System.out.print(item[i] + " ");
        }
    }

    //pesquisa se há um elemento e retorna a posicao
    public static int pesquisa(int buscado){
        int posicao = 0;
        if(vazio()){
            System.out.println("Lista vazia!");
            return 0;
        }
        else{
            for(int i = 0; i < item.length; i++){
                if(item[i] == buscado) {
                    posicao = i;
                    break;
                }
            }
            return posicao;
        }

    }

    //retira e retorna um elemento da lista:
    public static int retira(int chave){
        if(vazio()){
            System.out.println("Lista vazia!");
            return 0;
        }
        else{
            boolean v = false;
            int local = 0;
            for(int i=0; i < item.length; i++){
                if(item[i] == chave) {
                    local = i;
                    v = true;
                }
            }
            if(v){
                ultimo = ultimo - 1;
                for(int i = 0; i < ultimo - 1; i++){
                    if(item[i] == chave ){
                       continue;
                    }else{
                        if(item[i + 1]!=chave)
                            item[i] = item[i + 1];
                        else
                            item[i + 1] = item[i + 2];
                    }

                }

            }
            return chave;
        }
    }

    //retira e retorna o primeiro elemento da lista se a mesma não estiver vazia:
    public static int retiraPrimeiro(){
        if(vazio()){
            System.out.println("Lista vazia, nada a alterar");
            return 0;
        }else{
            ultimo = ultimo - 1;
            int primeiro = item[0];
            for(int i = 0; i < ultimo - 1; i++){
                item[i] = item[i + 1];
            }
            return primeiro;
        }
    }


}
