import java.io.*;

public class Autoverleih
{
   public static void main(String[] args) throws Exception
   {
      Auto auto1 = new Auto();
      
     auto1.setAutoNummer("HH-MB-194");
      
     InputStreamReader eingabeLeser      = new InputStreamReader(System.in);
     BufferedReader    gepufferterLeser  = new BufferedReader(eingabeLeser);

     System.out.println("Bitte geben Sie die gefahrenen Km ein:"); 

     String eingabe  = gepufferterLeser.readLine();
     int gefahreneKm = Integer.parseInt(eingabe);

     auto1.aktualisiereKmStand(gefahreneKm);
     System.out.println("");
     System.out.println("Der neue Km-Stand ist: " + "\n" + auto1.getKmStand() + " Kilometer");
     System.out.println("");

     System.out.println("Bitte geben Sie die gefahrenen Km ein:");
     eingabe  = gepufferterLeser.readLine();
     gefahreneKm = Integer.parseInt(eingabe);

     auto1.aktualisiereKmStand(gefahreneKm);
     System.out.println("");
     System.out.println("Der neue Km-Stand ist: " + "\n" + auto1.getKmStand() + " Kilometer");
     System.out.println("");

     System.out.println("Bitte geben Sie die gefahrenen Km ein:");
     eingabe  = gepufferterLeser.readLine();
     gefahreneKm = Integer.parseInt(eingabe);

     auto1.aktualisiereKmStand(gefahreneKm);
     System.out.println("");
     System.out.println("Der neue Km-Stand ist: " + "\n" + auto1.getKmStand() + " Kilometer");
     System.out.println("");


   }
}