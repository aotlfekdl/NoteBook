package o.collection.set.ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	HashSet<String> lottery = new HashSet<>();
	HashSet<String> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		lottery.add(lottery);
		return true;
	}	
	public boolean deleteObject(Lottery l) {
		return true;
	}
	
	public HashSet winObject() {
		List list = new ArrayList();
		
		int rn = (int)(Math.random()*10)+1;
		
		return win;
	}
	
	public TreeSet sortedWinObjecet() {
		return null;
		
	}
	
	public boolean searchWinner(Lottery l) {
		return true;
	}
}
