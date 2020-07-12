package libro.cap02.fechas;

public class Fecha 
{
	private int dia;
	private int mes;
	private int anio;
	//retorna la fecha expresada en dias
	private int fechaToDias()
	{
		return anio*360+mes*30+dia;
	}
	
	//asigna la fecha expressada en dias a los atributos
	private void diasToFecha(int i)
	{
		//divido por 360 y obtengo el anio
		anio = (int) i / 360;
		//del resto de la division anterior puedo obtener el mes y el dia
		int resto = i % 360;
		//el mes es el resto dividido 30
		mes = (int) resto/30;
		//su resto son los dias
		dia = resto % 30;
		
		//si el dia y mes queda en cero
		if (dia == 0)
		{
			dia=30;
			mes--;
		}
		if (mes == 0)
		{
			mes=12;
			anio--;
		}
	}
	
	public void addDias(int d)
	{
		//convierto la fecha a dias y le sumo d
		int sum = fechaToDias()+d;
		//la fecha resultante (sum) la separo en dia,mes y anio
		diasToFecha(sum);
	}
	
	
	
	
	
	//constructor string. Busco ocurrencias de /
	public Fecha (String s) {
		int pos1 = s.indexOf('/');
		int pos2 = s.lastIndexOf('/');
	//proceso las fechas
		String sDia = s.substring(0,pos1);
		dia = Integer.parseInt(sDia);
		String sMes = s.substring (pos1+1,pos2);
		mes = Integer.parseInt(sMes);
		String sAnio = s.substring(pos2+1);
		anio = Integer.parseInt(sAnio);
		
	}
	
	
	
	//constructor
	public Fecha(int d, int m, int a) {
		dia = d;
		mes = m;
		anio = a;
	}
	
	//contructor sin argumentos
	public Fecha() {
		
	}
	
	//sobreescribo equals
	public boolean equals(Object o)
	{
		Fecha otra = (Fecha)o;
		return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
	}
	
	
	//sobreescribo toString
	public String toString()
	{
		return dia+"/"+mes+"/"+anio;
	}
	
	//setters and getters
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}

	
	
	
	
}


