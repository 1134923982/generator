package com.example.generator.utils;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @Author Liumq
 * @Date   2019/05/23
 */
public class FileUtil {

    /**
     * @param type     使用模板类型
     * @param data     填充数据
     * @param filePath 输出文件
     * @throws IOException
     * @throws TemplateException
     */
    public static void generateToJava(int type, Object data, String filePath, ZipOutputStream zip) throws IOException, TemplateException {
        File file = new File(filePath);
        if (file.exists()) {
            System.err.println("ERROR: " + file.getPath().substring(file.getPath().lastIndexOf("\\") + 1, file.getPath().length()) + " 已存在，请手动修改");
            return;
        }
        Template tpl = getTemplate(type); // 获取模板文件
        // 填充数据
        StringWriter writer = new StringWriter();
        tpl.process(data, writer);
        writer.flush();


        //添加到zip
        zip.putNextEntry(new ZipEntry(filePath));
        IOUtils.write(writer.toString(), zip, "UTF-8");
        IOUtils.closeQuietly(writer);
        zip.closeEntry();

    }

    /**
     * 获取模板
     *
     * @param type 模板类型
     * @return
     * @throws IOException
     */
    private static Template getTemplate(int type) throws IOException {
        switch (type) {
            case FreemarketConfigUtils.TYPE_ENTITY:
                return FreemarketConfigUtils.getInstance().getTemplate("Entity.ftl");
            case FreemarketConfigUtils.TYPE_DAO:
                return FreemarketConfigUtils.getInstance().getTemplate("Dao.ftl");
            case FreemarketConfigUtils.TYPE_SERVICE:
                return FreemarketConfigUtils.getInstance().getTemplate("Service.ftl");
            case FreemarketConfigUtils.TYPE_CONTROLLER:
                return FreemarketConfigUtils.getInstance().getTemplate("Controller.ftl");
            case FreemarketConfigUtils.TYPE_MAPPER:
                return FreemarketConfigUtils.getInstance().getTemplate("Mapper.ftl");
            case FreemarketConfigUtils.TYPE_INTERFACE:
                return FreemarketConfigUtils.getInstance().getTemplate("Interface.ftl");
            case FreemarketConfigUtils.TYPE_HTML:
                return FreemarketConfigUtils.getInstance().getTemplate("Html.ftl");
            case FreemarketConfigUtils.TYPE_JS:
                return FreemarketConfigUtils.getInstance().getTemplate("Js.ftl");
            default:
                return null;
        }
    }

    private static String getBasicProjectPath() {
        String path = new File(FileUtil.class.getClassLoader().getResource("").getFile()).getPath() + File.separator;
        StringBuilder sb = new StringBuilder();
//        sb.append(path.substring(0, path.indexOf("target"))).append("src").append(File.separator).append("main").append(File.separator);
        //TODO 基本路径

//        return sb.toString();
        return "E:\\";
    }

    /**
     * 获取源码路径
     *
     * @return
     */
    public static String getSourcePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(getBasicProjectPath()).append("java").append(File.separator);
        return sb.toString();
    }

    /**
     * 获取资源文件路径
     *
     * @return
     */
    public static String getResourcePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(getBasicProjectPath()).append("resources").append(File.separator);
        return sb.toString();
    }

}
