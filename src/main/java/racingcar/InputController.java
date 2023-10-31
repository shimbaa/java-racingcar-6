package racingcar;

import java.util.List;

public class InputController {

    private final InputView inputView = new InputView();

    List<String> getCarNames() {
        String input = inputView.getCarNames();
        return inputToStringList(input);
    }

    int getTrialNumber() {
        String input = inputView.getTrialNumber();
        Validator.validateIsInteger(input);
        return Integer.parseInt(input);
    }

    private List<String> inputToStringList(String input) {
        String removeSpaceResult = Util.removeSpace(input);
        String[] splitByCommaResult = Util.splitByComma(removeSpaceResult);
        return Util.arrayToList(splitByCommaResult);
    }
}