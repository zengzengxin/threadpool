package com.zzx.threadpool.entity;

public class Message {
    private String id;

    private String tittle;

    private String body;

    public Message(String id, String tittle, String body) {
        this.id = id;
        this.tittle = tittle;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
