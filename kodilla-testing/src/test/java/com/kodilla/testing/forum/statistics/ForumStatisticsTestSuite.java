package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.ForumStatistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticksMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        ArrayList<String> result = new ArrayList<>();
        when(statisticksMock.usersNames()).thenReturn(result);

        ArrayList<String> result100Users = generatorUsersNames(100);
        when(statisticksMock.usersNames()).thenReturn(result100Users);

        when(statisticksMock.postsCount()).thenReturn(0);
        when(statisticksMock.commentsCount()).thenReturn(0);


        when(statisticksMock.postsCount()).thenReturn(1000);
        when(statisticksMock.commentsCount()).thenReturn(56);


        when(statisticksMock.postsCount()).thenReturn(56);
        when(statisticksMock.commentsCount()).thenReturn(89);


        //When
        forumStatistics.calculateAdvStatistics(statisticksMock);
        //Then
        Assert.assertEquals(56, forumStatistics.getNumberOfPosts(), 0.1);
    }

    private ArrayList<String> generatorUsersNames(int usersQuantity) {
        ArrayList<String> resultUsersNames = new ArrayList<>();

        for (int i = 1; i < usersQuantity; i++) {
            String userName = "name" + (i);
            resultUsersNames.add(userName);
        }
        return resultUsersNames;
    }

}



