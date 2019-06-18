package com.hxx.lessontwo.jpa;

import com.hxx.lessontwo.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 请求日志数据接口
 * ========================

 * Time：21:06
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface LoggerJPA
        extends JpaRepository<LoggerEntity,Long>
{

}