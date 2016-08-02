package impl.common;

public class NumberValidator {
    public Boolean isValid(Integer times) {
        return !(times == null || times.equals(0));
    }
}
