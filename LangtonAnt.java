public class LangtonAnt
{
 private String[][] langtonAntBoard;
 private int currentXOfAnt = 0;
 private int currentYOfAnt = 0;
 private int previousXOfAnt = 0;
 private int previousYOfAnt = 0;
 private String currentDirectionOfAnt = "Unknown";
 private String previousDirectionOfAnt = "Unknown";
 private String currentColor = "White";
 private String previousColor = "Unknown";
 private Ant ant;
 private int xMax;
 private int yMax;

 public LangtonAnt(int xMax, int yMax)
 {
 this.xMax = xMax;
 this.yMax = yMax;
 langtonAntBoard = new String[this.xMax][this.yMax];
 for(int x=0; x<this.xMax; x++)
  {
  for(int y=0; y<this.yMax; y++)
   {
   langtonAntBoard[x][y] = "White";
   }
  }
 }

 private void printLine()
 {
 for(int i=0; i<50; i++)
  System.out.print("-");
 System.out.println();
 }
 
 private void printAntDetails()
 {
 printLine();
 System.out.print(previousXOfAnt + "," + previousYOfAnt);
 System.out.print("--->"+ currentXOfAnt + "," + currentYOfAnt + "\t");
 System.out.print(previousColor + "--->" + currentColor + "\t   ");
 System.out.println(previousDirectionOfAnt + "--->" + currentDirectionOfAnt);
 }

 public void playGame(Ant ant)
 {
 this.ant = ant;
 currentXOfAnt = ant.getPositionX();
 currentYOfAnt = ant.getPositionY();
 currentDirectionOfAnt = ant.getAntDirection();
 currentColor = getColor(currentXOfAnt, currentYOfAnt);
 printAntDetails();
 /*System.out.println("Now ant is in Board[" + currentXOfAnt + ", " + currentYOfAnt + "]     in " + currentColor + " with direction: " + currentDirectionOfAnt);*/
 if(currentColor.equalsIgnoreCase("White"))
  {
  
  moveRight();
  }
 else
  {
  setColor(previousXOfAnt, previousYOfAnt, "Black");
  setColor(currentXOfAnt, currentYOfAnt, "White");
  moveLeft();
  }
 }

 private String getColor(int xPosition, int yPosition)
 {
 return langtonAntBoard[xPosition][yPosition];
 }
 
 public void setColor(int xPosition, int yPosition, String color)
 {
 langtonAntBoard[xPosition][yPosition] = color;
 }

 private void moveRight()
 {
 previousXOfAnt = currentXOfAnt;
 previousYOfAnt = currentYOfAnt;
 if(currentDirectionOfAnt.equalsIgnoreCase("North"))
  {
  if(currentYOfAnt != yMax-1)
   {
   previousDirectionOfAnt = "North";
   currentDirectionOfAnt = "East";
   currentYOfAnt += 1;
   }
  else
   {
   previousDirectionOfAnt = "North";
   currentDirectionOfAnt = "West";
   currentYOfAnt -= 1;
   }
  }
 else if(currentDirectionOfAnt.equalsIgnoreCase("South"))
  {
  if(currentYOfAnt != 0)
   {
   previousDirectionOfAnt = "South";
   currentDirectionOfAnt = "West";
   currentYOfAnt -= 1;
   }
  else
   {
   previousDirectionOfAnt = "South";
   currentDirectionOfAnt = "East";
   currentYOfAnt += 1;
   }
  }
 else if(currentDirectionOfAnt.equalsIgnoreCase("East"))
  {
  if(currentXOfAnt != xMax-1)
   {
   previousDirectionOfAnt = "East";
   currentDirectionOfAnt = "South";
   currentXOfAnt += 1;
   }
   else
   {
   previousDirectionOfAnt = "East";
   currentDirectionOfAnt = "North";
   currentXOfAnt -= 1;
   }
  }
 else if(currentDirectionOfAnt.equalsIgnoreCase("West"))
  {
  if(currentXOfAnt != 0)
   {
   previousDirectionOfAnt = "West";
   currentDirectionOfAnt = "North";
   currentXOfAnt -= 1;
   }
  else
   {
   previousDirectionOfAnt = "West";
   currentDirectionOfAnt = "South";
   currentXOfAnt += 1;   
   }
  }
 ant.setAntDirection(currentDirectionOfAnt);
 ant.setPositionX(currentXOfAnt);
 ant.setPositionY(currentYOfAnt);
 printAntDetails();
 /*System.out.println("Ant moved from [" + previousXOfAnt + ", " + previousYOfAnt + "]        to [" + currentXOfAnt + ", " + currentYOfAnt + "] in " + currentColor + " with         direction from: " + previousDirectionOfAnt + " to: " + currentDirectionOfAnt);*/
 }
 private void moveLeft()
 {
 
 }
}