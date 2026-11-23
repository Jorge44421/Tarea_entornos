package ejercicio2;

//Representa una carta de la baraja francesa.
 //Cada carta se define por su palo y su valor.
public class Card {

	// Palo de la carta (por ejemplo: "Spades", "Heart")
	public String suit;
	// Valor de la carta (por ejemplo: "Ace", "7", "King")
	public String value;
	
	 //Constructor: crea una carta con el palo y el valor indicados.
	 //@param suit  palo de la carta
	 //@param value valor de la carta
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	 //Sobrescribe el método toString() de Object para mostrar la carta
	 //en formato legible.
	 //@return texto con el formato "palo-valor", por ejemplo "Spades-Ace"
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
