package bai_tap_them.quan_ly_furama.view;

import bai_tap_them.quan_ly_furama.entity.Facility.Facility;
import bai_tap_them.quan_ly_furama.entity.Facility.House;
import bai_tap_them.quan_ly_furama.entity.Facility.Room;
import bai_tap_them.quan_ly_furama.entity.Facility.Vila;
import bai_tap_them.quan_ly_furama.utils.validate.FacilityValidate;

import java.util.Scanner;

public class FacilityView {
    private static Scanner scanner = new Scanner(System.in);

    public static String serviceId() {
        String serviceId;
        System.out.println("Input service's ID");
        serviceId = scanner.nextLine();
        return serviceId;
    }

    public static String serviceName() {
        String serviceName;
        do {
            System.out.println("Input service's name");
            serviceName = scanner.nextLine();
        } while (!FacilityValidate.validateFacilityName(serviceName));
        return serviceName;
    }

    public static Double usableArea() {
        Double usableArea = 0.0;
        do {
            try {
                System.out.println("Input service's usable area (>=30)");
                usableArea = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

        } while (usableArea < 30);
        return usableArea;
    }

    public static Double rentalCost() {
        Double rentalCost = 0.0;
        do {
            try {
                System.out.println("Input service's rental cost");
                rentalCost = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

        } while (rentalCost <= 0);

        return rentalCost;
    }

    public static Integer maxPeople() {
        Integer maxPeople = 0;
        do {
            try {
                System.out.println("Input service's max people");
                maxPeople = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

        } while (maxPeople <= 0 || maxPeople > 20);

        return maxPeople;
    }

    public static String rentalType() {
        String rentalType;
        System.out.println("Input service's rental type");
        rentalType = scanner.nextLine();

        return rentalType;
    }

    public static String roomStandard() {
        String roomStandard;
        System.out.println("Input service's room standard");
        roomStandard = scanner.nextLine();
        return roomStandard;
    }

    public static Integer numberOfFloors() {
        Integer numberOfFloors = 0;
        do {
            try {
                System.out.println("Input service's number of floors");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

        } while (numberOfFloors <= 0);

        return numberOfFloors;
    }

    public static String freeServiceIncluded() {
        String freeServiceIncluded;
        System.out.println("Input service's free service included");
        freeServiceIncluded = scanner.nextLine();
        return freeServiceIncluded;
    }

    public static Double poolArea() {
        Double poolArea = 0.0;
        do {
            try {
                System.out.println("Input service's pool area");
                poolArea = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

        } while (poolArea < 30);

        return poolArea;
    }

    public static Facility getRoom() {
        String serviceId;
        do {
            serviceId = serviceId();
        }
        while (!FacilityValidate.validateRoomId(serviceId));
        String serviceName = serviceName();
        double usableArea = usableArea();
        double rentalCost = rentalCost();
        int maxPeople = maxPeople();
        String rentalType;
        do {
            rentalType = rentalType();
        }
        while (!FacilityValidate.validateRoomId(rentalType));
        String freeServiceIncluded = freeServiceIncluded();
        return new Room(serviceId, serviceName, usableArea, rentalCost, maxPeople, rentalType, freeServiceIncluded);
    }

    public static Facility getHouse() {
        String serviceId;
        do {
            serviceId = serviceId();
        }
        while (!FacilityValidate.validateHouseId(serviceId));
        String serviceName = serviceName();
        double usableArea = usableArea();
        double rentalCost = rentalCost();
        int maxPeople = maxPeople();
        String rentalType;
        do {
            rentalType = rentalType();
        }
        while (!FacilityValidate.validateHouseId(rentalType));
        String roomStandard;
        do {
            roomStandard = roomStandard();
        }
        while (!FacilityValidate.validateHouseId(roomStandard));
        int numberOfFloors = numberOfFloors();
        return new House(serviceId, serviceName, usableArea, rentalCost, maxPeople, rentalType, roomStandard, numberOfFloors);
    }

    public static Facility getVila() {
        String serviceId;
        do {
            serviceId = serviceId();
        }
        while (!FacilityValidate.validateVilaId(serviceId));
        String serviceName = serviceName();
        double usableArea = usableArea();
        double rentalCost = rentalCost();
        int maxPeople = maxPeople();
        String rentalType;
        do {
            rentalType = rentalType();
        }
        while (!FacilityValidate.validateVilaId(rentalType));
        String roomStandard;
        do {
            roomStandard = roomStandard();
        }
        while (!FacilityValidate.validateVilaId(roomStandard));
        double poolArea = poolArea();
        int numberOfFloors = numberOfFloors();
        return new Vila(serviceId, serviceName, usableArea, rentalCost, maxPeople, rentalType, roomStandard, poolArea, numberOfFloors);
    }

}
