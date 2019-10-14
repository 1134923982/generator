package com.example.generator.utils;

import com.example.generator.entity.ColumnEntity;
import com.example.generator.task.*;
import com.example.generator.task.base.AbstractTask;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Liumq
 * @Date   2019-05-28
 * @Describe 这个类统筹生成Controller.java、Service.java、Dao.java、entity.java、mapper.java、html、js的数据
 */
public class TaskQueue {

    private LinkedList<AbstractTask> taskQueue = new LinkedList<>();

    private void initCommonTasks(String className) {
        if (!StringUtil.isBlank(ConfigUtil.getConfiguration().getPath().getController())) {
            taskQueue.add(new ControllerTask(className));
        }
        if (!StringUtil.isBlank(ConfigUtil.getConfiguration().getPath().getService())) {
            taskQueue.add(new ServiceTask(className));
        }
        if (!StringUtil.isBlank(ConfigUtil.getConfiguration().getPath().getInterf())) {
            taskQueue.add(new InterfaceTask(className));
        }
        if (!StringUtil.isBlank(ConfigUtil.getConfiguration().getPath().getDao())) {
            taskQueue.add(new DaoTask(className));
        }
    }

    public void initSingleTasks(String className, String tableName, List<ColumnEntity> columnList,ColumnEntity primaryKey) {
        initCommonTasks(className);
        //初始化mappers
        if (!StringUtil.isBlank(ConfigUtil.getConfiguration().getPath().getMapper())) {
            taskQueue.add(new MapperTask(className,tableName,columnList,primaryKey));
        }
        //entity的初始化
        if (!StringUtil.isBlank(ConfigUtil.getConfiguration().getPath().getEntity())) {
            taskQueue.add(new EntityTask(className,columnList));
        }
        //html界面的初始化
        if(!StringUtil.isBlank(ConfigUtil.getConfiguration().getPath().getHtml())){
            taskQueue.add(new HtmlTask(className,columnList));
        }
        //js的初始化
        if(!StringUtil.isBlank(ConfigUtil.getConfiguration().getPath().getJs())){
            taskQueue.add(new JsTask(className,columnList));
        }
    }

    public boolean isEmpty() {
        return taskQueue.isEmpty();
    }

    public AbstractTask poll() {
        return taskQueue.poll();
    }

}
