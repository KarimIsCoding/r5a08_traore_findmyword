package r5a08_findmyword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordTest {

    @Test
    public void should_check_one_incorrect_letter(){
        // Arrange
        Word word = new Word("E");

        // Act
        Score actual = word.guess("B");
        Letter expected = Letter.INCORRECT;

        // Arrange
        Assertions.assertEquals(expected, actual.letter(0));

    }

    @Test
    public void should_check_one_correct_letter(){
        // Arrange
        Word word = new Word("E");

        // Act
        Score actualScore = word.guess("E");
        Letter actual = actualScore.letter(0);
        Letter expected = Letter.CORRECT;

        // Arrange
        Assertions.assertEquals(actual, expected);

    }
}
