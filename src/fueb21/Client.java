/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fueb21;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {
	
	public static void schreibeNachricht( Socket s, String msg) throws Exception {
		PrintWriter printWriter =
	            new PrintWriter(
	                new OutputStreamWriter(
	                    s.getOutputStream()));
	        printWriter.print(msg);
	        printWriter.flush();
	}
	
	public static void verbindeUndSchreibeNachricht(String msg) throws Exception {
		//Implementieren Sie den Verbindungsaufbau hier. Senden Sie die Informationen mit Hilfe der Methode "schreibeNachricht"
		
	}
	
	public static String marshall( BestellPosition bp) {
		//Implementieren Sie eine geeignete Serialisierung (Marshalling) der Objekte der Klasse BestellPosition
	}
	
	public static void sendeBestellung(BestellPosition bp) throws Exception {
		String msg = marshall(bp);
		verbindeUndSchreibeNachricht(msg);	
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println("Client");
		
		BestellPosition bp = new BestellPosition();
		
		bp.material = "Stuhl";
		bp.preis = "302.91";
		bp.anzahl = 5;
		
		sendeBestellung(bp);
		
	}
}