package com.youcheng.runner.core.service;

import com.youcheng.runner.core.service.domain.Manager;

public interface ManagerService {

    /**
     * 管理员登录
     * @param username
     * @param password
     * @return
     */
    public Manager login(String username, String password);

    /**
     * 通过ID获取管理员信息
     * @param id
     * @return
     */
    public Manager get(Long id);

    /**
     * 修改密码
     * @param id
     * @param newPwd
     * @return
     */
    public Manager modifyPwd(Long id, String newPwd);
}