import java.awt.Color; //needed for color to work

public class Pup extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Pup(World wref)
  {
    super(wref);
     Color shellColor = new Color(222, 184, 135); //requires import line at top to work (new color defined using RGB values)
    this.setShellColor(shellColor);
    
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Pup(int x, int y, World wref)
  {
    super(x, y, wref);
     Color shellColor = new Color(222, 184, 135); //requires import line at top to work (new color defined using RGB values)
    this.setShellColor(shellColor);
    
      ex1.getBodyColor();
    
    /**
   * Method to set the body color which
   * will also set the pen color
   * @param color the color to use
   */
    Color bodyColor = new Color(139, 69, 19); //requires import line at top to work (new color defined using RGB values)
    ex1.setBodyColor(bodyColor);
    
  }
}