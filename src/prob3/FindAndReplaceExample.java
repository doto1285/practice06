package prob3;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발 될 수 있습니다.";

		/* 코드를 작성합니다 */
		String strRelace;
		strRelace = str.replaceAll("자바", "Java");
		if(strRelace.equals(str)) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
			return;
		}
		System.out.println("자바 문자열이 포함되어 있습니다.");
		System.out.println(strRelace);
	}
}