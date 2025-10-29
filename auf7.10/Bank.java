public class Bank
{
   public static void main(String[] args)
   {
      Konto konto1 = new Konto();
      Konto konto2 = new Konto();

      konto1.setKontoNr(00000001);
      konto2.setKontoNr(00000002);

      konto1.einzahlen(2000);
      konto1.kontoauszugAnzeigen();
      konto1.abheben(1000);
      konto1.kontoauszugAnzeigen();

      konto2.einzahlen(3000);
      konto2.kontoauszugAnzeigen();
      konto2.abheben(1500);
      konto2.kontoauszugAnzeigen();
   }
}