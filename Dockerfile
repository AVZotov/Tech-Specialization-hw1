FROM openjdk:latest
WORKDIR /usr/src/app
COPY ./src/main/java .
RUN javac -sourcepath . -d out ./ru/geekbrains/homework01/Program.java
WORKDIR /usr/src/app/out
#CMD java -classpath . ru.geekbrains.homework01.Program
ENTRYPOINT ["java", "ru.geekbrains.homework01.Program"]
