package com.isshin.lottery.interfaces;

import com.isshin.lottery.infrastructure.dao.IActivityDao;
import com.isshin.lottery.infrastructure.po.Activity;
import com.isshin.lottery.rpc.IActivityBooth;
import com.isshin.lottery.rpc.dto.ActivityDto;
import com.isshin.lottery.rpc.req.ActivityReq;
import com.isshin.lottery.rpc.res.ActivityRes;
import com.isshin.lotterycommon.lottery.common.Constants;
import com.isshin.lotterycommon.lottery.common.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yibo Lei
 * @since 2023/6/11
 */
@Service
public class ActivityBooth implements IActivityBooth {
    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(),
                Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }
}
