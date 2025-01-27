# SPRING PLUS
Required</br>
1-1</br>
읽기전용으로 설정되어있어 JpaSystemException 발생하는 부분 </br>
메서드에 @Transactional사용해 해결 </br>
</br>
</br>
1-2</br>
.claim("nickName", nickName)사용해 토큰생성시 nickname정보 설정후,</br>
getAttribute로 ServletRequest에 값 설정후, controller에서 사용</br>
</br>
</br>
1-3</br>
aop실행 순간 설정</br>
</br>
</br>
1-4</br>
status 예외가 던지는 상태인 badrequest로 변경</br>
</br>
</br>

1-5</br>
 연산자 이용해 동적으로 jpql쿼리 실행하도록 작성</br>
</br>
</br>
2-1</br>
 casecade이용해 엔티티 저장시 연관엔티티도 자동으로 영속상태로 만들도록 설정</br>
 </br>
 </br>

2-2</br>
fetch join 이용해 n+1문제 해결</br>
</br>
</br>

2-3</br>
jpql-> queryDsl로 변경</br>
</br>
</br>

2-4</br>
스프링시큐리티 사용한 인증,인가 구현</br>



Challenge
