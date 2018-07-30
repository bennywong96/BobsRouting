package org.bob.cxfrs.beans;

import org.bob.cxfrs.beans.util.JSONUtil;


public class User {

    JSONUtil util = new JSONUtil();

    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(){

    }
}