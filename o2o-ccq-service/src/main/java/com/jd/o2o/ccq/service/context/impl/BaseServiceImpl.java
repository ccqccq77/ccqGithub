package com.jd.o2o.ccq.service.context.impl;

import com.jd.o2o.ccq.dao.context.BaseDao;
import com.jd.o2o.ccq.domain.web.MainReqWeb;
import com.jd.o2o.ccq.domain.web.MainRespWeb;
import com.jd.o2o.ccq.service.context.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ccq on 2017/8/31.
 */
@Service
public class BaseServiceImpl implements BaseService {

    @Resource
    private BaseDao baseDao;

    @Override
    public MainRespWeb getInfo(MainReqWeb mainReqWeb){
        MainRespWeb mainRespWeb = baseDao.getInfoById(mainReqWeb);
        return mainRespWeb;
    }
}
