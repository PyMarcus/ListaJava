public class TesteClasse {
    public static void main(String[] args){
        Lista.lista(10);

        Lista.insere(1);Lista.insere(3);Lista.insere(4);
        Lista.insere(7);Lista.insere(8);
        System.out.println(Lista.pesquisa(3));
        System.out.println(Lista.retira(3));
        System.out.println(Lista.retiraPrimeiro());
        Lista.imprime();

    }
}
