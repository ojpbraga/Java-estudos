import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroAluno {
    private List<Aluno> lista;
    


    public CadastroAluno() {
        lista = new ArrayList<>();
    }


    public void adicionarAluno(Aluno aluno) {
        lista.add(aluno);
        
    }

    public int ordenarAlunos() {
        
    }

    public void imprimeListaAlunos() {
       System.out.println(getLista());
    }

    public String toString() {
        return "Aluno: " + getNome() + " Matricula: " + getMatricula() + " Curso: " + getCurso() + " Turno: " + getTurno();
    }



}
