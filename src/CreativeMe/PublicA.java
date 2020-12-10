package CreativeMe;

import javax.accessibility.AccessibleContext;
import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.dnd.DropTarget;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.VolatileImage;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.Locale;
import java.util.Set;

public class PublicA extends Applet {
    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    @Override
    protected void addImpl(Component comp, Object constraints, int index) {
        super.addImpl(comp, constraints, index);
    }

    @Override
    public boolean areFocusTraversalKeysSet(int id) {
        return super.areFocusTraversalKeysSet(id);
    }

    @Override
    public Component add(Component comp) {
        return super.add(comp);
    }

    @Override
    public Component add(Component comp, int index) {
        return super.add(comp, index);
    }

    @Override
    public Component add(String name, Component comp) {
        return super.add(name, comp);
    }

    @Override
    public void add(PopupMenu popup) {
        super.add(popup);
    }

    @Override
    public void add(Component comp, Object constraints) {
        super.add(comp, constraints);
    }

    @Override
    public void add(Component comp, Object constraints, int index) {
        super.add(comp, constraints, index);
    }

    @Override
    public synchronized void addComponentListener(ComponentListener l) {
        super.addComponentListener(l);
    }

    @Override
    public synchronized void addContainerListener(ContainerListener l) {
        super.addContainerListener(l);
    }

    @Override
    public synchronized void addFocusListener(FocusListener l) {
        super.addFocusListener(l);
    }

    @Override
    public void addHierarchyBoundsListener(HierarchyBoundsListener l) {
        super.addHierarchyBoundsListener(l);
    }

    @Override
    public void addHierarchyListener(HierarchyListener l) {
        super.addHierarchyListener(l);
    }

    @Override
    public synchronized void addInputMethodListener(InputMethodListener l) {
        super.addInputMethodListener(l);
    }

    @Override
    public synchronized void addKeyListener(KeyListener l) {
        super.addKeyListener(l);
    }

