package baseball.service;

import baseball.vo.GuessResultVO;

import java.util.List;

import static baseball.constant.GameConstant.NUMBER_LENGTH;

public class BaseballService {

    public GuessResultVO countStrikeAndBall(List<Integer> guess, List<Integer> answer) {
        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < NUMBER_LENGTH; i++) {
            if (guess.get(i).equals(answer.get(i))) {
                strikeCount++;
            } else if (answer.contains(guess.get(i))) {
                ballCount++;
            }
        }

        return new GuessResultVO(strikeCount, ballCount);
    }

}