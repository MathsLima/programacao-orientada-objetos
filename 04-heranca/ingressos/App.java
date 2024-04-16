public class App{
    public static void main(String[] args){
        ingresso ing = new ingresso(10);
        System.out.println(ing.toString());

        ingressoVip ingVip = new ingressoVip(10, 10);
        System.out.println(ingVip.toString());
    }
}