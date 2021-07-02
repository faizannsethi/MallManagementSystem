package finalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class AllWindows extends Main {

    static Person p1;
    static String pswd = null;
    static String user = null;
    static Mall AAFS;
    static JComboBox shop_manager = new JComboBox();
    static JComboBox employee_list = new JComboBox();

    public static class SeventhWindow {

        public static void seventhWindow() {
            JFrame frame = new JFrame("Edit Window");

            JComboBox shop_list = new JComboBox();
            ArrayList<String> shops = new ArrayList();
            shops.add(" Sethi's");
            shops.add(" Alphaman Theatre");
            shops.add(" FunCity");
            shops.add(" Corner 101");

            Iterator itr1 = shops.iterator();
            while (itr1.hasNext()) {
                Object element = itr1.next();
                shop_list.addItem(element);
            }

            JComboBox shop_owner = new JComboBox();
            ArrayList<String> owners = new ArrayList();
            owners.add("Faizan Sethi (Sethi's)");
            owners.add("Muhammad Shahzil (Alphaman Theatre)");
            owners.add("Muhammad Abdullah (FunCity)");
            owners.add("Syed Afraz (Corner 101)");

            Iterator itr2 = owners.iterator();
            while (itr2.hasNext()) {
                Object element = itr2.next();
                shop_owner.addItem(element);
            }

            JButton button1 = new JButton("Add Shop");
            JButton button2 = new JButton("Remove Shop");
            JButton button3 = new JButton("Add Shop Owner");
            JButton button4 = new JButton("Remove Shop Owner");
            JButton button5 = new JButton("Add Manager");
            JButton button6 = new JButton("Remove Manager");
            JButton button7 = new JButton("Add Employee");
            JButton button8 = new JButton("Remove Employee");

            JLabel l1 = new JLabel("Shops");
            JLabel l2 = new JLabel("Shop Owners");
            JLabel l3 = new JLabel("Managers");
            JLabel l4 = new JLabel("Employees");
            
            JPanel panelTop = new JPanel();
            
            JPanel panelMain = new JPanel();
            panelMain.setLayout(new BorderLayout());
            
            JPanel panelBottom = new JPanel();
            
            panelBottom.setLayout(null);

            JPanel p2 = new JPanel();

            GridLayout g1 = new GridLayout(10, 2, 20, 20);

            p2.setLayout(g1);

            p2.add(l1);
            p2.add(l2);
            p2.add(shop_list);
            p2.add(shop_owner);
            p2.add(l3);
            p2.add(l4);
            p2.add(shop_manager);
            p2.add(employee_list);
            p2.add(button1);
            p2.add(button2);
            p2.add(button3);
            p2.add(button4);
            p2.add(button5);
            p2.add(button6);
            p2.add(button7);
            p2.add(button8);
            
            //Button for Back.
            JButton buttonBack = new JButton("BACK");
            buttonBack.setBackground(Color.black);
            buttonBack.setForeground(Color.white);
            //buttonBack.setBounds(10,10,100,40);
            panelBottom.add(buttonBack);

            p2.setBorder(BorderFactory.createEmptyBorder(50, 25, 50, 25));

            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String shopName = JOptionPane.showInputDialog(null, "Enter name of the shop?");

                    if ((shopName != null) && (shopName.equals("")==false)) {
                        ArrayList<String> newShops = new ArrayList();
                        newShops.add(shopName);

                        Iterator itr5 = newShops.iterator();
                        while (itr5.hasNext()) {
                            Object element = itr5.next();
                            shop_list.addItem(element);
                        }
                    }

                }

            });

            button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String shop = JOptionPane.showInputDialog(null, "Enter the number of the shop, in the list, you want to remove (0 being first) ?");
                    int shopNum = Integer.parseInt(shop);
                    shop_list.removeItemAt(shopNum);
                }

            });

            button3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String ownerName = JOptionPane.showInputDialog(null, "Enter name of the shop Owner (shop name in brackets)?");

                    if ((ownerName != null) && (ownerName.equals("")==false)) {
                        ArrayList<String> newShopOwner = new ArrayList();
                        newShopOwner.add(ownerName);

                        Iterator itr6 = newShopOwner.iterator();
                        while (itr6.hasNext()) {
                            Object element = itr6.next();
                            shop_owner.addItem(element);
                        }
                    }
                }

            });

            button4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String shopOwner = JOptionPane.showInputDialog(null, "Enter the number of the shop Owner, in the list, you want to remove (0 being first) ?");
                    int shopOwnerNum = Integer.parseInt(shopOwner);
                    shop_owner.removeItemAt(shopOwnerNum);
                }

            });

            button5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String manager = JOptionPane.showInputDialog(null, "Enter name of the Manager (shop name in brackets)?");

                    if ((manager != null) && (manager.equals("")==false)) {
                        ArrayList<String> newManager = new ArrayList();
                        newManager.add(manager);

                        Iterator itr7 = newManager.iterator();
                        while (itr7.hasNext()) {
                            Object element = itr7.next();
                            shop_manager.addItem(element);
                        }
                    }
                }

            });

            button6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String shopManager = JOptionPane.showInputDialog(null, "Enter the number of the Manager, in the list, you want to remove (0 being first) ?");
                    int shopManagerNum = Integer.parseInt(shopManager);
                    shop_manager.removeItemAt(shopManagerNum);
                }

            });

            button7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String employee = JOptionPane.showInputDialog(null, "Enter name of the employee (shop name in brackets)?");

                    if ((employee != null) && (employee.equals("")==false)) {
                        ArrayList<String> newEmployee = new ArrayList();
                        newEmployee.add(employee);

                        Iterator itr8 = newEmployee.iterator();
                        while (itr8.hasNext()) {
                            Object element = itr8.next();
                            employee_list.addItem(element);
                        }
                    }
                }

            });

            button8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String shopEmployee = JOptionPane.showInputDialog(null, "Enter the number of the Employee, in the list, you want to remove (0 being first) ?");
                    int shopEmployeeNum = Integer.parseInt(shopEmployee);
                    employee_list.removeItemAt(shopEmployeeNum);
                }

            });
            panelMain.add(panelTop,BorderLayout.NORTH);
            panelMain.add(p2,BorderLayout.CENTER);
            panelMain.add(panelBottom,BorderLayout.SOUTH);
            frame.add(panelMain);
            frame.setSize(500, 500);
            frame.setVisible(true);

        }

    }

    public static class SixthWindow {

        static Font labelFont;
        static String labelText;
        static int stringWidth;
        static int componentWidth;
        static double widthRatio;
        static int newFontSize;
        static int componentHeight;
        static int fontSizeToUse;

        private static void sixthWindow() {
            //Create frame.
            JFrame sixthFrame = new JFrame("FunCity");
            sixthFrame.setSize(370, 550);

            //Create main panel.
            JPanel panelMain = new JPanel();
            panelMain.setLayout(new BorderLayout());

            //Create Top panel.
            JPanel panelTop = new JPanel();
            panelTop.setLayout(new FlowLayout());
            panelTop.setBackground(Color.white);

            //Create Center panel.
            JPanel panelCenter = new JPanel();
            panelCenter.setLayout(null);
            panelCenter.setBackground(Color.DARK_GRAY);

            // ImageIcon created for Logo.
            ImageIcon iconLogo = new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\FuncityLogo.PNG");

            //Label to hold this Image.
            JLabel labelImage = new JLabel();
            labelImage.setIcon(iconLogo);
            panelTop.add(labelImage);

            //Add Air Hockey button.
            ImageIcon airHockeyImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\airHockey.jpg")
                    .getImage().getScaledInstance(65, 138, Image.SCALE_SMOOTH));
            JButton airHockeyButton = new JButton(airHockeyImage);
            airHockeyButton.setBackground(Color.gray);
            airHockeyButton.setBorder(BorderFactory.createEmptyBorder());
            airHockeyButton.setBounds(25, 25, 65, 138);
            panelCenter.add(airHockeyButton);

            //Add Punching Bag button.
            ImageIcon punchingBagImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\punchingBag.jpg")
                    .getImage().getScaledInstance(65, 138, Image.SCALE_SMOOTH));
            JButton punchingBagButton = new JButton(punchingBagImage);
            punchingBagButton.setBackground(Color.GRAY);
            punchingBagButton.setBorder(BorderFactory.createEmptyBorder());
            punchingBagButton.setBounds(105, 25, 65, 138);
            panelCenter.add(punchingBagButton);

            //Add rollerCoaster button.
            ImageIcon rollerCoasterImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\rollerCoaster.jpg")
                    .getImage().getScaledInstance(65, 138, Image.SCALE_SMOOTH));
            JButton rollerCoasterButton = new JButton(rollerCoasterImage);
            rollerCoasterButton.setBackground(Color.GRAY);
            rollerCoasterButton.setBorder(BorderFactory.createEmptyBorder());
            rollerCoasterButton.setBounds(185, 25, 65, 138);
            panelCenter.add(rollerCoasterButton);

            //Add Snooker button.
            ImageIcon snookerImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\snooker.jpg")
                    .getImage().getScaledInstance(65, 138, Image.SCALE_SMOOTH));
            JButton snookerButton = new JButton(snookerImage);
            snookerButton.setBackground(Color.GRAY);
            snookerButton.setBorder(BorderFactory.createEmptyBorder());
            snookerButton.setBounds(265, 25, 65, 138);
            panelCenter.add(snookerButton);

            //Rupees per Hour label.
            JLabel money = new JLabel("Rs/Hour");
            money.setHorizontalAlignment(SwingConstants.CENTER);
            money.setForeground(Color.white);
            money.setVisible(false);

            //Add Label for Air Hockey.
            JLabel airHockeyLabel = new JLabel(PlayArea.game1.game_price);
            airHockeyLabel.setHorizontalAlignment(SwingConstants.CENTER);
            airHockeyLabel.setForeground(Color.red);
            airHockeyLabel.setVisible(false);
            airHockeyLabel.setBounds(25, 185, 65, 65);
            panelCenter.add(airHockeyLabel);

            //Add Label for Punching Bag
            JLabel punchingBagLabel = new JLabel(PlayArea.game2.game_price);
            punchingBagLabel.setHorizontalAlignment(SwingConstants.CENTER);
            punchingBagLabel.setForeground(Color.black);
            punchingBagLabel.setVisible(false);
            punchingBagLabel.setBounds(105, 185, 65, 65);
            panelCenter.add(punchingBagLabel);

            //Add Label for Roller-Coaster Ride
            JLabel rollerCoasterLabel = new JLabel(PlayArea.game3.game_price);
            rollerCoasterLabel.setHorizontalAlignment(SwingConstants.CENTER);
            rollerCoasterLabel.setForeground(Color.red);
            rollerCoasterLabel.setVisible(false);
            rollerCoasterLabel.setBounds(185, 185, 65, 65);
            panelCenter.add(rollerCoasterLabel);

            //Add Label for Snooker
            JLabel snookerLabel = new JLabel(PlayArea.game4.game_price);
            snookerLabel.setHorizontalAlignment(SwingConstants.CENTER);
            snookerLabel.setForeground(Color.black);
            snookerLabel.setVisible(false);
            snookerLabel.setBounds(265, 185, 65, 65);
            panelCenter.add(snookerLabel);

            airHockeyButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == airHockeyButton) {
                        labelFont = airHockeyLabel.getFont();
                        labelText = airHockeyLabel.getText();
                        stringWidth = airHockeyLabel.getFontMetrics(labelFont).stringWidth(labelText);
                        componentWidth = airHockeyLabel.getWidth();
                        widthRatio = (double) componentWidth / (double) stringWidth;
                        newFontSize = (int) (0.90 * labelFont.getSize() * widthRatio);
                        componentHeight = airHockeyLabel.getHeight();
                        fontSizeToUse = Math.min(newFontSize, componentHeight);
                        airHockeyLabel.setFont(new Font(labelFont.getName(), Font.BOLD, fontSizeToUse));

                        money.setBounds(25, 175, 65, 20);
                        money.setVisible(true);
                        panelCenter.add(money);

                        airHockeyLabel.setVisible(true);
                        punchingBagLabel.setVisible(false);
                        rollerCoasterLabel.setVisible(false);
                        snookerLabel.setVisible(false);
                    }
                }
            });

            punchingBagButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == punchingBagButton) {
                        labelFont = punchingBagLabel.getFont();
                        labelText = punchingBagLabel.getText();
                        stringWidth = punchingBagLabel.getFontMetrics(labelFont).stringWidth(labelText);
                        componentWidth = punchingBagLabel.getWidth();
                        widthRatio = (double) componentWidth / (double) stringWidth;
                        newFontSize = (int) (0.90 * labelFont.getSize() * widthRatio);
                        componentHeight = punchingBagLabel.getHeight();
                        fontSizeToUse = Math.min(newFontSize, componentHeight);
                        punchingBagLabel.setFont(new Font(labelFont.getName(), Font.BOLD, fontSizeToUse));

                        money.setBounds(105, 175, 65, 20);
                        money.setVisible(true);
                        panelCenter.add(money);

                        airHockeyLabel.setVisible(false);
                        punchingBagLabel.setVisible(true);
                        rollerCoasterLabel.setVisible(false);
                        snookerLabel.setVisible(false);
                    }
                }
            });

            rollerCoasterButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == rollerCoasterButton) {
                        labelFont = rollerCoasterLabel.getFont();
                        labelText = rollerCoasterLabel.getText();
                        stringWidth = rollerCoasterLabel.getFontMetrics(labelFont).stringWidth(labelText);
                        componentWidth = rollerCoasterLabel.getWidth();
                        widthRatio = (double) componentWidth / (double) stringWidth;
                        newFontSize = (int) (0.90 * labelFont.getSize() * widthRatio);
                        componentHeight = rollerCoasterLabel.getHeight();
                        fontSizeToUse = Math.min(newFontSize, componentHeight);
                        rollerCoasterLabel.setFont(new Font(labelFont.getName(), Font.BOLD, fontSizeToUse));

                        money.setBounds(185, 175, 65, 20);
                        money.setVisible(true);
                        panelCenter.add(money);

                        airHockeyLabel.setVisible(false);
                        punchingBagLabel.setVisible(false);
                        rollerCoasterLabel.setVisible(true);
                        snookerLabel.setVisible(false);
                    }
                }
            });

            snookerButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == snookerButton) {
                        labelFont = snookerLabel.getFont();
                        labelText = snookerLabel.getText();
                        stringWidth = snookerLabel.getFontMetrics(labelFont).stringWidth(labelText);
                        componentWidth = snookerLabel.getWidth();
                        widthRatio = (double) componentWidth / (double) stringWidth;
                        newFontSize = (int) (0.90 * labelFont.getSize() * widthRatio);
                        componentHeight = snookerLabel.getHeight();
                        fontSizeToUse = Math.min(newFontSize, componentHeight);
                        snookerLabel.setFont(new Font(labelFont.getName(), Font.BOLD, fontSizeToUse));

                        money.setBounds(265, 175, 65, 20);
                        money.setVisible(true);
                        panelCenter.add(money);

                        airHockeyLabel.setVisible(false);
                        punchingBagLabel.setVisible(false);
                        rollerCoasterLabel.setVisible(false);
                        snookerLabel.setVisible(true);
                    }
                }
            });

            //Image for Back button.
            ImageIcon backFuncity = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\FuncityBack.PNG").getImage().getScaledInstance(115, 50, Image.SCALE_SMOOTH));
            //Back button created.
            JButton back = new JButton(backFuncity);
            back.setBorder(BorderFactory.createEmptyBorder());
            back.setBounds(125, 255, 117, 52);
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            panelCenter.add(back);

            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == back) {
                        sixthFrame.dispose();
                    }
                }
            });

            //Add panels to frame.
            panelMain.add(panelCenter, BorderLayout.CENTER);
            panelMain.add(panelTop, BorderLayout.NORTH);
