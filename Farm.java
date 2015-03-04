public class Farm
{
  public static void main(String[] a)
  {
    World wref = new World();
    Pikachu pik = new Pikachu(wref);
    
    pik.forward(100);
  }
}