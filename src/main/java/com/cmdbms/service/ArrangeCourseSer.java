package com.cmdbms.service;

import com.cmdbms.model.Argcoure;

import java.util.List;

public interface ArrangeCourseSer {
    int insertOne(Argcoure course);

    List selectOne();

    int updateOne(Argcoure course);

    int deleteOne(int id);
}
