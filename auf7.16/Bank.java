import java.io.*;

public class Bank
{
   public static void main(String[] args) throws Exception
   {
      Konto konto1 = new Konto(1);
      Konto konto2 = new Konto(2);
   
      // Eingabe des Anwenders wird eingelesen
      InputStreamReader eingabeLeser      = new InputStreamReader(System.in);
      BufferedReader    gepufferterLeser  = new BufferedReader(eingabeLeser);
      
      int kontoNr =0;  
      boolean weitereAktionen = true;
      boolean kontoExistiert  = false;
      
      while(weitereAktionen == true)
      {
         System.out.print("\n");
         System.out.print("Wollen Sie eine Einzahlung oder eine Auszahlung vornehmen (ja/nein): ");
         String eingabe = gepufferterLeser.readLine();
         System.out.print("\n");
         
         if(eingabe.equals("ja"))
         {
            kontoExistiert = false;
            while(kontoExistiert == false)
            {
               System.out.print("\n");
               System.out.print("Welches Konto wollen Sie benutzen?: ");
               eingabe = gepufferterLeser.readLine();
               System.out.print("\n");
               kontoNr = Integer.parseInt(eingabe);

               if (kontoNr == 1 || kontoNr == 2)
               {
                  kontoExistiert = true;         
               }
            
               if(kontoExistiert == false)
               { 
                  System.out.println("Dieses Konto existiert nicht");
               }
            }
            
            System.out.print("Was wollen Sie tun? (e einzahlen / a auszahlen): "); 
            eingabe = gepufferterLeser.readLine();
            System.out.print("\n");
         
            if (eingabe.equals("e"))
            {
               System.out.print("Bitte geben Sie einen Betrag an: ");
               eingabe = gepufferterLeser.readLine();
               System.out.print("\n");
               
               if(kontoNr == 1)
               {
                  konto1.einzahlen(Integer.parseInt(eingabe));
                  konto1.kontoauszugAnzeigen();
               }
               else if(kontoNr == 2)
               {
                  konto2.einzahlen(Integer.parseInt(eingabe));
                  konto2.kontoauszugAnzeigen();
               }
            }
            else if (eingabe.equals("a"))
            {
               System.out.print("Bitte geben Sie einen Betrag an: ");
               eingabe = gepufferterLeser.readLine();
               System.out.print("\n");

               if(kontoNr == 1)
               {
                  konto1.abheben(Integer.parseInt(eingabe));
                  konto1.kontoauszugAnzeigen();
               }
               else if(kontoNr == 2)
               {
                  konto2.abheben(Integer.parseInt(eingabe));
                  konto2.kontoauszugAnzeigen();
               }
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