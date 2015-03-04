public class Farm
{
 public static void main(String[] a)
 {
   World ref=new World();
   Cow steveyboy=new Cow(ref);
   steveyboy.backward(100);
   steveyboy.turn(-90);
   steveyboy.forward(10);
   steveyboy.animateForward();
   steveyboy.animateTurn();
   Pikachu pik = new Pikachu(ref);
   pik.forward(100);
   Pup mac = new Pup(ref);
   mac.forward(100);
  }
}