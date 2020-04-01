package com.zzx.threadpool.task;


import com.zzx.threadpool.entity.Message;

public class MessageTask implements Runnable{
    private Message message;

    private int ticket = 1000;

    public MessageTask(Message msg){
        this.message = msg;
    }

    public void run(){
        System.out.println(ticket--);
        if (ticket == 20){
            int i = 1/0;
        }
    }

}
