package randoop;

import junit.framework.*;

public class RandoopTest10 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test1");


    SpaceWar.PowerUp var3 = new SpaceWar.PowerUp(10, 240.9713786093358d, 579.3282808260785d);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test2");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    float var1 = var0.getAlignmentX();
    var0.setVisible(false);
    var0.nextFocus();
    var0.updateUI();
    var0.enableInputMethods(true);
    java.lang.String var8 = var0.toString();
    SpaceWar.SpacePanel var9 = new SpaceWar.SpacePanel();
    float var10 = var9.getAlignmentX();
    var9.setVisible(false);
    boolean var13 = var9.isDoubleBuffered();
    java.awt.dnd.DropTarget var14 = var9.getDropTarget();
    var9.show(false);
    java.awt.Rectangle var17 = var9.getVisibleRect();
    java.awt.image.BufferedImage var19 = var9.loadImg("SpaceWar.SpacePanel[,0,0,0x0,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=800,height=600]]");
    java.awt.ComponentOrientation var20 = var9.getComponentOrientation();
    boolean var21 = var9.isPaintingTile();
    boolean var22 = var9.isOptimizedDrawingEnabled();
    int var23 = var0.getComponentZOrder((java.awt.Component)var9);
    javax.swing.JRootPane var24 = var0.getRootPane();
    boolean var25 = var0.isMaximumSizeSet();
    java.lang.String var26 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "SpaceWar.SpacePanel[,0,0,0var8,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=800,height=600]]"+ "'", var8.equals("SpaceWar.SpacePanel[,0,0,0var8,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=800,height=600]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test3");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    float var1 = var0.getAlignmentX();
    var0.setVisible(false);
    SpaceWar.SpacePanel var4 = new SpaceWar.SpacePanel();
    java.awt.Color var5 = var4.getBackground();
    var0.setForeground(var5);
    SpaceWar.SpacePanel var7 = new SpaceWar.SpacePanel();
    float var8 = var7.getAlignmentX();
    var7.setVisible(false);
    boolean var11 = var7.isDoubleBuffered();
    java.awt.dnd.DropTarget var12 = var7.getDropTarget();
    var7.show(false);
    java.awt.Rectangle var15 = var7.getVisibleRect();
    var0.repaint(var15);
    java.awt.FocusTraversalPolicy var17 = var0.getFocusTraversalPolicy();
    java.awt.im.InputMethodRequests var18 = var0.getInputMethodRequests();
    var0.layout();
    java.awt.Point var20 = var0.getMousePosition();
    java.awt.Container var21 = var0.getTopLevelAncestor();
    var0.setOpaque(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test4");


    SpaceWar.Player var0 = new SpaceWar.Player();
    int var1 = var0.getPower();
    var0.setLeft(true);
    var0.increasePower(0);
    int var6 = var0.getR();
    int var7 = var0.getLives();
    var0.setRigth(false);
    int var10 = var0.getScore();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test5");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    float var1 = var0.getAlignmentX();
    var0.setVisible(false);
    boolean var4 = var0.isDoubleBuffered();
    var0.enable(false);
    boolean var7 = var0.requestDefaultFocus();
    SpaceWar.SpacePanel var8 = new SpaceWar.SpacePanel();
    float var9 = var8.getAlignmentX();
    var8.firePropertyChange("", (-1), 1);
    java.awt.event.MouseListener[] var14 = var8.getMouseListeners();
    int var15 = var8.getDebugGraphicsOptions();
    SpaceWar.SpacePanel var16 = new SpaceWar.SpacePanel();
    float var17 = var16.getAlignmentX();
    var16.setVisible(false);
    boolean var20 = var16.isDoubleBuffered();
    java.awt.dnd.DropTarget var21 = var16.getDropTarget();
    var16.show(false);
    java.awt.Rectangle var24 = var16.getVisibleRect();
    var8.paintImmediately(var24);
    var8.firePropertyChange("SpaceWar.SpacePanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=800,height=600]]", '#', '#');
    var8.list();
    java.awt.Rectangle var31 = var8.getBounds();
    var0.scrollRectToVisible(var31);
    SpaceWar.Player var33 = new SpaceWar.Player();
    boolean var34 = var33.isRecovering();
    var33.setRigth(false);
    int var37 = var33.getPowerLevel();
    var33.increasePower((-1));
    java.lang.Object var40 = var0.getClientProperty((java.lang.Object)(-1));
    var0.setFocusable(true);
    java.awt.peer.ComponentPeer var43 = var0.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test6");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    float var1 = var0.getAlignmentX();
    var0.setVisible(false);
    java.awt.Dimension var4 = var0.getPreferredSize();
    boolean var5 = var0.getVerifyInputWhenFocusTarget();
    java.awt.Component var8 = var0.findComponentAt(10, 1);
    boolean var9 = var0.requestDefaultFocus();
    java.awt.Insets var10 = var0.getInsets();
    var0.setDoubleBuffered(false);
    java.awt.Toolkit var13 = var0.getToolkit();
    java.awt.Dimension var14 = var0.getMinimumSize();
    java.awt.event.MouseListener[] var15 = var0.getMouseListeners();
    javax.swing.plaf.PanelUI var16 = var0.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test7");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    float var1 = var0.getAlignmentX();
    var0.setVisible(false);
    var0.setInheritsPopupMenu(false);
    var0.move(10, 10);
    var0.firePropertyChange("SpaceWar.SpacePanel[,0,0,0x0,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=800,height=600]]", false, false);
    var0.removeAll();
    java.awt.Point var14 = var0.location();
    SpaceWar.SpacePanel var15 = new SpaceWar.SpacePanel();
    SpaceWar.SpacePanel var16 = new SpaceWar.SpacePanel();
    java.awt.Color var17 = var16.getBackground();
    SpaceWar.SpacePanel var18 = new SpaceWar.SpacePanel();
    float var19 = var18.getAlignmentX();
    var18.setVisible(false);
    var18.nextFocus();
    var18.updateUI();
    var18.enableInputMethods(true);
    var15.add((java.awt.Component)var16, (java.lang.Object)true);
    java.awt.Dimension var27 = var16.getPreferredSize();
    var16.firePropertyChange("SpaceWar.SpacePanel[,0,0,0x0,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=800,height=600]]", (-1.0f), 100.0f);
    SpaceWar.SpacePanel var32 = new SpaceWar.SpacePanel();
    float var33 = var32.getAlignmentX();
    var32.setVisible(false);
    boolean var36 = var32.isDoubleBuffered();
    SpaceWar.SpacePanel var37 = new SpaceWar.SpacePanel();
    java.awt.Color var38 = var37.getBackground();
    var37.repaint();
    java.lang.Object var40 = var32.getClientProperty((java.lang.Object)var37);
    var16.remove((java.awt.Component)var32);
    SpaceWar.SpacePanel var42 = new SpaceWar.SpacePanel();
    float var43 = var42.getAlignmentX();
    var42.firePropertyChange("", (-1), 1);
    java.awt.event.MouseMotionListener[] var48 = var42.getMouseMotionListeners();
    java.awt.Dimension var49 = var42.getMinimumSize();
    var16.setMaximumSize(var49);
    var0.setMinimumSize(var49);
    java.awt.event.FocusListener[] var52 = var0.getFocusListeners();
    SpaceWar.SpacePanel var53 = new SpaceWar.SpacePanel();
    float var54 = var53.getAlignmentX();
    var53.setVisible(false);
    var53.nextFocus();
    var53.updateUI();
    var53.enableInputMethods(true);
    java.awt.Image var63 = var53.createImage(25, 500);
    boolean var64 = var0.isFocusCycleRoot((java.awt.Container)var53);
    boolean var65 = var53.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test8");


    SpaceWar.PowerUp var3 = new SpaceWar.PowerUp(100, (-1.0d), 0.0d);
    double var4 = var3.getR();
    int var5 = var3.getType();
    double var6 = var3.getX();
    int var7 = var3.getType();
    boolean var8 = var3.update();
    double var9 = var3.getY();
    double var10 = var3.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test9");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    SpaceWar.SpacePanel var1 = new SpaceWar.SpacePanel();
    java.awt.Color var2 = var1.getBackground();
    SpaceWar.SpacePanel var3 = new SpaceWar.SpacePanel();
    float var4 = var3.getAlignmentX();
    var3.setVisible(false);
    var3.nextFocus();
    var3.updateUI();
    var3.enableInputMethods(true);
    var0.add((java.awt.Component)var1, (java.lang.Object)true);
    java.awt.Insets var12 = var0.getInsets();
    java.lang.String var13 = var0.getUIClassID();
    boolean var14 = var0.isFocusable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "PanelUI"+ "'", var13.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test10");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    float var1 = var0.getAlignmentX();
    var0.firePropertyChange("", (-1), 1);
    java.awt.event.MouseListener[] var6 = var0.getMouseListeners();
    int var7 = var0.getDebugGraphicsOptions();
    java.awt.im.InputMethodRequests var8 = var0.getInputMethodRequests();
    var0.removeNotify();
    var0.enable();
    boolean var11 = var0.isValidateRoot();
    javax.swing.ActionMap var12 = var0.getActionMap();
    int var13 = var0.getY();
    var0.enableInputMethods(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test11");


    SpaceWar.Player var0 = new SpaceWar.Player();
    var0.increasePower(25);
    int var3 = var0.getScore();
    var0.setRigth(true);
    var0.update();
    var0.setDown(false);
    var0.loseLife();
    var0.loseLife();
    boolean var11 = var0.isDead();
    int var12 = var0.getPowerLevel();
    var0.setLife(99);
    var0.setLeft(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test12");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    float var1 = var0.getAlignmentX();
    var0.setVisible(false);
    boolean var4 = var0.isDoubleBuffered();
    var0.enable(false);
    java.awt.Container var7 = var0.getTopLevelAncestor();
    javax.swing.InputMap var9 = var0.getInputMap(1);
    SpaceWar.SpacePanel var10 = new SpaceWar.SpacePanel();
    SpaceWar.SpacePanel var11 = new SpaceWar.SpacePanel();
    java.awt.Color var12 = var11.getBackground();
    SpaceWar.SpacePanel var13 = new SpaceWar.SpacePanel();
    float var14 = var13.getAlignmentX();
    var13.setVisible(false);
    var13.nextFocus();
    var13.updateUI();
    var13.enableInputMethods(true);
    var10.add((java.awt.Component)var11, (java.lang.Object)true);
    java.awt.Image var24 = var11.createImage(1, (-1));
    java.awt.event.MouseListener[] var25 = var11.getMouseListeners();
    java.awt.Color var26 = var11.getBackground();
    var11.grabFocus();
    boolean var28 = var0.isAncestorOf((java.awt.Component)var11);
    var11.layout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test13");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    java.awt.Color var1 = var0.getBackground();
    boolean var4 = var0.inside(0, (-1));
    SpaceWar.SpacePanel var6 = new SpaceWar.SpacePanel();
    float var7 = var6.getAlignmentX();
    var6.setVisible(false);
    var6.nextFocus();
    var6.reshape((-1), 1, (-1), 10);
    var6.disable();
    boolean var17 = var6.isFocusable();
    SpaceWar.SpacePanel var18 = new SpaceWar.SpacePanel();
    float var19 = var18.getAlignmentX();
    var18.firePropertyChange("", (-1), 1);
    javax.swing.plaf.PanelUI var24 = var18.getUI();
    java.awt.im.InputMethodRequests var25 = var18.getInputMethodRequests();
    SpaceWar.SpacePanel var26 = new SpaceWar.SpacePanel();
    float var27 = var26.getAlignmentX();
    var26.setVisible(false);
    var26.nextFocus();
    var26.updateUI();
    var26.enableInputMethods(true);
    var26.setSize((-1), 1);
    SpaceWar.SpacePanel var37 = new SpaceWar.SpacePanel();
    var37.firePropertyChange("SpaceWar.SpacePanel[,0,0,0x0,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=800,height=600]]", false, false);
    var18.add((java.awt.Component)var26, (java.lang.Object)"SpaceWar.SpacePanel[,0,0,0x0,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=800,height=600]]");
    java.awt.event.KeyListener[] var43 = var18.getKeyListeners();
    java.awt.FocusTraversalPolicy var44 = var18.getFocusTraversalPolicy();
    SpaceWar.SpacePanel var45 = new SpaceWar.SpacePanel();
    var45.firePropertyChange("SpaceWar.SpacePanel[,0,0,0x0,invalid,hidden,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=800,height=600]]", false, false);
    java.awt.Toolkit var50 = var45.getToolkit();
    var6.add((java.awt.Component)var18, (java.lang.Object)var45);
    var6.layout();
    java.awt.Component var53 = var0.add("", (java.awt.Component)var6);
    java.awt.image.BufferedImage var55 = var0.loadImg("PanelUI");
    java.awt.Color var56 = var0.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test14");


    SpaceWar.SpacePanel var0 = new SpaceWar.SpacePanel();
    var0.setSize(1, (-1));
    SpaceWar.SpacePanel var4 = new SpaceWar.SpacePanel();
    float var5 = var4.getAlignmentX();
    var4.setVisible(false);
    SpaceWar.SpacePanel var8 = new SpaceWar.SpacePanel();
    java.awt.Color var9 = var8.getBackground();
    var4.setForeground(var9);
    SpaceWar.SpacePanel var11 = new SpaceWar.SpacePanel();
    float var12 = var11.getAlignmentX();
    var11.setVisible(false);
    boolean var15 = var11.isDoubleBuffered();
    java.awt.dnd.DropTarget var16 = var11.getDropTarget();
    var11.show(false);
    java.awt.Rectangle var19 = var11.getVisibleRect();
    var4.repaint(var19);
    java.awt.FocusTraversalPolicy var21 = var4.getFocusTraversalPolicy();
    SpaceWar.SpacePanel var22 = new SpaceWar.SpacePanel();
    float var23 = var22.getAlignmentX();
    var22.firePropertyChange("", (-1), 1);
    boolean var28 = var22.isFocusOwner();
    SpaceWar.SpacePanel var30 = new SpaceWar.SpacePanel();
    float var31 = var30.getAlignmentX();
    var30.setVisible(false);
    java.awt.Dimension var34 = var30.getPreferredSize();
    java.awt.Toolkit var35 = var30.getToolkit();
    SpaceWar.SpacePanel var36 = new SpaceWar.SpacePanel();
    var36.setName("");
    int var39 = var36.getX();
    SpaceWar.SpacePanel var40 = new SpaceWar.SpacePanel();
    float var41 = var40.getAlignmentX();
    var40.setVisible(false);
    var40.nextFocus();
    SpaceWar.SpacePanel var45 = new SpaceWar.SpacePanel();
    float var46 = var45.getAlignmentX();
    var45.setVisible(false);
    SpaceWar.SpacePanel var49 = new SpaceWar.SpacePanel();
    java.awt.Color var50 = var49.getBackground();
    var45.setForeground(var50);
    var40.setBackground(var50);
    var36.setBackground(var50);
    var30.setForeground(var50);
    var22.putClientProperty((java.lang.Object)(byte)100, (java.lang.Object)var50);
    var4.setBackground(var50);
    SpaceWar.SpacePanel var57 = new SpaceWar.SpacePanel();
    float var58 = var57.getAlignmentX();
    var57.setVisible(false);
    boolean var61 = var57.isDoubleBuffered();
    java.awt.dnd.DropTarget var62 = var57.getDropTarget();
    var57.show(false);
    boolean var65 = var57.isPaintingForPrint();
    SpaceWar.SpacePanel var66 = new SpaceWar.SpacePanel();
    float var67 = var66.getAlignmentX();
    SpaceWar.SpacePanel var68 = new SpaceWar.SpacePanel();
    float var69 = var68.getAlignmentX();
    var68.setVisible(false);
    java.awt.Dimension var72 = var68.getPreferredSize();
    boolean var73 = var68.getVerifyInputWhenFocusTarget();
    java.awt.Component var76 = var68.findComponentAt(10, 1);
    var66.addKeyListener((java.awt.event.KeyListener)var68);
    java.awt.Dimension var78 = var68.getMinimumSize();
    var57.setMinimumSize(var78);
    java.awt.Dimension var80 = var4.getSize(var78);
    var0.setMaximumSize(var78);
    java.lang.String var82 = var0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "PanelUI"+ "'", var82.equals("PanelUI"));

  }

}
