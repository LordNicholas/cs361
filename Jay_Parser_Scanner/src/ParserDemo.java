//Lord Austin CS361 2018 fall

//Nicholas Austin and Amir Eraiba

public class ParserDemo {

	private static String file1 = "Tests for the scanner.jay";
	private static String file2  = "prog2.jay";

	public static void main(String[] args) {
		TokenStream tStream = new TokenStream(file2);
		System.out.println("test1");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}
}
