package bridge;

import java.util.ArrayList;
import java.util.List;

public class BridgeMaker {

    private final BridgeNumberGenerator bridgeNumberGenerator;

    public BridgeMaker(BridgeNumberGenerator numberGenerator) {
        this.bridgeNumberGenerator = numberGenerator;
    }

    /**
     * @param size 다리의 길이
     * @return 입력받은 길이에 해당하는 다리 모양. 위 칸이면 "U", 아래 칸이면 "D"로 표현해야 한다.
     */
    public List<String> makeBridge(int size) {
        List<String> newBridge = new ArrayList<>();
        //Bridge newBridge = new Bridge();

        for (int i = 0; i < size; i++) {
            int randomNum = bridgeNumberGenerator.generate();
            if (randomNum == 1) {
                newBridge.add("U");
                continue;
            }
            newBridge.add("D");
        }
        return newBridge;
    }
}
