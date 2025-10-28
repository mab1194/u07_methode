public class Auto
{
   private String autoNummer;
   private int kmStand;

   public void setAutoNummer(String autoNummer)
   {
      this.autoNummer = autoNummer;
   }

   public String getAutoNummer()
   {
      return this.autoNummer;
   }

   public void aktualisiereKmStand(int gefahreneKm)
   {
      this.kmStand = this.kmStand + gefahreneKm;
   }

   public int getKmStand()
   {
      return this.kmStand;
   }
}