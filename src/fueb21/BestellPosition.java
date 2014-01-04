/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fueb21;


public class BestellPosition {
	public String material;
	public String preis;
	public int anzahl;
	
	@Override
	public String toString() {
		return "Material: " + material + "\nPreis: " + preis + "\nAnzahl: " +anzahl;
	}
}

