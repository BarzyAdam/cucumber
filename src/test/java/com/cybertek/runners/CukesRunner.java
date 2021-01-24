package com.cybertek.runners;

//we can run by main and we were learned by annotation @Test ,now we gonna run by cucumber
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//that one for running by cucumber
@CucumberOptions(
        //we can make more plugin by putting plugin inside {} then we can add how many plugin we want
        plugin = {"html:target/cucumber-report.html",
        "json:target/cucumber.jason",
                "rerun:target/rerun.txt"
        },

                               //we need path of features ,but how we gonna copy path?
                            //write click on feature package then "copy path" then choose that one from content root
        features = "src/test/resources/features", //that one for scenireos
        glue="com/cybertek/step_definition" , //glue is that where we are going to execute actual codes
        //how did we copied path for glue? by going to the step_difinition then write click after choose from source root

        dryRun=false,//what is that dryRun?if we put true->it just run the code and want to know if there is everything is there
                          //but when you put false it gonna run and gonna show you the result  and gonna print scenarios

        //i want to print student and admin which tag I should use it
               // tags="@student or @admin"

        //tags = "@librarian and @employee"
                //tags="@login and not @student"

        tags = " @googleTable"


        //we have and ,or ,not tags each one gonna use for a perpose



)
public class CukesRunner {


}
