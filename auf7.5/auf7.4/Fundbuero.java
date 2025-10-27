public class Fundbuero
{
   public static void main(String[] args)
   {
      // Erstellen des Fundsache Objekts
      Fundsache fundsache1 = new Fundsache();
      Fundsache fundsache2 = new Fundsache();
      Fundsache fundsache3 = new Fundsache();
   
      // Zuweisung der Bezeichnung
      fundsache1.setBezeichnung("Handy");
      fundsache2.setBezeichnung("Portemonaie");
      fundsache3.setBezeichnung("Koffer");
      
      // Zuweisung eines Fundortes
      fundsache1.setFundort("Hauptbahnhof Hamburg");
      fundsache2.setFundort("Hammer Steindamm 42");
      fundsache3.setFundort("Hamburg Airport");

      // Zuweisung vom Wert
      fundsache1.setWert(500.00);
      fundsache2.setWert(200.00);
      fundsache3.setWert(300.00);


      // Ausgabe der Fundsachen      
      System.out.println("");
      System.out.println("Die Fundsache: " + fundsache1.getBezeichnung() + " wurde hier gefunden: " + fundsache1.getFundort() + "." + "\n"
      + "Der Wert der Fundsache beträgt: " + fundsache1.getWert() + " Euro");

      System.out.println("");
      System.out.println("Die Fundsache: " + fundsache2.getBezeichnung() + " wurde hier gefunden: " + fundsache2.getFundort() + "." + "\n"
      + "Der Wert der Fundsache beträgt: " + fundsache2.getWert() + " Euro");

      System.out.println("");
      System.out.println("Die Fundsache: " + fundsache3.getBezeichnung() + " wurde hier gefunden: " + fundsache3.getFundort() + "." + "\n"
      + "Der Wert der Fundsache beträgt: " + fundsache3.getWert() + " Euro");
    
      double maxWert          = 0;
      String maxFundort       = "";
      String maxBezeichnung   = "";

      if (fundsache1.getWert() > maxWert)
      {
         maxWert        = fundsache1.getWert();
         maxFundort     = fundsache1.getFundort();
         maxBezeichnung = fundsache1.getBezeichnung();
      }
      else if (fundsache2.getWert() > maxWert)
      {
         maxWert        = fundsache2.getWert();
         maxFundort     = fundsache2.getFundort();
         maxBezeichnung = fundsache2.getBezeichnung();
      }
      else if (fundsache3.getWert() > maxWert)
      {
         maxWert        = fundsache3.getWert();
         maxFundort     = fundsache3.getFundort();
         maxBezeichnung = fundsache3.getBezeichnung();
      }                     
      
      System.out.println("");
      System.out.println("Die wertvollste Fundsache : " + maxBezeichnung + " wurde hier gefunden " + maxFundort + "." + "\n"
       + "Der Wert der Fundsache beträgt: " + maxWert + " Euro" );
      System.out.println("");
      
   }
}