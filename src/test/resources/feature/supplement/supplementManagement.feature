Feature: 영양제를 관리한다.

  Scenario: 영양제를 관리
    Given 로그인 되어있음
    And 카테고리 생성되어있음
    And 영양제 생성되어있음
    When 영양제 카테고리로 조회 요청
    Then 영양제 목록 조회됨
    When 영양제 수정 요청
    Then 영양제 수정됨
    When 영양제 삭제 요청
    Then 영양제 삭제됨
