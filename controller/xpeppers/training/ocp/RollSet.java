package xpeppers.training.ocp;

public class RollSet implements Rolls {

  private int rollsArray[];
  private int index;
  
  public RollSet(){
    rollsArray = new int[22];
    index = 0;
  }
  
  public void add(int n) {
    rollsArray[index] += n;
    index++;
  }

  public int sum() {
    int sum = 0;
    int gameEnd = Math.min(index, 20);
    
    for (int i=0; i<gameEnd; i+=2){
      int framePoints = rollsArray[i] + rollsArray[i+1];
      if(framePoints>=10)
        framePoints += rollsArray[i+2];
      sum += framePoints;
    }
    return sum;
  }

}
