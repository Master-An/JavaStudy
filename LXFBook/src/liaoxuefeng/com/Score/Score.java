package liaoxuefeng.com.Score;

import java.util.Arrays;

public class Score {

    private int[] scores;

    public Score(int[] scores) {
        this.scores = scores;
    }

    public void pringScores() {
        System.out.println(Arrays.toString(scores));
    }
}
