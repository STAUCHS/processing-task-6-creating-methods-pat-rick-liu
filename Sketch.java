import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(1000, 500);
  }

  // Called once at the beginning of execution. Add initial set up
  // values here i.e background, stroke, fill etc.

  public void setup() {
    surface.setResizable(true);
    noLoop();
    background(199, 213, 228);
  }

  // Called repeatedly, anything drawn to the screen goes here
  public void draw() {

    public int randomFlower(){
      Random myRandom = new Random();
    int intRedRandom = myRandom.nextInt(255);
    int intGreenRandom = myRandom.nextInt(255);
    int intBlueRandom = myRandom.nextInt(255);
    int intPetalRandom = myRandom.nextInt(100, 150);
    int intMiddleRandom = myRandom.nextInt(20, 40);
      drawFlower(intRedRandom, intGreenRandom, intBlueRandom, width / 7, height / 4 * intColumn, intPetalRandom,
          intMiddleRandom);
    }
    // Draws the rows and columns of randomized flowers
    for (int intColumn = 1; intColumn < 4; intColumn++) {
      Random myRandom = new Random();
    int intRedRandom = myRandom.nextInt(255);
    int intGreenRandom = myRandom.nextInt(255);
    int intBlueRandom = myRandom.nextInt(255);
    int intPetalRandom = myRandom.nextInt(100, 150);
    int intMiddleRandom = myRandom.nextInt(20, 40);
      drawFlower(intRedRandom, intGreenRandom, intBlueRandom, width / 7, height / 4 * intColumn, intPetalRandom,
          intMiddleRandom);

    for (int intRow = 1; intRow < 6; intRow++) {
      Random myRandom2 = new Random();
    int intRed2Random = myRandom2.nextInt(255);
    int intGreen2Random = myRandom2.nextInt(255);
    int intBlue2Random = myRandom2.nextInt(255);
    int intPetal2Random = myRandom2.nextInt(100, 150);
    int intMiddle2Random = myRandom2.nextInt(20, 40);
      drawFlower(intRed2Random, intGreen2Random, intBlue2Random, width/7 + width / 7 * intRow, height / 4 * intColumn, intPetal2Random,
          intMiddle2Random);
    }
    }
  }

  /**
   * Method that draws a flower based on the random parameters
   * 
   * @param intRed             affects the redness of the flower
   * @param intGreen           affects the greeness of the flower
   * @param intBlue            affects the blueness of the flower
   * @param intTranslateX      affects the X position of the flower
   * @param intTranslateY      affects the Y position of the flower
   * @param intIncreasePetalsX affects the length of the petal
   * @param intIncreasePetalsY affects the width of the petal
   * @return
   * @author Patrick Liu
   */
  // Drawing my flower
  public void drawFlower(int intRed, int intGreen, int intBlue, int intTranslateX, int intTranslateY,
      int intIncreasePetalsX, int intIncreasePetalsY) {
    fill(intRed, intGreen, intBlue);
    translate(intTranslateX, intTranslateY);
    for (int intPetals = 1; intPetals < 10; intPetals++) {
      rotate(PI / 8);
      ellipse(0, 0, intIncreasePetalsX, intIncreasePetalsY);
    }
    fill(0);
    ellipse(0, 0, intIncreasePetalsY + intIncreasePetalsY / 8, intIncreasePetalsY + intIncreasePetalsY / 8);
    resetMatrix();
  }

  public boolean idk2(){
    if (){

    }
   }

}