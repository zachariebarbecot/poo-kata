package fr.zbar.pookata.fizzbuzz;

import fr.zbar.pookata.fizzbuzz.word.BuzzWord;
import fr.zbar.pookata.fizzbuzz.word.FizzWord;
import fr.zbar.pookata.fizzbuzz.word.NumberWord;
import fr.zbar.pookata.fizzbuzz.word.Word;

import java.util.stream.IntStream;

public record DisplayFizzBuzz(int i, int j) {

    public void print(Media media) {
        IntStream.rangeClosed(i, j)
            .mapToObj(this::word)
            .map(Word::stringValue)
            .forEach(media::print);
    }

    private Word word(int number) {
        return
            new NumberWord(
                new FizzWord(
                    new BuzzWord(number, 5),
                    3
                )
            );
    }
}
