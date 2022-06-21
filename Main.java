public class Main {
    public static void main(String[] args) {


        Caixa<Integer> ci = new Caixa<>(99);
        ci.showType();
        System.out.println(ci.getob().toString());
        Caixa<String> cs = new Caixa<>("Teste");
        cs.showType();
        System.out.println(cs.getob().toString());
        Caixa<Character> cc = new Caixa<>('T');
        cc.showType();
        System.out.println(cc.getob().toString());
    }
}