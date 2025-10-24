import java.io.*;

public class Start
{
   public static void main(String[] args) throws Exception
   {
      // Eingabe des Anwenders wird eingelesen
      InputStreamReader eingabeLeser      = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser  = new BufferedReader(eingabeLeser);

      System.out.println("Welche Zahl wollen sie mit 3 potenzieren?");

      String eingabe = gepufferterLeser.readLine();
      int a              = Integer.parseInt(eingabe);
     
      // Ein neues Objekt der Klasse rechner wird erzeugt
      Rechner rechner = new Rechner();

      // Die Kubikzahl wird mittels der Methode hochDrei berechnet
      int kubikzahl = rechner.hochDrei(a);

      // Die berechnete Kubikzahl wird ausgegeben
      System.out.println(kubikzahl);
       
      
   }
}