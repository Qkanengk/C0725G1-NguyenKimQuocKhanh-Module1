package bai_tap_them.quan_ly_furama.repository;


import bai_tap_them.quan_ly_furama.entity.Booking;
import bai_tap_them.quan_ly_furama.entity.Contract;
import bai_tap_them.quan_ly_furama.utils.BookingComparator;


import java.util.*;

public class ContractRepository implements IContractRepository {

    private static Queue<Booking> bookingQueue = new PriorityQueue<>(new BookingComparator());
    private static TreeSet<Contract> contractTreeSet = new TreeSet<>();

    static {
        bookingQueue.addAll(BookingRepository.bookingTreeSet);
        contractTreeSet.add(new Contract("CT112", "1212", 2000, 2000));
    }

    @Override
    public List<Contract> findAll() {
        return new ArrayList<>(contractTreeSet);
    }

    @Override
    public boolean add(Contract contract) {
        if (contractTreeSet.contains(contract)) {
            return false;
        } else {
            if (bookingQueue.peek().getBookingId().equals(contract.getBookingId())) {
                BookingRepository.bookingTreeSet.removeIf(booking -> booking.getBookingId().equals(contract.getBookingId()));
                bookingQueue.poll();
                contractTreeSet.add(contract);
                return true;
            }
            return false;
        }
    }

    @Override
    public void update(String id, Contract contract) {
        for (Contract contract1 : contractTreeSet) {
            if (contract1.getContractId().equals(id)) {
                contractTreeSet.remove(contract1);
                contractTreeSet.add(contract);
                break;
            }
        }
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Contract findById(String id) {
        return null;
    }

    public Queue<Booking> findQueue() {
        return bookingQueue;
    }
}
