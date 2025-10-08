package r5a08_findmyword;

import java.util.Arrays;

public class Score {
    private final String correct;
    private Letter[] results;

    public Score(String correct) {
        this.correct = correct;
        this.results = new Letter[correct.length()];
        Arrays.fill(results, Letter.INCORRECT);
    }

    public Letter letter(int i) {
        return results[i];
    }

    public void assess(String attempt) {
        for (int i = 0; i < attempt.length(); i++) {
            if (assertIsCorrectLetter(i, attempt, correct)) {
                results[i] = Letter.CORRECT;
            } else {
                results[i] = Letter.INCORRECT;
            }
        }
    }

    private boolean assertIsCorrectLetter(int position, String attempt, String correct) {
        return correct.charAt(position) == attempt.charAt(position);
    }
}
