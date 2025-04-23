package com._this;

public class UserInfo {

    private String userId;
    private String userPassword;
    private String userName;
    private String userAddress;
    private String phoneNumber;

    //생성자 매개변수 1개 에서 5개 즉 생성자 5개 만들어주세요
    public UserInfo(String userId){
        this.userId = userId;
    }
    public UserInfo(String userId, String userPassword){
        this.userId = userId;
        this.userPassword = userPassword;
    }
    public UserInfo(String userId, String userPassword, String userName){
        this(userId,userPassword);
        this.userName = userName;
    }
    public UserInfo(String userId, String userPassword, String userName, String userAddress){
        this(userId,userPassword,userName);
        this.userAddress = userAddress;
    }
    public UserInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber){
        this(userId,userPassword,userName,userAddress);
        this.phoneNumber = phoneNumber;

    }
    //getter 메서드 만들어주세요
    public String getUserId() {
        return userId;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setter 메서드 만들어주세요
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}//end of main
