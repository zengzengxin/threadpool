package com.zzx.threadpool.ctrl;


import com.zzx.threadpool.entity.Message;
import com.zzx.threadpool.entity.MessageMapper;
import com.zzx.threadpool.task.MessageTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;

@RestController
@RequestMapping("sendMessage")
public class ThreadPoolTest {

    @Autowired
    ThreadPoolExecutor myThreadPool;

    @Resource
    MessageMapper courseMapper;

    private int messageNum = 1000;

    Message ms = new Message("1：","回家啊过的机会噶机会是快递","asdassdasdasdasda");
    MessageTask msg = new MessageTask(ms);

    @GetMapping
    public String sendMessage(){
        courseMapper.insert(ms);
        for (int i = 0; i <messageNum ; i++) {
            myThreadPool.execute(msg);

        }
        return "消息推送成功";
    }
}
