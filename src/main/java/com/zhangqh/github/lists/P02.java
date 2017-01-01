package com.zhangqh.github.lists;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * P02 (*) Find the last but one element of a list
 * Created by zhangqinghua.zhang on 2017/1/2.
 */
public class P02<T> {
    public T secondLast(List<T> elements) {
        if (elements == null || elements.size() <= 1) {
            throw new NoSuchElementException();
        }
        return elements.get(elements.size() - 2);
    }
}
