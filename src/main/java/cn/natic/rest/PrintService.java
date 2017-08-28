package cn.natic.rest;

import cn.natic.customer.CustomerBo;
import cn.natic.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by naticmac on 2017/8/27.
 */
@Path("/customer")
@Component
public class PrintService {

    @Autowired
    CustomerBo customerBo;
    @Autowired
    UserMapper userMapper;

    @GET
    @Path("/print")
    public Response printMessage() {
        String result = customerBo.getMsg();
        result = userMapper.getUser("7").getUsername() + result;
        return Response.status(200).entity(result).build();
    }

}
