package vista;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazApp extends JFrame {

	private PanelAjustes pnlAj;
	private PanelHora pnlHo;
	private PanelFormato pnlFor;
	private Controlador ctrl;

	public InterfazApp(Controlador ctrl) {
		this.ctrl = new Controlador();
		pnlAj = new PanelAjustes(ctrl);
		pnlHo = new PanelHora();
		pnlFor = new PanelFormato(ctrl);
		ctrl.conectar(pnlHo);

		// Pantalla Principal
		setSize(400, 350); // Tamano Del la pantalla
		setTitle("Ajuste de Hora"); // Titulo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Al cerrar terminar el programa
		setLayout(null);

		setResizable(false);
		setLocationRelativeTo(null);

		pnlHo.setBounds(5, 5, 382, 100);
		add(pnlHo);

		pnlAj.setBounds(5, 108, 382, 100);
		add(pnlAj);

		pnlFor.setBounds(5, 212, 382, 100);
		add(pnlFor);

		setVisible(true);
	}

	public static void main(String[] args) {
		InterfazApp main = new InterfazApp(new Controlador());
		main.setVisible(true);
	}
}
