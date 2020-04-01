package com.zzx.threadpool.entity;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Author: huanglp
 * Date: 2018-12-11
 */
@Mapper
public interface MessageMapper extends BaseMapper<Message> {


}
