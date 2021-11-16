public class StringvsStringBuffer {

	public static void main(String[] args) {
		
		String s = new String("Durga");
		s.concat("software");
		System.out.println("String example---"+s);
		
		String s1 = "Avi";
		s1.concat("concatinated");
		System.out.println("afterconcatination" + s1);
		String s2 = "Avi";
		System.out.println("s2 value" + s2);
		
		StringBuffer sb= new StringBuffer("Durga");
		sb.append("software"); 
		System.out.println("StringBuffer example---"+sb);
	}

}
