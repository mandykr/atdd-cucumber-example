Feature: 영양제 조합을 검색한다.

  Scenario: 영양제 조합을 검색
    Given 로그인 되어있음
    And 카테고리 생성되어있음
    And 영양제 생성되어있음
    And 영양제 조합 생성되어있음
    When 영양제로 영양제 조합 검색 요청
    Then 영양제 조합 검색됨
    When 건강 상태로 영양제 조합 검색 요청
    Then 영양제 조합 검색됨
