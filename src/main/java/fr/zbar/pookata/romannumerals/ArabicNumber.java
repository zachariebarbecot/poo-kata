package fr.zbar.pookata.romannumerals;

import fr.zbar.pookata.romannumerals.romannumber.FiftyRomanNumber;
import fr.zbar.pookata.romannumerals.romannumber.FiveHundredRomanNumber;
import fr.zbar.pookata.romannumerals.romannumber.FiveRomanNumber;
import fr.zbar.pookata.romannumerals.romannumber.HundredRomanNumber;
import fr.zbar.pookata.romannumerals.romannumber.OneRomanNumber;
import fr.zbar.pookata.romannumerals.romannumber.RomanNumber;
import fr.zbar.pookata.romannumerals.romannumber.TenRomanNumber;
import fr.zbar.pookata.romannumerals.romannumber.ThousandRomanNumber;

public record ArabicNumber(int value) {

    public RomanNumber toRomanNumber() {
        return
            new ThousandRomanNumber(
                new FiveHundredRomanNumber(
                    new HundredRomanNumber(
                        new FiftyRomanNumber(
                            new TenRomanNumber(
                                new FiveRomanNumber(
                                    new OneRomanNumber(value)
                                )
                            )
                        )
                    )
                )
            );
    }
}
