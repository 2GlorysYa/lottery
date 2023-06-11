package com.isshin.lottery.rpc;

import com.isshin.lottery.rpc.req.ActivityReq;
import com.isshin.lottery.rpc.res.ActivityRes;

/**
 * @author Yibo Lei
 * @since 2023/6/3
 */
public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}
