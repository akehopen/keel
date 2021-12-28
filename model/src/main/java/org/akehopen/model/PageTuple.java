package org.akehopen.model;


import org.akehopen.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * @author panghaoyue
 */
public class PageTuple<T> {

    private Pair<Long, List<T>> pagePair;

    private PageTuple() {
    }

    public static <T> PageTuple<T> of(Long count, List<T> content) {
        PageTuple<T> page = new PageTuple<>();
        page.pagePair = Pair.of(count, content);
        return page;
    }

    public static <T> PageTuple<T> empty() {
        return of(0L, new ArrayList<>());
    }

    public static <T> PageTuple<T> empty(Class<T> clazz) {
        return of(0L, new ArrayList<>());
    }

    public Long getTotalCount() {
        return this.pagePair.getA();
    }

    public List<T> getContent() {
        return this.pagePair.getB();
    }

}
