package com.example.atddcucumber.acceptance.category;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CategorySteps {
    private static final String ENDPOINT = "/api/categories";

    @Given("로그인 되어있음")
    public void 로그인_되어있음() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @Given("카테고리 생성되어있음")
    public static String 카테고리_생성되어있음(String name, int depth) {
        return 카테고리_생성_요청(name, depth).jsonPath().getString("id");
    }

    @When("카테고리 생성 요청")
    public static ExtractableResponse<Response> 카테고리_생성_요청(String name, int depth) {
        return RestAssured.given().log().all()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(createParams(name, depth))
                .when().post(ENDPOINT)
                .then().log().all().extract();
    }

    private static Map<String, Object> createParams(String name, int depth) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("name", name);
        params.put("depth", depth + "");
        return params;
    }

    @Then("카테고리 생성됨")
    public static void 카테고리_생성됨(ExtractableResponse<Response> response) {
        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

    @When("카테고리 조회 요청")
    public void 카테고리_조회_요청() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("카테고리 조회됨")
    public void 카테고리_조회됨() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("카테고리 이름 수정 요청")
    public void 카테고리_이름_수정_요청() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("카테고리 이름 수점됨")
    public void 카테고리_이름_수점됨() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("카테고리 위치 변경 요청")
    public void 카테고리_위치_변경_요청() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("카테고리 위치 변경됨")
    public void 카테고리_위치_변경됨() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("카테고리 삭제 요청")
    public void 카테고리_삭제_요청() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("카테고리 삭제됨")
    public void 카테고리_삭제됨() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
