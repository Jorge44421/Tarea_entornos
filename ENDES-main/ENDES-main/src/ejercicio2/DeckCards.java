package ejercicio2;

import java.util.ArrayList;

//Simula una baraja de 52 cartas: la crea, la baraja y reparte 5 cartas.
public class DeckCards {

	public static void main(String[] args) {

		// Los 4 palos de la baraja
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		// Los 13 valores posibles de cada palo
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		// Lista dinámica donde se guardarán las cartas
		ArrayList<Card> deck = new ArrayList<Card>();

		// 1) CREAR LA BARAJA: combina cada palo con cada valor (4 x 13 = 52 cartas)
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card); // añade la carta al final de la lista
			}
		}

		// 2) BARAJAR: intercambia cada carta con otra de posición aleatoria
		for (int i = 0; i < deck.size(); i++) {
			// Posición aleatoria entre 0 e i-1 (Math.random() devuelve un valor en [0, 1))
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);   // guarda temporalmente la carta de la posición i
			deck.set(i, deck.get(j)); // coloca en i la carta de la posición j
			deck.set(j, tmp);         // coloca en j la carta guardada
		}

		// 3) REPARTIR: muestra por consola las 5 primeras cartas de la baraja
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i)); // llama internamente a Card.toString()
		}

	}

}
