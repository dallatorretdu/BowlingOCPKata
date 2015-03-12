package xpeppers.training.ocp;

public class BowlingRollSet extends RollSet implements Rolls {
  
  @Override
  public int sum() {
    int sum = 0;
    int i=0, frame=0;
    
    while(frame<10){
      if(isStrike(i)){
        sum += 10 + getRolls()[i+1] + getRolls()[i+2];
        i+=1;
      }
      else if (isSpare(i)){
        sum += 10 + getRolls()[i+2];
        i+=2;
      }
      else{
        sum += getRolls()[i] + getRolls()[i+1];
        i+=2;
      }
      frame++;
    }
    
    return sum;
  }

  private boolean isStrike(int i) {
    return getRolls()[i] == 10;
  }
  private boolean isSpare(int i) {
    return getRolls()[i] + getRolls()[i+1] == 10;
  }
  
}
