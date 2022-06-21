public class Caixa<T>{
    private T objeto;


    Caixa(T objeto) {
        this.objeto = objeto;
    }

    public T getob() {
        return objeto;
    }

    public void showType() {
        System.out.println("Tipo do T é: " +
                objeto.getClass().getName());
    }
}

