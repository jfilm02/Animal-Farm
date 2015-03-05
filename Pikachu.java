import java.awt.Color; //needed for color to work

public class Pikachu extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Pikachu(World wref)
  {
    super(wref);
    
    this.getDistance(100,100);
    Color shellColor = new Color(255, 255, 0); //requires import line at top to work (new color defined using RGB values)
    this.setShellColor(shellColor);
    this.setPenColor(shellColor);
   // this.getShellColor(255,255,0);
    Color bodyColor = new Color(255, 255, 0);
    this.setBodyColor(bodyColor);
    this.setWidth(30);
    this.setHeight(30);
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Pikachu(int x, int y, World wref)
  {
    super(x, y, wref);
  }
}