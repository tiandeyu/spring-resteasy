package cn.natic.customer.impl;

import cn.natic.customer.CustomerBo;
import org.springframework.stereotype.Component;

/**
 * Created by naticmac on 2017/8/27.
 */
@Component("customerBo")
public class CustomerBoImpl implements CustomerBo {

    public String getMsg() {
        return "RESTEasy + Spring example";
    }
}
