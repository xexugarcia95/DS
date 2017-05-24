package src;

public class Observador implements IObservador {
	
	private boolean actualizarLlamado = false;
	
	public void actualizar(Sujeto sujeto)
	{
		actualizarLlamado = true;
	}
	
	public boolean actualizarLlamado()
	{
		return actualizarLlamado;
	}
}
