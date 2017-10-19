package com.jd.o2o.ccq.dao.context.util;


import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


public class O2ODynamicDataSource extends AbstractRoutingDataSource {
    private static Logger log = LogManager.getLogger(O2ODynamicDataSource.class);

    /**
     * 库数量
     */
    private int dbNum;

    @Override
    protected Object determineCurrentLookupKey() {
        String pin = DynamicDataSourceHolder.getDataSouce();
        if (StringUtils.isBlank(pin)) {
            return -1;
        }
        try {
            return Integer.parseInt(pin);
        } catch (Exception e) {
            int hash = pin.hashCode();
            if (dbNum == 0) {
                return 0;
            }
            int absValue = Math.abs(hash);
            //绝对值为负数时，使用最大int值
            int inx = absValue < 0 ? Integer.MAX_VALUE % dbNum : absValue % dbNum;
            log.info("{}属于{}库", pin, inx);
            return inx;
        }

    }

    public int getDbNum() {
        return dbNum;
    }

    public void setDbNum(int dbNum) {
        this.dbNum = dbNum;
    }
}