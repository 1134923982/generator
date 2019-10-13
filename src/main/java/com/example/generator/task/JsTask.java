package com.example.generator.task;

import com.example.generator.task.base.AbstractTask;
import com.example.generator.utils.ConfigUtil;
import com.example.generator.utils.FileUtil;
import com.example.generator.utils.FreemarketConfigUtils;
import com.example.generator.utils.StringUtil;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipOutputStream;

/**
 * Author 刘铭清
 * Date   2019/10/12
 */
public class JsTask extends AbstractTask {

    public JsTask(String className) {
        super(className);
    }

    @Override
    public void run(ZipOutputStream zip) throws IOException, TemplateException {
        // 生成html填充数据
        System.out.println("Generating " + className + ".js");
        Map<String, String> jsData = new HashMap<>();
        jsData.put("BasePackageName", ConfigUtil.getConfiguration().getPackageName());
        jsData.put("jsPackageName", ConfigUtil.getConfiguration().getPath().getJs());
        jsData.put("EntityPackageName", ConfigUtil.getConfiguration().getPath().getEntity());
        jsData.put("Author", ConfigUtil.getConfiguration().getAuthor());
        jsData.put("Date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        jsData.put("ClassName", className);
        jsData.put("EntityName", StringUtil.firstToLowerCase(className));
        String filePath = FileUtil.getResourcePath() + StringUtil.package2Path(ConfigUtil.getConfiguration().getPath().getHtml());
        String fileName = className + ".js";
        // 生成Service接口文件
        FileUtil.generateToJava(FreemarketConfigUtils.TYPE_JS, jsData, filePath + fileName,zip);
    }
}
