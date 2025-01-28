public class Metodos{
	
	int dia;
	String mes=" ";
	int anyo;
	
public Metodos(int dia, String mes, int anyo){
	this.dia=dia;
	this.mes=mes;
	this.anyo=anyo;
}
public int getDia(){
	return dia;
}
public void setDia (int dia){
	this.dia=dia;
}
public String getMes(){
	return mes;
}
public void setMes (String mes){
	this.mes=mes;
}	
public int getAnyo(){
	return anyo;
}
public void setAnyo (int anyo){
	this.anyo=anyo;
}
public boolean esMayor(){
	return (anyo<=2004);
}
public String toString (){
	return "el dia " + dia + " del mes " + mes + " del año " + anyo;
}

	
	
}