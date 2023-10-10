package test;

import main.SumOfDigits;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsTest {

    @DisplayName("Test sumOfDigits method")
    @ParameterizedTest(name = "TS{index}. Input={0}, Expected Result ={1}")
    @ArgumentsSource(Provider.class)
    void testSumOfDigits(Integer input, Integer expected) {
        SumOfDigits testSumOfDigits = new SumOfDigits();
        int result = testSumOfDigits.sumOfDigits(input);
        // Use asserEquals
        assertEquals(result, expected);
    }

    static class Provider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    // Input, Expected Result,
                    Arguments.of(1, 1 ),
                    Arguments.of(12, 3),
                    Arguments.of(756, 9),
                    Arguments.of(384762, 3),
                    Arguments.of(632873943, 9)

            );
        }
    }
}
