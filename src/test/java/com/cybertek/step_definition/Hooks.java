package com.cybertek.step_definition;


import com.cybertek.utilities.Driver09;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //@Before(order = 2)
    public void setUpscenario(){
        System.out.println("--->Before annotation:Setting up browser");
    }

    //we wanna use that one just for specific scenarios,so what should we do? we can do like that -> @Before("@db")
    //we have another thing call order ,order is like priorty it gonna let you runn which one is first and second
    //@Before("@db")
    @Before(value = "@db",order = 1)//we putted that one 1 and that one gonna run first
    public void setUodatebaseConnection(){
        System.out.println("--->Before Annotation: DB connection created <-------");
    }

   @After(order = 1)
    public void tearDownScenario(Scenario scenario11){

       // System.out.println("---> After annotation:closing browser");

        //System.out.println("scenario.getName() = " + scenario.getName());
        //System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
        //System.out.println("scenario.isFailed() = " + scenario.isFailed());

        //1-We need to take a screen shot using Selenium -->
        // getScreenshotAs:to be able to use this method we jave to cast our driver type to TakesScreenshot

        //2-we are doing to attach it into our report:using attach method
        //attach method accepts 3 arguements. #1 Screemshot itself #2:image type(jpeg ,png)  #3:current scenarios name

        if(scenario11.isFailed());
        {
            byte[] screenshot22 = ((TakesScreenshot) Driver09.getDriver()).getScreenshotAs(OutputType.BYTES);
            //((TakesScreenshot) Driver09.getDriver() <--that part for casting our driver to screenshot

            scenario11.attach(screenshot22, "image/png", scenario11.getName());

            //if its pass it not gonna screenshot if not it gonna take a screenshot and by opening report in target folder
            //in the borowser you gonna se that there is a screenShot for the fail part
            //the image is huge so you can use command -  for making smaller
        }

    }

    //we have @beforestep ,what is different between that and beforemethod?beforestep gonna run before all steps not just scenarios
    //@BeforeStep
    public void setUpstep(){
        System.out.println(" ======> BeforeStep:   <============");

    }

    //@AfterStep
    public void tearDownstep(){
        System.out.println("======> AfterStep:  <===========");
    }
}
