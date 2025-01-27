# SPRING PLUS
</br>
</br>

# ✅ 1-1</br>
## @Transactional의 이해

읽기전용으로 설정되어있어 JpaSystemException 발생하는 부분 </br>
메서드에 @Transactional사용해 해결 </br>
</br>
</br>
# ✅ 1-2</br>
## JWT의 이해
.claim("nickName", nickName)사용해 토큰생성시 nickname정보 설정후,</br>
getAttribute로 ServletRequest에 값 설정후, controller에서 사용</br>
</br>
</br>
# ✅ 1-3</br>
## AOP의 이해
 @Before사용 하여 메서드 실행전에 AOP실행할 수 있도록 설정</br>
</br>
</br>
# ✅ 1-4</br>
## 컨트롤러 테스트의 이해
.andExpect(status().isOk())
status를 예외가 던지는 상태인 isBadRequest로 변경</br>
</br>
</br>

# ✅ 1-5</br>
## JPA의 이해
 IS NULL, || 연산자 이용해 조건이 null일 경우 조건을 통과할수 있도록 동적인 jpql쿼리 작성</br>
</br>
</br>
# 2-1</br>
## JPA Cascade
 casecade이용해 부모 Entity 저장시 연관된 자식 Entity도 자동으로 영속상태로 만들도록 설정</br>
 </br>
 </br>

# ✅ 2-2</br>
## N+1
fetch join 이용해 lazy loding을 무효화 시킴으로써 n+1문제 해결</br>
</br>
</br>

# ✅ 2-3</br>
## QueryDSL
jpql-> 단건 이벤트조회를  queryDsl로 변경, n+1문제 해결</br>
</br>
</br>

# ✅ 2-4</br>
## Spring Security
기존의 jwt필터가 스프링시큐리티필터를 사용하도록 변경하여 인증,인가 구현</br>

