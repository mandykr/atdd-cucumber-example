Feature: 영양제 댓글을 관리한다.

  Scenario: 영양제 댓글을 관리
    Given 로그인 되어있음
    And 카테고리 생성되어있음
    And 영양제 생성되어있음
    When 영양제 댓글 등록 요청
    Then 영양제 댓글 등록됨
    When 영양제 댓글 수정 요청
    Then 영양제 댓글 수정됨
    When 영양제 댓글 삭제 요청
    Then 영양제 댓글 삭제됨
