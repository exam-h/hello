package TechBoostHomeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class Q03TextReader {
	private String path;

	private static Logger logger = Logger.getLogger(Q03TextReader.class.getName());

	public enum Mark {
		START, END
	};

	private Q03TextReader(String path) {
		this.path = path;
	}

	private void execute() {
		List<Integer> valueList = new Q03ObjectList<Integer>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				valueList.add(Integer.parseInt(line));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Integer value : valueList) {
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		logger.info(Mark.START.name());
		new Q03TextReader(args[0]).execute();
		logger.info(Mark.END.name());
	}

}
