package org.akehopen.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangqiulin
 */
@Data
public class AbstractDynamicQO implements Serializable {

    private static final int NO_PAGE = 0;
    private static final int PAGE_STARTING_0 = 1;
    private static final int PAGE_STARTING_1 = 2;
    private static final int OFFSET = 3;

    /**
     * 页大小
     */
    private Integer pageSize = 10;

    /**
     * 分页页码，从0开始，主要供MongoDB使用，MySQL见Offset
     */
    private Integer currentPage;

    /**
     * 针对MySQL中lLIMIT的第一个参数
     */
    private Integer offset;

    /**
     * 分页模式
     * 0-不分页，1-currentPage0，2-currentPage1，3-offset
     */
    private Integer pageMode;

    public Integer getOffset() {
        if (pageMode == NO_PAGE) {
            return null;
        }
        if (pageMode == PAGE_STARTING_0) {
            return currentPage * pageSize;
        }
        if (pageMode == PAGE_STARTING_1) {
            return Math.max(((currentPage - 1) * pageSize), 0);
        }
        if (pageMode == OFFSET) {
            return offset;
        }
        return null;
    }

    public void withoutPaging() {
        this.pageMode = NO_PAGE;
    }

    public void pagingStarting0() {
        this.pageMode = PAGE_STARTING_0;
    }

    public void pagingStarting1() {
        this.pageMode = PAGE_STARTING_1;
    }

    public void pagingWithOffset() {
        this.pageMode = OFFSET;
    }

}
