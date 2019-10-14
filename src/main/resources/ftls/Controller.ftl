package ${BasePackageName}${ControllerPackageName};

import ${BasePackageName}${EntityPackageName}.${ClassName}Entity;
import ${BasePackageName}${ServicePackageName}.${ClassName}Service;
import ${BasePackageName}utils.Query;
import ${BasePackageName}utils.R;
import ${BasePackageName}utils.PageMap;
import ${BasePackageName}utils.PageUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Author ${Author}
 * Date  ${Date}
 */
@RestController
@RequestMapping("${pathName}")
public class ${ClassName}Controller {
    @Autowired
    private ${ClassName}Service ${EntityName}Service;

    /**
     * 查看列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("${pathName}:list")
    public R list(@RequestBody PageMap pageMap) {
        //查询列表数据
        Query query = new Query(pageMap.getMap());

        List<${ClassName}Entity> ${EntityName}List = ${EntityName}Service.queryList(query);
        int total = ${EntityName}Service.queryTotal(query);

        PageUtils pageUtil = new PageUtils(${EntityName}List, total, query.getLimit(), query.getPage());

        return R.ok().put("page", pageUtil);
    }


}
