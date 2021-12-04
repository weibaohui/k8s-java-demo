FROM maven:3-openjdk-17-slim as builder
WORKDIR /app
COPY . .
RUN mvn install  -DskipTests

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/k8s-0.0.1-SNAPSHOT.jar /app/app.jar
RUN ln -snf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo "Asia/Shanghai" > /etc/timezone
ENV JVM_OPTS="-XX:+PrintFlagsFinal  -XX:+UnlockExperimentalVMOptions "
ENV JAVA_OPTS=""
EXPOSE 8080
CMD ["sh","-c","java $JVM_OPTS $JAVA_OPTS -jar /app/app.jar"]

