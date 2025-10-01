package r5a08.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordTest {

    @Test
    public void should_check_one_incorrect_letter() {
        //Arrange
        Word word = new Word("E"); // Le mot a déviner fait une lettre
        //Act
        Score actual = word.guess("E"); // tentative du joueur
        Letter expected = Letter.INCORRECT;
        // Assert
        Assertions.assertEquals(expected, actual.letter(0));
    }

}
