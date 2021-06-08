package Java3.Lesson6;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayTest {
private ArrayCheck arrayCheck;

    @BeforeEach
    public void init() {
        arrayCheck = new ArrayCheck();
    }


    @ParameterizedTest
    @MethodSource("dataForsearch4InArray")
    public void testArraySumOperation(int[] array, int[] result) {
        Assertions.assertEquals(result, arrayCheck.search4InArray(array));
    }
    public static Stream<Arguments> dataForsearch4InArray() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[] { 1, 2, 3, 4, 5, 6, 7}, new int[] {5, 6, 7}));
        out.add(Arguments.arguments(new int[] { 1, 4, 3, 8, 10, 2, 1}, new int[] {3, 8, 10, 2, 1}));
        out.add(Arguments.arguments(new int[] { 1, 1, 1, 4, 7}, new int[] {7}));
        out.add(Arguments.arguments(new int[] { 4, 9, 9, 9}, new int[] {9, 9, 9}));
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForcheckArr")
    public void testcheckArr(int[] array, boolean result) {
        Assertions.assertEquals(result, arrayCheck.checkArr(array));
    }
    public static Stream<Arguments> dataForArraycheckArr() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[] { 1, 1, 1, 4, 4, 1, 4, 4}, true));
        out.add(Arguments.arguments(new int[] { 1, 1, 1, 1, 1}, false));
        out.add(Arguments.arguments(new int[] { 4, 4, 4, 4}, false));
        out.add(Arguments.arguments(new int[] { 1, 4, 4, 1, 1, 4, 3}, false));
        return out.stream();
    }
}
