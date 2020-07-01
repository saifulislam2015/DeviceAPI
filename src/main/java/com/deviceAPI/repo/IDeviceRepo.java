package com.deviceAPI.repo;

import com.deviceAPI.model.DeviceDD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDeviceRepo extends JpaRepository<DeviceDD,Long> {
}
