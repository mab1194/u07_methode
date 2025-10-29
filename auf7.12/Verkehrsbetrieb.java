// u07_operation
// auf7.12

public class Verkehrsbetrieb
{
   public static void main(String[] args)
   {
      Fahrzeug fahrzeug1 = new Fahrzeug();
      
      fahrzeug1.setMaximaleTankfuellung(60);
      fahrzeug1.setVerbrauchPro100Km(6);
      
      fahrzeug1.tankeLiter(30);
      
      System.out.println("Tankfuellung: " + fahrzeug1.getAktuelleTankfuellung() + " Liter");

      fahrzeug1.fahreKm(200);

      System.out.println("Tankfuellung: " + fahrzeug1.getAktuelleTankfuellung() + " Liter");

      System.out.println("Reichweite: " + fahrzeug1.restReichweitInKm() + " km");
   
   }
}