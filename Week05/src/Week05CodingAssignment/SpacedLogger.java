package Week05CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		StringBuilder sb = new StringBuilder(log);
		for(int i = 0; i<sb.length(); i+=2)
			sb.insert(i, ' ');
		System.out.println(sb.toString());
		
	}

	@Override
	public void error(String error) {
		StringBuilder sb = new StringBuilder(error);
		for(int i = 0; i<sb.length(); i+=2)
			sb.insert(i, ' ');
		System.out.println("ERROR:" + sb.toString());
	}

}
