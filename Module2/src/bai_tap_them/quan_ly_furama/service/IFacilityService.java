package bai_tap_them.quan_ly_furama.service;

import bai_tap_them.quan_ly_furama.entity.Facility.Facility;

import java.util.List;

public interface IFacilityService extends Service<Facility> {
    List<Facility> getMaintenanceList();

    public  void incrementUsage(String id);
}
