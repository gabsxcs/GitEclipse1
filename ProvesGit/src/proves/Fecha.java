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
	
	public int compareTo(Fecha otraFecha) {
        if (this.año != otraFecha.año)
            return Integer.compare(this.año, otraFecha.año);
        if (this.mes != otraFecha.mes)
            return Integer.compare(this.mes, otraFecha.mes);
        return Integer.compare(this.dia, otraFecha.dia);
    }
}

