package cn.natic.mybatis.beans;

import java.io.Serializable;

/**
 * Created by naticmac on 2017/8/16.
 */

public class UserBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;
    private String password;
    private Double account;

    public UserBean() {
        super();
    }

    public UserBean(String username, String password, Double account) {
        this();
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public UserBean(Integer id, String username, String password, Double account) {
        this(username, password, account);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }
}
