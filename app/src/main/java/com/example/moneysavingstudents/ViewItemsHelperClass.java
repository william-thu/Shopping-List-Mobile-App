package com.example.moneysavingstudents;

public class ViewItemsHelperClass {

    String tv1, tv2, tv3, tv4, user_username, user_name, user_email;

    Boolean purchased;
    public ViewItemsHelperClass() {

    }

    public ViewItemsHelperClass(String tv1, String tv2, String tv3, String tv4, Boolean purchased, String user_username, String user_name, String user_email) {
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.tv3 = tv3;
        this.tv4 = tv4;
        this.purchased = purchased;
        this.user_username=user_username;
        this.user_name=user_name;
        this.user_email=user_email;

    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_username() {
        return user_username;
    }

    public String getUser_email() { return user_email; }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public Boolean getPurchased() {
        return purchased;
    }

    public void setPurchased(Boolean purchased) {
        this.purchased = purchased;
    }

    public String getTv1() {
        return tv1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public String getTv2() {
        return tv2;
    }

    public void setTv2(String tv2) {
        this.tv2 = tv2;
    }

    public String getTv3() {
        return tv3;
    }

    public void setTv3(String tv3) {
        this.tv3 = tv3;
    }

    public String getTv4() {
        return tv4;
    }

    public void setTv4(String tv4) {
        this.tv4 = tv4;
    }
}
