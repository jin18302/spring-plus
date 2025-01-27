# SPRING PLUS
Required
1-1
읽기전용으로 설정되어있어 JpaSystemException 발생하는 부분 
메서드에 @Transactional사용해 해결 

1-2
.claim("nickName", nickName)사용해 토큰생성시 nickname정보 설정후,
getAttribute로 ServletRequest에 값 설정후, controller에서 사용

1-3
aop실행 순간 설정

1-4
status 예외가 던지는 상태인 badrequest로 변경

1-5
 연산자 이용해 동적으로 jpql쿼리 실행하도록 작성

2-1
 casecade이용해 엔티티 저장시 연관엔티티도 자동으로 영속상태로 만들도록 설정

2-2
fetch join 이용해 n+1문제 해결

2-3
jpql-> queryDsl로 변경

2-4
스프링시큐리티 사용한 인증,인가 구현



Challenge
