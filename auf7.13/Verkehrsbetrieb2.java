// u07_operation
// auf7.13

public class Verkehrsbetrieb2
{
   public static void main(String[] args)
   {
      Fahrzeug fahrzeug1 = new Fahrzeug();
      
      fahrzeug1.setMaximaleTankfuellung(60);
      fahrzeug1.setVerbrauchPro100Km(6);
      
      fahrzeug1.tankeLiter(30);
      
      System.out.println("Tankfuellung: " + fahrzeug1.getAktuelleTankfuellung() + " Liter");
      System.out.println("Reichweite: "   + fahrzeug1.restReichweiteInKm()      + " km");
      
      System.out.println();
      fahrzeug1.tankeLiter(40);
      
      System.out.println("Tankfuellung: " + fahrzeug1.getAktuelleTankfuellung() + " Liter\n");
      
      fahrzeug1.fahreKm(200);
      
      System.out.println("Tankfuellung: " + fahrzeug1.getAktuelleTankfuellung() + " Liter");
      System.out.println("Reichweite: "   + fahrzeug1.restReichweiteInKm()      + " km");
      
      System.out.println();
      fahrzeug1.fahreKm(400);
      
      System.out.println("Tankfuellung: " + fahrzeug1.getAktuelleTankfuellung() + " Liter");
      System.out.println("Reichweite: "   + fahrzeug1.restReichweiteInKm()      + " km");
      
      System.out.println();
      fahrzeug1.fahreKm(100);
      
      System.out.println("Tankfuellung: " + fahrzeug1.getAktuelleTankfuellung() + " Liter");
      System.out.println("Reichweite: "   + fahrzeug1.restReichweiteInKm()      + " km");
   }
}