## 견고한 결제 시스템 구축
- Payment System 설계
- Toss Payments 결제 연동
- Payment Service 데이터 모델링
- 가상의 Checkout 기능 구현
- 결제 승인 기능 구현
- 결제 승인 에러 핸들링 (feat: Retry, Timeout)
- 결제 복구 서비스 (feat: Bulk Head, Parallel Processing)
- Confluent Kafka 연동
- 결제 승인 메시지 발행 (feat: Transactional Outbox Pattern, Apache Kafka)
- 신뢰성 있게 카프카를 사용하는 방법
- Wallet Service 구축
- Wallet Service 동시성 제어 (feat: Optimistic Locking)
- Wallet Service 메시지 처리와 전달 보장 (feat: Kafka Transaction)
- Wallet Service 신뢰성 향상 (feat: Dead Letter Queue)
- Ledger Service 구축 (feat: Double-Entry Ledger, Trigger)
- 결제 완료 기능 구축

<br>

## 재고시스템으로 알아보는 동시성이슈 해결방법
- 재고 감소 로직 작성
- Synchronized 이용해보기
- Pessimistic Lock 활용해보기
- Optimistic Lock 활용해보기
- Named Lock 활용해보기
- Redis 라이브러리 알아보기
- Lettuce를 작성하여 재고 감소 로직 작성하기
- Redisson 을 활용하여 재고 로직 작성하기
- 라이브러리 장단점
- Mysql과 Redis 비교하기

<br>

## 실습으로 배우는 선착순 이벤트 시스템
- 쿠폰 발급 로직 작성
- Redis를 활용하여 문제 해결하기
- Kafka를 활용하여 문제 해결하기
- Producer 사용하기
- Consumer 모듈 추가하기
- Consumer 사용하기
- 발급 가능한 쿠폰 개수를 1인당 1개로 제한하기
- 쿠폰을 발급하다가 에러가 발생하면 어떻게 하나요?

<br>

## 현직 대기업 개발자 푸와 함께하는 진짜 백엔드 시스템 실무!
- JDK, IntelliJ, Visual Studio Code 설치
- Google Cloud Platform(GCP) 계정 생성, 인스턴스 만들기
- Docker Desktop 설치
- CPU를 극단적으로 사용하는 애플리케이션 만들기
- 스트레스 테스트 툴로 성능 측정하기
- Dockerized 애플리케이션 GCP에 배포하기
- jenkins를 이용해서 배포하기
- 무중단 배포를 위한 환경 이해하기
- nginx를 통한 로드밸런싱 구성
- 서버를 늘려서 성능 측정하기
- 쉬는 시간 - 후배들에게 받았던 질문 (1)
- Git, Sourcetree 설치
- Sourcetree로 쉽게 Git 배워보기
- GitHub Webhook과 jenkins로 배포 자동화하기
- 머지할 때 발생하는 충돌(conflict) 해결하기
- 실무에서 유용한 Git 꿀팁
- I/O bound 애플리케이션도 서버를 늘리면 성능을 올릴 수 있을까?
- DB를 이용한 한줄 게시판 만들기
- 페이징과 글번호/글내용으로 검색 기능 만들기
- 스트레스 테스트 툴로 성능 측정하기
- 서버가 죽는 이유와 Message Queue를 도입하여 얻을 수 있는 장점
- RabbitMQ 도입과 글 목록 캐싱
- 스트레스 테스트 - 글 작성 요청은 실패하지 않을까?
- 검색 요청은 여전히 느리다
- 쉬는 시간 - 후배들에게 받았던 질문 (2)
- ES 클러스터 구성
- ES에 데이터 적재 후 검색하기
- 검색 성능 테스트와 샤드, 레플리카
- I/O bound 애플리케이션에서의 기술적 선택 요소
- Kubernetes
- GCP 같은 클라우드 서비스에서 제공해주는 다양한 기능

<br>

