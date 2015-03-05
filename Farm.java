public class Farm
{
 public static void main(String[] a)
 {
   World ref=new World();
   Cow steveyboy=new Cow(ref);
   steveyboy.animateTurnright();
   steveyboy.animateForward();
   steveyboy.animateForward();
   steveyboy.animateTurnright();
   steveyboy.animateForward();
   steveyboy.animateForward();
   steveyboy.animateTurnright();
   steveyboy.animateForward();
   steveyboy.animateForward();
   steveyboy.animateForward();
   steveyboy.animateForward();
   steveyboy.animateTurnright();
   steveyboy.animateForward();
   steveyboy.animateForward();
   steveyboy.animateForward();
   steveyboy.animateForward();
   steveyboy.turn(135);
   steveyboy.animateForward();
   steveyboy.animateForward();
   steveyboy.animateForward();
   steveyboy.animateForward();
   steveyboy.animateForward();
   Pikachu pik = new Pikachu(ref);
   pik.forward(100);
   pik.turn(90);
   pik.forward(50);
   Pup mac = new Pup(ref);
   mac.forward(100);
  }
}