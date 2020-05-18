package com.example.jpa_example.service;

import com.example.jpa_example.model.User;
import com.example.jpa_example.model.UserDetail;
import com.example.jpa_example.param.UserParam;
import com.example.jpa_example.repository.UserDetailRepository;
import com.mysql.cj.util.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImp implements UserDetailService {


    @Resource
    private UserDetailRepository userDetailRepository;


    @Override
    public Page<UserDetail> findByCondition(UserParam detailParam, Pageable pageable) {

        return userDetailRepository.findAll((root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            //equal
            if (!StringUtils.isNullOrEmpty(detailParam.getIntroduction())) {
                predicates.add(cb.equal(root.get("introduction"), detailParam.getIntroduction()));
            }
            //like
            if (!StringUtils.isNullOrEmpty(detailParam.getRealName())) {
                predicates.add(cb.like(root.get("realName"), "%" + detailParam.getRealName() + "%"));
            }
            //between
            if (detailParam.getMinAge() != null && detailParam.getMaxAge() != null) {
                Predicate agePredicate = cb.between(root.get("age"), detailParam.getMinAge(), detailParam.getMaxAge());
                predicates.add(agePredicate);
            }
            //greaterThan
            if (detailParam.getMinAge() != null) {
                predicates.add(cb.greaterThan(root.get("age"), detailParam.getMinAge()));
            }
            return query.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
        }, pageable);


    }
}
