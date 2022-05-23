import com.kodilla.stream.ForumUser.Forum;
import com.kodilla.stream.ForumUser.ForumUser;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumberGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        //-------------------------EXERCISE 1-----------------
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

        //------------------------EXERCISE 2-----------------------
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Text before decorate: Test");
        poemBeautifier.beautify("Test", text -> text.toUpperCase());
        poemBeautifier.beautify("Test", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Test", text -> text.toLowerCase());
        poemBeautifier.beautify("Test", text -> text.charAt(0) + "/" + text.charAt(1) + "/" + text.charAt(2)
                + "/" + text.charAt(3));

        System.out.println("Using Stream to generate even number from 1 to 20");
        NumberGenerator.generateEven(20);

        //-----------------------EXERCISE 3-------------------------
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        //-----------------------EXERCISE 4---------------------------
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultForumUser = forum.getUserList().stream()
                .filter(fu -> fu.getUserSex() == 'M')
                .filter(fu -> Period.between(fu.getUserBirth(), LocalDate.now()).getYears() > 20)
                .filter(fu -> fu.getPostQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, fu -> fu));

        System.out.println("# elements: " + resultForumUser.size());
        resultForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach((System.out::println));

    }
}
