Feature: 카테고리를 관리한다.

  Scenario: 카테고리를 관리
    Given 로그인 되어있음
    And 카테고리 생성되어있음
    When 카테고리 생성 요청
    Then 카테고리 생성됨
    When 카테고리 조회 요청
    Then 카테고리 조회됨
    When 카테고리 이름 수정 요청
    Then 카테고리 이름 수점됨
    When 카테고리 위치 변경 요청
    Then 카테고리 위치 변경됨
    When 카테고리 삭제 요청
    Then 카테고리 삭제됨
