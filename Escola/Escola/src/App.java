import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Aluno> lista = new ArrayList<>();

        CadastroAluno alune1 = new CadastroAluno(10, "Jos", "Tarde", "EM");
        alune1.adicionarAluno();

        CadastroAluno alune2 = new CadastroAluno(1, "Mariah", "Manhã", "Psicologia");
        alune2.adicionarAluno();

        
        imprimeListaAlunos();

        
       
    }
}
