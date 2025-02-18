package org.example.infrastructure.dao;


import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.dao.po.CrowdTagsDetail;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 人群标签明细
 * @create 2024-12-28 11:49
 */
@Mapper
public interface ICrowdTagsDetailDao {

    void addCrowdTagsUserId(CrowdTagsDetail crowdTagsDetailReq);

}
