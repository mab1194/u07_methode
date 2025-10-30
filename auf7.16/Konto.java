public class Konto
{
   private int kontoNr;
   private int kontostand;

   public Konto(int kontoNr)
   {
      this.kontoNr = kontoNr; 
   }

   public int getKontoNr()
   {
      return this.kontoNr;
   }

   public int getKontostand()
   {
      return this.kontostand;
   }

   public void einzahlen(int betrag)
   {
      this.kontostand = this.kontostand + betrag;
   }

   public void abheben(int betrag)
   {
      this.kontostand = this.kontostand - betrag;
   }

   public void kontoauszugAnzeigen()
   {
      System.out.println("Kontoauszug KontoNr " + this.kontoNr + "  Kontostand: " + this.kontostand + " Euro" );
   }
}