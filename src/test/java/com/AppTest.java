package com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTest {
    @Test
    @DisplayName("닉네임 입력 받기")
    void t1() {
        String rs = AppTestRunner.run("""
                용사
                """);
        assertThat(rs)
                .contains("닉네임을 입력하여 주세요!")
                .contains("닉네임 : ")
                .contains("용사");
    }
}
