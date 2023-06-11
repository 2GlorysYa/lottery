package com.isshin.lottery.infrastructure.po;

import java.util.Date;

/**
 * @author Yibo Lei
 * @since 2023/6/4
 */
public class Activity {
    /**
     * self-incrementing id
     */
    private Long id;
    /**
     * activity id
     */
    private Long activityId;
    /**
     * activity name
     */
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
     * activity state: activity state: edit、review、withDrawl、pass、running、reject、close、open
     */
    private Integer state;
    /**
     * creator
     */
    private String creator;
    /**
     * create time
     */
    private Date createTime;
    /**
     * update time
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
