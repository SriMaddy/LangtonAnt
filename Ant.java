public class Ant
{
 private int xPosition;
 private int yPosition;
 private String antDirection;

 public Ant(int x, int y, String antDir)
 {
 this.xPosition = x;
 this.yPosition = y;
 this.antDirection = antDir;
 }

 public int getPositionX()
 {
 return this.xPosition;
 }
 public int getPositionY()
 {
 return this.yPosition;
 }
 public String getAntDirection()
 {
 return this.antDirection;
 }
 public void setPositionX(int x)
 {
 this.xPosition = x;
 }
 public void setPositionY(int y)
 {
 this.yPosition = y;
 }
 public void setAntDirection(String antDir)
 {
 this.antDirection = antDir;
 }
}