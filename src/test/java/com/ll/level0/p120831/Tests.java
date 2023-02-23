package com.ll.level0.p120831;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("정수 10이 주어질 때, 그 이하의 짝수들의 합은 30")
    void t1(){
        assertThat(new Solution().solution(10)).isEqualTo(30);
    }
    @Test
    @DisplayName("정수 4가 주어질 때, 그 이하의 짝수들의 합은 6")
    void t2(){
        assertThat(new Solution().solution(4)).isEqualTo(6);
    }
    @Test
    @DisplayName("정수 7이 주어질 때, 그 이하의 짝수들의 합은 12")
    void t3(){
        assertThat(new Solution().solution(7)).isEqualTo(12);
    }
}
