import java.io.*;

public class Bank
{
   public static void main(String[] args) throws Exception
   {
      Konto konto1 = new Konto(00000001);
      Konto konto2 = new Konto(00000002);
   
      // Eingabe des Anwenders wird eingelesen
      InputStreamReader eingabeLeser      = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser  = new BufferedReader(eingabeLeser);


      
      boolean weitereAktionen = true;
      
      while(weitereAktionen == true)
      {
         System.out.print("\n");
         System.out.print("Wollen Sie eine Einzahlung oder eine Auszahlung vornehmen (ja/nein): ");
         String eingabe = gepufferterLeser.readLine();
         System.out.print("\n");
         
         if(eingabe.equals("ja"))
         {
            System.out.print("Was wollen Sie tun? (e einzahlen / a auszahlen): "); 
            eingabe = gepufferterLeser.readLine();
            System.out.print("\n");

            if (eingabe.equals("e"))
            {
            System.out.print("Bitte geben Sie einen Betrag an: ");
            eingabe = gepufferterLeser.readLine();
            System.out.print("\n");
            konto1.einzahlen(Integer.parseInt(eingabe));
            konto1.kontoauszugAnzeigen();
            }
            else if (eingabe.equals("a"))
            {
            System.out.print("Bitte geben Sie einen Betrag an: ");
            eingabe = gepufferterLeser.readLine();
            System.out.print("\n");
            konto1.abheben(Integer.parseInt(eingabe));
            konto1.kontoauszugAnzeigen(); 
            }
            else
            {
              System.out.print("Ungueltige Eingabe");
            }
         }
         if(eingabe.equals("nein"))
         {
            weitereAktionen = false;
         }
      }
      System.out.println("Vielen Dank , dass Sie die ABK-Bank besucht haben." + "\n" + "Wir wünschen Ihnen noch einen schönen Tag");
   }
}