## 스프링부트 JUnit 테스트 - 시큐리티를 활용한 Bank 애플리케이션
- Bank 프로젝트 생성
- yml 설정
- 화면설계
- 테이블설계
- User 엔티티 생성
- Account 엔티티 생성
- Transaction 엔티티 생성
- SecurityConfig 기본 설정
- SecurityConfig 직접 테스트
- SecurityConfig Junit 테스트
- 공통DTO 만들기
- 회원가입 서비스 만들기
- 회원가입 서비스 테스트
- 회원가입 서비스 코드 리팩토링
- 회원가입 컨트롤러 만들기
- 회원가입 컨트롤러 유효성검사 AOP 적용
- 회원가입 컨트롤러 정규표현식 실습1
- 회원가입 컨트롤러 정규표현식 실습2
- 회원가입 컨트롤러 정규표현식 DTO 적용
- 회원가입 컨트롤러 테스트
- Jwt 토큰 생성을 위한 세팅
- Jwt 토큰 필터 구현 완료
- Jwt 필터 등록하기
- Jwt 토큰 로그인 실패 로직 처리
- Jwt 인가필터 구현 및 등록완료
- 시큐리티 JWT 코드 리뷰 및 개념잡기
- JwtProcess 테스트
- successfulAuthentication 테스트
- unsuccessfulAuthentication 테스트
- authorization 테스트
- 회원가입 테스트 오류 잡기
- SecurityConfig에 ROLE_ prefix 관련 공식 문서 변경 확인하기
- 계좌등록 서비스 만들기
- 계좌등록 컨트롤러 만들기
- 계좌등록 서비스 테스트
- 계좌등록 컨트롤러 테스트
- 본인계좌목록보기 서비스 만들기
- 본인계좌목록보기 컨트롤러 만들기
- 계좌삭제 서비스 생성 및 테스트
- 계좌삭제 컨트롤러 생성 및 테스트
- @Sql teadown.sql 적용하기
- Jwt토큰 만료시간 버그 잡기
- 계좌입금 서비스 만들기
- 계좌입금 컨트롤러 만들기
- 계좌입금 서비스 테스트
- 서비스 테스트에 관하여 생각해보기
- 계좌입금 컨트롤러 테스트
- 계좌출금 서비스 만들기
- 계좌출금 서비스 테스트
- 계좌출금 컨트롤러 생성 및 테스트
- 계좌이체 서비스 생성
- 계좌이체 서비스 테스트
- 계좌이체 컨트롤러 생성 및 테스트
- Long 타입 테스트
- cors 테스트
- 입출금내역 동적 쿼리 작성
- outer join 하는 이유
- @DataJpaTest 더미데이터 만들기
- @DataJpaTest autoincrement 초기화
- @DataJpaTest 더티체킹
- 동적쿼리 테스트
- fetch join 테스트
- 입출금내역조회 서비스 만들기
- 입출금내역조회 컨트롤러 생성 및 테스트
- 계좌상세보기 서비스, 컨트롤러 생성 및 테스트
- 전체테스트 및 PostMan 확인

<br>

## Spring Boot 3.x 를 이용한 RESTful Web Services 개발
- Web Service와 Web Application의 개요
- Web Service 개발 방법 SOAP과 REST의 이해
- OpenAPI 소개
- Spring Boot 개요
- RESTful API 설계 - 사용자 관리 API
- Spring Boot Project 생성
- Spring Boot Project 구조 확인과 실행 방법
- HelloWorld Controller 추가
- HelloWorld Bean 추가
- DispatcherServlet과 프로젝트 동작의 이해
- Path Variable 이용 - 가변 URI 사용
- User 도메인 클래스 생성
- 사용자 목록 조회를 위한 API 구현 - HTTP GET method
- 사용자 등록을 위한 API 구현 - HTTP POST method
- HTTP Status Code 제어
- HTTP Status Code 제어를 위한 Exception Handling
- Spring AOP를 이용한 Exception Handling
- 사용자 삭제를 위한 API 구현 - HTTP DELETE method
- 유효성 체크를 위한 Validation API 사용
- 다국어 처리를 위한 Internationalization 구현 방법
- Response 데이터 형식 변환 - XML format
- Response 데이터 제어를 위한 Filtering
- 프로그래밍으로 제어하는 Filtering - 개별 사용자 조회
- 프로그래밍으로 제어하는 Filtering - 전체 사용자 조회
- Version 관리 - URI를 이용한 버전관리
- Version 관리 - Paramter와 Header를 이용한 버전관리
- Level3 단계의 REST API 구현을 위한 HATEOAS 적용
- Swagger Documentation 구현 - Spring Boot 2.7 사용 ①
- Swagger Documentation 구현 - Spring Boot 2.7 사용 ②
- Swagger Documentation 구현 - Spring Boot 3.1 사용 ①
- Swagger Documentation 구현 - Spring Boot 3.1 사용 ②
- Spring Boot Actuator를 이용한 모니터링 및 Metrics 수집
- HAL Explorer를 이용한 API 테스트
- Spring Security를 이용한 인증 처리
- API 사용을 위한 사용자 인증 처리 구현
- Java Persistence API의 개요
- JPA 사용을 위한 Dependency 추가와 Entity 설정
- Spring Data JPA를 이용한 초기 데이터 생성
- JPA Service 구현을 위한 Controller, Repository 생성
- JPA를 이용한 개별 사용자 상세 조회 - HTTP Get method
- JPA를 이용한 사용자 추가와 삭제 - HTTP POST/DELETE method
- 게시물 관리를 위한 Post Entity 추가와 초기 데이터 생성
- 게시물 조회를 위한 Post Entity와 User Entity와의 관계 설정
- JPA를 이용한 새 게시물 추가 - HTTP POST Method
- Richardson Maturity Model 소개
- RESTful API 설계 시 고려해야 할 사항

