package com.zhangqh.github.lists;

import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * P03 (*) Find the Kth element of a list
 * Created by zhangqinghua.zhang on 2017/1/2.
 */
public class P03<T> {
    public T kth(List<T> elements, int K) {
        if (K < 0) {
            throw new InvalidParameterException();
        }
        if (elements == null || elements.size() < K + 1) {
            throw new NoSuchElementException();
        }
        return elements.get(K);
    }

    /**
     * 递归获取kth
     */
    public T kthRecursive(LinkedList<T> elements, int K) {
        if (K < 0) {
            throw new InvalidParameterException();
        }
        if (elements == null || elements.size() == 0) {
            throw new NoSuchElementException();
        }
        if (K == 0) {
            return elements.getFirst();
        }
        return kthRecursive(new LinkedList<>(elements.subList(1, elements.size())), K - 1);
    }

    public static <T> T kthStream(final List<T> elements, final int k) {
        return elements.stream().limit(k + 1).collect(Collectors.toCollection(LinkedList::new)).getLast();
    }
}
