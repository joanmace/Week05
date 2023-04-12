package Week05CodingAssignment;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		logger.log("Mace");
		logger.error("Mace");
		Logger loggerr = new SpacedLogger();
		logger.log("Mace");
		logger.error("Mace");
	}

}
