package prob7;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("blue", 85);
		map.put("red", 96);
		map.put("black", 92);

		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0; // 최고 점수
		int totalScore = 0; // 점수 합계

		/* 코드를 작성하세요 */
		int count=0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			count++;
			totalScore += value;
			if(maxScore < value) {
				maxScore = value;
				name = key;
			}
		}
		System.out.println("평균점수:"+totalScore/count);
		System.out.println("최고점수:"+maxScore);
		System.out.println("최고 점수를 받은 아이디"+name);
	}
}