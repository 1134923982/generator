package ${BasePackageName}${ServicePackageName};

import ${BasePackageName}${DaoPackageName}.${ClassName}Dao;
import ${BasePackageName}${EntityPackageName}.${ClassName}Entity;
${InterfaceImport}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Author ${Author}
 * Date  ${Date}
 */
@Service
public class ${ClassName}Service${Impl} {
    @Autowired
    private ${ClassName}Dao ${EntityName}Dao;

    @Override
    public List<${ClassName}Entity> queryList(Map<String, Object> map) {
         return ${EntityName}Dao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
         return ${EntityName}Dao.queryTotal(map);
    }

}
