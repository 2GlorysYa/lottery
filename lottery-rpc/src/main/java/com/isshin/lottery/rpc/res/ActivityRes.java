package com.isshin.lottery.rpc.res;

import com.isshin.lotterycommon.lottery.common.Result;
import com.isshin.lottery.rpc.dto.ActivityDto;

import java.io.Serializable;

/**
 * @author Yibo Lei
 * @since 2023/6/3
 */
public class ActivityRes implements Serializable {
    private Result result;
    private ActivityDto activityDto;

    public ActivityRes() {
    }

    public ActivityRes(Result result, ActivityDto activityDto) {
        this.result = result;
        this.activityDto = activityDto;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivityDto() {
        return activityDto;
    }

    public void setActivityDto(ActivityDto activityDto) {
        this.activityDto = activityDto;
    }
}
