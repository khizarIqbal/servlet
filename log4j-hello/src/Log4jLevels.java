import static java.lang.System.out;

import org.apache.logging.log4j.Level;

public class Log4jLevels {

	public static void main(String[] args) {
		print(Level.OFF);
		print(Level.FATAL);
		print(Level.ERROR);
		print(Level.WARN);
		print(Level.INFO);
		print(Level.DEBUG);
		print(Level.TRACE);
		print(Level.ALL); // Integer.MAX_VALUE = 2147483647
	}
	
	static void print(Level level){
		
		System.out.println(level.toString() + " : " + level.intLevel());
	}

}
