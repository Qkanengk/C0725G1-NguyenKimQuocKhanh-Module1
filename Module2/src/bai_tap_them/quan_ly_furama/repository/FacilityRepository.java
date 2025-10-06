package bai_tap_them.quan_ly_furama.repository;

import bai_tap_them.quan_ly_furama.entity.Facility.Facility;
import bai_tap_them.quan_ly_furama.entity.Facility.Vila;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    protected static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    static {
        facilityMap.put(new Vila("SVVL-0001", "BeachVilla", 120.5, 2000.0, 8, "Day", "Deluxe", 50.0, 2), 0);
        facilityMap.put(new Vila("SVVL-0002", "BeachVilla", 120.5, 2000.0, 8, "Day", "Deluxe", 50.0, 2), 4);
    }

    @Override
    public List<Facility> findAll() {
        Map<Facility, Integer> tempFacilityMap = new LinkedHashMap<>();
        tempFacilityMap.putAll(facilityMap);
        for (Map.Entry<Facility, Integer> entry : tempFacilityMap.entrySet()) {
            if (entry.getValue() >= 5) {
                tempFacilityMap.remove(entry.getKey());
            }
        }
        return new ArrayList<>(tempFacilityMap.keySet());
    }

    @Override
    public boolean add(Facility facility) {
        if (facilityMap.containsKey(facility)) {
            return false;
        } else {
            facilityMap.put(facility, 0);
            return true;
        }
    }

    @Override
    public void update(String id, Facility facility) {
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public Facility findById(String id) {
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getKey().getServiceId().equals(id)) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override
    public List<Facility> getMaintenanceList() {
        List<Facility> mainTenanceList = new ArrayList<>();
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getValue() >= 5) {
                mainTenanceList.add(entry.getKey());
            }
        }
        return mainTenanceList;
    }

    @Override
    public void incrementUsage(String id) {
        Facility facility = findById(id);
        if (facility != null) {
            facilityMap.put(facility, facilityMap.get(facility) + 1);
        }
    }
}
