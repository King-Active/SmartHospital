package org.example.smarthospital_back.controller;
import org.example.smarthospital_back.entity.FeeEntity;
import org.example.smarthospital_back.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@CrossOrigin

@RequestMapping("/Fee")
public class FeeController {
    @Autowired
    FeeRepository fr;
    @RequestMapping(value = "/generateFee", method = RequestMethod.POST)
    @ResponseBody
    public String generateFee(String fee_type,
                              long u_id,
                              double fee_money
    ){
        long currentTimeMillis = System.currentTimeMillis();
        Timestamp currentTimestamp = new Timestamp(currentTimeMillis);
        int generateResult = fr.generateFee(fee_type,u_id,fee_money,currentTimestamp);
        if(generateResult == 0) {
            return "生成失败";
        } else {
            return "生成成功";
        }
    }
    @RequestMapping(value = "/payFee", method = RequestMethod.POST)
    @ResponseBody
    public String payFee(long fee_id){
        int payResult = fr.payFee(fee_id);
        if(payResult == 0) {
            return "支付失败";
        } else {
            return "支付成功";
        }
    }
    @RequestMapping(value = "/checkFee", method = RequestMethod.POST)
    @ResponseBody
    public List<FeeEntity> checkFee(long u_id){
        return fr.checkFee(u_id);
    }
}
