package com.jd.o2o.ccq.web.controller;

import com.alibaba.fastjson.JSON;
import com.jd.o2o.ccq.domain.web.ExtendMobieClientContext;
import com.jd.o2o.ccq.domain.web.InvoiceReqWeb;
import com.jd.o2o.ccq.domain.web.MainReqWeb;
import com.jd.o2o.ccq.domain.web.MainRespWeb;
import com.jd.o2o.ccq.service.context.BaseService;
import com.jd.o2o.commons.domain.response.ServiceResponse;
import com.jd.o2o.commons.springmvc.ext.bind.annotation.RequestJsonParam;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by ccq on 2017/8/29.
 */
/*测试git fetch    不测试啦   到底测试不*/
@Controller
@RequestMapping("/ccq")
public class BaseController {
    private static final Logger log = LoggerFactory.getLogger(BaseController.class);

    @Resource
    private BaseService baseService;

    @ResponseBody
    @RequestMapping(value = "/login", consumes = {"application/json;charset=utf-8"},
            produces = {"application/json;charset=utf-8"}, method = RequestMethod.POST)
    public String test(HttpServletRequest req, HttpServletResponse rep) throws Exception {
        /*JSONObject jsonObject1 = new JSONObject(req);
        System.out.println(jsonObject1);*/
        System.out.println("输入为："+req);
        JSONObject jsonObject1 = new JSONObject(req);
        System.out.println(jsonObject1);
        //System.out.println("序列化后"+JSON.toJSONString(req)); // fastJson来json化
        String reqBody = getRequestBody(req);
        JSONObject jsonObject = new JSONObject(reqBody);
        String test = jsonObject.getString("test");
        System.out.println("输入：" + test);
        MainReqWeb mainReqWeb = new MainReqWeb();
        mainReqWeb.setId(test);
        //MainRespWeb mainRespWeb = baseService.getInfo(mainReqWeb);
        //System.out.println("输出"+mainRespWeb.getName());
        return test;
    }

    @ResponseBody
    @RequestMapping(value = "/login1", consumes = {"application/json;charset=utf-8"},
            produces = {"application/json;charset=utf-8"}, method = RequestMethod.POST)
    public String test1(HttpServletRequest req, HttpServletResponse rep) throws Exception {
        /*JSONObject jsonObject1 = new JSONObject(req);
        System.out.println(jsonObject1);*/
        String reqBody = getRequestBody(req);
        JSONObject jsonObject = new JSONObject(reqBody);
        String test = jsonObject.getString("test");
        System.out.println("输入：" + test);
        MainReqWeb mainReqWeb = new MainReqWeb();
        mainReqWeb.setId(test);
        MainRespWeb mainRespWeb = baseService.getInfo(mainReqWeb);
        System.out.println("输出"+mainRespWeb.getName());
        return test;
    }

    @RequestMapping(value = "/insertInvoiceInfo", method = {RequestMethod.POST})
    @ResponseBody
    public ServiceResponse insertInvoice(ExtendMobieClientContext context, @RequestJsonParam("body") InvoiceReqWeb invoiceReqWeb) {
        log.info("入参pin={},invoiceReqWeb={}", context.getPin(), JSON.toJSONString(invoiceReqWeb));
        return null;
    }


    private String getRequestBody(HttpServletRequest req) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        String reqBody = sb.toString();
        return reqBody;
    }

}
