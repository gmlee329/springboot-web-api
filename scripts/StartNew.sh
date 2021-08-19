#!/bin/bash

# 새로 배포된 어플리케이션 실행
REPOSITORY=/home/ec2-user/app/target
JAR_NAME=$(ls -tr $REPOSITORY/*.jar | tail -n 1)
echo "> 새 애플리케이션 배포"
echo "> JAR name: $JAR_NAME"
echo "> $JAR_NAME에 실행 권한 추가"
chmod +x $JAR_NAME

nohup java -jar $JAR_NAME > $REPOSITORY/nohup.out 2>&1 &
