package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_1.test1");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    float var1 = var0.getAlignmentX();
    var0.setVisible(false);
    SpaceWar.SpacePanel var4 = new SpaceWar.SpacePanel();
    java.awt.Color var5 = var4.getBackground();
    var0.setForeground(var5);
    var0.run();

  }

}
