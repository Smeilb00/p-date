package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today,tomorrow;
		today = new Date(03, 11, 2019);
		tomorrow = new Date(04, 11, 2019);
		
		System.out.println("Comprobaremos que todos los metodos funcionan apropiadamente: ");
		
		System.out.println("Primero los getters");
		System.out.println("Dia: "+today.getDay()+ " Mes: "+ today.getMonth() + " ("+
		today.getMonthName()+") Anio: "+ today.getYear());
		
		System.out.println("Comprobamos los metodos Comparadores entre el 03/11/2019 y el 04/11/2019: ");
		System.out.println("Primero el isSame que comprueba toda la fecha: ");
		System.out.println(today.isSame(tomorrow));
		System.out.println("Ahora el dia: ");
		System.out.println(today.isSameDay(tomorrow));
		System.out.println("El mes: ");
		System.out.println(today.isSameMonth(tomorrow));
		System.out.println("El anio: ");
		System.out.println(today.isSameYear(tomorrow));
		
		System.out.println("Con el siguiente metodo comprobamos que el dia este dentro de las posibilidades del mes: ");
		System.out.println(today.isDayOfMonthRight());
		
		System.out.println("La estacion: ");
		System.out.println(today.seasonOfTheMonth());
		
		System.out.println("Los meses que quedan hasta que acabe el anio: ");
		System.out.println(today.monthsLeft());
		
		System.out.println("Numero de dias del mes: ");
		System.out.println(today.numDays(today.getMonth()));
		
		System.out.println("El siguiente te devuelve la fecha de todos los dias que quedan del mes: ");
		System.out.println(today.daysOfTheMonthLeft());
		
		System.out.println("Este muestra un String de todos los meses con el mismo numero de dias: ");
		System.out.println(today.monthsWithSameDays());
		
		System.out.println("Vemos los dias que han pasado desde el dia 1 de Enero de este anio");
		System.out.println(today.numDaysFrom11(today));
		//System.out.println("Comprobamos el numero de intentos necesarios");
		//System.out.println(today.numAttempsRand());
		//Lo dejo comentado porque tarda mucho en encontrar una solucion 
		System.out.println("Vemos el dia de la semana sabiendo que el 1 de Enero fue Martes");
		System.out.println(today.dayOfWeek());
	}

}

