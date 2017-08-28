package cn.natic.mybatis.mapper;

import cn.natic.mybatis.beans.UserBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by naticmac on 2017/8/27.
 */
public interface UserMapper {

    @Select("SELECT * FROM t_user WHERE id = #{userId}")
    UserBean getUser(@Param("userId") String userId);
}
