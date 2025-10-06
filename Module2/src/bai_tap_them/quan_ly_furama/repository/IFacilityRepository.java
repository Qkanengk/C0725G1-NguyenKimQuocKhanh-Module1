package bai_tap_them.quan_ly_furama.repository;

import bai_tap_them.quan_ly_furama.entity.Facility.Facility;

import java.util.List;


public interface IFacilityRepository extends Repository<Facility> {

    List<Facility> getMaintenanceList();

     void incrementUsage(String code);
}
