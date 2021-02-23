package com.ak.oncallservice.oncallservice.controller;

import com.ak.oncallservice.oncallservice.data.CustomerEntryDao;
import com.ak.oncallservice.oncallservice.data.OnCallDatabaseDao;
import com.ak.oncallservice.oncallservice.model.CustomerEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://ec2-34-233-127-128.compute-1.amazonaws.com:3000")
@RestController
@RequestMapping("/api/oncall")
public class OnCallController {
    @Autowired
    public OnCallDatabaseDao dao;

    @PostMapping
    public CustomerEntry create(@RequestBody CustomerEntry custEntry) {
        return dao.add(custEntry);
    }

    @GetMapping()
    public String testEndpoint() {
        return "This test has passed";
    }

}
