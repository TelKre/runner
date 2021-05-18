package com.youcheng.runner.core.service.impl;

import com.youcheng.runner.core.service.domain.Example;
import com.youcheng.runner.core.service.repository.ExampleRepository;
import com.youcheng.runner.core.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService{

    @Autowired
    private ExampleRepository exampleRepository;
    @Override
    public Example save(Example example){

        return exampleRepository.save(example);
    }
    @Override
    public Example findById(Long id){
        return exampleRepository.findOne(id);
    }

}
