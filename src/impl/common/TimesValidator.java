package impl.common;

public class TimesValidator {
    public Boolean isValid(Integer times) {
        return !(times == null || times.equals(0));
    }
}
