package com.deviceAPI.repo;

import com.deviceAPI.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDeviceRepo extends JpaRepository<Device,Long> {
}
