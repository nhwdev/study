# 🛒 Shop — Spring Boot & CI/CD Study

> **Spring Boot 기반 쇼핑몰**을 구현하고, Docker와 GitHub Actions로 배포 흐름을 학습하는 프로젝트입니다.  
> 회원·상품·게시판·주문 기능부터 WebSocket 채팅, AI 챗봇, Docker Hub와 EC2 배포까지 다룹니다.

<br>

## 🛠 Tech Stack

![Java](https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![MariaDB](https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white)
![MyBatis](https://img.shields.io/badge/MyBatis-000000?style=for-the-badge)
![JSP](https://img.shields.io/badge/JSP-007396?style=for-the-badge)
![jQuery](https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white)
![Spring AI](https://img.shields.io/badge/Spring_AI-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=for-the-badge&logo=githubactions&logoColor=white)
![AWS EC2](https://img.shields.io/badge/AWS_EC2-FF9900?style=for-the-badge)

| 영역 | 기술 및 구성 |
|------|--------------|
| Backend | Java 17, Spring Boot 3.5.14, Spring MVC, AOP, Bean Validation, Lombok |
| Database | MariaDB, MyBatis 3.0.5, HikariCP |
| View | JSP, JSTL, SiteMesh, Bootstrap, jQuery, Summernote, Chart.js |
| Integration | WebSocket, Spring AI 1.1.5, OpenAI, 네이버 로그인·검색 API, SMTP, jsoup |
| Build & Deploy | Maven Wrapper, 실행 가능한 WAR, Docker, Docker Hub, GitHub Actions, AWS EC2 |

<br>

## 📂 폴더 구조

```text
Shop/
├── .github/workflows/
│   └── deploy.yml                  # Docker 이미지 빌드 및 EC2 배포
├── .mvn/                          # Maven Wrapper 설정
├── src/main/
│   ├── java/com/study/shop/
│   │   ├── aop/                   # 로그인·본인 확인·관리자·장바구니 검사
│   │   ├── config/                # MVC, MyBatis 스캔, WebSocket 설정
│   │   ├── controller/            # 회원·상품·게시판·주문·관리자·AJAX·채팅
│   │   ├── dao/                   # 데이터 접근 계층
│   │   │   └── mapper/            # 어노테이션 기반 MyBatis SQL
│   │   ├── dto/                   # 회원·상품·장바구니·주문·게시글·메일
│   │   ├── exception/             # 로그인·장바구니·쇼핑몰 예외
│   │   ├── handler/               # WebSocket 메시지 브로드캐스트
│   │   ├── intercepter/           # 게시판 요청 검사
│   │   ├── service/               # 비즈니스 로직·업로드·크롤링·AI 호출
│   │   ├── sitemesh/              # 공통 화면 레이아웃
│   │   ├── util/                  # 임시 비밀번호용 난수 문자열
│   │   ├── ShopApplication.java   # 애플리케이션 시작점
│   │   └── ServletInitializer.java
│   ├── resources/
│   │   ├── application.properties # 서버·DB·메일·AI·파일 경로 설정
│   │   ├── messages.properties    # 입력 검증 메시지
│   │   └── static/                # 이미지, CSS, 지역 데이터, 업로드 샘플
│   └── webapp/WEB-INF/
│       ├── decorators/layout.jsp  # 공통 메뉴·레이아웃·차트
│       └── views/                 # user, item, board, cart, admin, chat
├── src/test/                      # 애플리케이션 컨텍스트 테스트 코드
├── Dockerfile                     # 빌드·실행 환경을 분리한 이미지
├── mvnw / mvnw.cmd                 # Maven Wrapper
└── pom.xml                        # 의존성 및 WAR 빌드 설정
```

<br>

## ⚙️ 주요 기능

| 기능 | 구현 내용 |
|------|-----------|
| 👤 회원 | 회원가입, 세션 로그인·로그아웃, 마이페이지, 정보 수정, 탈퇴, 비밀번호 변경 |
| 🔑 계정 찾기 | 이메일·전화번호 기반 아이디 조회, 임시 비밀번호 생성 및 메일 발송 로직 |
| 🟢 소셜 로그인 | 네이버 OAuth 로그인, 프로필 조회, 최초 로그인 시 회원 등록 |
| 🛍️ 상품 | 상품 목록·상세·등록·수정·삭제, 상품 이미지 업로드 |
| 🛒 장바구니 | 세션 기반 상품 담기·삭제, 동일 상품 수량 합산, 총금액 계산 |
| 📦 주문 | 주문 및 주문상품 DB 저장, 주문 완료 화면, 마이페이지 주문내역 |
| 📋 게시판 | 게시판별 목록, 검색·페이징, 상세·조회수, 글 작성·수정·삭제, 답글·댓글, 첨부파일 |
| 📝 에디터 | Summernote를 활용한 본문 작성과 이미지 업로드 |
| 💬 채팅 | 로그인 세션을 연결한 WebSocket 실시간 메시지 브로드캐스트 |
| 🤖 AI 챗봇 | Spring AI의 ChatClient를 통해 질문을 전달하고 응답 표시 |
| 🔍 네이버 검색 | 검색 API 호출과 결과 페이지 처리 |
| 📧 관리자 | 회원 목록 조회, 선택한 회원에게 HTML 메일·첨부파일 발송 |
| 📊 통계·AJAX | 게시판 작성자별·날짜별 통계 차트, 지역 선택, 환율·로고 크롤링 |
| 🔐 공통 처리 | AOP를 통한 로그인·본인·관리자 확인, 주문 전 장바구니 검사, 입력 검증 |

외부 연동 기능은 계정과 API 설정이 필요합니다. 비밀번호 찾기 메일과 네이버 로그인은 아래 실행 준비 항목을 함께 확인하세요.

<br>

## 📖 학습 포인트

| 단계 | 주제 | 핵심 개념 |
|:----:|------|-----------|
| 1 | Spring MVC | Controller → Service → DAO → Mapper 계층 분리, JSP 화면 구성 |
| 2 | DB 연동 | MyBatis 어노테이션 SQL, 회원·상품·게시판·주문 데이터 처리 |
| 3 | 공통 관심사 | AOP, 인터셉터, Bean Validation, 예외 화면, SiteMesh |
| 4 | 비동기 통신 | jQuery AJAX, 파일 업로드, Chart.js, WebSocket |
| 5 | 외부 서비스 | 네이버 OAuth·검색, SMTP, jsoup 크롤링, Spring AI |
| 6 | 컨테이너 | 멀티 스테이지 Docker 빌드, WAR 실행, 포트·볼륨·환경변수 |
| 7 | CI/CD | GitHub Actions → Docker Hub → EC2 배포 자동화 |

<br>

## 🗄️ 데이터베이스

MyBatis Mapper에서 사용하는 주요 테이블입니다.

| 테이블 | 용도 |
|--------|------|
| `useraccount` | 회원 정보와 로그인 채널 |
| `item` | 상품 정보와 이미지 파일명 |
| `orders` | 주문 기본 정보 |
| `orderitem` | 주문별 상품·수량 |
| `board` | 게시글·게시판 구분·답글 계층 |
| `comment` | 게시글 댓글 |

현재 저장소에는 테이블 생성용 SQL 파일이 없습니다. 실행 전에 [Mapper](./src/main/java/com/study/shop/dao/mapper/)와 [DTO](./src/main/java/com/study/shop/dto/)를 참고해 MariaDB 테이블을 준비해야 합니다.

<br>

## 🚀 로컬 실행

### 1. 환경 준비

- JDK 17과 MariaDB
- Maven은 저장소의 Wrapper 사용
- AI·메일·네이버 기능을 사용할 경우 해당 서비스 계정과 API 설정

### 2. 애플리케이션 설정

[application.properties](./src/main/resources/application.properties)의 DB 연결과 파일 경로를 실행 환경에 맞춥니다. 개인 설정은 저장소 밖의 `shop-local.properties` 파일로 분리해 덮어쓸 수 있습니다.

```properties
# 예시: 저장소 폴더의 상위 디렉터리에 shop-local.properties 생성
# DB 이름과 접속 정보는 실제 환경에 맞게 변경
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
spring.ai.openai.api-key=${OPENAI_API_KEY}
spring.mail.username=${GOOGLE_MAIL_ID}
spring.mail.password=${GOOGLE_MAIL_PW}
my.mail.sender=${MAIL_SENDER:${GOOGLE_MAIL_ID}}
my.naver.id=YOUR_NAVER_ID
my.naver.pw=YOUR_NAVER_PASSWORD
resources.dir=./runtime/
```

환경변수로 설정할 경우 현재 설정 파일은 `OPENAI_API_KEY`, `GOOGLE_MAIL_ID`, `GOOGLE_MAIL_PW`, `NAVER_MAIL_ID`, `NAVER_MAIL_PW`를 참조합니다. 네이버 로그인·검색의 Client ID와 Client Secret은 각 컨트롤러의 설정도 확인해야 합니다.

### 3. 리소스와 외부 연동 준비

- 업로드 파일은 `resources.dir` 아래 `static/upload/`에 저장됩니다. [MvcConfig](./src/main/java/com/study/shop/config/MvcConfig.java)의 `/upload/**` 리소스 경로도 같은 위치를 가리키도록 맞춥니다. 현재 해당 경로는 Windows 개발 환경의 절대 경로입니다.
- 지역 선택 기능은 `resources.dir/static/file/sido.txt`를 읽습니다. 저장소의 [sido.txt](./src/main/resources/static/file/sido.txt)를 해당 위치에 복사합니다.
- 네이버 로그인은 [UserController](./src/main/java/com/study/shop/controller/UserController.java)의 콜백 주소를 실제 서버 주소와 네이버 앱 설정에 맞춥니다. 현재 로그인 요청에 `8080` 포트가 있고 토큰 요청에는 `YOUR_CALLBACK_URL`이 남아 있습니다.
- 비밀번호 찾기 메일은 별도 SMTP 파일 로딩과 계정 설정을 사용하는 코드입니다. 현재 참조하는 `/WEB-INF/CLasses/mail.properties` 파일이 없어, 관리자 메일 설정만으로 이 기능까지 바로 동작하지는 않습니다.

### 4. 빌드 및 실행

Windows PowerShell:

```powershell
.\mvnw.cmd clean package -Dmaven.test.skip=true
java -jar target/shop-0.0.1-SNAPSHOT.war --spring.config.additional-location=file:../shop-local.properties
```

macOS / Linux:

```bash
chmod +x mvnw
./mvnw clean package -Dmaven.test.skip=true
java -jar target/shop-0.0.1-SNAPSHOT.war --spring.config.additional-location=file:../shop-local.properties
```

위 명령은 현재 Dockerfile과 동일하게 테스트를 제외하고 빌드합니다.

기본 포트는 **8888**입니다. 실행 후 상품 목록 `http://localhost:8888/item/list` 또는 로그인 `http://localhost:8888/user/login`으로 접속합니다.

<br>

## 🐳 Docker & CI/CD

### Docker 구성

- Java 17 이미지에서 Maven Wrapper로 WAR 빌드
- 실행 이미지에 `shop-0.0.1-SNAPSHOT.war`를 `app.war`로 복사
- `java -jar app.war`로 실행, 컨테이너 포트 `8888` 사용

### 자동 배포 흐름

```text
main 브랜치 Push
       ↓
GitHub Actions — 소스 체크아웃·Docker 빌드
       ↓
Docker Hub — 실행 번호를 태그로 이미지 저장
       ↓
EC2 SSH 접속 — 기존 shop 컨테이너 교체
       ↓
8888 포트로 실행·업로드 디렉터리 볼륨 연결
```

[deploy.yml](./.github/workflows/deploy.yml)은 `main` 브랜치의 Push로 실행됩니다. Docker 이미지 이름은 현재 `nohker/shop`이며, 다른 환경에서 사용하려면 워크플로의 이미지 이름과 서버 설정을 맞춰야 합니다.

| GitHub Actions Secret | 용도 |
|-----------------------|------|
| `DOCKER_USERNAME`, `DOCKER_PASSWORD` | Docker Hub 로그인 |
| `EC2_HOST`, `EC2_USER`, `EC2_KEY` | 배포 서버 SSH 접속 |
| `OPENAI_API_KEY` | AI 챗봇 |
| `GOOGLE_MAIL_ID`, `GOOGLE_MAIL_PW` | SMTP 계정 |
| `NAVER_MAIL_ID`, `NAVER_MAIL_PW` | 네이버 계정 관련 설정 |

배포 시 호스트의 `/home/ubuntu/upload`를 컨테이너의 `/app/upload`에 연결합니다. 업로드 저장 경로와 `/upload/**`의 조회 경로는 이 볼륨에 맞춰야 합니다. DB는 별도 MariaDB 연결을 사용하며, 현재 워크플로에는 DB 초기화나 DB 환경변수 전달 단계가 없습니다.
