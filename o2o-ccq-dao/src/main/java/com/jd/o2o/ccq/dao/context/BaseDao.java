package com.jd.o2o.ccq.dao.context;

import com.jd.o2o.ccq.domain.web.MainReqWeb;
import com.jd.o2o.ccq.domain.web.MainRespWeb;

/**
 * Created by ccq on 2017/8/31.
 */
public interface BaseDao {
    MainRespWeb getInfoById(MainReqWeb mainReqWeb);
}
