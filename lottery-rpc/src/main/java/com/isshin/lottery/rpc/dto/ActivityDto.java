package com.isshin.lottery.rpc.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Yibo Lei
 * @since 2023/6/3
 */
public class ActivityDto implements Serializable {
    /**
     * actvity ID
     */
    private Long activityId;

    private String activityName;

    /**
     * activity description
     */
    private String activityDesc;

    /**
     * begin time
     */
    private Date beginDateTime;

    /**
     * end time
     */
    private Date endDateTime;

    /**
     * stock
     */
    private Integer stockCount;


    /**
     * number of participation per person
     */
    private Integer takeCount;

    /**
     * activity state: edit、review、withDrawl、pass、running、reject、close、open
     */
    private Integer state;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public Date getBeginDateTime() {
        return beginDateTime;
    }

    public void setBeginDateTime(Date beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getTakeCount() {
        return takeCount;
    }

    public void setTakeCount(Integer takeCount) {
        this.takeCount = takeCount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
