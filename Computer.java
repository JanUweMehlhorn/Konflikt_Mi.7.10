public class Computer
{
   private String hersteller;
   private boolean laptop;
   private int prozessoren;
   private int hauptspeicher;

   public Computer()
   {
      setHersteller("Lenovo");
      setLaptop(true);
      setHauptspeicher(4000000);
   }

   public Computer(String hersteller, boolean laptop, int hauptspeicher)
   {
      setHersteller(hersteller);
      setLaptop(laptop);
      setHauptspeicher(hauptspeicher);
   }

   public void setHersteller(String hersteller)
   {
      this.hersteller = hersteller;
   }

   public void setLaptop(boolean laptop)
   {
      this.laptop = laptop;
   }

   public void setHauptspeicher(int hauptspeicher)
   {
      this.hauptspeicher = hauptspeicher;
   }

   public String getHersteller()
   {
      return hersteller;
   }

   public boolean getLaptop()
   {
      return laptop;
   }

   public int getHauptspeicher()
   {
      return hauptspeicher;
   }

   public void printComputer()
   {
       System.out.println("Computer:\t" + hersteller + "\t" + laptop + "\t" + hauptspeicher);
   }
}
