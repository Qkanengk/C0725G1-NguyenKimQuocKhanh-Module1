package bai_tap_them.quan_ly_furama.utils.validate;

public class ContractValidate {
    public static boolean validateContractId(String id) {
        return id.matches("^CT-\\d{4}$");
    }
}
