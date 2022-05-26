import com.kodilla.stream.ForumUser.Forum;
import com.kodilla.stream.ForumUser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
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
