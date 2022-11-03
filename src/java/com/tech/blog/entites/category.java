
package com.tech.blog.entites;

public class category {
    
    private int cid;
    private String name;
    private String descr;

    public category(int cid, String name, String descr) {
        this.cid = cid;
        this.name = name;
        this.descr = descr;
    }

    public category() {
    }

    public category(String name, String descr) {
        this.name = name;
        this.descr = descr;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
    
    
    
}
