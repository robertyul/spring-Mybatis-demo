package com.persistence.manager;

import com.persistence.dao.IDemoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by robertpicyu on 2017/4/17.
 */
@Repository("demoMannger")
public class DemoMannger {
    final protected Logger logger = LoggerFactory.getLogger(DemoMannger.class);
    @Autowired
    IDemoMapper demoMapper;

    public String getValue() {
        String value = demoMapper.getValue("0");
        logger.debug("get value : {}", value);
        return value;
    }
}
