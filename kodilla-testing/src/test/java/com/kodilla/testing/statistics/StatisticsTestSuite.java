package com.kodilla.testing.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {
    private static int counter = 0;

    @Mock
    private Statistics statisticsMock;


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("End of tests");
    }

    @BeforeEach
    public void beforeEachTest() {
        counter++;
        System.out.println("Test number " + counter);

    }

    @Test
    @DisplayName("Test with 0 posts")
    void calculateAdvStatisticsWith0Posts() {
        //Given
        AnalysisOfStatistics stat = new AnalysisOfStatistics(statisticsMock);
        List<String> users = generateListOfUsers(5);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0); //number of posts 0
        when(statisticsMock.commentsCount()).thenReturn(0); //number of comments 0

        //When
        double postsPerUser = stat.getPostsPerUser();
        double commentsPerUser = stat.getCommentsPerUser();
        double commentsPerPost = stat.getCommentsPerPost();

        //Then
        assertEquals(0, postsPerUser);
        assertEquals(0, commentsPerUser);
        assertEquals(0, commentsPerPost);
    }

    @Test
    @DisplayName("Test with 1000 posts")
    void calculateAdvStatisticsWith1000Posts() {
        //Given
        AnalysisOfStatistics stat = new AnalysisOfStatistics(statisticsMock);
        List<String> users = generateListOfUsers(5);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100); //number of posts 0
        when(statisticsMock.commentsCount()).thenReturn(5); //number of comments 0

        //When
        double postsPerUser = stat.getPostsPerUser();
        double commentsPerUser = stat.getCommentsPerUser();
        double commentsPerPost = stat.getCommentsPerPost();

        //Then
        assertEquals(20, postsPerUser);
        assertEquals(1, commentsPerUser);
        assertEquals(0.05, commentsPerPost);
    }

    @Test
    @DisplayName("Test with 0 comments")
    void calculateAdvStatisticsWith0Comments() {
        //Given
        AnalysisOfStatistics stat = new AnalysisOfStatistics(statisticsMock);
        List<String> users = generateListOfUsers(5);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100); //number of posts 0
        when(statisticsMock.commentsCount()).thenReturn(0); //number of comments 0

        //When
        double postsPerUser = stat.getPostsPerUser();
        double commentsPerUser = stat.getCommentsPerUser();
        double commentsPerPost = stat.getCommentsPerPost();

        //Then
        assertEquals(20, postsPerUser);
        assertEquals(0, commentsPerUser);
        assertEquals(0, commentsPerPost);

    }

    @Test
    @DisplayName("Test with more posts then comments")
    void calculateAdvStatisticsMorePostsThenComments() {
        //Given
        AnalysisOfStatistics stat = new AnalysisOfStatistics(statisticsMock);
        List<String> users = generateListOfUsers(5);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100); //number of posts 0
        when(statisticsMock.commentsCount()).thenReturn(50); //number of comments 0

        //When
        double postsPerUser = stat.getPostsPerUser();
        double commentsPerUser = stat.getCommentsPerUser();
        double commentsPerPost = stat.getCommentsPerPost();

        //Then
        assertEquals(20, postsPerUser);
        assertEquals(10, commentsPerUser);
        assertEquals(0.5, commentsPerPost);

    }

    @Test
    @DisplayName("Test with more comments then posts")
    void calculateAdvStatisticsMoreCommentsThenPosts() {
        //Given
        AnalysisOfStatistics stat = new AnalysisOfStatistics(statisticsMock);
        List<String> users = generateListOfUsers(5);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(50); //number of posts 0
        when(statisticsMock.commentsCount()).thenReturn(100); //number of comments 0

        //When
        double postsPerUser = stat.getPostsPerUser();
        double commentsPerUser = stat.getCommentsPerUser();
        double commentsPerPost = stat.getCommentsPerPost();

        //Then
        assertEquals(10, postsPerUser);
        assertEquals(20, commentsPerUser);
        assertEquals(2, commentsPerPost);

    }

    @Test
    @DisplayName("Test with 0 users")
    void calculateAdvStatisticsWith0Users() {
        //Given
        AnalysisOfStatistics stat = new AnalysisOfStatistics(statisticsMock);
        List<String> users = generateListOfUsers(0);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0); //number of posts 0
        when(statisticsMock.commentsCount()).thenReturn(0); //number of comments 0

        //When
        double postsPerUser = stat.getPostsPerUser();
        double commentsPerUser = stat.getCommentsPerUser();
        double commentsPerPost = stat.getCommentsPerPost();

        //Then
        assertEquals(0, postsPerUser);
        assertEquals(0, commentsPerUser);
        assertEquals(0, commentsPerPost);

    }

    @Test
    @DisplayName("Test with 100 Users")
    void calculateAdcStatisticsWith100Users() {
        //Given
        AnalysisOfStatistics stat = new AnalysisOfStatistics(statisticsMock);
        List<String> users = generateListOfUsers(100);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(5); //number of posts 0
        when(statisticsMock.commentsCount()).thenReturn(10); //number of comments 0
        //When
        double postsPerUser = stat.getPostsPerUser();
        double commentsPerUser = stat.getCommentsPerUser();
        double commentsPerPost = stat.getCommentsPerPost();

        //Then
        assertEquals(0.05, postsPerUser);
        assertEquals(0.1, commentsPerUser);
        assertEquals(2, commentsPerPost);

    }

    private List<String> generateListOfUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            resultList.add("User" + n);
        }
        return resultList;
    }

}
