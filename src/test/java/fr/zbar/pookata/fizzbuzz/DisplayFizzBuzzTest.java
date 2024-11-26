package fr.zbar.pookata.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class DisplayFizzBuzzTest {

    @Test
    void print_100_times() {
        Media.FakeMedia media = new Media.FakeMedia();

        new DisplayFizzBuzz(1, 100)
            .print(media);

        assertThat(media.words().size())
            .isEqualTo(100);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4})
    void print_number(Integer number) {
        Media.FakeMedia media = new Media.FakeMedia();

        new DisplayFizzBuzz(number, number)
            .print(media);

        assertThat(media.words().getFirst())
            .isEqualTo(String.valueOf(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void print_fizz(Integer number) {
        Media.FakeMedia media = new Media.FakeMedia();

        new DisplayFizzBuzz(number, number)
            .print(media);

        assertThat(media.words().getFirst())
            .isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void print_buzz(Integer number) {
        Media.FakeMedia media = new Media.FakeMedia();

        new DisplayFizzBuzz(number, number)
            .print(media);

        assertThat(media.words().getFirst())
            .isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void print_fizzbuzz(Integer number) {
        Media.FakeMedia media = new Media.FakeMedia();

        new DisplayFizzBuzz(number, number)
            .print(media);

        assertThat(media.words().getFirst())
            .isEqualTo("FizzBuzz");
    }

    @Test
    void print_multiple() {
        Media.FakeMedia media = new Media.FakeMedia();

        new DisplayFizzBuzz(1, 5)
            .print(media);

        assertThat(media.words())
            .containsExactly("1", "2", "Fizz", "4", "Buzz");
    }
}
