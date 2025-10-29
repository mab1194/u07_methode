public class Fahrzeug
{
   private int maximaleTankfuellung;
   private int aktuelleTankfuellung;
   private int verbrauchPro100Km;

   public void setMaximaleTankfuellung(int maximaleFuellung)
   {
      this.maximaleTankfuellung = maximaleFuellung;
   }

   public int getMaximaleTankfuellung()
   {
      return this.maximaleTankfuellung;
   }
   
   public int getAktuelleTankfuellung()
   {
      return this.aktuelleTankfuellung;
   }

   public void setVerbrauchPro100Km(int verbrauchPro100Km)
   {
      this.verbrauchPro100Km = verbrauchPro100Km;
   }

   public int getVerbrauchPro100Km()
   {
      return this.verbrauchPro100Km;
   }
   
   public void tankeLiter(int benzinMenge)
   {
      this.aktuelleTankfuellung = this.aktuelleTankfuellung + benzinMenge ;
   }
   
   public void fahreKm(int strecke)
   {
      double verbrauch = this.verbrauchPro100Km * (strecke/100.0);
      this.aktuelleTankfuellung =  this.aktuelleTankfuellung - (int)verbrauch;
   }

   public int restReichweitInKm()
   {
      double restReichweiteInKm = ((this.aktuelleTankfuellung / this.verbrauchPro100Km )* 100.0);
      return (int)restReichweiteInKm;
   }
   

}