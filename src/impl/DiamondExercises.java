package impl;

import api.Constant;
import api.IDiamondExercises;
import impl.common.TimesValidator;

import java.util.*;

public class DiamondExercises implements IDiamondExercises {
    private static Character asterisk = '*';
    private static Character space    = ' ';
    private TimesValidator validator = new TimesValidator();

    @Override
    public void isosceles(Integer times) {
        List<String> resultList = getDiamondStringResult(times,
                Constant.DimamondPattern.ISOSCELES);
        printResult(resultList);
    }

    @Override
    public void diamond(Integer times) {
        List<String> resultList = getDiamondStringResult(times,
                    Constant.DimamondPattern.DIAMOND);
        printResult(resultList);
    }

    @Override
    public void diamondWithName(Integer times) {
        List<String> resultList = getDiamondStringResult(times,
                Constant.DimamondPattern.DIAMOND_BY_NAME);
        printResult(resultList);
    }

    public List<String> getDiamondStringResult(Integer times, String pattern) {
        if (validator.isValid(times)) {
            List<String> resultList = getPositiveDiamondResult(times);
            if (pattern.equals(Constant.DimamondPattern.DIAMOND_BY_NAME)) {
                resultList.add(getUserName());
            } else {
                resultList.add(getMiddleLineOfAsterisk(times));
                if (pattern.equals(Constant.DimamondPattern.ISOSCELES)) {
                    return resultList;
                }
            }
            resultList.addAll(getNegativeDiamondResult(times));
            return resultList;
        }else {
            return null;
        }
    }

    public void printResult(List<String> resultList) {
        if (resultList != null && resultList.size() != 0) {
            resultList.forEach(System.out::print);
        }
    }

    public List<String> getPositiveDiamondResult(Integer times) {
        List<String> positiveResult = new ArrayList<>();
        Integer totalLength = times * 2 - 1;

        for (Integer index = 1 ; index < times; index ++) {
            Integer asteriskLength = index * 2 - 1;
            String asterisks = getRepeatCharsByNum(asteriskLength, asterisk);
            String spaces    = getRepeatCharsByNum((totalLength - asteriskLength) / 2, space);
            positiveResult.add(spaces + asterisks + spaces + "\n");
        }
        return positiveResult;
    }

    public List<String> getNegativeDiamondResult(Integer times) {
        List<String> negativeResult = getPositiveDiamondResult(times);
        Collections.reverse(negativeResult);
        return negativeResult;
    }

    public String getMiddleLineOfAsterisk(Integer times) {
        return getRepeatCharsByNum(times * 2 - 1, asterisk) + "\n";
    }

    public String getUserName() {
        Map<String, String> map = System.getenv();
        return map.get("USER") + '\n';
    }

    public String getRepeatCharsByNum(Integer num, Character character) {
        String repeatString = "";
        for (Integer index = 0; index < num ; index ++) {
            repeatString = repeatString.concat(character.toString());
        }
        return repeatString;
    }
}
