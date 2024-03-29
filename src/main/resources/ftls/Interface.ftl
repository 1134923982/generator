package ${BasePackageName}${InterfacePackageName};

import ${BasePackageName}${EntityPackageName}.${ClassName}Entity;

import java.util.List;
import java.util.Map;

/**
 * Author ${Author}
 * Date  ${Date}
 */
public interface ${ClassName}Service {

    /**
     * 分页查询
     *
     * @param map 参数
     * @return list
     */
    List<${ClassName}Entity> queryList(Map<String, Object> map);

    /**
    * 分页统计总数
    *
    * @param map 参数
    * @return 总数
    */
    int queryTotal(Map<String, Object> map);

}
