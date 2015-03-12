package xpeppers.training.ocp;

public class Accumulator implements Rolls {

  private int score;
  
  public void add(int n) {
    score += n;
  }

  public int sum() {
    return score;
  }

}
