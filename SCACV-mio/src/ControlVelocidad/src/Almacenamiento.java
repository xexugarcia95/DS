package ControlVelocidad.src;
public class Almacenamiento {
	private int velocidad;
	private double distancia;
	private int _seleccionada;
	protected Almacenamiento() {
		velocidad = 0;
		distancia = 0.0;
		_seleccionada = 0;
	}
	synchronized protected void almacenarVelocidad(int aInt_velActual) {
		velocidad=aInt_velActual;
		almacenarDistancia();
	}
	synchronized protected int leerVelocidad() {
		return velocidad;	
	}
	synchronized protected void almacenarDistancia() {
		if(velocidad*0.25 > 1){
			distancia += (velocidad*0.25)/(3600); 
		}		
	}
	synchronized protected double leerDistancia() {
		return distancia;	
	}
	synchronized protected void almacenarVelSeleccionada() {
		_seleccionada = velocidad;
	}
	synchronized protected int leerVelSeleccionada() {
		return _seleccionada;
	}
}