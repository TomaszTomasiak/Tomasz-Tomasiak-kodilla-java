package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.ForumStatistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticksMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticksMock);


        when(statisticksMock.usersNames()).thenReturn(new ArrayList<>());
        assertEquals(0, forumStatistics.getNumberOfUsers());

        when(statisticksMock.usersNames()).thenReturn(generator100UsersNames());
        assertEquals(100, forumStatistics.getNumberOfUsers());


        when(statisticksMock.postsCount()).thenReturn(0);
        assertEquals(0, forumStatistics.getNumberOfPosts());

        when(statisticksMock.commentsCount()).thenReturn(0);
        assertEquals(0, forumStatistics.getNumberOfComments());

        when(statisticksMock.postsCount()).thenReturn(1000);
        when(statisticksMock.commentsCount()).thenReturn(12);
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(89, forumStatistics.getNumberOfComments());

        when(statisticksMock.postsCount()).thenReturn(56);
        when(statisticksMock.commentsCount()).thenReturn(89);
        assertEquals(56, forumStatistics.getNumberOfPosts());
        assertEquals(89, forumStatistics.getNumberOfComments());
    }

    private ArrayList<String> generator100UsersNames() {
        ArrayList<String> result100UsersNames = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            String userName = "name" + (i);
            result100UsersNames.add(userName);
        }
        return result100UsersNames;
    }
}



