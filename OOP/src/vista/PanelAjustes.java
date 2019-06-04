package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class PanelAjustes extends JLabel implements ActionListener {


	private JButton Horas, Minutos, Segundos;
	
	private Controlador ctrl;

	public PanelAjustes(Controlador ctrl) {
		this.ctrl = ctrl;
		// Crear Borde
		setSize(380, 100);
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Ajustes")));

		Horas = new JButton("H");
		Minutos = new JButton("M");
		Segundos = new JButton("S");

		Horas.setBounds(10, 30, 100, 40);
		Horas.addActionListener(this);

		Minutos.setBounds(140, 30, 100, 40);// x,y,ancho,alto
		Minutos.addActionListener(this);

		Segundos.setBounds(270, 30, 100, 40);
		Segundos.addActionListener(this);

		add(Horas);
		add(Minutos);
		add(Segundos);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
			if (e.getActionCommand().equalsIgnoreCase(Horas.getText())) {		
				ctrl.BottHora();
			} else {
				if (e.getActionCommand().equalsIgnoreCase(Minutos.getText())) {
					ctrl.BottMinu();
				} else {
					if (e.getActionCommand().equalsIgnoreCase(Segundos.getText())) {
						ctrl.BottSegu();
					}
				}
			}
		}
	
	}

