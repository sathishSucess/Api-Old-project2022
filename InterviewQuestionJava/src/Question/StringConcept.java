package Question;

public class StringConcept {
	public static void main(String[] args) {

//Reverse the given String

//	//1.	
//		String s = "java";
//		String output = " ";
//
//		for (int i = s.length() - 1; i >= 0; i--) {
//
//			char c = s.charAt(i);
//			output = output + c;
//
//		}
//		System.out.println(output);

		// 2.
		String s = "java program";
		String output = "";
		String[] str = s.split("");
		for (String s1 : str) {
			for (int i = s1.length()-1; i<=0; i--) {
				char c = s1.charAt(i);
				output = output + c;
			}
			
		}
		System.out.println(output);

	}

}