//            sixthFrame.add(panelBottom, BorderLayout.SOUTH);
            sixthFrame.add(panelMain);

            //Mandatory code.
            sixthFrame.setDefaultCloseOperation(sixthFrame.EXIT_ON_CLOSE);
            sixthFrame.setVisible(true);
        }
    }

    public static class FifthWindow {

        public static void fifthWindow() {

            //Create frame.
            JFrame conorFrame = new JFrame("CONOR 101");
            conorFrame.setSize(500, 700);

            //Create main panel.
            JPanel panelMainConor = new JPanel();
            panelMainConor.setLayout(new BorderLayout());

            //Create Top panel.
            JPanel panelTopConor = new JPanel();
            panelTopConor.setLayout(new GridLayout(1, 1, -120, 10));
            panelTopConor.setBackground(Color.white);

            //Create Center panel.
            JPanel panelCenterConor = new JPanel();
            panelCenterConor.setLayout(null);
            panelCenterConor.setBackground(Color.gray);

            //Create Bottom panel.
            JPanel panelBottomConor = new JPanel();
            panelBottomConor.setLayout(new FlowLayout());
            panelBottomConor.setBackground(Color.gray);

            //Create panels to display the required information
            JPanel juicesDisplay = new JPanel(new GridLayout(12, 1, 10, 10));
            juicesDisplay.setBounds(80, 140, 400, 300);
            panelCenterConor.add(juicesDisplay);
            juicesDisplay.setBackground(Color.gray);
            juicesDisplay.setVisible(false);

            JPanel fastFoodDisplay = new JPanel(new GridLayout(16, 1, 10, 10));
            fastFoodDisplay.setBounds(55, 93, 400, 400);
            panelCenterConor.add(fastFoodDisplay);
            fastFoodDisplay.setBackground(Color.gray);
            fastFoodDisplay.setVisible(false);

            JPanel chineseCuisineDisplay = new JPanel(new GridLayout(9, 1, 10, 10));
            chineseCuisineDisplay.setBounds(75, 170, 400, 225);
            panelCenterConor.add(chineseCuisineDisplay);
            chineseCuisineDisplay.setBackground(Color.gray);
            chineseCuisineDisplay.setVisible(false);

            //ImageIcon created for Logo.
            ImageIcon cornerShopLogo = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\ConorLogo.PNG")
                    .getImage().getScaledInstance(160, 110, Image.SCALE_SMOOTH));
            ImageIcon cornerShopImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\ConorName.PNG")
                    .getImage().getScaledInstance(305, 110, Image.SCALE_SMOOTH));
            ImageIcon juicesImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\Juices.PNG")
                    .getImage().getScaledInstance(90, 40, Image.SCALE_SMOOTH));
            ImageIcon fastfoodImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\FastFood.PNG")
                    .getImage().getScaledInstance(110, 40, Image.SCALE_SMOOTH));
            ImageIcon chineseCuisineImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\ChineseFood.PNG")
                    .getImage().getScaledInstance(122, 40, Image.SCALE_SMOOTH));
            ImageIcon CornerBackButton = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\ConorBack.PNG")
                    .getImage().getScaledInstance(110, 40, Image.SCALE_SMOOTH));

            //Labels to hold this Image.
            JLabel refreshmentsLogo = new JLabel();
            refreshmentsLogo.setBounds(0, 40, -100, 20);
            refreshmentsLogo.setIcon(cornerShopLogo);
            panelTopConor.add(refreshmentsLogo);

            JLabel refreshmentsImage = new JLabel();
            refreshmentsImage.setIcon(cornerShopImage);
            panelTopConor.add(refreshmentsImage);

            // Labels to display the juices available
            JLabel juiceCorner0 = new JLabel(Refreshments.JuiceCorner[0].toStrings());
            juicesDisplay.add(juiceCorner0);
            JLabel juiceCorner1 = new JLabel(Refreshments.JuiceCorner[1].toStrings());
            juicesDisplay.add(juiceCorner1);
            JLabel juiceCorner2 = new JLabel(Refreshments.JuiceCorner[2].toStrings());
            juicesDisplay.add(juiceCorner2);
            JLabel juiceCorner3 = new JLabel(Refreshments.JuiceCorner[3].toStrings());
            juicesDisplay.add(juiceCorner3);
            JLabel juiceCorner4 = new JLabel(Refreshments.JuiceCorner[4].toStrings());
            juicesDisplay.add(juiceCorner4);
            JLabel juiceCorner5 = new JLabel(Refreshments.JuiceCorner[5].toStrings());
            juicesDisplay.add(juiceCorner5);
            JLabel juiceCorner6 = new JLabel(Refreshments.JuiceCorner[6].toStrings());
            juicesDisplay.add(juiceCorner6);
            JLabel juiceCorner7 = new JLabel(Refreshments.JuiceCorner[7].toStrings());
            juicesDisplay.add(juiceCorner7);
            JLabel juiceCorner8 = new JLabel(Refreshments.JuiceCorner[8].toStrings());
            juicesDisplay.add(juiceCorner8);
            JLabel juiceCorner9 = new JLabel(Refreshments.JuiceCorner[9].toStrings());
            juicesDisplay.add(juiceCorner9);
            JLabel juiceCorner10 = new JLabel(Refreshments.JuiceCorner[10].toStrings());
            juicesDisplay.add(juiceCorner10);
            JLabel juiceCorner11 = new JLabel(Refreshments.JuiceCorner[11].toStrings());
            juicesDisplay.add(juiceCorner11);

            // Labels to display the fast foods available
            JLabel fastFoodCorner0 = new JLabel(Refreshments.FastFoodCorner[0].toStrings());
            fastFoodDisplay.add(fastFoodCorner0);
            JLabel fastFoodCorner1 = new JLabel(Refreshments.FastFoodCorner[1].toStrings());
            fastFoodDisplay.add(fastFoodCorner1);
            JLabel fastFoodCorner2 = new JLabel(Refreshments.FastFoodCorner[2].toStrings());
            fastFoodDisplay.add(fastFoodCorner2);
            JLabel fastFoodCorner3 = new JLabel(Refreshments.FastFoodCorner[3].toStrings());
            fastFoodDisplay.add(fastFoodCorner3);
            JLabel fastFoodCorner4 = new JLabel(Refreshments.FastFoodCorner[4].toStrings());
            fastFoodDisplay.add(fastFoodCorner4);
            JLabel fastFoodCorner5 = new JLabel(Refreshments.FastFoodCorner[5].toStrings());
            fastFoodDisplay.add(fastFoodCorner5);
            JLabel fastFoodCorner6 = new JLabel(Refreshments.FastFoodCorner[6].toStrings());
            fastFoodDisplay.add(fastFoodCorner6);
            JLabel fastFoodCorner7 = new JLabel(Refreshments.FastFoodCorner[7].toStrings());
            fastFoodDisplay.add(fastFoodCorner7);
            JLabel fastFoodCorner8 = new JLabel(Refreshments.FastFoodCorner[8].toStrings());
            fastFoodDisplay.add(fastFoodCorner8);
            JLabel fastFoodCorner9 = new JLabel(Refreshments.FastFoodCorner[9].toStrings());
            fastFoodDisplay.add(fastFoodCorner9);
            JLabel fastFoodCorner10 = new JLabel(Refreshments.FastFoodCorner[10].toStrings());
            fastFoodDisplay.add(fastFoodCorner10);
            JLabel fastFoodCorner11 = new JLabel(Refreshments.FastFoodCorner[11].toStrings());
            fastFoodDisplay.add(fastFoodCorner11);
            JLabel fastFoodCorner12 = new JLabel(Refreshments.FastFoodCorner[12].toStrings());
            fastFoodDisplay.add(fastFoodCorner12);
            JLabel fastFoodCorner13 = new JLabel(Refreshments.FastFoodCorner[13].toStrings());
            fastFoodDisplay.add(fastFoodCorner13);
            JLabel fastFoodCorner14 = new JLabel(Refreshments.FastFoodCorner[14].toStrings());
            fastFoodDisplay.add(fastFoodCorner14);
            JLabel fastFoodCorner15 = new JLabel(Refreshments.FastFoodCorner[15].toStrings());
            fastFoodDisplay.add(fastFoodCorner15);

            // Labels to display the fast foods available
            JLabel chineseCuisineCorner0 = new JLabel(Refreshments.ChineseCuisine[0].toStrings());
            chineseCuisineDisplay.add(chineseCuisineCorner0);
            JLabel chineseCuisineCorner1 = new JLabel(Refreshments.ChineseCuisine[1].toStrings());
            chineseCuisineDisplay.add(chineseCuisineCorner1);
            JLabel chineseCuisineCorner2 = new JLabel(Refreshments.ChineseCuisine[2].toStrings());
            chineseCuisineDisplay.add(chineseCuisineCorner2);
            JLabel chineseCuisineCorner3 = new JLabel(Refreshments.ChineseCuisine[3].toStrings());
            chineseCuisineDisplay.add(chineseCuisineCorner3);
            JLabel chineseCuisineCorner4 = new JLabel(Refreshments.ChineseCuisine[4].toStrings());
            chineseCuisineDisplay.add(chineseCuisineCorner4);
            JLabel chineseCuisineCorner5 = new JLabel(Refreshments.ChineseCuisine[5].toStrings());
            chineseCuisineDisplay.add(chineseCuisineCorner5);
            JLabel chineseCuisineCorner6 = new JLabel(Refreshments.ChineseCuisine[6].toStrings());
            chineseCuisineDisplay.add(chineseCuisineCorner6);
            JLabel chineseCuisineCorner7 = new JLabel(Refreshments.ChineseCuisine[7].toStrings());
            chineseCuisineDisplay.add(chineseCuisineCorner7);
            JLabel chineseCuisineCorner8 = new JLabel(Refreshments.ChineseCuisine[8].toStrings());
            chineseCuisineDisplay.add(chineseCuisineCorner8);

            //Button to display the available juices
            JButton juicesButton = new JButton(juicesImage);
            juicesButton.setBounds(20, 40, 130, 45);
            juicesButton.setForeground(Color.white);
            juicesButton.setBackground(Color.gray);
            juicesButton.setBorder(BorderFactory.createEmptyBorder());
            panelCenterConor.add(juicesButton);

            //Button used to display the fast food items
            JButton fastFoodButton = new JButton(fastfoodImage);
            fastFoodButton.setBounds(160, 40, 130, 45);
            fastFoodButton.setForeground(Color.white);
            fastFoodButton.setBackground(Color.gray);
            fastFoodButton.setBorder(BorderFactory.createEmptyBorder());
            panelCenterConor.add(fastFoodButton);

            //Button used to display the Chinese Cuisine
            JButton chineseCuisineButton = new JButton(chineseCuisineImage);
            chineseCuisineButton.setBounds(320, 40, 130, 45);
            chineseCuisineButton.setForeground(Color.white);
            chineseCuisineButton.setBackground(Color.gray);
            chineseCuisineButton.setBorder(BorderFactory.createEmptyBorder());
            panelCenterConor.add(chineseCuisineButton);

            //Back button to go from the refreshments window to the shops window
            JButton backToShops_R = new JButton(CornerBackButton);
            backToShops_R.setBounds(10, 20, 130, 45);
            backToShops_R.setForeground(Color.white);
            backToShops_R.setBackground(Color.gray);
            backToShops_R.setBorder(BorderFactory.createEmptyBorder());
            panelBottomConor.add(backToShops_R);

            //Event Handling.
            //For juicesButton.
            juicesButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent sw) {
                    if (sw.getSource() == juicesButton) {
                        juicesDisplay.setVisible(true);
                        fastFoodDisplay.setVisible(false);
                        chineseCuisineDisplay.setVisible(false);
                    }
                }
            });

            //For fastFoodButton.
            fastFoodButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent sw) {
                    if (sw.getSource() == fastFoodButton) {
                        juicesDisplay.setVisible(false);
                        fastFoodDisplay.setVisible(true);
                        chineseCuisineDisplay.setVisible(false);
                    }
                }
            });

            //For chineseCuisineButton.
            chineseCuisineButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent sw) {
                    if (sw.getSource() == chineseCuisineButton) {
                        chineseCuisineDisplay.setVisible(true);
                        fastFoodDisplay.setVisible(false);
                        juicesDisplay.setVisible(false);

                    }
                }
            });

            //For backToShops button.
            backToShops_R.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent sw) {
                    if (sw.getSource() == backToShops_R) {
                        conorFrame.dispose();
                    }
                }
            });

            //Adding panels to main panel.
            panelMainConor.add(panelTopConor, BorderLayout.NORTH);
            panelMainConor.add(panelCenterConor, BorderLayout.CENTER);
            panelMainConor.add(panelBottomConor, BorderLayout.SOUTH);

            //Adding main panel to frame.
            conorFrame.add(panelMainConor);

            //Mandatory Code
            conorFrame.setDefaultCloseOperation(conorFrame.EXIT_ON_CLOSE);
            conorFrame.setVisible(true);
        }
    }

    public static class FourthWindow {

        static JLabel infoMovieOne;
        static JLabel infoMovieTwo;
        static JLabel infoMovieThree;

        public static void fourthWindow() {
            //Create frame.
            JFrame fourthFrame = new JFrame("AlphaMan Theatre");
            fourthFrame.setSize(370, 350);

            //Create main panel.
            JPanel panelMain = new JPanel();
            panelMain.setLayout(new BorderLayout());

            //Create Top panel.
            JPanel panelTop = new JPanel();
            panelTop.setLayout(new FlowLayout());
            panelTop.setBackground(Color.white);

            //Create Center panel.
            JPanel panelCenter = new JPanel();
            panelCenter.setLayout(null);
            panelCenter.setBackground(Color.DARK_GRAY);

            // ImageIcon created for Logo.
            ImageIcon iconLogo = new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\AlphaManCinema.PNG");

            //Label to hold this Image.
            JLabel labelImage = new JLabel();
            labelImage.setIcon(iconLogo);
            panelTop.add(labelImage);

            //Label created.
            JLabel selectMovie = new JLabel("Select a movie: ");
            selectMovie.setBackground(Color.black);
            selectMovie.setBounds(40, 25, 100, 20);
            selectMovie.setForeground(Color.white);
            panelCenter.add(selectMovie);

            //Array for Dropdown.
            String[] listOfMovies = {Cinema.MOVIE_1, Cinema.MOVIE_2, Cinema.MOVIE_3, Cinema.MOVIE_4};

            //Dropdown created for user to select a movie.
            JComboBox movieList = new JComboBox();
            for (String everyMovie : listOfMovies) {

                movieList.addItem(everyMovie);
            }
            movieList.setBounds(150, 25, 180, 20);
            panelCenter.add(movieList);

            //Label that will display Show 1 information.
            infoMovieOne = new JLabel("Show 1");
            infoMovieOne.setBounds(45, 70, 600, 20);
            infoMovieOne.setForeground(Color.white);
            panelCenter.add(infoMovieOne);

            //Label that will display Show 2 information.
            infoMovieTwo = new JLabel("Show 2");
            infoMovieTwo.setBounds(45, 100, 600, 20);
            infoMovieTwo.setForeground(Color.white);
            panelCenter.add(infoMovieTwo);

            //Label that will display Show 3 information.
            infoMovieThree = new JLabel("Show 3");
            infoMovieThree.setBounds(45, 130, 600, 20);
            infoMovieThree.setForeground(Color.white);
            panelCenter.add(infoMovieThree);

            //Image of back button.
            ImageIcon backCinema = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\AlphaBack.PNG").getImage().getScaledInstance(110, 40, Image.SCALE_SMOOTH));
            //Back button created.
            JButton back = new JButton(backCinema);
            back.setBounds(15, 160, 100, 40);
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            panelCenter.add(back);

            //Event Handling for the JComboBox/Drop-down.
            movieList.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == movieList) {
                        JComboBox sample = (JComboBox) e.getSource();
                        String choice = (String) sample.getSelectedItem();
                        switch (choice) {
                            case Cinema.MOVIE_1:
                                infoMovieOne.setText("1)    Movie Day: " + Cinema.show1.movie_day + "           Movie Time: " + Cinema.show1.movie_time);
                                infoMovieTwo.setText("2)    Movie Day: " + Cinema.show5.movie_day + "    Movie Time: " + Cinema.show5.movie_time);
                                infoMovieThree.setText("There's no other show for this movie.");
                                break;
                            case Cinema.MOVIE_2:
                                infoMovieOne.setText("1)    Movie Day: " + Cinema.show2.movie_day + "           Movie Time: " + Cinema.show2.movie_time);
                                infoMovieTwo.setText("2)    Movie Day: " + Cinema.show6.movie_day + "    Movie Time: " + Cinema.show6.movie_time);
                                infoMovieThree.setText("There's no other show for this movie.");
                                break;
                            case Cinema.MOVIE_3:
                                infoMovieOne.setText("1)    Movie Day: " + Cinema.show3.movie_day + "    Movie Time: " + Cinema.show3.movie_time);
                                infoMovieTwo.setText("2)    Movie Day: " + Cinema.show7.movie_day + "  Movie Time: " + Cinema.show7.movie_time);
                                infoMovieThree.setText("3)    Movie Day: " + Cinema.show9.movie_day + "        Movie Time: " + Cinema.show9.movie_time);

                                break;
                            case Cinema.MOVIE_4:
                                infoMovieOne.setText("1)    Movie Day: " + Cinema.show4.movie_day + "    Movie Time: " + Cinema.show4.movie_time);
                                infoMovieTwo.setText("2)    Movie Day: " + Cinema.show8.movie_day + "  Movie Time: " + Cinema.show8.movie_time);
                                infoMovieThree.setText("3)    Movie Day: " + Cinema.show10.movie_day + "        Movie Time: " + Cinema.show10.movie_time);
                                break;

                        }
                    }
                }
            });

            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == back) {
                        fourthFrame.dispose();
                    }
                }
            });

            //Add panels to frame.
            panelMain.add(panelCenter, BorderLayout.CENTER);
            panelMain.add(panelTop, BorderLayout.NORTH);
            fourthFrame.add(panelMain);

            //Mandatory code.
            fourthFrame.setDefaultCloseOperation(fourthFrame.EXIT_ON_CLOSE);
            fourthFrame.setVisible(true);
        }
    }

    public static class ThirdWindow {// Class which contains everything about the third window

        public static void thirdWindow() {

            //Create frame.
            JFrame sethisFrame = new JFrame("Sethi's");
            sethisFrame.setSize(450, 630);

            //Create main panel.
            JPanel panelMainSethis = new JPanel();
            panelMainSethis.setLayout(new BorderLayout());

            //Create Top panel.
            JPanel panelTopSethis = new JPanel();
            panelTopSethis.setLayout(new GridLayout(1, 1, 10, 10));
            panelTopSethis.setBackground(Color.GRAY);

            //Create Center panel.
            JPanel panelCenterSethis = new JPanel();
            panelCenterSethis.setLayout(null);
            panelCenterSethis.setBackground(Color.gray);

            //Create Bottom panel.
            JPanel panelBottomSethis = new JPanel();
            panelBottomSethis.setLayout(new FlowLayout());
            panelBottomSethis.setBackground(Color.gray);

            //Create panels to display the required information
            JPanel menDisplay = new JPanel(new GridLayout(10, 1, 10, 10));
            menDisplay.setBounds(40, 140, 400, 200);
            panelCenterSethis.add(menDisplay);
            menDisplay.setBackground(Color.gray);
            menDisplay.setVisible(false);

            JPanel womenDisplay = new JPanel(new GridLayout(10, 1, 10, 10));
            womenDisplay.setBounds(40, 140, 400, 200);
            panelCenterSethis.add(womenDisplay);
            womenDisplay.setBackground(Color.gray);
            womenDisplay.setVisible(false);

            //ImageIcon created for Logo.
            ImageIcon sethisShopImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\Sethi'sShop.PNG")
                    .getImage().getScaledInstance(170, 90, Image.SCALE_DEFAULT));
            ImageIcon sethisImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\SLogo.PNG")
                    .getImage().getScaledInstance(180, 130, Image.SCALE_DEFAULT));
            ImageIcon MenImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\MensClothing.PNG")
                    .getImage().getScaledInstance(110, 60, Image.SCALE_DEFAULT));
            ImageIcon WomenImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\WomenClothing.PNG")
                    .getImage().getScaledInstance(150, 60, Image.SCALE_DEFAULT));
            ImageIcon SethisBackButton = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\Sethi'sBack.PNG")
                    .getImage().getScaledInstance(150, 60, Image.SCALE_DEFAULT));

            //Labels to hold this Image.
            JLabel clothesImage = new JLabel();
            clothesImage.setBounds(0, 40, -100, 20);
            clothesImage.setIcon(sethisImage);
            panelTopSethis.add(clothesImage);

            JLabel sethisShopLogo = new JLabel();
            sethisShopLogo.setIcon(sethisShopImage);
            panelTopSethis.add(sethisShopLogo);

            //Button to display men clothes
            JButton menButton = new JButton(MenImage);
            menButton.setBounds(30, 40, 170, 50);
            menButton.setForeground(Color.white);
            menButton.setBackground(Color.gray);
            menButton.setBorder(BorderFactory.createEmptyBorder());
            panelCenterSethis.add(menButton);

            //Button used to display women clothes
            JButton womenButton = new JButton(WomenImage);
            womenButton.setBounds(210, 40, 170, 50);
            womenButton.setForeground(Color.white);
            womenButton.setBackground(Color.gray);
            womenButton.setBorder(BorderFactory.createEmptyBorder());
            panelCenterSethis.add(womenButton);

            //Back button to go from the clothes window to the shops window
            JButton backToShops_C = new JButton(SethisBackButton);
            backToShops_C.setBounds(20, 40, 150, 50);
            backToShops_C.setForeground(Color.white);
            backToShops_C.setBackground(Color.gray);
            backToShops_C.setBorder(BorderFactory.createEmptyBorder());
            panelBottomSethis.add(backToShops_C);

            //Labels to display the inventory for men clothing
            JLabel menClothing0 = new JLabel(Clothing.MenClothing[0].toString());
            menClothing0.setForeground(Color.white);
            menDisplay.add(menClothing0);
            JLabel menClothing1 = new JLabel(Clothing.MenClothing[1].toString());
            menClothing1.setForeground(Color.white);
            menDisplay.add(menClothing1);
            JLabel menClothing2 = new JLabel(Clothing.MenClothing[2].toString());
            menClothing2.setForeground(Color.white);
            menDisplay.add(menClothing2);
            JLabel menClothing3 = new JLabel(Clothing.MenClothing[3].toString());
            menClothing3.setForeground(Color.white);
            menDisplay.add(menClothing3);
            JLabel menClothing4 = new JLabel(Clothing.MenClothing[4].toString());
            menClothing4.setForeground(Color.white);
            menDisplay.add(menClothing4);
            JLabel menClothing5 = new JLabel(Clothing.MenClothing[5].toString());
            menClothing5.setForeground(Color.white);
            menDisplay.add(menClothing5);
            JLabel menClothing6 = new JLabel(Clothing.MenClothing[6].toString());
            menClothing6.setForeground(Color.white);
            menDisplay.add(menClothing6);
            JLabel menClothing7 = new JLabel(Clothing.MenClothing[7].toString());
            menClothing7.setForeground(Color.white);
            menDisplay.add(menClothing7);
            JLabel menClothing8 = new JLabel(Clothing.MenClothing[8].toString());
            menClothing8.setForeground(Color.white);
            menDisplay.add(menClothing8);
            JLabel menClothing9 = new JLabel(Clothing.MenClothing[9].toString());
            menClothing9.setForeground(Color.white);
            menDisplay.add(menClothing9);

            //Labels to display the inventory for women clothing
            JLabel womenClothing0 = new JLabel(Clothing.WomenClothing[0].toString());
            womenDisplay.add(womenClothing0);
            JLabel womenClothing1 = new JLabel(Clothing.WomenClothing[1].toString());
            womenDisplay.add(womenClothing1);
            JLabel womenClothing2 = new JLabel(Clothing.WomenClothing[2].toString());
            womenDisplay.add(womenClothing2);
            JLabel womenClothing3 = new JLabel(Clothing.WomenClothing[3].toString());
            womenDisplay.add(womenClothing3);
            JLabel womenClothing4 = new JLabel(Clothing.WomenClothing[4].toString());
            womenDisplay.add(womenClothing4);
            JLabel womenClothing5 = new JLabel(Clothing.WomenClothing[5].toString());
            womenDisplay.add(womenClothing5);
            JLabel womenClothing6 = new JLabel(Clothing.WomenClothing[6].toString());
            womenDisplay.add(womenClothing6);
            JLabel womenClothing7 = new JLabel(Clothing.WomenClothing[7].toString());
            womenDisplay.add(womenClothing7);
            JLabel womenClothing8 = new JLabel(Clothing.WomenClothing[8].toString());
            womenDisplay.add(womenClothing8);
            JLabel womenClothing9 = new JLabel(Clothing.WomenClothing[9].toString());
            womenDisplay.add(womenClothing9);

            //Event Handling.
            //For menButton button.
            menButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent sw) {
                    if (sw.getSource() == menButton) {
                        menDisplay.setVisible(true);
                        womenDisplay.setVisible(false);
                    }
                }
            });

            //For womenButton button.
            womenButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent sw) {
                    if (sw.getSource() == womenButton) {
                        womenDisplay.setVisible(true);
                        menDisplay.setVisible(false);
                    }
                }
            });

            //For backToShops button.
            backToShops_C.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent sw) {
                    if (sw.getSource() == backToShops_C) {
                        sethisFrame.dispose();
                    }
                }
            });
            //Adding panels to main panel.
            panelMainSethis.add(panelTopSethis, BorderLayout.NORTH);
            panelMainSethis.add(panelCenterSethis, BorderLayout.CENTER);
            panelMainSethis.add(panelBottomSethis, BorderLayout.SOUTH);

            //Adding main panel to frame.
            sethisFrame.add(panelMainSethis);

            //Mandatory Code
            sethisFrame.setDefaultCloseOperation(sethisFrame.EXIT_ON_CLOSE);
            sethisFrame.setVisible(true);
        }
    }

    public static class secondWindow {// Class which contains everything about the second window

        public static void secondWindow() {
            JFrame secondFrame = new JFrame("Mall Window"); // title of the frame
            GridLayout secondLayout;// layout to design the window
            JPanel panel = new JPanel(new GridLayout(11, 1, 10, 10));// Panel created
            panel.setBorder(BorderFactory.createEmptyBorder(50, 25, 50, 25));

            // Images used as logos or on buttons
            ImageIcon image;
            ImageIcon clothingImage;
            ImageIcon refreshmentsImage;
            ImageIcon cinemaImage;
            ImageIcon playingAreaImage;
            ImageIcon backImage;
            ImageIcon shopImage;
            ImageIcon databookImage;

            // Code to get all of the images from their respective locations
            image = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\AAFS.PNG")
                    .getImage().getScaledInstance(470, 90, Image.SCALE_DEFAULT));
            clothingImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\Sethi's.PNG")
                    .getImage().getScaledInstance(336, 95, Image.SCALE_DEFAULT));
            refreshmentsImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\Corner101.PNG")
                    .getImage().getScaledInstance(336, 95, Image.SCALE_DEFAULT));
            cinemaImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\AlphamanTheatre.PNG")
                    .getImage().getScaledInstance(480, 95, Image.SCALE_DEFAULT));
            playingAreaImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\FunCity.PNG")
                    .getImage().getScaledInstance(336, 95, Image.SCALE_DEFAULT));
            backImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\Back.PNG")
                    .getImage().getScaledInstance(256, 85, Image.SCALE_DEFAULT));
            shopImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\Shops.PNG")
                    .getImage().getScaledInstance(326, 95, Image.SCALE_DEFAULT));
            databookImage = new ImageIcon(new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\Databook.PNG")
                    .getImage().getScaledInstance(326, 95, Image.SCALE_DEFAULT));

            // Creating the labels now
            JLabel labelLogo = new JLabel();
            labelLogo.setBounds(10,10,50,50);
            labelLogo.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
            labelLogo.setIcon(image);

            JLabel categories = new JLabel(shopImage);
            categories.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

            //Labels used as line space in grid layout
            JLabel space1 = new JLabel("");
            JLabel space2 = new JLabel("");
            JLabel space3 = new JLabel("");

            //Creating the buttons now
            JButton databookButton = new JButton(databookImage);
            databookButton.setBackground(Color.gray);
            databookButton.setBorder(BorderFactory.createEmptyBorder());

            JButton clothes = new JButton(clothingImage);
            clothes.setBackground(Color.gray);
            clothes.setBorder(BorderFactory.createEmptyBorder());

            JButton refreshments = new JButton(refreshmentsImage);
            refreshments.setBackground(Color.gray);
            refreshments.setBorder(BorderFactory.createEmptyBorder());

            JButton cinema = new JButton(cinemaImage);
            cinema.setBackground(Color.gray);
            cinema.setBorder(BorderFactory.createEmptyBorder());

            JButton playingArea = new JButton(playingAreaImage);
            playingArea.setBackground(Color.gray);
            playingArea.setBorder(BorderFactory.createEmptyBorder());

            JButton back = new JButton(backImage);
            back.setBackground(Color.gray);
            back.setBorder(BorderFactory.createEmptyBorder());

            panel.add(labelLogo);// adding the label to the panel
            panel.add(space2);
            panel.add(databookButton);
            panel.add(space3);
            panel.add(categories);// adding the categories label to the panel
            panel.add(clothes);// adding clothes button to the panel
            panel.add(refreshments);// adding the refreshments button to the panel
            panel.add(cinema);// adding the cinema button to the panel
            panel.add(playingArea);// adding the playingArea button to the panel
            panel.add(space1);
            panel.add(back);// adding the back button to the panel

            secondFrame.add(panel);// the panel is added to the frame
            secondFrame.setVisible(true);// frame becomes visible by this line of code
            secondFrame.setSize(650, 1000);// setting the size of the frame
            secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            panel.setBackground(Color.gray);
            //frame.pack();

            databookButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == databookButton) {
                        SeventhWindow.seventhWindow();
                    }
                }
            });

            clothes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == clothes) {
                        ThirdWindow.thirdWindow();
                    }
                }
            });
            refreshments.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == refreshments) {
                        FifthWindow.fifthWindow();
                    }
                }
            });
            cinema.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == cinema) {
                        FourthWindow.fourthWindow();
                    }
                }
            });
            playingArea.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == playingArea) {
                        SixthWindow.sixthWindow();
                    }
                }
            });
            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == back) {
                        secondFrame.dispose();
                    }
                }
            });
        }
    }

    //This is a method for creating the Login Screen Window.
    public static void firstWin() {

        //Create frame.
        JFrame firstFrame = new JFrame("Flamingo Enterprises");
        firstFrame.setSize(355, 600);

        //Create main panel.
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BorderLayout());

        //Create Top panel.
        JPanel panelTop = new JPanel();
        panelTop.setLayout(new FlowLayout());
        panelTop.setBackground(Color.darkGray);

        //Create Center panel.
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(null);
        panelCenter.setBackground(Color.gray);

        //Create Bottom panel.
        JPanel panelBottom = new JPanel();
        panelBottom.setLayout(new FlowLayout());
        panelBottom.setBackground(Color.black);

        //ImageIcon created for Logo.
        ImageIcon iconLogo = new ImageIcon("C:\\Users\\Faizan Sethi\\Desktop\\OOP Project Images\\Capture.PNG");

        //Label to hold this Image.
        JLabel labelImage = new JLabel();
        labelImage.setIcon(iconLogo);
        panelTop.add(labelImage);

        //Label for username.
        JLabel userLabel = new JLabel("User ID");
        userLabel.setBounds(80, 40, 100, 20);
        userLabel.setForeground(Color.black);
        userLabel.setBackground(Color.black);
        panelCenter.add(userLabel);

        //Textfield for username.
        JTextField userText = new JTextField(20);
        userText.setBounds(170, 40, 100, 20);
        panelCenter.add(userText);

        //Label for password.
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(80, 80, 100, 20);
        passwordLabel.setForeground(Color.black);
        panelCenter.add(passwordLabel);

        //Password Field for password.
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(170, 80, 100, 20);
        panelCenter.add(passwordText);

        //Button for Next.
        JButton buttonNext = new JButton("SIGN IN");
        buttonNext.setBackground(Color.darkGray);
        buttonNext.setForeground(Color.white);
        buttonNext.setBounds(138, 130, 80, 40);
        panelCenter.add(buttonNext);

        //Button for Exit.
        JButton buttonExit = new JButton("EXIT");
        buttonExit.setBackground(Color.black);
        buttonExit.setForeground(Color.white);
        buttonExit.setBounds(138, 200, 80, 40);
        panelCenter.add(buttonExit);

        //Event Handling.
        //For Next button.
        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttonNext) {

                    char[] pass = (passwordText.getPassword());
                    pswd = new String(pass);
                    user = userText.getText();
                }
                if ((user.equals(((MallOwner) p1).name)) && pswd.equals(((MallOwner) p1).password)) {

                    secondWindow.secondWindow();
                } else {
                    JOptionPane.showMessageDialog(firstFrame, "Wrong Username or Password, please try again.", "Wrong Input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        //Event Handling.
        //For Exit button.
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttonExit) {
                    System.exit(0);
                }
            }
        });

        //Adding panels to main panel.
        panelMain.add(panelTop, BorderLayout.NORTH);
        panelMain.add(panelCenter, BorderLayout.CENTER);
        panelMain.add(panelBottom, BorderLayout.SOUTH);

        //Adding main panel to frame.
        firstFrame.add(panelMain);

        //Mandatory Code
        firstFrame.setDefaultCloseOperation(firstFrame.EXIT_ON_CLOSE);
        firstFrame.setVisible(true);
    }

    /*Main method creates instances of Mall and Mall Owner. Constructor chaining then takes place and all required objects are created.*/
    public static void main(String[] args) {

        //Mall created.
        AAFS = new Mall("Cool Hot Mall", "AAFS");

        //Mall Owner created.
        p1 = new MallOwner("AAFS", 23,
                "mazey@seecs.com", "99556550", "Khowgali", "gurwork");

        Manager m1 = new Manager("Jon Snow", 36, "jon.snow@gmail.com", "03096745889", "Winterfell", 35000, "3 years", "Sethi's");
        Manager m2 = new Manager("Tyrion Lannister", 40, "tyrion.lannister@gmail.com", "03085579235", "King's landing", 40000, "4 years", "Alphaman Theatre");
        Manager m3 = new Manager("Arya Stark", 28, "arya.stark@gmail.com", "03174630119", "The Wall", 30000, "1 year", "FunCity");
        Manager m4 = new Manager("Daenerys Targaryen", 32, "daenerys.targaryen@gmail.com", "03483122411", "Dragonstone", 35000, "3 years", "Corner 101");

        Iterator itr3 = managers.iterator();
        while (itr3.hasNext()) {
            Object element = itr3.next();
            shop_manager.addItem(element);
        }

        Employee e1 = new Employee("Steve Rogers", 36, "captain_america@gmail.com", "03993331677", "Chicago", 20000, "2 years", 246321, "Corner 101");
        Employee e2 = new Employee("Tony Stark", 40, "iron_man@gmail.com", "03886613525", "New York City", 20000, "2 years", 245147, "Alphaman Theatre");
        Employee e3 = new Employee("Peter Parker", 28, "spider_man@gmail.com", "03771523665", "Los Angeles", 15000, "1 year", 247845, "Sethi's");
        Employee e4 = new Employee("Logan", 39, "wolverine11@gmail.com", "03667826552", "Mutant City", 22000, "2.3 years", 253148, "FunCity");

        Iterator itr4 = employees.iterator();
        while (itr4.hasNext()) {
            Object element = itr4.next();
            employee_list.addItem(element);
        }

        firstWin();
    }
}
