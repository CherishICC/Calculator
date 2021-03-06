FROM maven:3.6.3-jdk-11 as builder
WORKDIR /build
COPY pom.xml .

COPY src/ /build/src
RUN mvn clean install

FROM openjdk:11-jre

COPY --from=builder /build/target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar .

CMD java -jar calculator-1.0-SNAPSHOT-jar-with-dependencies.jar