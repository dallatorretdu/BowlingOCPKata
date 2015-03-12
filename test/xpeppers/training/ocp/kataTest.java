package xpeppers.training.ocp;

import static org.junit.Assert.*;

import org.junit.Test;

public class kataTest {

  private BowlingGame game;
  
  @Test
  public void testGutterGame() {
    game = new BowlingGameFactory().create();
    rollMany(20, 0);
    assertEquals(0, game.score());
  }
  
  @Test
  public void testAllOnes() {
    game = new BowlingGameFactory().create();
    rollMany(20, 1);
    assertEquals(20, game.score());
  }
  
  @Test
  public void testOneSpare() {
    game = new BowlingGameFactory().create();
    game.roll(5);
    game.roll(5);
    game.roll(3);
    rollMany(17, 0);
    assertEquals(16, game.score());
  }
  @Test
  public void testMultipleSpares() {
    game = new BowlingGameFactory().create();
    game.roll(5);
    game.roll(5);
    game.roll(4);
    rollMany(15, 0);
    game.roll(5);
    game.roll(5);
    game.roll(2);
    assertEquals(30, game.score());
  }
  @Test
  public void testAllSpares() {
    game = new BowlingGameFactory().create();
    rollMany(20, 5);
    game.roll(3);
    assertEquals(148, game.score());
  }

  private void rollMany(int number, int score) {
    for (int i=0; i<number; i++){
      game.roll(score);
    }
  }

}
