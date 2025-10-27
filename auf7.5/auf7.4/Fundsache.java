public class Fundsache
{
   private String bezeichnung;
   private String fundort;
   private double wert;
   
   public void setBezeichnung(String fundsacheBezeichnung)
   {
      bezeichnung = fundsacheBezeichnung;
   }
   
   public void setFundort(String fundsacheFundort)
   {
      fundort = fundsacheFundort;
   }

   public void setWert(double fundsacheWert)
   {
      wert = fundsacheWert;
   }
   
   public String getBezeichnung()
   {
      return bezeichnung;
   }

   public String getFundort()
   {
      return fundort;
   }
   
   public double getWert()
   {
      return wert;
   }
}