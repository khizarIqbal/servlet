
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class HelloWorld {

	private static final Logger log = LogManager.getLogger(HelloWorld.class);

	public static void main(String[] args) {
		
		log.trace("This is Trace Message");
		log.debug("This is Debug Message");
		log.info("This is Info Message");
		log.warn("This is Warn Message");
		log.error("This is Error Message");
		log.fatal("This is Fatal Message");
	}

}
