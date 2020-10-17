package liaoxuefeng.com.Score;

public class Main {

    public static void main(String[] args) {
        int[] scores = new int[]{88, 77, 51, 66};
        Score s = new Score(scores);
        s.pringScores();
        scores[2] = 99;
        s.pringScores();
    }
}
