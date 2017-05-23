package Simulador.src;
public class ObservableBotones extends Observable {

	public ObservableBotones(PanelBotones Observador_panelBotones) {
		super();
		agregarObservador(Observador_panelBotones);
	}
}