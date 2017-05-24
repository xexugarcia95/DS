package src;
import java.util.List;

public class SujetoLista extends Sujeto {
	
	public List<IObservador> coleccionObservadores()
	{
		return observadores;
	}
}
