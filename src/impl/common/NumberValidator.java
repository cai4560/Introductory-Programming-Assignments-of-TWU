package impl.common;

public class NumberValidator {
    public Boolean isValid(Integer number) {
        return !(number == null || number.equals(0));
    }
}
