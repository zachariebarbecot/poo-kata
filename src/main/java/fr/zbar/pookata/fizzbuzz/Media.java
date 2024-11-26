package fr.zbar.pookata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public interface Media {

    void print(String s);

    class FakeMedia implements Media {

        private final List<String> words = new ArrayList<>();

        @Override
        public void print(String s) {
            words.add(s);
        }

        public List<String> words() {
            return words;
        }
    }
}
