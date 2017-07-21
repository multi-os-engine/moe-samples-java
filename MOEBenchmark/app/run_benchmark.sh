#!/bin/bash
../gradlew startApplication -PapplicationActivity=.MainActivity -PapplicationPackage=org.moe.benchmark;

sleep 10

adb root

adb pull /data/data/org.moe.benchmark/csvfile.csv