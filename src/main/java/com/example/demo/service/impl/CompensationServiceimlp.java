package com.example.demo.service.impl;

import com.example.demo.dao.CompensationDao;
import com.example.demo.entity.Compensation;
import com.example.demo.entity.Staff;
import com.example.demo.service.CompensationService;
import com.example.demo.utils.DateUtil;
import com.example.demo.utils.ObjUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("compensationService")
public class CompensationServiceimlp implements CompensationService {

    @Autowired
    private CompensationDao compensationDao;

    /**
     * 员工查看自己
      * @param staff
     * @return
     */
    @Override
    public List<Compensation> checkAccountByCompensation(Staff staff) {
        Compensation compensation = new Compensation();
        compensation.setStaff(staff);
        String datetime = DateUtil.dateYear();
        compensation.setCompensationDate(datetime);
        return compensationDao.checkAccountByCompensationDao(compensation);
    }

    @Override
    public int updateAccountByCompensationDao(Compensation compensation) {
        Staff staff = ObjUtil.getStaff();
        compensation.setStaff(staff);
        return compensationDao.updateAccountByCompensationDao(compensation);
    }


    /**
     * 查看全部工资
     * @return
     */
    public List<Compensation> lookAllCompensation(){
        return compensationDao.lookCompensationAllDao();
    }
}
