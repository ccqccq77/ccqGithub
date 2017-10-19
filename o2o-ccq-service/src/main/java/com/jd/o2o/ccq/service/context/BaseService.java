package com.jd.o2o.ccq.service.context;


import com.jd.o2o.ccq.domain.web.MainReqWeb;
import com.jd.o2o.ccq.domain.web.MainRespWeb;

public interface BaseService {

    MainRespWeb getInfo(MainReqWeb mainReqWeb);
}
