package exemplos.patterns.adapter;

import java.util.Date;

/**
 *
 * Ricardo Urquiz Brasil
 */
public interface Email {
    
    public void enviarEmail(String origem, String destino, 
            String mensagem, 
            Date data);
    
}