<br>

## 스프링 시큐리티
- 프로젝트 구성 및 의존성 추가
- 사용자 정의 보안 기능 구현
- Form Login 인증
- Form Login 인증 필터 : UsernamePasswordAuthenticationFilter
- Logout 처리, LogoutFilter
- Remember Me 인증
- Remember Me 인증 필터 : RememberMeAuthenticationFilter
- 익명사용자 인증 필터 : AnonymousAuthenticationFilter
- 동시 세션 제어, 세션 고정 보호, 세션 정책
- 세션 제어 필터 : SessionManagementFilter, ConcurrentSessionFilter
- 권한설정과 표현식
- 예외 처리 및 요청 캐시 필터 : ExceptionTranslationFilter, RequestCacheAwareFilter
- 사이트 간 요청 위조 - CSRF, CsrfFilter
- 위임 필터 및 필터 빈 초기화 - DelegatingProxyChain, FilterChainProxy
- 필터 초기화와 다중 보안 설정
- 인증 개념 이해 - Authentication
- 인증 저장소 - SecurityContextHolder, SecurityContext
- 인증 저장소 필터 - SecurityContextPersistenceFilter
- 인증 흐름 이해 - Authentication Flow
- 인증 관리자 : AuthenticationManager
- 인증 처리자 - AuthenticationProvider
- 인가 개념 및 필터 이해 : Authorization, FilterSecurityInterceptor
- 인가 결정 심의자 - AccessDecisionManager, AccessDecisionVoter
- 스프링 시큐리티 필터 및 아키텍처 정리
- 정적 자원 관리 - WebIgnore 설정
- 사용자 DB 등록 및 PasswordEncoder
- DB 연동 인증 처리(1) : CustomUserDetailsService
- DB 연동 인증 처리(2) : CustomAuthenticationProvider
- 커스텀 로그인 페이지 생성하기
- 로그아웃 및 인증에 따른 화면 보안 처리
- 인증 부가 기능 - WebAuthenticationDetails, AuthenticationDetailsSource
- 인증 성공 핸들러 : CustomAuthenticationSuccessHandler
- 인증 실패 핸들러 : CustomAuthenticationFailureHandler
- 인증 거부 처리 - Access Denied
- 인증 필터 - AjaxAuthenticationFilter
- 인증 처리자 - AjaxAuthenticationProvider
- 인증 핸들러 - AjaxAuthenticationSuccessHandler, AjaxAuthenticationFailureHandler
- 인증 및 인가 예외 처리 - AjaxLoginUrlAuthenticationEntryPoint, AjaxAccessDeniedHandler
- Ajax Custom DSLs 구현하기
- Ajax 로그인 구현 & CSRF 설정
- 스프링 시큐리티 인가 개요
- 관리자 시스템 - 권한 도메인, 서비스, 리포지토리 구성
- 웹 기반 인가처리 DB 연동 - 주요 아키텍처 이해
- 웹 기반 인가처리 DB 연동 - FilterInvocationSecurityMetadataSource (1)
- 웹 기반 인가처리 DB 연동 - FilterInvocationSecurityMetadataSource (2)
- 웹 기반 인가처리 실시간 반영하기
- 인가처리 허용 필터 - PermitAllFilter 구현
- 계층 권한 적용하기- RoleHierarchy
- 아이피 접속 제한하기 - CustomIpAddressVoter
- Method 방식 개요
- 어노테이션 권한 설정 - @PreAuthorize, @PostAuthorize, @Secured, @RolesAllowed
- AOP Method 기반 DB 연동 - 주요 아키텍처 이해
- AOP Method 기반 DB 연동 - MapBasedSecurityMetadataSource (1)
- AOP Method 기반 DB 연동 - MapBasedSecurityMetadataSource (2)
- AOP Method 기반 DB 연동 - MapBasedSecurityMetadataSource (3)
- AOP Method 기반 DB 연동 - ProtectPointcutPostProcessor

<br>
