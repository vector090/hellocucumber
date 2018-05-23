#!/usr/bin/env bash

mvn test -Dcucumber.options='--tags @important'
#mvn test -Dcucumber.options="--tags '@important and @qa_ready'"
#mvn test -Dcucumber.options="--tags '@important or @qa_ready'"

#CUCUMBER_OPTIONS="--tags '@important'" mvn test
