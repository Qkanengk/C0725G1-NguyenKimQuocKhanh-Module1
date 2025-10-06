package bai_tap_them.quan_ly_furama.repository;

import bai_tap_them.quan_ly_furama.entity.Booking;
import bai_tap_them.quan_ly_furama.entity.Contract;

import java.util.Queue;

public interface IContractRepository extends Repository<Contract> {
    public Queue<Booking> findQueue();
}
