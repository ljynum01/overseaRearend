package com.example.common;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

@Data
public class CommonResult<T> {

    private List<T> list;

    private PageInfo<T> pageInfo;

    public CommonResult(List<T> list, PageInfo<T> pageInfo) {
        this.list = list;
        this.pageInfo = pageInfo;
    }
}

