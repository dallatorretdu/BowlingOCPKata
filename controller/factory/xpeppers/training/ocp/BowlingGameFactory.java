package xpeppers.training.ocp;

public class BowlingGameFactory {

  public BowlingGame create() {
    
    return new BowlingGame(new RollSet());
  }

}
