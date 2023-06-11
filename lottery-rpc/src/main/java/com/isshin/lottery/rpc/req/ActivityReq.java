package com.isshin.lottery.rpc.req;

import java.io.Serializable;

/**
 * @author Yibo Lei
 * @since 2023/6/3
 */
public class ActivityReq implements Serializable {
    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
