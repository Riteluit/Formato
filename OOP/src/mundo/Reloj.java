package mundo;

public class Reloj {

	private int NumHora, NumMin, NumSeg;

	private String M;

	public Reloj() {
		NumHora = 12;
		NumMin = 0;
		NumSeg = 0;
		M = "AM";

	}

	// Suma de Horas Min Seg Formato 12 Horas

	public int SumarHora() {
		if (getM() == "AM" || getM() == "PM") { // si es 12 Horas
			if (getNumHora() == 11 && getM() == "AM") {//Si el numero es 11 y la zona horaria es AM cambie la zona horaria a PM y sumele 1 al nuemro
				setM("PM");
				setNumHora(getNumHora() + 1);
			} else {
				if (getNumHora() == 11 && getM() == "PM") {//Si el numero es 11 y la zona horaria es PM cambie la zona horaria a AM y sumele 1 al nuemro
					setM("AM");
					setNumHora(getNumHora() + 1);
				} else {
					if (getNumHora() == 12) { //Si el numero es 12 cambie ese numero a 1
						setNumHora(1);
					} else {
						setNumHora(getNumHora() + 1); //Si no cumple las anteriores condicionales, sumele 1 al numero que esta.
					}
				}
			}
		} else {
			if (getM() == "") { // Si es 24 horas
				if (getNumHora() == 23) {	//Si el numero es 23 el sig numero cambielo a 0
					setNumHora(0);
				} else {
					setNumHora(getNumHora() + 1);	//Si no se cumple la anterior condicion, sumele 1 al numero
				}
			}
		}

		return getNumHora();
	}

	public int SumarMin() {			//Suma de los minutos
		if (getNumMin() == 59) { 	//Si el numero es 59 Cambiar a 0 
			setNumMin(0);
			SumarHora();
		} else {
			setNumMin(getNumMin() + 1); //Si el numero el diferente a 59 Sumele al numero 1
		}
		return getNumMin();
	}

	public int SumarSeg() {			//Suma de Segundos
		if (getNumSeg() == 59) {	//Si el numero es 59 Cambiar a 0 
			setNumSeg(0);
			SumarMin();
		} else {
			setNumSeg(getNumSeg() + 1);	//Si el numero el diferente a 59 Sumele al numero 1
		}
		return getNumSeg();
	}

	// convertidores
	public int ConVenH() {	//Convertidor de 12H a 24H
		if (getNumHora() == 12 && getM() == "PM") { //Si el numero es 12 y la zona horaria PM, Vacie la zona horaria y deje el 12 horas
			setM("");
			setNumHora(12);
		} else {
			if (getM() == "AM") {	//Si la zona horaria es AM, deje la zona horaria en blanco y deje el mismo numero que estaba
				setM("");
				if (getNumHora() == 12) {	//Si la zona horaria es AM y el numero es 12, cambielo a 0 horas
					setNumHora(0);
				}
			} else {
				if (getM() == "PM") {//Si la zona horaria es PM, dejen el blanco la zona horaria y al numero que esta, sumele 12
					setM("");
					setNumHora(getNumHora() + 12);
				}
			}
		}
		return getNumHora();
	}

	public int ConDocH() {	//Convertidor de 24 H a 12H
		if (getNumHora() == 0) {	//Si la Hora es 0 (24H) , entonces en formato 12 H coloque 12 horas y AM en el formato 
			setM("AM");
			setNumHora(12);

		} else {
			if (getNumHora() <= 12) {	//Si el numero es menor o igual a 12 
				
				//Se hace para que no coloque 24 en horas, el formato (24H), sino para que aparesca 12 PM  y 12 en formato (24H) 
				if (getNumHora() + 1 == 13) {	//Mire si el numero obtenido + 1es igual a 13 Hagalo formato PM sino hagalo formato AM
					setM("PM");
				} else {
					setM("AM");			
				}
			} else {
				if (getNumHora() > 12) { //Si el numero es mayor a 12, Coloquele de formato PM, y a ese numero resteel 12
					setM("PM");
					setNumHora(getNumHora() - 12);
				}
			}
		}
		return getNumHora();
	}
	
	//Setters and Getters
	public int getNumHora() {
		return NumHora;
	}

	public void setNumHora(int numHora) {
		NumHora = numHora;
	}

	public int getNumMin() {
		return NumMin;
	}

	public void setNumMin(int numMin) {
		NumMin = numMin;
	}

	public int getNumSeg() {
		return NumSeg;
	}

	public void setNumSeg(int numSeg) {
		NumSeg = numSeg;
	}

	public String getM() {
		return M;
	}

	public void setM(String m) {
		M = m;
	}

}
