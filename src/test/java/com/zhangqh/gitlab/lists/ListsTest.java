package com.zhangqh.gitlab.lists;

import com.zhangqh.github.lists.P01;
import com.zhangqh.github.lists.P02;
import com.zhangqh.github.lists.P03;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Lists tests
 * Created by zhangqinghua.zhang on 2017/1/2.
 */
public class ListsTest {
    @Test
    public void shouldFindLastElementFromAListOfAlphabets() {
        P01<String> p01 = new P01<String>();
        assertThat(p01.last(Arrays.asList("a", "b", "c", "d")), is(equalTo("d")));
    }

    @Test
    public void shouldFindSecondLastElementFromAList() {
        List<Integer> numbers = Arrays.asList(1, 2, 11, 4, 5, 8, 10, 6);
        P02<Integer> p02 = new P02<Integer>();
        assertThat(p02.secondLast(numbers), is(equalTo(10)));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListEmpty() throws Exception {
        P02<Integer> p02 = new P02<Integer>();
        p02.secondLast(Collections.<Integer>emptyList());
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListHasSingleElement() throws Exception {
        P02<Integer> p02 = new P02<Integer>();
        p02.secondLast(Arrays.asList(1));
    }

    @Test
    public void shouldFindKthElementFromAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        P03<Integer> p03 = new P03<Integer>();
        assertThat(p03.kth(numbers, 2), is(equalTo(3)));
    }

}
