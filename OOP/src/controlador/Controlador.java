
package controlador;

import vista.*;
import mundo.Reloj;

public class Controlador {
	private Reloj Rlj;
	private PanelHora pnlHor;

	public Controlador() {
		Rlj = new Reloj();
	}

	public void BottHora() {	//Se configura al darle clic al boton Hora "H"

		pnlHor.lblHora(Rlj.SumarHora());
		pnlHor.lblMin(Rlj.getNumMin());
		pnlHor.lblSeg(Rlj.getNumSeg());
		pnlHor.lblForm(Rlj.getM());

	}

	public void BottMinu() {	//Se configura al darle clic al boton Minuto "M"

		pnlHor.lblMin(Rlj.SumarMin());
		pnlHor.lblHora(Rlj.getNumHora());
		pnlHor.lblSeg(Rlj.getNumSeg());
		pnlHor.lblForm(Rlj.getM());
	}

	public void BottSegu() {	//Se configura al darle clic al boton Segundo "S"

		pnlHor.lblSeg(Rlj.SumarSeg());
		pnlHor.lblHora(Rlj.getNumHora());
		pnlHor.lblMin(Rlj.getNumMin());
		pnlHor.lblForm(Rlj.getM());
	}

	public void BotRaDocH() {	//Convertidor a 12 H
		Rlj.ConDocH();
		pnlHor.lblHora(Rlj.getNumHora());
		pnlHor.lblForm(Rlj.getM());
	}

	public void BotRaVenH() {	//Convertidor a 24 H
		Rlj.ConVenH();
		pnlHor.lblHoraVenH(Rlj.getNumHora());
		pnlHor.lblForm(Rlj.getM());
	}

	public void conectar(PanelHora pnlHor) {
		this.pnlHor = pnlHor;
	}

}
