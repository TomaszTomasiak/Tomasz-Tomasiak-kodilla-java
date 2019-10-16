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

        ArrayList<String>tmpUsersNames = new ArrayList<>();

        for (int i = 0; i<100; i++) {
            String userName = "name" + (i);
            tmpUsersNames.add(userName);
        }
        when(statisticksMock.usersNames()).thenReturn(tmpUsersNames);

        when(statisticksMock.usersNames().size()).thenReturn(100);
        when(statisticksMock.usersNames().size()).thenReturn(0);

        when(statisticksMock.postsCount()).thenReturn(0);
        when(statisticksMock.commentsCount()).thenReturn(56);
        when(statisticksMock.postsCount()).thenReturn(1000);
        when(statisticksMock.commentsCount()).thenReturn(0);
        when(statisticksMock.commentsCount()).thenReturn(12);

        when(statisticksMock.postsCount()).thenReturn(56);
        when(statisticksMock.commentsCount()).thenReturn(89);

        when(statisticksMock.usersNames()).thenReturn(new ArrayList<>());

        //When

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticksMock);

        Assert.assertEquals(9, forumStatistics.getNumberOfPosts(), 0.1);
    }
}
