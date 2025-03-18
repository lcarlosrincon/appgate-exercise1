package com.lc.appgate.exercise1.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequenceServiceImplTest {

    private SubsequenceServiceImpl subsequenceService;

    @BeforeEach
    void setUp() {
        subsequenceService = new SubsequenceServiceImpl();
    }

    @Test
    void givenValidSubsequence_whenNumDistinct_thenReturnsCorrectCount() {
        String source = "rabbbit";
        String target = "rabbit";

        int result = subsequenceService.numDistinct(source, target);

        assertEquals(3, result);
    }

    @Test
    void givenAnotherValidSubsequence_whenNumDistinct_thenReturnsCorrectCount() {
        String source = "babgbag";
        String target = "bag";

        int result = subsequenceService.numDistinct(source, target);

        assertEquals(5, result);
    }

    @Test
    void givenSourceShorterThanTarget_whenNumDistinct_thenReturnsZero() {
        String source = "abc";
        String target = "abcd";

        int result = subsequenceService.numDistinct(source, target);

        assertEquals(0, result);
    }

    @Test
    void givenEmptyTarget_whenNumDistinct_thenReturnsOne() {
        String source = "abc";
        String target = "";

        int result = subsequenceService.numDistinct(source, target);

        assertEquals(1, result);
    }

    @Test
    void givenEmptySource_whenNumDistinct_thenReturnsZero() {
        String source = "";
        String target = "abc";

        int result = subsequenceService.numDistinct(source, target);

        assertEquals(0, result);
    }

    @Test
    void givenSameStrings_whenNumDistinct_thenReturnsOne() {
        String source = "abc";
        String target = "abc";

        int result = subsequenceService.numDistinct(source, target);

        assertEquals(1, result);
    }

}