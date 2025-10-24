public class Rechner
{
   public int hochDrei(int zahl)
   {
      zahl = zahl * zahl * zahl;
      
      return zahl;     
   }
   public int potenziere(int basis, int exponent)
   {
      int ergebnis = 0;
      
      if(exponent == 0)
      {
         ergebnis = 1;
             
      }
      else if(exponent == 1)
      {
         ergebnis = basis;
      
      }
      else if (exponent >= 2)
      {  
         ergebnis = basis;

         for (int i = 2; i <= exponent; i++)
         {  
            
            ergebnis = ergebnis * basis;
         }
         
      }
      
      return ergebnis;
   }
}