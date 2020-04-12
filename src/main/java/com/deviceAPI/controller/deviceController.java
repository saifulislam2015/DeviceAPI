package com.deviceAPI.controller;

import com.deviceAPI.model.Device;
import com.deviceAPI.repo.IDeviceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
public class deviceController {
    @Autowired(required = true)
    private IDeviceRepo repo;

    @GetMapping("/test")
    public String Test(){
        return "OK";
    }

    @GetMapping("/devices")
    public List<Device> getDevices(){
        return repo.findAll();
    }
}
