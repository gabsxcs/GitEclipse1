package proves;

public class Fecha {

int dia, mes, año;
	
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
		
	@Override
	public String toString() {
	String resultat = String.format("%2d/%2d/%2d", dia, mes, año );
	return resultat;
	}
}
