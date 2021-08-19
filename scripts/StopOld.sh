#!/bin/bash

REPOSITORY=/home/ec2-user/app

# 현재 실행 중인 어플리케이션 종료
CURRENT_PID=$(ps -e | grep java | awk '{print $1}')

echo "현재 구동 중인 애플리케이션 pid: $CURRENT_PID"

if [ -z "$CURRENT_PID" ]; then
  echo "> java application is not running"
else
  echo "> kill -15 $CURRENT_PID"
  kill -15 $CURRENT_PID
  sleep 5
fi

ls -al $REPOSITORY
rm -rf $REPOSITORY/*