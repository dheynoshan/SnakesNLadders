import java.util.HashMap;

public class SnakeLadders {
	
	static HashMap < Integer , Integer > snake = new HashMap < Integer , Integer >();
    static HashMap < Integer , Integer > ladder = new HashMap< Integer , Integer >();
	
	public SnakeLadders() {
		
	        snake.put(99,54);
	        snake.put(70,55);
	        snake.put(52,42);
	        snake.put(25,2);
	        snake.put(95,72);
	         
	        ladder.put(9,25);
	        ladder.put(28,40);
	        ladder.put(60,85);
	        ladder.put(46,90);
	        ladder.put(17,69);
	    
	}
		
	
}
