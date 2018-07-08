
package atividadealuno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class CadDisciplinaConcrete implements CadDisciplina {

    private  List<Disciplina> lista=new ArrayList<>();

    public CadDisciplinaConcrete() {
    }
    
    
    
    @Override
    public void adicionarDisciplina(Disciplina disciplina) {
        lista.add(disciplina);  
    }

    @Override
    public void mostrarDisciplina() {
        System.out.println(lista);
    }
    
}
