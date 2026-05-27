# Dockerfile : shop 프로젝트 폴더에 생성
# 도커 이미지 생성을 위한 파일
# 1단계: 빌드 환경 설정
FROM openjdk:17-jdk-slim as builder

# 작업 경로 설정
WORKDIR /app

# 현재 프로젝트의 모든 파일을 컨테이너의 /app으로 복사
COPY . .

# mvnw에 실행 권한 부여
RUN chmod +x mvnw

# 프로젝트 빌드 (테스트 제외)
RUN ./mvnw clean package -Dmaven.test.skip=true

# 2단계: 실행 환경 설정
FROM eclipse-temurin:17-jdk-slim
WORKDIR /app

# builder 단계에서 생성된 .war 파일을 복사
COPY --from=builder /app/target/shop-0.0.1-SNAPSHOT.war app.war

# 포트 설정
EXPOSE 8888

# 실행 명령어
ENTRYPOINT ["java","-jar","app.war"]
