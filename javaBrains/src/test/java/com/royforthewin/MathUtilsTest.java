package com.royforthewin;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    void beforeAllInit() {
        mathUtils = new MathUtils();
    }

    @Test
    @DisplayName("mathUtils - add method")
    void addTest() {
        assertThat(mathUtils.add(2, 2)).isEqualTo(4);
    }

    @Test
    @DisplayName("mathUtils - getCircleArea method ")
    void computeCircleRadiusTest() {
        assertThat(mathUtils.getCircleArea(10)).isEqualTo(314.1592653589793);
    }


    @Test
    @DisplayName("mathUtils - divide method")
    void divideTest() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
    }

}