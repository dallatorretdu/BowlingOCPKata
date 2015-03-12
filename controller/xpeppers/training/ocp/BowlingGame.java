package xpeppers.training.ocp;

public class BowlingGame {

  private final Rolls rolls;
  
  public BowlingGame(Rolls rolls){
    this.rolls = rolls;
  }
  
  public void roll(int pins) {
    rolls.add(pins);
  }

  public int score() {
    return rolls.sum();
  }

}
