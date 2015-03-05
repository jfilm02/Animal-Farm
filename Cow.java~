import java.awt.Color;
public class Cow extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Cow(World wref)
  {
    super(wref);
    Color shellColor = new Color(220, 220, 220);
    this.setShellColor(shellColor);
    Color bodyColor = new Color(0, 0, 0);
    this.setBodyColor(bodyColor);
    this.setWidth(70);
    this.setHeight(60);
    this.setName("Steve the Cow");
    this.getDistance(100,100);
  }
  
  public void animateForward()
  {
    for(int i = 0; i< 20; i++)
    {
      this.forward(10);
      try
      {
        Thread.sleep(200);
      } catch (InterruptedException ex) { }
    }
  }
  public void animateTurn()
  {
    for(int i = 0; i< 9; i++)
    {
      this.turn(90);
      try
      {
        Thread.sleep(150);
      } catch (InterruptedException ex) { }
    }
  }
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Cow(int x, int y, World wref)
  {
    super(x, y, wref);
  }
}