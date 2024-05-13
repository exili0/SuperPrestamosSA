package SuperPrestamosSA;

import java.awt.Container;

public class VistaImp implements Vista {

	private Modelo modelo;
	private Controlador controlador;
	
	public VistaImp() {
		super();
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
		
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
		
	}

	public Container getContenedor() {
		
		return null;
	}
}
