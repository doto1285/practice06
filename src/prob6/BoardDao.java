package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		
		for(int i=1; i<4; i++) {
			Board board = new Board();
			board.setTitle("제목"+i);
			board.setContent("내용"+i);
			list.add(board);
		}
		
		return list;
	}
}
