package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
Rerun :is Built in plugin in cucumber
->Allows us ti run Failed Test again.
->lets say Iam running 100 tests
-and only 6 of them is fail ,so that rerun gonna run again that fails only

that one significant like that 6 fails you gonna run again so for knowing if that fail happen again and again or maybe
due to of enviroment or fast or slow
 */
@RunWith(Cucumber.class)//that one for running by cucumber
@CucumberOptions(
        features = "@target/rerun.txt",
        glue="com/cybertek/step_definition")



/*
how it gonna work?
first you gonna run CukesRunner then if you have any fail in the target you gonna see that there is a rerun.txt that
contains the line that have a fail
then you can rerun by FailedTesRunner
 */
public class FailedTestRunner {


}
