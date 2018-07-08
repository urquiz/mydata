
package atividadealuno;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class AtividadeAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno registro1 = new Aluno();
        Aluno registro2= new Aluno();
        registro1.setNome("Alexandre");
        registro1.setEmail("biangaman@bol.com.br");
        CadAlunoConcrete adicionar = new CadAlunoConcrete();
        adicionar.adicionarAluno(registro1);
        registro2.setNome("Ricardo");
        registro2.setEmail("urquisbr@gmail.com");
        adicionar.adicionarAluno(registro2);
        adicionar.mostrarAluno();
       
        Disciplina registro3 = new Disciplina();
        Disciplina registro4 = new Disciplina();
        registro3.setDisciplina("Desenvolvimento Avançado");
        registro3.setProfessor("Cristiano Almeida");
        CadDisciplinaConcrete adicionarDadosProfessor = new CadDisciplinaConcrete();
        adicionarDadosProfessor.adicionarDisciplina(registro3);      
        adicionarDadosProfessor.mostrarDisciplina();
        
                
    }
    
}
