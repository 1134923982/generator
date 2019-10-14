<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${BasePackageName}${DaoPackageName}.${ClassName}Dao">

    <resultMap type="${BasePackageName}entity.${ClassName}Entity" id="${EntityName}Map">
        <#list columns! as column>
        <result property="${column.attrname}" column="${column.columnName}"/>
        </#list>
    </resultMap>


    <select id="queryList" resultType="${BasePackageName}entity.${ClassName}Entity">
        select
        <#list columns! as column>
           `${column.columnName}`<#if column_has_next>,</#if>
        </#list>
        from ${TableName}
        WHERE 1=1
        <if test="name != null and name.trim() != ''">
            AND name LIKE concat('%',${r'#{name}'},'%')
        </if>
        <choose>
            <when test="sidx != null and sidx.trim() != ''">
                order by ${r'${sidx}'} ${r'${order}'}
            </when>
            <otherwise>
                order by ${PrimaryKey.columnName} desc
            </otherwise>
        </choose>
        <if test="offset != null and limit != null">
            limit ${r'#{offset}'},${r'#{limit}'}
        </if>
    </select>

    <select id="queryTotal" resultType="int">
        select count(*) from ${TableName}
        WHERE 1=1
        <if test="name != null and name.trim() != ''">
            AND name LIKE concat('%',${r'#{name}'},'%')
        </if>
    </select>

</mapper>