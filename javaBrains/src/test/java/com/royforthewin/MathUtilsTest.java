package com.royforthewin;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
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

    @Test
    @DisplayName(" disabled test")
    @Disabled
    void disabledTest() {
        fail("This test should be disabled");
    }

    @Test
    @DisplayName(" assertAll")
    void multiplyTest() {
        assertAll(
                () -> assertThat(mathUtils.multiply(2,2)).isEqualTo(4),
                () -> assertThat(mathUtils.multiply(2,0)).isEqualTo(0),
                () -> assertThat(mathUtils.multiply(2,-1)).isEqualTo(-2)
        );


    }

}