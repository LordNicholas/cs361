/**
 * @author Christelle
 * 
 * Nicholas Austin and Amir Eraiba
 * 
 */
//Lord Austin CS361 2018 fall

//Nicholas Austin and Amir Eraiba

public class ScannerDemo {

	private static String file1 = "Tests for the scanner.jay";
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);
		Token tok;
		int i = 0;
		while (!ts.isEndofFile()) {
			
			if(ts.isEndofFile())
				break;
			tok = ts.nextToken();
			i++;
			System.out.println("Token " + i + " - Type: " + tok.getType() + " - Value: " + tok.getValue());
		
		}
	}
}
