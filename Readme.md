
Created using command:
```
mvn archetype:generate                      \
   -DarchetypeGroupId=io.cucumber           \
   -DarchetypeArtifactId=cucumber-archetype \
   -DarchetypeVersion=2.3.1.2               \
   -DgroupId=hellocucumber                  \
   -DartifactId=hellocucumber               \
   -Dpackage=hellocucumber                  \
   -Dversion=1.0.0-SNAPSHOT                 \
   -DinteractiveMode=false
```

See https://docs.cucumber.io/guides/10-minute-tutorial/


If you cannot run specific .feature file correctly (e.g. stepdefs.feature), you can always run RunCucumberTest.java to run all the features.

Or it could be IDEA's problem: simply clean up the seemingly problematic run configurations, and re-run.
