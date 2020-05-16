package com.example.jpa_example.service;

import com.example.jpa_example.model.UserDetail;
import com.example.jpa_example.param.UserParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserDetailService {
    public Page<UserDetail> findByCondition(UserParam detailParam, Pageable pageable);

}
