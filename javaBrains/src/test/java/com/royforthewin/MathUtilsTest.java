package com.royforthewin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MathUtilsTest {




    @Test
    @DisplayName("mathUtils - add method")
    void addTest() {
        MathUtils mathUtils = new MathUtils();
        assertThat(mathUtils.add(2,2)).isEqualTo(4);
    }

    @Test
    @DisplayName("mathUtils - getCircleArea method ")
    void computeCircleRadiusTest(){
        MathUtils mathUtils = new MathUtils();
        assertThat(mathUtils.getCircleArea(10)).isEqualTo(314.1592653589793);
    }

}