import java.util.ArrayList;

class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    
    Livro(String t, String a, int ano){
        titulo = t;
        autor = a;
        anoPublicacao = ano;
    }
}

public class Atividade04 {
    public static void main(String[] args){
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(new Livro("titulo1", "Naamã", 2000));
        livros.add(new Livro("titulo2", "Naamã2", 2005));
        livros.add(new Livro("titulo3", "Naamã3", 2006));
        
        for(Livro l : livros){
            System.out.println("titulo: " + l.titulo);
        }
    }
}
