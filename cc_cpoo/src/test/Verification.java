package test;

import java.util.Objects;

public final class Verification {
	public static void verifieEgalite(float f1, float f2) {
		if ( Math.abs(f1 - f2) >= 0.001f) erreur();
	}
	public static void verifieEgalite(String s1, String s2) {
		if ( ! Objects.equals(s1,s2)) erreur();
	}
	public static void verifieVrai(boolean b) {
		if (!b) erreur();
	}
	public static void verifieFaux(boolean b) {
		if (b) erreur();
	}
	public static void erreur() {
		System.out.println("Test KO");
	}
}
