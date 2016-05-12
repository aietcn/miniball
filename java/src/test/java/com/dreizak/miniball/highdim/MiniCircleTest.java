package com.dreizak.miniball.highdim;

import com.dreizak.miniball.model.ArrayPointSet;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * @author baoqiang
 */
public class MiniCircleTest {

  @Test
  public void testMiniCircle() throws Exception {
    ArrayPointSet pointSet = new ArrayPointSet(2, 3);
    pointSet.set(0, 0, 0);
    pointSet.set(0, 1, 0);
    pointSet.set(1, 0, 0);
    pointSet.set(1, 1, 1);
    pointSet.set(2, 0, 0.5);
    pointSet.set(2, 1, 0.5);
    Miniball miniball = new Miniball(pointSet);
    assertTrue(miniball.radius()==0.5);
    double[] coords = miniball.center();
    assertTrue(coords[0]==0);
    assertTrue(coords[1]==0.5);
  }
}
