package com.vkeonline.enthuware;

import com.vkeonline.enthuware.exam816.StreamFeatures;
import org.junit.jupiter.api.Test;

class StreamFeaturesTest {
    static StreamFeatures sf = new StreamFeatures() ;

    @Test
    void testComputeAverage() {
        StreamFeatures.computeAverage() ;
    }

    @Test
    void getMax() {
        sf.getMax();
    }

    @Test
    void getTenRandomDoubles() {
        sf.getTenRandomDoubles();
    }

    @Test
    void checkJoining() {
        sf.checkJoining();
    }

    @Test
    void checkIntStream() {
        sf.checkIntStream();
    }
}