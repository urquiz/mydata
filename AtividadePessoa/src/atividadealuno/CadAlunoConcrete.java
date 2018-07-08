
package atividadealuno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class CadAlunoConcrete implements CadAluno {

    private  List<Aluno> lista=new ArrayList<>();
    
    public CadAlunoConcrete() {
       
    
    }
    
   
    @Override
    public void adicionarAluno(Aluno aluno) {    
             lista.add(aluno);    
    }
    public void mostrarAluno()
    {
       System.out.println(lista);
    }
}
