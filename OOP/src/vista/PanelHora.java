package vista;

import java.awt.Font;

import javax.swing.JLabel;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelHora extends JLabel {

	private JLabel Hor, Min, Seg, Form;

	private JLabel Hora, Minu, Segu;

	private int HorNum = 12, MinNum = 0, SegNum = 0;
	
	private String M= "AM" ;

	public PanelHora() {
		// Crear Borde

		setSize(380, 100);
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Hora")));

		Hor = new JLabel("Hora");
		Hor.setBounds(20, 20, 35, 15);// x,y,ancho,alto
		Hor.setFont(new Font(null, Font.ITALIC, 14));

		Hora = new JLabel(getHorNum() + "");
		Hora.setBounds(20, 60, 35, 15);// x,y,ancho,alto
		Hora.setFont(new Font(null, Font.ITALIC, 20));

		Min = new JLabel("Minutos");
		Min.setBounds(150, 20, 50, 15);// x,y,ancho,alto
		Min.setFont(new Font(null, Font.ITALIC, 14));

		Minu = new JLabel(getMinNum() + "");
		Minu.setBounds(150, 60, 50, 15);// x,y,ancho,alto
		Minu.setFont(new Font(null, Font.ITALIC, 20));

		Seg = new JLabel("Segundos");
		Seg.setBounds(250, 20, 70, 20);// x,y,ancho,alto
		Seg.setFont(new Font(null, Font.ITALIC, 14));

		Segu = new JLabel(getSegNum() + "");
		Segu.setBounds(250, 60, 70, 20);// x,y,ancho,alto
		Segu.setFont(new Font(null, Font.ITALIC, 20));
		
		Form = new JLabel(getM() +"");
		Form.setBounds(330,60,70,20);
		Form.setFont(new Font(null, Font.ITALIC,20));
		
		add(Hor);
		add(Min);
		add(Seg);
		add(Form);

		add(Hora);
		add(Minu);
		add(Segu);
	}
	
	//Getter and Setters 
	
	public int getHorNum() {
		return HorNum;
	}

	public void setHorNum(int horNum) {
		HorNum = horNum;
	}

	public int getMinNum() {
		return MinNum;
	}

	public void setMinNum(int minNum) {
		MinNum = minNum;
	}

	public int getSegNum() {
		return SegNum;
	}

	public void setSegNum(int segNum) {
		SegNum = segNum;
	}

	public String getM() {
		return M;
	}

	public void setM(String m) {
		M = m;
	}
	
	//Coger los valores que se obtienen en Controlador y actualizar el JLabel
	
	public void lblHora(int a) {
		setHorNum(a);
		Hora.setText(getHorNum()+"");
	}
	
	public void lblForm(String a) {
		setM(a);
		Form.setText(getM());
	}
	
	public void lblMin(int a) {
		setMinNum(a);
		Minu.setText(getMinNum()+"");
	}
	
	public void lblSeg(int a) {
		setSegNum(a);
		Segu.setText(getSegNum()+"");
	}
	
	public void lblHoraVenH(int a) {
		setHorNum(a);
		Hora.setText(getHorNum()+"");
	}
	
	public void lblFormVenH(String a) {
		setM(a);
		Form.setText(getM());
	}
	
	public void lblMinVenH(int a) {
		setMinNum(a);
		Minu.setText(getMinNum()+"");
	}
	
	public void lblSegVenH(int a) {
		setSegNum(a);
		Segu.setText(getSegNum()+"");
	}
	


}
