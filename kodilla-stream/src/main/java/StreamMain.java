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
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultForumUser = forum.getUserList().stream()
                .filter(fu -> fu.getUserSex() == 'M')
                .filter(fu -> Period.between(fu.getUserBirth(), LocalDate.now()).getYears() >= 20)
                .filter(fu -> fu.getPostQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, Function.identity()));

        System.out.println("# elements: " + resultForumUser.size());
        resultForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach((System.out::println));

    }
}
