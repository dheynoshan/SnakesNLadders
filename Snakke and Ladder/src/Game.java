
public class Game {
	
	Dice d = new Dice();
	SnakeLadders snl = new SnakeLadders();
	
	Players player1 = new Players(1);
	Players player2 = new Players(2);
	
	boolean player1Turn = true;
	boolean player2Turn = false;
	
	boolean isWin = false;
	char sel;
	
	String playerTurn = "Player 1";
	String winner = null;
	String snakeLadder;
			
	int num = 0;
	
	public void GamePlay() {
		
		if(!isWin ) {
			//Player 1's turn
			snakeLadder = null;
			if(player1Turn) {
				//Rolling the Dice for Player1's
					num = d.diceRoll();
					
					//Check the position + roll number <=100					 
					if((player1.getPosition() + num) <= 100) {
						player1.changePosition(num);
				
						//Check for snakes
						if(null!=SnakeLadders.snake.get(player1.getPosition()))
					    {
					        snakeLadder = "swallowed by snake";
					        player1.goTo(SnakeLadders.snake.get(player1.getPosition()));
					        
					    }//End of Snake check
						//Check for ladders
						if(null!=SnakeLadders.ladder.get(player1.getPosition()))
					    {
					        snakeLadder = "Climbed";
					        //snakeLadder = "Climbed to " + String.valueOf(player1.getPosition());
					        player1.goTo(SnakeLadders.ladder.get(player1.getPosition()));
					        
					    }//End of ladder check
						//Repetition for 1 or 6
						if(num!=1 && num!=6) {
							player1Turn = false;
							player2Turn = true;
							playerTurn = "Player 2";
						}//End of 1 or 6 check
						
						if(player1.getPosition()>=100) {
							isWin = true;
							player1Turn = false;
							player2Turn = false;
							winner = "Player 1 wins";
						}
					}// End of one iteration of player 1
				
				
			}//End of multiple iterations of player 1
				
			else if(player2Turn) {
				//Rolling the Dice for Player2's
					num = d.diceRoll();
					//Check the position + roll number <=100					 
					if((player2.getPosition() + num) <= 100) {
						player2.changePosition(num);
						
						//Check for snakes
						if(null!=SnakeLadders.snake.get(player2.getPosition()))
					    {
					        
					        player2.goTo(SnakeLadders.snake.get(player2.getPosition()));
					        
					    }//End of Snake check
						//Check for ladders
						if(null!=SnakeLadders.ladder.get(player2.getPosition()))
					    {
					        
					        player1.goTo(SnakeLadders.ladder.get(player2.getPosition()));
					        
					    }//End of ladder check
						//Repetition for 1 or 6
						if(num!=1 && num!=6) {
							player2Turn = false;
							player1Turn = true;
							playerTurn = "Player 1";
						}//End of 1 or 6 check
						
						if(player2.getPosition()>=100) {
							isWin = true;
							winner = "Player 2 wins";
							player1Turn = false;
							player2Turn = false;
							
						}
					}// End of one iteration of player 2
				
					
			}//End of multiple iterations of player 2
		}
	
	}
}

