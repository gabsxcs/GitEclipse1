package proves;

import java.util.Scanner;

public class FechaMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entra la primera fecha : ");
		System.out.printf("Día: ");
		int dia= Integer.parseInt(entrada.nextLine());
		System.out.printf("\nMes: ");
		int mes = Integer.parseInt(entrada.nextLine());
		System.out.printf("\nAño: ");
		int año = Integer.parseInt(entrada.nextLine());
		
		
		
		
		Fecha primera = new Fecha(dia, mes, año);
		
		System.out.println("Entra la segunda fecha : ");
		System.out.printf("Día: ");
		dia= Integer.parseInt(entrada.nextLine());
		System.out.printf("\nMes: ");
		mes = Integer.parseInt(entrada.nextLine());
		System.out.printf("\nAño: ");
		año = Integer.parseInt(entrada.nextLine());
		
		
		
		Fecha segunda = new Fecha(dia,mes,año);
		System.out.print("La data menor es ");
		
		if (primera.año < segunda.año)
			System.out.println(primera);
		else if (primera.año > segunda.año)
			System.out.println(segunda);
		else if(primera.mes < segunda.mes)
			System.out.println(primera);
		else if(primera.mes > segunda.año)
			System.out.println(segunda);
		else if(primera.dia < segunda.dia)
			System.out.println(primera);
		else if(primera.dia > segunda.dia)
			System.out.println(segunda);
		
	
		
		entrada.close();
	}

}
