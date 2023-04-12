package Week05CodingAssignment;

public class Week05 {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		logger.error("Hello");

		
		Logger loggerr = new SpacedLogger();
		loggerr.log("Hello");
		loggerr.error("Hello");

	}
	

}
