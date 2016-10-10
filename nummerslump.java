import javax.swing.*;
import java.io.*; 
import java.util.*;
public class nummerslump {
	public static void main(String[] args) {
		int slump = (int) (Math.random() * 100); //för att RNG:a fram ett tal
		System.out.println ("gissa ett nummer mellan 0 och 100");

		Scanner sc = new Scanner (System.in); //för att kunna "absorbera/ta in" det användaren skriver 

		int gissat = sc.nextInt ();

		if (gissat == slump) {
			System.out.println("Du gissade rätt!");
		} 
		else { 
			if (gissat > 100) {
				System.out.println ("Ditt tal var över 100, det får max vara 100!"); //om användaren inte följer reglerna :^)
			}
			else if (gissat > slump) {
				System.out.println("Du gissade " + gissat + ", det var för högt!");  //om talet är större än slump
				System.out.println("Rätt nummer var " + slump); 
			} 
			else if (gissat < slump) {
				System.out.println("Du gissade " + gissat + ", det var för lågt");  //om talet är mindre än slump
				System.out.println("Rätt nummer var " + slump);
			}

		} //slut på "gisskoden"

	}


}