package Simulador.src;
import Monitorizacion.src.Monitorizacion;
import ControlVelocidad.src.ControlVelocidad;
import javax.swing.*;

@SuppressWarnings("serial")
public class Interfaz extends JApplet {
	JLabel etiquetaVelAuto, etiquetaEstado;
	Simulacion simulacion;
	Monitorizacion monitor;
	ControlVelocidad control;
	public void init(){
		this.setSize(800,600);
	}
	public Interfaz(){
		PanelEtiquetas panelE = new PanelEtiquetas(this);
		PanelBotones panelB = new PanelBotones(this);
		simulacion =new Simulacion(panelE,panelB);
		control = new ControlVelocidad();
		monitor = new Monitorizacion(control.eje);		
		panelE.aniadirComponentes(monitor, control);
		panelB.aniadirComponentes(monitor, control);
		simulacion.start();			
		control.start();
		monitor.start();
		add(panelB);		
		add(panelE);
		setVisible(true);
		destroy();
	}
}