package test01;

public class Run {

	public static void main(String[] args) {
		String[] p = {"mumu", "soe", "poe", "kai", "mine"};
		String[] c = {"kai", "kai", "mine", "mine"};
		String[] a = solution(p, c);
		for (String arr : a) {
			System.out.println(arr);
		}
	}
	
	public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        int pSize = players.length;
        int cSize = callings.length;
        for (int i = 0; i < cSize ; i++) {
        	for (int j = 1 ; j < pSize ; j++) {
        		if (players[j].equals(callings[i])) {
        			players[j] = players[j-1];
        			players[j-1] = callings[i];
        			break;
        		}
        	}
        }
        answer = players.clone();
        return answer;
    }
}
