public class Farm
{
 public static void main(String[] a)
 {
   World ref=new World();
   Cow steveyboy=new Cow(ref);
   steveyboy.animateTurnaround();
   steveyboy.animateForward();
   steveyboy.animateTurnright();
   steveyboy.animateForward();
   steveyboy.animateTurnleft();
   Pikachu pik = new Pikachu(ref);
   pik.forward(100);
   pik.turn(90);
   pik.forward(50);
   Pup mac = new Pup(ref);
   mac.forward(100);
   mac.turn(-90);
   mac.forward(100);
  }
}