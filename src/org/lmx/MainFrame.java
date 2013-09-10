package org.lmx;

/**
 * Created with IntelliJ IDEA.
 * User: Whisley
 * Date: 13-9-10
 * Time: 下午6:21
 * To change this template use File | Settings | File Templates.
 */

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Whisley
 */
public class MainFrame extends JFrame {

    private JTabbedPane tab;
    private JSplitPane split;
    private JPanel viewPanel;
    private JPanel demoPanel;
    private JPanel addressPanel;
    private JPanel savingPanel;
    private JPanel checkingPanel;
    private JPanel driverPanel;
    private JPanel medPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;




    public MainFrame() throws HeadlessException {
        initComponent();
    }

    private void initComponent () {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));

        tab = new JTabbedPane();
        demoPanel = new JPanel();
        addressPanel = new JPanel();
        savingPanel = new JPanel();
        checkingPanel = new JPanel();
        driverPanel = new JPanel();
        medPanel = new JPanel();
        tab.addTab("Demographic Info", demoPanel);
        tab.addTab("Address Info", addressPanel);
        tab.addTab("Saving Info", savingPanel);
        tab.addTab("Checking Info", checkingPanel);
        tab.addTab("Driver Info", driverPanel);
        tab.addTab("Medical Info", medPanel);

        button1 = new JButton("my button");
        demoPanel.setLayout(new FlowLayout());
        demoPanel.add(button1);
        button1.setLocation(500,300);


        viewPanel = new JPanel();
        split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, tab, viewPanel);
        split.setDividerSize(6);
        split.setEnabled(false);
        add(split, BorderLayout.CENTER);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}