package org.snva.hws.model;

public class PrivilegedUser extends  User {


    @Override
    public String toString() {
        return this.extra + super.toString();
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    private String extra="";
}
