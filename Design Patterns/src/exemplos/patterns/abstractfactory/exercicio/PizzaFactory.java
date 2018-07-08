package exemplos.patterns.abstractfactory.exercicio;

import java.util.Calendar;

/**
 *
 * Ricardo Urquiz Brasil
 */
public abstract class PizzaFactory {

    public static Pizza pedirPizza(Calendar data) {
        int diaSemana = data.get(Calendar.DAY_OF_WEEK);
        Pizzaiolo fazedorDePizza;
        switch (diaSemana) {
            case Calendar.MONDAY:
            case Calendar.WEDNESDAY:
            case Calendar.FRIDAY:
                fazedorDePizza = PizzaioloFactory.definePizzaiolo(2);
                break;
            case Calendar.TUESDAY:
            case Calendar.THURSDAY:
            case Calendar.SATURDAY:
                fazedorDePizza = PizzaioloFactory.definePizzaiolo(1);
                break;
            default:
                return null;
        }
        return fazedorDePizza.montarPizza();
    }

}
