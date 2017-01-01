package com.zhangqh.github.lists;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * P01 (*) Find the last element of a list
 * Created by zhangqinghua.zhang on 2017/1/2.
 */
public class P01<T> {
    public T last(List<T> elements) {
        if (elements == null || elements.size() == 0) {
            throw new NoSuchElementException();
        }
        return elements.get(elements.size() - 1);
    }
}
