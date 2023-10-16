public class Aluno {
    private int matricula;
    private String nome;
    private String turno;
    private String curso;

    public Aluno(int matricula, String nome, String turno, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.turno = turno;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
