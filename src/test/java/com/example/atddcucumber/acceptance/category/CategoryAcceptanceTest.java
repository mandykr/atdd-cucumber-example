package com.example.atddcucumber.acceptance.category;


import com.example.atddcucumber.acceptance.AcceptanceTest;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.atddcucumber.acceptance.category.CategorySteps.*;

class CategoryAcceptanceTest extends AcceptanceTest {
    private String 칼슘;

    @BeforeEach
    public void setUp() {
        super.setUp();
        칼슘 = 카테고리_생성되어있음("칼슘", 0);
    }

    @DisplayName("카테고리를 관리한다")
    @Test
    void manageCategory() {
        ExtractableResponse<Response> createResponse = 카테고리_생성_요청("칼슘/마그네슘", 0);
        카테고리_생성됨(createResponse);
    }
}
