import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogMessage {

	private static final Logger log = LogManager.getLogger(LogMessage.class);
	
	public static void main(String[] args) {
		
		log.info("User {} has logged in using id {}","Robert Miller","rm");
	}

}
