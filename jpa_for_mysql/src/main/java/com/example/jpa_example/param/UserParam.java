package com.example.jpa_example.param;

public class UserParam {

    private String userId;
    private Integer minAge;
    private Integer maxAge;
    private String realName;
    private String introduction;
    private String city;

    public UserParam() {
    }

    public UserParam(String userId, Integer minAge, Integer maxAge, String realName, String introduction, String city) {
        this.userId = userId;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.realName = realName;
        this.introduction = introduction;
        this.city = city;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
