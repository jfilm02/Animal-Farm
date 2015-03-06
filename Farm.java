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
   pik.turn(90);
   pik.forward(180);
   pik.turn(-90);
   pik.forward(90);
   pik.turn(-90);
   pik.forward(80);
   pik.turn(90);
   pik.forward(5);
   pik.turn(-90);
   pik.forward(200);
   pik.turn(90);
   pik.forward(10);
   pik.turn(90);
   pik.forward(200);
   pik.turn(270);
   pik.forward(5);
   pik.turn(90);
   pik.forward(80);
   pik.turn(90);
   pik.forward(20);
   pik.turn(90);
   pik.forward(80);
   pik.turn(90);
   pik.forward(20);
   pik.turn(90);
   pik.forward(80);
   pik.turn(90);
   pik.forward(5);
   pik.turn(-90);
   pik.forward(200);
   pik.turn(90);
   pik.forward(10);
   pik.turn(90);
   pik.forward(160);
   pik.turn(90);
   pik.forward(100);
   
   Pup mac = new Pup(ref);
   mac.forward(100);
   mac.turn(-90);
   mac.forward(100);
  }
}