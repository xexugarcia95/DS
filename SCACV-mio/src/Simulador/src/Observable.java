package Simulador.src;
import java.util.ArrayList;
public abstract class Observable {
	public Observador observador;
	private ArrayList<Observador> observadores;
	public Observable() {
		observadores = new ArrayList<Observador>();
	}
	 public void agregarObservador(Observador o) {
		 observadores.add(o);
	  }
	 public void eliminarObservador(Observador o) {
		 observadores.remove(o);
	  }
	public void notificarObservador() {
		for (Observador o:observadores) {
			o.actualizar();
	    }
	}
}