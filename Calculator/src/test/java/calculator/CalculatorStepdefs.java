package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorStepdefs {
    private Calculator calculator;
    private int value1;
    private Calculator.OperationType operationType;
    private int value2;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("Two input values, {int} and {int}. Operator is {word}")
    public void twoInputValuesAndOperatorIs(int arg0, int arg1, String operator) {
        value1 = arg0;
        value2 = arg1;

        switch (operator) {
            case "*" -> operationType = Calculator.OperationType.MULTIPLY;
            case "/" -> operationType = Calculator.OperationType.DIVISION;
            case "^" -> operationType = Calculator.OperationType.POWER;
            default -> throw new IllegalArgumentException("Operator " + operator + " is not supported");
        }
    }

    @When("I perform operator on the two values")
    public void iPerformOperatorOnTheTwoValues() {
        switch (operationType) {
            case MULTIPLY -> result = calculator.multiply(value1, value2);
            case DIVISION -> result = calculator.division(value1, value2);
            case POWER -> result = calculator.power(value1, value2);
        }
    }

    @Then("I expect the result {int}")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
