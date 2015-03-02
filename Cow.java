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
  }
  {
    Color bodyColor = new Color(0, 0, 0);
    this.setBodyColor(bodyColor);
  }
  {
    this.setWidth(70);
    this.setHeight(60);
  }
  {
    this.getName();
    this.setName("Steve the Cow");
  }
  {
    this.getDistance(100,100);
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