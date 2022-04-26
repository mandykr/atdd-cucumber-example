Feature: 영양제를 검색한다.

  Scenario: 영양제를 검색
    Given 로그인 되어있음
    And 카테고리 생성되어있음
    And 영양제 생성되어있음
    When 영양제 카테고리로 조회 요청
    Then 영양제 목록 조회됨
    When 영양제 이름으로 조회 요청
    Then 영양제 조회됨
