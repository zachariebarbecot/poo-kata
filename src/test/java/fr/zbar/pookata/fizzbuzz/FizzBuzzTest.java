package fr.zbar.pookata.fizzbuzz;

import fr.zbar.pookata.fizzbuzz.word.BuzzWord;
import fr.zbar.pookata.fizzbuzz.word.FizzWord;
import fr.zbar.pookata.fizzbuzz.word.NumberWord;
import fr.zbar.pookata.fizzbuzz.word.Word;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4})
    void value_is_number(Integer number) {
        assertThat(word(number).stringValue())
            .isEqualTo(number.toString());
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void value_is_fizz_when_multiple_of_three(Integer number) {
        assertThat(word(number).stringValue())
            .isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void value_is_buzz_when_multiple_of_five(Integer number) {
        assertThat(word(number).stringValue())
            .isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void value_is_fizzbuzz_when_multiple_of_three_and_five(Integer number) {
        assertThat(word(number).stringValue())
            .isEqualTo("FizzBuzz");
    }

    private Word word(Integer number) {
        return
            new NumberWord(
                new FizzWord(
                    new BuzzWord(number, 5),
                    3
                )
            );
    }
}
