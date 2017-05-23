package ControlVelocidad.src;
public class Reloj extends Thread {
	private final int INTERVALO = 250;
	private ControlVelocidad control;
	public Reloj(ControlVelocidad ControlVelocidad_c) {
		this.control = ControlVelocidad_c;
	}
	public void run() {
		while(true){
			try{ 
				sleep(INTERVALO);
			}catch(java.lang.InterruptedException e){e.printStackTrace();}	
			control.controlarEstado();
		}
	}
}