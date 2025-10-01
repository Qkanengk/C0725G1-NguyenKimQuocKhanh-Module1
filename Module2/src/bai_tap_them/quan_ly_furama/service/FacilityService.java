package bai_tap_them.quan_ly_furama.service;

import bai_tap_them.quan_ly_furama.entity.Facility.Facility;
import bai_tap_them.quan_ly_furama.repository.FacilityRepository;
import bai_tap_them.quan_ly_furama.repository.IFacilityRepository;

import java.util.List;

public class FacilityService implements IFacilityService {
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public List<Facility> findAll() {
        return facilityRepository.findAll();
    }

    @Override
    public boolean add(Facility facility) {
        return facilityRepository.add(facility);
    }

    @Override
    public void update(String id, Facility facility) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Facility findById(String id) {
        return facilityRepository.findById(id);
    }

    @Override
    public List<Facility> getMaintenanceList() {
        return facilityRepository.getMaintenanceList();
    }
}
