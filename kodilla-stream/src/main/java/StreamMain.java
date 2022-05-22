import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Text before decorate: Test");
        poemBeautifier.beautify("Test", text -> text.toUpperCase());
        poemBeautifier.beautify("Test", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Test", text -> text.toLowerCase());
        poemBeautifier.beautify("Test", text -> text.charAt(0) + "/" + text.charAt(1) + "/" + text.charAt(2)
                + "/" + text.charAt(3));
    }
}
