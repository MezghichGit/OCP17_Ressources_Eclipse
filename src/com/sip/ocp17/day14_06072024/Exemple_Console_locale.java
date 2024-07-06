package com.sip.ocp17.day14_06072024;

import java.io.Console;
import java.util.Formatter;
import java.util.Locale;

public class Exemple_Console_locale {
	public static void main(String[] args) {
	//Console console = System.console();
	//console.writer().format(new Locale("fr", "CA"),"Hello World");
		
		 // Création d'une locale pour la France
        Locale locale = Locale.GERMANY;
        
        // Utilisation de Formatter avec la locale spécifiée
        try (Formatter formatter = new Formatter(System.out, locale)) {
            double nombre = 1234567.89;
            formatter.format("Le nombre formaté est : %,.2f", nombre);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
