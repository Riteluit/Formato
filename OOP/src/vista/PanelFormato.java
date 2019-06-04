package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class PanelFormato extends JPanel implements ActionListener {

	private JRadioButton DocH, VenH;
	private ButtonGroup group;
	private Controlador ctrl;
	
	

	public PanelFormato(Controlador ctrl) {
		this.ctrl = ctrl;
		
		setSize(380, 100);
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Formato")));

		DocH = new JRadioButton("12 Horas", true);
		VenH = new JRadioButton("24 Horas");
		group = new ButtonGroup();

		DocH.setBounds(50, 40, 100, 30); // x,y,ancho,alto
		VenH.setBounds(210, 40, 100, 30);
		
		group.add(DocH);
		group.add(VenH);
		
		DocH.addActionListener(this);	//"Lea la instruccion"
		VenH.addActionListener(this);


		add(DocH);
		add(VenH);

	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equalsIgnoreCase(DocH.getText())) {
			ctrl.BotRaDocH();
			
		}else {
			if (e.getActionCommand().equalsIgnoreCase(VenH.getText())) {
				ctrl.BotRaVenH();
				
			}
		}

	}





	

}
