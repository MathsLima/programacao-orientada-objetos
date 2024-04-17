public class App{
    public static void main(String[] args){
        gerente chefe = new gerente("Jose", 1500, "TI");
        vendedor clt = new vendedor("Maria", 1000);

        System.out.println(chefe.toString());
        System.out.println(clt.toString());
    }
}