package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_2.test1");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    java.awt.Color var1 = var0.getBackground();
    var0.repaint();
    var0.setRequestFocusEnabled(false);
    var0.reshape(100, 0, 100, 0);
    var0.requestFocus();
    var0.firePropertyChange("hi!", '4', ' ');
    SpaceWar.Enemy var17 = new SpaceWar.Enemy(0, 100);
    int var18 = var17.getR();
    var17.explode();
    var0.putClientProperty((java.lang.Object)var17, (java.lang.Object)(short)10);
    var0.addNotify();

  }

}
