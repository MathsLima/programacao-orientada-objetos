public class Main
{
    public static void main (String[] args){
        System.out.println("\f");
        System.out.println("EE1 - Programaçao Orientada a Objetos");
        System.out.println("Autor: Matheus Silva de Lima");
        System.out.println("Obs: Informaçoes do desenvolvimento no README ");
        
        System.out.println("\n");
        
        Livro livro1 = new Livro("Harry Potter", "J. K. Rowling.", 3, 100);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis",2, 50);
        
        System.out.println("-Livro 1-");
        System.out.println("Titulo: " + livro1.getTitulo());
        livro1.adicionarCapitulo("Cap 1: Sinopse", 10);
        livro1.adicionarCapitulo("Cap 2: Introdução", 50);
        livro1.adicionarCapitulo("Cap 3: Final" ,40);
        
        
        System.out.println("\n");
        
        
        System.out.println("-Livro 2-");
        System.out.println("Autor: " + livro2.getAutor());
        livro2.adicionarCapitulo("Cap 1: Sinopse", 10);
        livro2.adicionarCapitulo("Cap 2: Introdução", 10);
        livro2.adicionarCapitulo("Cap 3: Final" ,30);   
        livro2.imprimirCapitulo2(1);
    }
}
