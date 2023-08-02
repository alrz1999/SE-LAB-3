package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void two_positive_input_values_and(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @Given("^Two input values, -(\\d+) and (\\d+)$")
    public void two_negative_positive_input_values_and(int arg0, int arg1) {
        value1 = - arg0;
        value2 = arg1;
    }

    @Given("^Two input values, (\\d+) and -(\\d+)$")
    public void two_positive_negative_input_values_and(int arg0, int arg1) {
        value1 = arg0;
        value2 = - arg1;
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the result (\\d+)$")
    public void i_expect_the_positive_result(int arg0) {
        Assert.assertEquals(arg0, result);
    }

    @Then("^I expect the result -(\\d+)$")
    public void i_expect_the_negative_result(int arg0) {
        Assert.assertEquals(-arg0, result);
    }
}
