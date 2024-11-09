# OpenJDK 21 JDK 이미지 사용
FROM openjdk:21-jdk-slim

# 빌드된 JAR 파일을 복사하기 위해 경로 설정
ARG JAR_FILE=build/libs/docker-test-0.0.1-SNAPSHOT.jar

# JAR 파일을 컨테이너의 app.jar로 복사
COPY ${JAR_FILE} app.jar

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]

# 기본 포트 설정
EXPOSE 8080
