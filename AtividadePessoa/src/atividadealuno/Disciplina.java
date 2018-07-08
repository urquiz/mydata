
package atividadealuno;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class Disciplina {
    private String professor;
    private String disciplina;

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "professor=" + professor + ", disciplina=" + disciplina + '}';
    }
    
    
}
