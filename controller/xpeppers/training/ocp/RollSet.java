package xpeppers.training.ocp;

public class RollSet implements Rolls {

  private int rollsArray[];
  private int index;
  
  public RollSet(){
    setRolls(new int[22]);
    setIndex(0);
  }
  
  public void add(int n) {
    getRolls()[getIndex()] += n;
    setIndex(getIndex() + 1);
  }

  public int sum() {
    int sum = 0;
    int gameEnd = Math.min(getIndex(), 20);
    
    for (int i=0; i<gameEnd; i+=2){
      int framePoints = getRolls()[i] + getRolls()[i+1];
      if(framePoints>=10)
        framePoints += getRolls()[i+2];
      sum += framePoints;
    }
    return sum;
  }

  protected int getIndex() {
    return index;
  }

  protected void setIndex(int index) {
    this.index = index;
  }

  protected int[] getRolls() {
    return rollsArray;
  }

  protected void setRolls(int rollsArray[]) {
    this.rollsArray = rollsArray;
  }

}
