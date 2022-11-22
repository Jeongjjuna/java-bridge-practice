package bridge.model;

import bridge.BridgeMaker;
import bridge.BridgeNumberGenerator;
import bridge.BridgeRandomNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BridgeMakerTest {
    private BridgeMaker bridgeMaker;

    @BeforeEach
    void setUp() {
        BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
        bridgeMaker = new BridgeMaker(bridgeNumberGenerator);
    }

    @DisplayName("다리가 잘 생성되었나 확인")
    @Test
    void 사이즈에_맞는_다리_생성_확인1() {
        Bridge result = bridgeMaker.makeBridge(5);
        System.out.println(result);
        assertThat(result.getSize()).isEqualTo(5);
    }

    @DisplayName("다리가 잘 생성되었나 확인")
    @Test
    void 사이즈에_맞는_다리_생성_확인2() {
        Bridge result = bridgeMaker.makeBridge(10);
        System.out.println(result);
        assertThat(result.getSize()).isEqualTo(10);
    }
}