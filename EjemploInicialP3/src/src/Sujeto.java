package src;
import java.util.ArrayList;
import java.util.List;

public abstract class Sujeto {
	
	protected List<IObservador> observadores = new ArrayList<IObservador>();
	
	public void insertar(IObservador observador)
	{
		observadores.add(observador);
	}
	
	public void liberar(IObservador observador)
	{
		observadores.remove(observador);
	}
	
	public void notificar()
	{
		for(IObservador observador : observadores)
		{
			observador.actualizar(this);
		}
	}
	
	public List lista()
	{
		return observadores;
	}
}
