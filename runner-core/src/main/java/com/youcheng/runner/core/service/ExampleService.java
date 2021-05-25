package com.youcheng.runner.core.service;


import com.youcheng.runner.core.domain.Example;

public interface ExampleService {

    public Example save(Example example);

    public Example findById(Long id);

}

