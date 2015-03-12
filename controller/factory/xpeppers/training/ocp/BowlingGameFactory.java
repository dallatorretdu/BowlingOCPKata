package xpeppers.training.ocp;

public class BowlingGameFactory {

  public BowlingGame create() {
    
    Rolls rolls = new Accumulator();
    
    return new BowlingGame(rolls);
  }

}
