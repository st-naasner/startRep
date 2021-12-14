package application;


public class Beispiel {
 Integer wert;
 String name;

 
 
 
 
 
 /**
 * @param wert
 * @param name
 */
public Beispiel(Integer wert, String name) {
	super();
	this.wert = wert;
	this.name = name;
}
/**
 * @return wert
 */
public Integer getWert() {
	return wert;
}
/**
 * @param wert das zu setzende Objekt wert
 */
public void setWert(Integer wert) {
	this.wert = wert;
}
/**
 * @return name
 */
public String getName() {
	return name;
}
/**
 * @param name das zu setzende Objekt name
 */
public void setName(String name) {
	this.name = name;
}
 

}
