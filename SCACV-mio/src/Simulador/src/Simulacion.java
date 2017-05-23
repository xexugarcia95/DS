package Simulador.src;
public class Simulacion extends Thread {
	private final int INTERVALO = 100;
	private ObservablePantalla observableEtiquetas;
	private ObservableBotones observableBotones; //etc., etc.
	public Simulacion(PanelEtiquetas panelE, PanelBotones panelB){
		observableEtiquetas = new ObservablePantalla(panelE);
		observableBotones = new ObservableBotones(panelB);
	}
	public void run() {
		while(true){
			try{ 
				sleep(INTERVALO);
			}catch(java.lang.InterruptedException e){e.printStackTrace();}
			observableEtiquetas.notificarObservador();
			observableBotones.notificarObservador();
		}
	}
}