    @Override
    public synchronized void addMouseListener(MouseListener l) {
        super.addMouseListener(l);
    }

    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener l) {
        super.addMouseMotionListener(l);
    }

    @Override
    public synchronized void addMouseWheelListener(MouseWheelListener l) {
        super.addMouseWheelListener(l);
    }

    @Override
    public void addNotify() {
        super.addNotify();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        super.addPropertyChangeListener(listener);
    }

    @Override
    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        super.addPropertyChangeListener(propertyName, listener);
    }

    @Override
    public void applyComponentOrientation(ComponentOrientation o) {
        super.applyComponentOrientation(o);
    }

    @Override
    public boolean action(Event evt, Object what) {
        return super.action(evt, what);
    }

    @Override
    protected AWTEvent coalesceEvents(AWTEvent existingEvent, AWTEvent newEvent) {
        return super.coalesceEvents(existingEvent, newEvent);
    }

    @Override
    public AccessibleContext getAccessibleContext() {
        return super.getAccessibleContext();
    }

    @Override
    public AppletContext getAppletContext() {
        return super.getAppletContext();
    }

    @Override
    public AudioClip getAudioClip(URL url) {
        return super.getAudioClip(url);
    }

    @Override
    public AudioClip getAudioClip(URL url, String name) {
        return super.getAudioClip(url, name);
    }

    @Override
    public boolean isActive() {
        return super.isActive();
    }

    @Override
    public boolean isAncestorOf(Component c) {
        return super.isAncestorOf(c);
    }

    @Override
    public Component findComponentAt(Point p) {
        return super.findComponentAt(p);
    }

    @Override
    public Component findComponentAt(int x, int y) {
        return super.findComponentAt(x, y);
    }

    @Override
    public Component getComponentAt(Point p) {
        return super.getComponentAt(p);
    }

    @Override
    public Component getComponentAt(int x, int y) {
        return super.getComponentAt(x, y);
    }

    @Override
    public Container getFocusCycleRootAncestor() {
        return super.getFocusCycleRootAncestor();
    }

    @Override
    public float getAlignmentX() {
        return super.getAlignmentX();
    }

    @Override
    public float getAlignmentY() {
        return super.getAlignmentY();
    }

    @Override
    public Set<AWTKeyStroke> getFocusTraversalKeys(int id) {
        return super.getFocusTraversalKeys(id);
    }

    @Override
    public String getAppletInfo() {
        return super.getAppletInfo();
    }

    @Override
    public void printAll(Graphics g) {
        super.printAll(g);
    }

    @Override
    public void removeAll() {
        super.removeAll();
    }

    @Override
    public Dimension getMaximumSize() {
        return super.getMaximumSize();
    }

    @Override
    protected boolean requestFocus(boolean temporary) {
        return super.requestFocus(temporary);
    }

    @Override
    protected boolean requestFocusInWindow(boolean temporary) {
        return super.requestFocusInWindow(temporary);
    }

    @Override
    protected String paramString() {
        return super.paramString();
    }

    @Override
    protected void firePropertyChange(String propertyName, int oldValue, int newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue);
    }

    @Override
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue);
    }

    @Override
    protected void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue);
    }

    @Override
    protected void processContainerEvent(ContainerEvent e) {
        super.processContainerEvent(e);
    }

    @Override
    protected void processHierarchyBoundsEvent(HierarchyEvent e) {
        super.processHierarchyBoundsEvent(e);
    }

    @Override
    protected void processHierarchyEvent(HierarchyEvent e) {
        super.processHierarchyEvent(e);
    }

    @Override
    protected void validateTree() {
        super.validateTree();
    }

    @Override
    public BaselineResizeBehavior getBaselineResizeBehavior() {
        return super.getBaselineResizeBehavior();
    }

    @Override
    public boolean contains(Point p) {
        return super.contains(p);
    }

    @Override
    public boolean contains(int x, int y) {
        return super.contains(x, y);
    }

    @Override
    public boolean getFocusTraversalKeysEnabled() {
        return super.getFocusTraversalKeysEnabled();
    }

    @Override
    public boolean getIgnoreRepaint() {
        return super.getIgnoreRepaint();
    }

    @Override
    public boolean hasFocus() {
        return super.hasFocus();
    }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int w, int h) {
        return super.imageUpdate(img, infoflags, x, y, w, h);
    }

    @Override
    public boolean isBackgroundSet() {
        return super.isBackgroundSet();
    }

    @Override
    public boolean isCursorSet() {
        return super.isCursorSet();
    }

    @Override
    public boolean isDisplayable() {
        return super.isDisplayable();
    }

    @Override
    public boolean isDoubleBuffered() {
        return super.isDoubleBuffered();
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled();
    }

    @Override
    public boolean isFocusable() {
        return super.isFocusable();
    }

    @Override
    public boolean isFocusCycleRoot() {
        return super.isFocusCycleRoot();
    }

    @Override
    public boolean isFocusCycleRoot(Container container) {
        return super.isFocusCycleRoot(container);
    }

    @Override
    public boolean isFocusOwner() {
        return super.isFocusOwner();
    }

    @Override
    public boolean isFocusTraversalPolicySet() {
        return super.isFocusTraversalPolicySet();
    }

    @Override
    public boolean isFontSet() {
        return super.isFontSet();
    }

    @Override
    public boolean isForegroundSet() {
        return super.isForegroundSet();
    }

    @Override
    public boolean isLightweight() {
        return super.isLightweight();
    }

    @Override
    public boolean isMaximumSizeSet() {
        return super.isMaximumSizeSet();
    }

    @Override
    public boolean isMinimumSizeSet() {
        return super.isMinimumSizeSet();
    }

    @Override
    public boolean isOpaque() {
        return super.isOpaque();
    }

    @Override
    public boolean isPreferredSizeSet() {
        return super.isPreferredSizeSet();
    }

    @Override
    public boolean isShowing() {
        return super.isShowing();
    }

    @Override
    public boolean isValid() {
        return super.isValid();
    }

    @Override
    public boolean isValidateRoot() {
        return super.isValidateRoot();
    }

    @Override
    public boolean isVisible() {
        return super.isVisible();
    }

    @Override
    public boolean prepareImage(Image image, ImageObserver observer) {
        return super.prepareImage(image, observer);
    }

    @Override
    public boolean prepareImage(Image image, int width, int height, ImageObserver observer) {
        return super.prepareImage(image, width, height, observer);
    }

    @Override
    public boolean requestFocusInWindow() {
        return super.requestFocusInWindow();
    }

    @Override
    public Color getBackground() {
        return super.getBackground();
    }

    @Override
    public ComponentOrientation getComponentOrientation() {
        return super.getComponentOrientation();
    }

    @Override
    public Container getParent() {
        return super.getParent();
    }

    @Override
    public synchronized ContainerListener[] getContainerListeners() {
        return super.getContainerListeners();
    }

    @Override
    public synchronized DropTarget getDropTarget() {
        return super.getDropTarget();
    }

    @Override
    public FocusTraversalPolicy getFocusTraversalPolicy() {
        return super.getFocusTraversalPolicy();
    }

    @Override
    public Graphics getGraphics() {
        return super.getGraphics();
    }

    @Override
    public GraphicsConfiguration getGraphicsConfiguration() {
        return super.getGraphicsConfiguration();
    }

    @Override
    public synchronized HierarchyBoundsListener[] getHierarchyBoundsListeners() {
        return super.getHierarchyBoundsListeners();
    }

    @Override
    public synchronized HierarchyListener[] getHierarchyListeners() {
        return super.getHierarchyListeners();
    }

    @Override
    public Image createImage(int width, int height) {
        return super.createImage(width, height);
    }

    @Override
    public Image createImage(ImageProducer producer) {
        return super.createImage(producer);
    }

    @Override
    public Image getImage(URL url) {
        return super.getImage(url);
    }

    @Override
    public Image getImage(URL url, String name) {
        return super.getImage(url, name);
    }

    @Override
    public int checkImage(Image image, ImageObserver observer) {
        return super.checkImage(image, observer);
    }

    @Override
    public int checkImage(Image image, int width, int height, ImageObserver observer) {
        return super.checkImage(image, width, height, observer);
    }

    @Override
    public int getBaseline(int width, int height) {
        return super.getBaseline(width, height);
    }

    @Override
    public LayoutManager getLayout() {
        return super.getLayout();
    }

    @Override
    public Locale getLocale() {
        return super.getLocale();
    }

    @Override
    public Point getLocation() {
        return super.getLocation();
    }

    @Override
    public Point getLocation(Point rv) {
        return super.getLocation(rv);
    }

    @Override
    public Point getLocationOnScreen() {
        return super.getLocationOnScreen();
    }

    @Override
    public PropertyChangeListener[] getPropertyChangeListeners() {
        return super.getPropertyChangeListeners();
    }

    @Override
    public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {
        return super.getPropertyChangeListeners(propertyName);
    }

    @Override
    public Rectangle getBounds() {
        return super.getBounds();
    }

    @Override
    public Rectangle getBounds(Rectangle rv) {
        return super.getBounds(rv);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getParameter(String name) {
        return super.getParameter(name);
    }

    @Override
    public String[][] getParameterInfo() {
        return super.getParameterInfo();
    }

    @Override
    public URL getCodeBase() {
        return super.getCodeBase();
    }

    @Override
    public URL getDocumentBase() {
        return super.getDocumentBase();
    }

    @Override
    public void doLayout() {
        super.doLayout();
    }

    @Override
    public void enableInputMethods(boolean enable) {
        super.enableInputMethods(enable);
    }

    @Override
    public void firePropertyChange(String propertyName, byte oldValue, byte newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue);
    }

    @Override
    public void firePropertyChange(String propertyName, char oldValue, char newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue);
    }

    @Override
    public void firePropertyChange(String propertyName, long oldValue, long newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue);
    }

    @Override
    public void firePropertyChange(String propertyName, float oldValue, float newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue);
    }

    @Override
    public void firePropertyChange(String propertyName, short oldValue, short newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue);
    }

    @Override
    public void firePropertyChange(String propertyName, double oldValue, double newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue);
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }

    @Override
    public void paintAll(Graphics g) {
        super.paintAll(g);
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }

    @Override
    public void play(URL url) {
        super.play(url);
    }

    @Override
    public void play(URL url, String name) {
        super.play(url, name);
    }

    @Override
    public synchronized void removeContainerListener(ContainerListener l) {
        super.removeContainerListener(l);
    }

    @Override
    public void removeHierarchyBoundsListener(HierarchyBoundsListener l) {
        super.removeHierarchyBoundsListener(l);
    }

    @Override
    public void removeHierarchyListener(HierarchyListener l) {
        super.removeHierarchyListener(l);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        super.removePropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        super.removePropertyChangeListener(propertyName, listener);
    }

    @Override
    public void repaint() {
        super.repaint();
    }

    @Override
    public void repaint(long tm) {
        super.repaint(tm);
    }

    @Override
    public void repaint(int x, int y, int width, int height) {
        super.repaint(x, y, width, height);
    }

    @Override
    public void repaint(long tm, int x, int y, int width, int height) {
        super.repaint(tm, x, y, width, height);
    }

    @Override
    public void revalidate() {
        super.revalidate();
    }

    @Override
    public void setBackground(Color c) {
        super.setBackground(c);
    }

    @Override
    public void setComponentOrientation(ComponentOrientation o) {
        super.setComponentOrientation(o);
    }

    @Override
    public synchronized void setDropTarget(DropTarget dt) {
        super.setDropTarget(dt);
    }

    @Override
    public void setEnabled(boolean b) {
        super.setEnabled(b);
    }

    @Override
    public void setFocusable(boolean focusable) {
        super.setFocusable(focusable);
    }

    @Override
    public void setFocusTraversalKeys(int id, Set<? extends AWTKeyStroke> keystrokes) {
        super.setFocusTraversalKeys(id, keystrokes);
    }

    @Override
    public void setFocusTraversalKeysEnabled(boolean focusTraversalKeysEnabled) {
        super.setFocusTraversalKeysEnabled(focusTraversalKeysEnabled);
    }

    @Override
    public void setFocusTraversalPolicy(FocusTraversalPolicy policy) {
        super.setFocusTraversalPolicy(policy);
    }

    @Override
    public void setIgnoreRepaint(boolean ignoreRepaint) {
        super.setIgnoreRepaint(ignoreRepaint);
    }

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(mgr);
    }

    @Override
    public void setLocale(Locale l) {
        super.setLocale(l);
    }

    @Override
    public void setLocation(Point p) {
        super.setLocation(p);
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
    }

    @Override
    public void setMaximumSize(Dimension maximumSize) {
        super.setMaximumSize(maximumSize);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void showStatus(String msg) {
        super.showStatus(msg);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void transferFocus() {
        super.transferFocus();
    }

    @Override
    public void transferFocusBackward() {
        super.transferFocusBackward();
    }

    @Override
    public void transferFocusDownCycle() {
        super.transferFocusDownCycle();
    }

    @Override
    public void transferFocusUpCycle() {
        super.transferFocusUpCycle();
    }

    @Override
    public void update(Graphics g) {
        super.update(g);
    }

    @Override
    public void validate() {
        super.validate();
    }

    @Override
    public VolatileImage createVolatileImage(int width, int height) {
        return super.createVolatileImage(width, height);
    }

    @Override
    public VolatileImage createVolatileImage(int width, int height, ImageCapabilities caps) throws AWTException {
        return super.createVolatileImage(width, height, caps);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean gotFocus(Event evt, Object what) {
        return super.gotFocus(evt, what);
    }

    @Override
    public boolean handleEvent(Event evt) {
        return super.handleEvent(evt);
    }

    @Override
    public boolean inside(int x, int y) {
        return super.inside(x, y);
    }

    @Override
    public boolean isFocusTraversable() {
        return super.isFocusTraversable();
    }

    @Override
    public boolean keyDown(Event evt, int key) {
        return super.keyDown(evt, key);
    }

    @Override
    public boolean keyUp(Event evt, int key) {
        return super.keyUp(evt, key);
    }

    @Override
    public boolean lostFocus(Event evt, Object what) {
        return super.lostFocus(evt, what);
    }

    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        return super.mouseDown(evt, x, y);
    }

    @Override
    public boolean mouseDrag(Event evt, int x, int y) {
        return super.mouseDrag(evt, x, y);
    }

    @Override
    public boolean mouseEnter(Event evt, int x, int y) {
        return super.mouseEnter(evt, x, y);
    }

    @Override
    public boolean mouseExit(Event evt, int x, int y) {
        return super.mouseExit(evt, x, y);
    }

    @Override
    public boolean mouseMove(Event evt, int x, int y) {
        return super.mouseMove(evt, x, y);
    }

    @Override
    public boolean mouseUp(Event evt, int x, int y) {
        return super.mouseUp(evt, x, y);
    }

    @Override
    public boolean postEvent(Event e) {
        return super.postEvent(e);
    }

    @Override
    public Component locate(int x, int y) {
        return super.locate(x, y);
    }

    @Override
    public Point location() {
        return super.location();
    }

    @Override
    public Rectangle bounds() {
        return super.bounds();
    }

    @Override
    public void disable() {
        super.disable();
    }

    @Override
    public void enable() {
        super.enable();
    }

    @Override
    public void enable(boolean b) {
        super.enable(b);
    }

    @Override
    public void layout() {
        super.layout();
    }

    @Override
    public void reshape(int x, int y, int width, int height) {
        super.reshape(x, y, width, height);
    }
}

