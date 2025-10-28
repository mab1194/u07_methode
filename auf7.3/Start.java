import java.io.*;

public class Start
{
   public static void main(String[] args) throws Exception
   {
      // Eingabe des Anwenders wird eingelesen
      InputStreamReader eingabeLeser      = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser  = new BufferedReader(eingabeLeser);

      System.out.println("Bitte geben Sie die Basis ein:"); 

      String eingabe = gepufferterLeser.readLine();
      int basis      = Integer.parseInt(eingabe);
     
      System.out.println("Bitte geben Sie den Exponenten ein:");

      eingabe = gepufferterLeser.readLine();
      int exponent             = Integer.parseInt(eingabe);

      // Ein neues Objekt der Klasse rechner wird erzeugt
      Rechner rechner = new Rechner();

      // Die Potenz wird mittels der Methode potenziere berechnet
      int potenz = rechner.potenziere(basis, exponent);

      // Die berechnete Potenz wird ausgegeben
      System.out.println(potenz);
       
      
   }
}