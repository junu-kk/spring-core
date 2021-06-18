# spring-core
김영한님의 스프링 핵심 원리 기본편 강의

## 비즈니스 요구사항
### 회원
- 회원가입, 회원조회 구현
- 회원등급 : 일반 or VIP
- 회원 DB 아직 미정
### 주문 & 할인
- 회원은 상품 주문 가능.
- 상품 주문시 회원 등급에 따른 할인 적용
- 일단은 1000원 고정할인이지만, 정률할인 혹은 할인X로 바뀔수도 있음.

## 도메인 설계
- 클라 -> 서비스 -> 레포로 지난번 강좌와 비슷하게 감.