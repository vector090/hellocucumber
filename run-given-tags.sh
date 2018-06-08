#!/usr/bin/env bash

set -x

# Only run given tag.
#mvn test -Dcucumber.options='--tags @important'

# Don't run given tag.
#mvn test -Dcucumber.options='--tags ~@important' # Deprecated syntax.
mvn test -Dcucumber.options="--tags 'not @important'" # New syntax.

#mvn test -Dcucumber.options="--tags '@important and @qa_ready'"
#mvn test -Dcucumber.options="--tags '@important or @qa_ready'"

# This also works.
#CUCUMBER_OPTIONS="--tags '@important'" mvn test
