package com.isshin.lottery.infrastructure.dao;

import com.isshin.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Yibo Lei
 * @since 2023/6/4
 */
@Mapper
public interface IActivityDao {
    void insert(Activity req);

    Activity queryActivityById(Long activityId);
}
