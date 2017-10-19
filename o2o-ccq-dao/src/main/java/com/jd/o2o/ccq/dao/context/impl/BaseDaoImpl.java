package com.jd.o2o.ccq.dao.context.impl;

import com.jd.o2o.ccq.dao.context.BaseDao;
import com.jd.o2o.ccq.dao.context.util.DynamicDataSourceHolder;
import com.jd.o2o.ccq.domain.web.Invoice;
import com.jd.o2o.ccq.domain.web.MainReqWeb;
import com.jd.o2o.ccq.domain.web.MainRespWeb;
import com.jd.o2o.commons.dao.GenericDAOImpl;
import com.jd.o2o.commons.dao.annotation.TableDesc;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ccq on 2017/8/31.
 */
@TableDesc(nameSpace = "InvoiceMapper")
@Repository
public class BaseDaoImpl extends GenericDAOImpl<Object, Long> implements BaseDao {

    @Override
    public MainRespWeb getInfoById(MainReqWeb mainReqWeb){
        MainRespWeb mainRespWeb = new MainRespWeb();
        mainRespWeb.setName(mainReqWeb.getId()+"dao");
        Map<String, Object> param = new HashMap<String, Object>();
        Invoice invoice = new Invoice();
        invoice.setPin(mainReqWeb.getId()+"进来了");
        DynamicDataSourceHolder.putDataSource(invoice.getPin());
        invoice.setInvoiceId(7776L);
        param.put("invoice", invoice);
        int a = this.insert("insertInvoice", param);
        System.out.println("返回的结果为"+a);
        return mainRespWeb;
    }
}
