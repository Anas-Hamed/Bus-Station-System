package busstation;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BusStation extends javax.swing.JFrame {

    EmployeeAction EA = new TripActions();
    CustomerAction CA = new TripActions();
    boolean round = true;
    int c = 0;
    ArrayList<Ticket> tlist;
    ArrayList<Ticket[]> tlistarray;

    public BusStation() {

        initComponents();

        HomejPanel.setVisible(true);
        HomejPanel.setBackground(new Color(0, 51, 102));

        EmployeePanel.setVisible(false);
        EmployeePanelAfterLogin.setVisible(false);
        ErrorPassword.setVisible(false);
        ErrorName.setVisible(false);
        CustomerPanel.setVisible(false);
        CustomerAvailableTripsPanel.setVisible(false);
        CustomerTripDetailsPanel.setVisible(false);
        ThankYouPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SidePane = new javax.swing.JPanel();
        EmployeejPanel = new javax.swing.JPanel();
        SubEmployeejLabel = new javax.swing.JLabel();
        HomejPanel = new javax.swing.JPanel();
        SubHomejLabel = new javax.swing.JLabel();
        CustomerjPanel = new javax.swing.JPanel();
        SubCustomerjLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        CloseButton = new javax.swing.JLabel();
        MinimizeButton = new javax.swing.JLabel();
        EmployeePaneAfterLogin = new javax.swing.JLayeredPane();
        EmployeePanelAfterLogin = new javax.swing.JPanel();
        EmployeeBluejPanel = new javax.swing.JPanel();
        NewTripjPanel = new javax.swing.JPanel();
        NewTripjLabel = new javax.swing.JLabel();
        EditTripjPanel = new javax.swing.JPanel();
        EditTripjLabel = new javax.swing.JLabel();
        ShowTripjPanel = new javax.swing.JPanel();
        ShowTripjLabel = new javax.swing.JLabel();
        DeletejPanel = new javax.swing.JPanel();
        DeletejLabel = new javax.swing.JLabel();
        LogOutjPanel = new javax.swing.JPanel();
        LogOutjLabel = new javax.swing.JLabel();
        DeletejPanelBox = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DeleteTripsjList = new javax.swing.JList<>();
        DeletejButton = new javax.swing.JButton();
        ShowTripjPanelBox = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        showTripsjList = new javax.swing.JList<>();
        EditTripjPanelBox = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        EditTripsjList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EditPricejTextField = new javax.swing.JTextField();
        HoursjTextField1 = new javax.swing.JTextField();
        MinutesjTextField1 = new javax.swing.JTextField();
        EditjButton = new javax.swing.JButton();
        errorecjLabel = new javax.swing.JLabel();
        SelectjButton = new javax.swing.JButton();
        NewjPanelBox = new javax.swing.JPanel();
        NewFromjLabel = new javax.swing.JLabel();
        NewFromjComboBox = new javax.swing.JComboBox<>();
        NewInternalDestinationjComboBox = new javax.swing.JComboBox<>();
        NewDestinationjLabel = new javax.swing.JLabel();
        NewInternaljRadioButton = new javax.swing.JRadioButton();
        NewExternaljRadioButton = new javax.swing.JRadioButton();
        NewTraveljLabel = new javax.swing.JLabel();
        NewjComboBox1 = new javax.swing.JComboBox<>();
        NewjComboBox2 = new javax.swing.JComboBox<>();
        NewjComboBox3 = new javax.swing.JComboBox<>();
        NewReturnTimejLabel = new javax.swing.JLabel();
        NewStopjLabel = new javax.swing.JLabel();
        NonStopjRadioButton = new javax.swing.JRadioButton();
        OneStopjRadioButton = new javax.swing.JRadioButton();
        ManyStopjRadioButton = new javax.swing.JRadioButton();
        LamosinejRadioButton = new javax.swing.JRadioButton();
        BusjRadioButton = new javax.swing.JRadioButton();
        MinibusjRadioButton = new javax.swing.JRadioButton();
        NewVehiclejLabel = new javax.swing.JLabel();
        NewDriverjLabel = new javax.swing.JLabel();
        DriverjTextField = new javax.swing.JTextField();
        NewPricejLabel = new javax.swing.JLabel();
        PricejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        HoursjTextField = new javax.swing.JTextField();
        MinutesjTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        SaveNewjButton = new javax.swing.JButton();
        NewExternalDestinationjComboBox = new javax.swing.JComboBox<>();
        errorjLabel = new javax.swing.JLabel();
        CustomerPane = new javax.swing.JLayeredPane();
        CustomerPanel = new javax.swing.JPanel();
        CustomerBluejPanel = new javax.swing.JPanel();
        OneWayjPanel = new javax.swing.JPanel();
        OneWayjLabel = new javax.swing.JLabel();
        RoundWayjPanel = new javax.swing.JPanel();
        RoundWayjLabel = new javax.swing.JLabel();
        FromjLabel = new javax.swing.JLabel();
        FromjComboBox = new javax.swing.JComboBox<>();
        ReturnjLabel = new javax.swing.JLabel();
        DestinationjComboBox = new javax.swing.JComboBox<>();
        DestinationjComboBox1 = new javax.swing.JComboBox<>();
        ExternaljRadioButton = new javax.swing.JRadioButton();
        InternaljRadioButton = new javax.swing.JRadioButton();
        DestinationjLabel = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        TraveljLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        SearchjButton = new javax.swing.JButton();
        errorcjLabel = new javax.swing.JLabel();
        CustomerAvailableTripsPanel = new javax.swing.JPanel();
        CustomerAvailableTripsBluejPanel = new javax.swing.JPanel();
        CustomerAvailableTripsjLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSpinner1 = new javax.swing.JSpinner();
        NextjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AvailableTripsjList = new javax.swing.JList<>();
        erroracjLabel = new javax.swing.JLabel();
        CustomerTripDetailsPanel = new javax.swing.JPanel();
        CustomerAvailableTripsBluejPanel1 = new javax.swing.JPanel();
        TripDetailsjLabel = new javax.swing.JLabel();
        DetailCustomerjLabel = new javax.swing.JLabel();
        DestinationCustomerjLabel = new javax.swing.JLabel();
        TravelDateCustomerjLabel = new javax.swing.JLabel();
        TravelTimeCustomerjLabel = new javax.swing.JLabel();
        DetailPricej = new javax.swing.JLabel();
        AvailableSeatsCustomerjLabel = new javax.swing.JLabel();
        SopsCustomerjLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BackjButton = new javax.swing.JButton();
        DetailAvailableSeatjLabel = new javax.swing.JLabel();
        DetailFromjLabel = new javax.swing.JLabel();
        DetailTravelDatejLabel = new javax.swing.JLabel();
        DetailStopsjLabel = new javax.swing.JLabel();
        DetailDestinationjLabel = new javax.swing.JLabel();
        DetailTravelTimejLabel = new javax.swing.JLabel();
        DetailPricejLabel = new javax.swing.JLabel();
        ReturnDateCustomerjLabel1 = new javax.swing.JLabel();
        ReturnTimeCustomerjLabel1 = new javax.swing.JLabel();
        DetailReturnDatejLabel1 = new javax.swing.JLabel();
        DetailReturnTimejLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ThankYouPanel = new javax.swing.JPanel();
        CustomerAvailableTripsBluejPanel2 = new javax.swing.JPanel();
        TripDetailsjLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        EmployeePane = new javax.swing.JLayeredPane();
        EmployeePanel = new javax.swing.JPanel();
        NameLable_EmployeePanel = new javax.swing.JLabel();
        PasswordLable_EmployeePanel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        PasswordField = new javax.swing.JPasswordField();
        SignInLabel_EmployeePane = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BorderPanel = new javax.swing.JPanel();
        NameField = new javax.swing.JTextField();
        ErrorPassword = new javax.swing.JLabel();
        ErrorName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        EmployeeBluejPanel1 = new javax.swing.JPanel();
        EployeeSignInjLabel1 = new javax.swing.JLabel();
        HomePane = new javax.swing.JLayeredPane();
        HomePanel = new javax.swing.JPanel();
        HomeBluejPanel = new javax.swing.JPanel();
        WlecomejLabel = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePane.setBackground(new java.awt.Color(0, 0, 51));
        SidePane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmployeejPanel.setBackground(new java.awt.Color(0, 0, 51));
        EmployeejPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeejPanelMouseClicked(evt);
            }
        });
        EmployeejPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubEmployeejLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        SubEmployeejLabel.setForeground(new java.awt.Color(255, 255, 255));
        SubEmployeejLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Manager_30px.png"))); // NOI18N
        SubEmployeejLabel.setText("Employee");
        SubEmployeejLabel.setIconTextGap(30);
        SubEmployeejLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubEmployeejLabelMouseClicked(evt);
            }
        });
        EmployeejPanel.add(SubEmployeejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 40));

        SidePane.add(EmployeejPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 40));

        HomejPanel.setBackground(new java.awt.Color(0, 0, 51));
        HomejPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomejPanelMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HomejPanelMouseReleased(evt);
            }
        });
        HomejPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubHomejLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        SubHomejLabel.setForeground(new java.awt.Color(255, 255, 255));
        SubHomejLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Home_30px_1.png"))); // NOI18N
        SubHomejLabel.setText("Home");
        SubHomejLabel.setIconTextGap(30);
        SubHomejLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubHomejLabelMouseClicked(evt);
            }
        });
        HomejPanel.add(SubHomejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 40));

        SidePane.add(HomejPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 220, 40));

        CustomerjPanel.setBackground(new java.awt.Color(0, 0, 51));
        CustomerjPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerjPanelMouseClicked(evt);
            }
        });
        CustomerjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubCustomerjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        SubCustomerjLabel.setForeground(new java.awt.Color(255, 255, 255));
        SubCustomerjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Queue_30px.png"))); // NOI18N
        SubCustomerjLabel.setText("Customer");
        SubCustomerjLabel.setIconTextGap(30);
        SubCustomerjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubCustomerjLabelMouseClicked(evt);
            }
        });
        CustomerjPanel.add(SubCustomerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 170, 40));

        SidePane.add(CustomerjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, 40));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText(" Bus Station");
        SidePane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 170, 50));
        SidePane.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, -1));

        jPanel1.add(SidePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 480));

        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Shutdown_20px.png"))); // NOI18N
        CloseButton.setIconTextGap(1);
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });
        jPanel1.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 30, -1));

        MinimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Minus_20px_3.png"))); // NOI18N
        MinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseClicked(evt);
            }
        });
        jPanel1.add(MinimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 30, -1));

        EmployeePaneAfterLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmployeePanelAfterLogin.setBackground(new java.awt.Color(255, 255, 255));
        EmployeePanelAfterLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), null));
        EmployeePanelAfterLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmployeeBluejPanel.setBackground(new java.awt.Color(0, 0, 51));
        EmployeeBluejPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewTripjPanel.setBackground(new java.awt.Color(0, 0, 51));
        NewTripjPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewTripjPanelMouseClicked(evt);
            }
        });
        NewTripjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewTripjLabel.setBackground(new java.awt.Color(255, 255, 255));
        NewTripjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        NewTripjLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewTripjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Plus_30px_1.png"))); // NOI18N
        NewTripjLabel.setText("  New Trip");
        NewTripjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewTripjLabelMouseClicked(evt);
            }
        });
        NewTripjPanel.add(NewTripjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        EmployeeBluejPanel.add(NewTripjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        EditTripjPanel.setBackground(new java.awt.Color(0, 0, 51));
        EditTripjPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditTripjPanelMouseClicked(evt);
            }
        });
        EditTripjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EditTripjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        EditTripjLabel.setForeground(new java.awt.Color(255, 255, 255));
        EditTripjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Edit_30px.png"))); // NOI18N
        EditTripjLabel.setText("   Edit Trip");
        EditTripjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditTripjLabelMouseClicked(evt);
            }
        });
        EditTripjPanel.add(EditTripjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        EmployeeBluejPanel.add(EditTripjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 50));

        ShowTripjPanel.setBackground(new java.awt.Color(0, 0, 51));
        ShowTripjPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowTripjPanelMouseClicked(evt);
            }
        });
        ShowTripjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShowTripjLabel.setBackground(new java.awt.Color(255, 255, 255));
        ShowTripjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ShowTripjLabel.setForeground(new java.awt.Color(255, 255, 255));
        ShowTripjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_TV_Show_30px.png"))); // NOI18N
        ShowTripjLabel.setText("Show Trips");
        ShowTripjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowTripjLabelMouseClicked(evt);
            }
        });
        ShowTripjPanel.add(ShowTripjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        EmployeeBluejPanel.add(ShowTripjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 130, -1));

        DeletejPanel.setBackground(new java.awt.Color(0, 0, 51));
        DeletejPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletejPanelMouseClicked(evt);
            }
        });
        DeletejPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeletejLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        DeletejLabel.setForeground(new java.awt.Color(255, 255, 255));
        DeletejLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Trash_30px.png"))); // NOI18N
        DeletejLabel.setText("Delete");
        DeletejLabel.setIconTextGap(15);
        DeletejLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletejLabelMouseClicked(evt);
            }
        });
        DeletejPanel.add(DeletejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        EmployeeBluejPanel.add(DeletejPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 140, -1));

        LogOutjPanel.setBackground(new java.awt.Color(0, 0, 51));
        LogOutjPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutjPanelMouseClicked(evt);
            }
        });
        LogOutjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogOutjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LogOutjLabel.setForeground(new java.awt.Color(255, 255, 255));
        LogOutjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Logout_Rounded_Left_30px.png"))); // NOI18N
        LogOutjLabel.setText("Log Out");
        LogOutjLabel.setIconTextGap(15);
        LogOutjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutjLabelMouseClicked(evt);
            }
        });
        LogOutjPanel.add(LogOutjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 110, 50));

        EmployeeBluejPanel.add(LogOutjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 140, -1));

        EmployeePanelAfterLogin.add(EmployeeBluejPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        DeletejPanelBox.setBackground(new java.awt.Color(255, 255, 255));
        DeletejPanelBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteTripsjList.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 102), null));
        DeleteTripsjList.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        DeleteTripsjList.setFixedCellHeight(40);
        jScrollPane4.setViewportView(DeleteTripsjList);

        DeletejPanelBox.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 640, 280));

        DeletejButton.setBackground(new java.awt.Color(102, 0, 0));
        DeletejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeletejButton.setForeground(new java.awt.Color(255, 255, 255));
        DeletejButton.setText("Delete");
        DeletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletejButtonActionPerformed(evt);
            }
        });
        DeletejPanelBox.add(DeletejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 100, 30));

        EmployeePanelAfterLogin.add(DeletejPanelBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 740, 360));

        ShowTripjPanelBox.setBackground(new java.awt.Color(255, 255, 255));
        ShowTripjPanelBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showTripsjList.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 102), null));
        showTripsjList.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        showTripsjList.setFixedCellHeight(40);
        jScrollPane3.setViewportView(showTripsjList);

        ShowTripjPanelBox.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 640, 280));

        EmployeePanelAfterLogin.add(ShowTripjPanelBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 740, 360));

        EditTripjPanelBox.setBackground(new java.awt.Color(255, 255, 255));
        EditTripjPanelBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EditTripsjList.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 102), null));
        EditTripsjList.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        EditTripsjList.setFixedCellHeight(40);
        jScrollPane5.setViewportView(EditTripsjList);

        EditTripjPanelBox.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 500, 280));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Time : ");
        EditTripjPanelBox.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 60, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Price : ");
        EditTripjPanelBox.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 60, 30));
        EditTripjPanelBox.add(EditPricejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 40, 30));
        EditTripjPanelBox.add(HoursjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 40, 30));
        EditTripjPanelBox.add(MinutesjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 40, 30));

        EditjButton.setBackground(new java.awt.Color(153, 0, 0));
        EditjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EditjButton.setForeground(new java.awt.Color(255, 255, 255));
        EditjButton.setText("Edit");
        EditjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditjButtonActionPerformed(evt);
            }
        });
        EditTripjPanelBox.add(EditjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 90, 30));

        errorecjLabel.setForeground(new java.awt.Color(102, 0, 0));
        EditTripjPanelBox.add(errorecjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 120, 20));

        SelectjButton.setBackground(new java.awt.Color(153, 0, 0));
        SelectjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectjButton.setForeground(new java.awt.Color(255, 255, 255));
        SelectjButton.setText("Select");
        SelectjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectjButtonActionPerformed(evt);
            }
        });
        EditTripjPanelBox.add(SelectjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 90, 30));

        EmployeePanelAfterLogin.add(EditTripjPanelBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 740, 360));

        NewjPanelBox.setBackground(new java.awt.Color(255, 255, 255));
        NewjPanelBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewFromjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        NewFromjLabel.setText("From :");
        NewjPanelBox.add(NewFromjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 50, 20));

        NewFromjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cairo", "Alexandria", "Fayoum", "Luxor", "Hurghada", "Sharm El-sheikh", "Dahab", "Portsaid", "Matrouh", "Aswan", " " }));
        NewjPanelBox.add(NewFromjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 160, 20));

        NewInternalDestinationjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cairo", "Alexandria", "Fayoum", "Luxor", "Hurghada", "Sharm El-sheikh", "Dahab", "Portsaid", "Matrouh", "Aswan", " " }));
        NewInternalDestinationjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewInternalDestinationjComboBoxActionPerformed(evt);
            }
        });
        NewjPanelBox.add(NewInternalDestinationjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 160, 20));

        NewDestinationjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        NewDestinationjLabel.setText("Destination :");
        NewjPanelBox.add(NewDestinationjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 90, 20));

        NewInternaljRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(NewInternaljRadioButton);
        NewInternaljRadioButton.setText("Internal");
        NewInternaljRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewInternaljRadioButtonMouseClicked(evt);
            }
        });
        NewjPanelBox.add(NewInternaljRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 100, 20));

        NewExternaljRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(NewExternaljRadioButton);
        NewExternaljRadioButton.setText("External");
        NewExternaljRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewExternaljRadioButtonMouseClicked(evt);
            }
        });
        NewExternaljRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewExternaljRadioButtonActionPerformed(evt);
            }
        });
        NewjPanelBox.add(NewExternaljRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, 20));

        NewTraveljLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        NewTraveljLabel.setText("Travel Date :");
        NewjPanelBox.add(NewTraveljLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 90, 20));

        NewjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        NewjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewjComboBox1ActionPerformed(evt);
            }
        });
        NewjPanelBox.add(NewjComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 70, 20));

        NewjComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        NewjComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewjComboBox2ActionPerformed(evt);
            }
        });
        NewjPanelBox.add(NewjComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 70, 20));

        NewjComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", " " }));
        NewjPanelBox.add(NewjComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 70, 20));

        NewReturnTimejLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        NewReturnTimejLabel.setText("Travel Time :");
        NewjPanelBox.add(NewReturnTimejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 100, 30));

        NewStopjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        NewStopjLabel.setText("Stop : ");
        NewjPanelBox.add(NewStopjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 90, 20));

        NonStopjRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(NonStopjRadioButton);
        NonStopjRadioButton.setSelected(true);
        NonStopjRadioButton.setText("Non-Stop");
        NewjPanelBox.add(NonStopjRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        OneStopjRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(OneStopjRadioButton);
        OneStopjRadioButton.setText("One-Stop");
        NewjPanelBox.add(OneStopjRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        ManyStopjRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(ManyStopjRadioButton);
        ManyStopjRadioButton.setText("many-Stops");
        NewjPanelBox.add(ManyStopjRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        LamosinejRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(LamosinejRadioButton);
        LamosinejRadioButton.setText("Limosine");
        LamosinejRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamosinejRadioButtonActionPerformed(evt);
            }
        });
        NewjPanelBox.add(LamosinejRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        BusjRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(BusjRadioButton);
        BusjRadioButton.setSelected(true);
        BusjRadioButton.setText("Bus");
        NewjPanelBox.add(BusjRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        MinibusjRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(MinibusjRadioButton);
        MinibusjRadioButton.setText("minibus");
        MinibusjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinibusjRadioButtonActionPerformed(evt);
            }
        });
        NewjPanelBox.add(MinibusjRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        NewVehiclejLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        NewVehiclejLabel.setText("Vehicle :");
        NewjPanelBox.add(NewVehiclejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        NewDriverjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        NewDriverjLabel.setText("Driver :");
        NewjPanelBox.add(NewDriverjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, 30));

        DriverjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DriverjTextFieldActionPerformed(evt);
            }
        });
        NewjPanelBox.add(DriverjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 288, 180, 30));

        NewPricejLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        NewPricejLabel.setText("Price :");
        NewjPanelBox.add(NewPricejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, 30));
        NewjPanelBox.add(PricejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 60, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Without Vehicle Factor");
        NewjPanelBox.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 326, -1, -1));

        HoursjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoursjTextFieldActionPerformed(evt);
            }
        });
        NewjPanelBox.add(HoursjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 40, 30));
        NewjPanelBox.add(MinutesjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 40, 30));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setText(" :");
        NewjPanelBox.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 10, 30));

        SaveNewjButton.setBackground(new java.awt.Color(102, 0, 0));
        SaveNewjButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        SaveNewjButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveNewjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Save_20px_2.png"))); // NOI18N
        SaveNewjButton.setText("Save");
        SaveNewjButton.setIconTextGap(15);
        SaveNewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveNewjButtonActionPerformed(evt);
            }
        });
        NewjPanelBox.add(SaveNewjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        NewExternalDestinationjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Germany", "Italy", "Russia", "India", "U.A.E", "Saudi Arabia", "Greece", "Sudan", "Libya" }));
        NewExternalDestinationjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewExternalDestinationjComboBoxActionPerformed(evt);
            }
        });
        NewjPanelBox.add(NewExternalDestinationjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 160, 20));

        errorjLabel.setForeground(new java.awt.Color(102, 0, 0));
        errorjLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewjPanelBox.add(errorjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 160, 20));

        EmployeePanelAfterLogin.add(NewjPanelBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 740, 360));

        EmployeePaneAfterLogin.add(EmployeePanelAfterLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 760, 430));

        jPanel1.add(EmployeePaneAfterLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 480));

        CustomerPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerPanel.setBackground(new java.awt.Color(255, 255, 255));
        CustomerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 102), null, null));
        CustomerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerBluejPanel.setBackground(new java.awt.Color(0, 0, 51));
        CustomerBluejPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OneWayjPanel.setBackground(new java.awt.Color(0, 0, 51));
        OneWayjPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneWayjPanelMouseClicked(evt);
            }
        });
        OneWayjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OneWayjLabel.setBackground(new java.awt.Color(255, 255, 255));
        OneWayjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        OneWayjLabel.setForeground(new java.awt.Color(255, 255, 255));
        OneWayjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Advance_20px.png"))); // NOI18N
        OneWayjLabel.setText("   One Way");
        OneWayjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneWayjLabelMouseClicked(evt);
            }
        });
        OneWayjPanel.add(OneWayjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        CustomerBluejPanel.add(OneWayjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        RoundWayjPanel.setBackground(new java.awt.Color(0, 0, 51));
        RoundWayjPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoundWayjPanelMouseClicked(evt);
            }
        });
        RoundWayjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoundWayjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        RoundWayjLabel.setForeground(new java.awt.Color(255, 255, 255));
        RoundWayjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Direction_20px_4.png"))); // NOI18N
        RoundWayjLabel.setText("   Round Way");
        RoundWayjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoundWayjLabelMouseClicked(evt);
            }
        });
        RoundWayjPanel.add(RoundWayjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        CustomerBluejPanel.add(RoundWayjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 150, 50));

        CustomerPanel.add(CustomerBluejPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        FromjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        FromjLabel.setText("From :");
        CustomerPanel.add(FromjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 50, 20));

        FromjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cairo", "Alexandria", "Fayoum", "Luxor", "Hurghada", "Sharm El-sheikh", "Dahab", "Portsaid", "Matrouh", "Aswan", " " }));
        CustomerPanel.add(FromjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 160, 20));

        ReturnjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ReturnjLabel.setText("Return Date :");
        CustomerPanel.add(ReturnjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 100, 20));

        DestinationjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cairo", "Alexandria", "Fayoum", "Luxor", "Hurghada", "Sharm El-sheikh", "Dahab", "Portsaid", "Matrouh", "Aswan", " " }));
        DestinationjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationjComboBoxActionPerformed(evt);
            }
        });
        CustomerPanel.add(DestinationjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 160, 20));

        DestinationjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Germany", "Italy", "Russia", "India", "U.A.E", "Saudi Arabia", "Greece", "Sudan", "Libya" }));
        DestinationjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationjComboBox1ActionPerformed(evt);
            }
        });
        CustomerPanel.add(DestinationjComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 160, 20));

        ExternaljRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(ExternaljRadioButton);
        ExternaljRadioButton.setText("External");
        ExternaljRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExternaljRadioButtonMouseClicked(evt);
            }
        });
        ExternaljRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExternaljRadioButtonActionPerformed(evt);
            }
        });
        CustomerPanel.add(ExternaljRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        InternaljRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(InternaljRadioButton);
        InternaljRadioButton.setSelected(true);
        InternaljRadioButton.setText("Internal");
        InternaljRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InternaljRadioButtonMouseClicked(evt);
            }
        });
        CustomerPanel.add(InternaljRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 90, -1));

        DestinationjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        DestinationjLabel.setText("Destination :");
        CustomerPanel.add(DestinationjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 90, 20));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        CustomerPanel.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 70, 20));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        CustomerPanel.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 70, 20));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", " " }));
        CustomerPanel.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 70, 20));

        TraveljLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        TraveljLabel.setText("Travel Date :");
        CustomerPanel.add(TraveljLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 90, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        CustomerPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 70, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        CustomerPanel.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 70, 20));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022" }));
        CustomerPanel.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 70, 20));

        SearchjButton.setBackground(new java.awt.Color(102, 0, 0));
        SearchjButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        SearchjButton.setForeground(new java.awt.Color(255, 255, 255));
        SearchjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Search_20px.png"))); // NOI18N
        SearchjButton.setText("Search");
        SearchjButton.setIconTextGap(15);
        SearchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchjButtonActionPerformed(evt);
            }
        });
        CustomerPanel.add(SearchjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        errorcjLabel.setForeground(new java.awt.Color(102, 0, 0));
        CustomerPanel.add(errorcjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 240, 20));

        CustomerPane.add(CustomerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 760, 430));

        CustomerAvailableTripsPanel.setBackground(new java.awt.Color(255, 255, 255));
        CustomerAvailableTripsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), null));
        CustomerAvailableTripsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerAvailableTripsBluejPanel.setBackground(new java.awt.Color(0, 0, 51));
        CustomerAvailableTripsBluejPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerAvailableTripsjLabel.setBackground(new java.awt.Color(255, 255, 255));
        CustomerAvailableTripsjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        CustomerAvailableTripsjLabel.setForeground(new java.awt.Color(255, 255, 255));
        CustomerAvailableTripsjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_More_30px.png"))); // NOI18N
        CustomerAvailableTripsjLabel.setText("AvailableTrips");
        CustomerAvailableTripsjLabel.setIconTextGap(15);
        CustomerAvailableTripsjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerAvailableTripsjLabelMouseClicked(evt);
            }
        });
        CustomerAvailableTripsBluejPanel.add(CustomerAvailableTripsjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        CustomerAvailableTripsPanel.add(CustomerAvailableTripsBluejPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));
        CustomerAvailableTripsPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));
        CustomerAvailableTripsPanel.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        NextjButton.setBackground(new java.awt.Color(102, 0, 0));
        NextjButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        NextjButton.setForeground(new java.awt.Color(255, 255, 255));
        NextjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Next_20px.png"))); // NOI18N
        NextjButton.setText("Next");
        NextjButton.setIconTextGap(15);
        NextjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextjButtonActionPerformed(evt);
            }
        });
        CustomerAvailableTripsPanel.add(NextjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, -1, -1));

        AvailableTripsjList.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 102), null));
        AvailableTripsjList.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        AvailableTripsjList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        AvailableTripsjList.setFixedCellHeight(40);
        jScrollPane2.setViewportView(AvailableTripsjList);

        CustomerAvailableTripsPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 640, 260));

        erroracjLabel.setForeground(new java.awt.Color(102, 0, 0));
        CustomerAvailableTripsPanel.add(erroracjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 350, 130, 20));

        CustomerPane.add(CustomerAvailableTripsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 760, 430));

        CustomerTripDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        CustomerTripDetailsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), null));
        CustomerTripDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerAvailableTripsBluejPanel1.setBackground(new java.awt.Color(0, 0, 51));
        CustomerAvailableTripsBluejPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TripDetailsjLabel.setBackground(new java.awt.Color(255, 255, 255));
        TripDetailsjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        TripDetailsjLabel.setForeground(new java.awt.Color(255, 255, 255));
        TripDetailsjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Details_30px_1.png"))); // NOI18N
        TripDetailsjLabel.setText("Trip Details");
        TripDetailsjLabel.setIconTextGap(15);
        TripDetailsjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TripDetailsjLabelMouseClicked(evt);
            }
        });
        CustomerAvailableTripsBluejPanel1.add(TripDetailsjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 50));

        CustomerTripDetailsPanel.add(CustomerAvailableTripsBluejPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        DetailCustomerjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        DetailCustomerjLabel.setForeground(new java.awt.Color(0, 0, 102));
        DetailCustomerjLabel.setText("From :");
        CustomerTripDetailsPanel.add(DetailCustomerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 20));

        DestinationCustomerjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        DestinationCustomerjLabel.setForeground(new java.awt.Color(0, 51, 102));
        DestinationCustomerjLabel.setText("Destination : ");
        CustomerTripDetailsPanel.add(DestinationCustomerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, 30));

        TravelDateCustomerjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        TravelDateCustomerjLabel.setForeground(new java.awt.Color(0, 51, 102));
        TravelDateCustomerjLabel.setText("Travel Date :");
        CustomerTripDetailsPanel.add(TravelDateCustomerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 30));

        TravelTimeCustomerjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        TravelTimeCustomerjLabel.setForeground(new java.awt.Color(0, 51, 102));
        TravelTimeCustomerjLabel.setText("Travel Time : ");
        CustomerTripDetailsPanel.add(TravelTimeCustomerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 30));

        DetailPricej.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        DetailPricej.setForeground(new java.awt.Color(0, 51, 102));
        DetailPricej.setText("price :");
        CustomerTripDetailsPanel.add(DetailPricej, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 30));

        AvailableSeatsCustomerjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        AvailableSeatsCustomerjLabel.setForeground(new java.awt.Color(0, 51, 102));
        AvailableSeatsCustomerjLabel.setText("Available Seats :");
        CustomerTripDetailsPanel.add(AvailableSeatsCustomerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, 30));

        SopsCustomerjLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        SopsCustomerjLabel.setForeground(new java.awt.Color(0, 51, 102));
        SopsCustomerjLabel.setText("Stops :");
        CustomerTripDetailsPanel.add(SopsCustomerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 30));

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Buy_20px_2.png"))); // NOI18N
        jButton1.setText("Buy a Ticket");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setIconTextGap(20);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        CustomerTripDetailsPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 250, 30));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Debit_Card_20px.png"))); // NOI18N
        jButton2.setText("Pay Now");
        jButton2.setIconTextGap(20);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        CustomerTripDetailsPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 170, 30));

        BackjButton.setBackground(new java.awt.Color(102, 0, 0));
        BackjButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        BackjButton.setForeground(new java.awt.Color(255, 255, 255));
        BackjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Back_To_20px_4.png"))); // NOI18N
        BackjButton.setText("Back");
        BackjButton.setIconTextGap(15);
        BackjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackjButtonActionPerformed(evt);
            }
        });
        CustomerTripDetailsPanel.add(BackjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        CustomerTripDetailsPanel.add(DetailAvailableSeatjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 110, 30));
        CustomerTripDetailsPanel.add(DetailFromjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 110, 20));
        CustomerTripDetailsPanel.add(DetailTravelDatejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 110, 30));
        CustomerTripDetailsPanel.add(DetailStopsjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 110, 30));
        CustomerTripDetailsPanel.add(DetailDestinationjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 110, 30));
        CustomerTripDetailsPanel.add(DetailTravelTimejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 110, 30));
        CustomerTripDetailsPanel.add(DetailPricejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 60, 30));

        ReturnDateCustomerjLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ReturnDateCustomerjLabel1.setForeground(new java.awt.Color(0, 51, 102));
        ReturnDateCustomerjLabel1.setText("Return Date :");
        CustomerTripDetailsPanel.add(ReturnDateCustomerjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, 30));

        ReturnTimeCustomerjLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ReturnTimeCustomerjLabel1.setForeground(new java.awt.Color(0, 51, 102));
        ReturnTimeCustomerjLabel1.setText("Return Time : ");
        CustomerTripDetailsPanel.add(ReturnTimeCustomerjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, 30));
        CustomerTripDetailsPanel.add(DetailReturnDatejLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 110, 30));
        CustomerTripDetailsPanel.add(DetailReturnTimejLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 110, 30));

        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        CustomerTripDetailsPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 220, 30));

        CustomerPane.add(CustomerTripDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 760, 430));

        ThankYouPanel.setBackground(new java.awt.Color(255, 255, 255));
        ThankYouPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerAvailableTripsBluejPanel2.setBackground(new java.awt.Color(0, 0, 51));
        CustomerAvailableTripsBluejPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TripDetailsjLabel1.setBackground(new java.awt.Color(255, 255, 255));
        TripDetailsjLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TripDetailsjLabel1.setForeground(new java.awt.Color(255, 255, 255));
        TripDetailsjLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Rose_30px_1.png"))); // NOI18N
        TripDetailsjLabel1.setText("Ticket Bought Successfully !!");
        TripDetailsjLabel1.setIconTextGap(15);
        TripDetailsjLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TripDetailsjLabel1MouseClicked(evt);
            }
        });
        CustomerAvailableTripsBluejPanel2.add(TripDetailsjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 330, 50));

        ThankYouPanel.add(CustomerAvailableTripsBluejPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        jTextField3.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 0, 0));
        jTextField3.setText("    Thank you for using our bus station ");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        ThankYouPanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 150, 670, 140));

        CustomerPane.add(ThankYouPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 760, 430));

        jPanel1.add(CustomerPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 470));

        EmployeePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmployeePanel.setBackground(new java.awt.Color(255, 255, 255));
        EmployeePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), null));
        EmployeePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameLable_EmployeePanel.setBackground(new java.awt.Color(255, 255, 255));
        NameLable_EmployeePanel.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        NameLable_EmployeePanel.setForeground(new java.awt.Color(153, 0, 51));
        NameLable_EmployeePanel.setText(" Name");
        EmployeePanel.add(NameLable_EmployeePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        PasswordLable_EmployeePanel.setBackground(new java.awt.Color(255, 255, 255));
        PasswordLable_EmployeePanel.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        PasswordLable_EmployeePanel.setForeground(new java.awt.Color(153, 0, 51));
        PasswordLable_EmployeePanel.setText("Password");
        EmployeePanel.add(PasswordLable_EmployeePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));
        EmployeePanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 260, 10));

        PasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordFieldMouseClicked(evt);
            }
        });
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        EmployeePanel.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 260, 30));

        SignInLabel_EmployeePane.setBackground(new java.awt.Color(0, 153, 0));
        SignInLabel_EmployeePane.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        SignInLabel_EmployeePane.setForeground(new java.awt.Color(102, 102, 0));
        SignInLabel_EmployeePane.setText("                          Sign in");
        SignInLabel_EmployeePane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        SignInLabel_EmployeePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInLabel_EmployeePaneMouseClicked(evt);
            }
        });
        EmployeePanel.add(SignInLabel_EmployeePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 260, 30));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Designed By AWO System");
        EmployeePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        BorderPanel.setBackground(new java.awt.Color(255, 255, 255));
        BorderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        BorderPanel.setForeground(new java.awt.Color(0, 102, 102));
        BorderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        BorderPanel.add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 30));

        ErrorPassword.setForeground(new java.awt.Color(204, 0, 0));
        ErrorPassword.setText("Error!!  Password is not valid");
        BorderPanel.add(ErrorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, -1));

        ErrorName.setForeground(new java.awt.Color(204, 0, 0));
        ErrorName.setText("Error!! Name is not Valid");
        BorderPanel.add(ErrorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, -1));
        BorderPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 10));

        EmployeePanel.add(BorderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 310, 320));

        EmployeeBluejPanel1.setBackground(new java.awt.Color(0, 0, 51));
        EmployeeBluejPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EployeeSignInjLabel1.setBackground(new java.awt.Color(255, 255, 255));
        EployeeSignInjLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        EployeeSignInjLabel1.setForeground(new java.awt.Color(255, 255, 255));
        EployeeSignInjLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Sign_Out_30px.png"))); // NOI18N
        EployeeSignInjLabel1.setText("Sign In");
        EployeeSignInjLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EployeeSignInjLabel1.setIconTextGap(20);
        EployeeSignInjLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EployeeSignInjLabel1MouseClicked(evt);
            }
        });
        EmployeeBluejPanel1.add(EployeeSignInjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 50));

        EmployeePanel.add(EmployeeBluejPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        EmployeePane.add(EmployeePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 760, 430));

        jPanel1.add(EmployeePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 470));

        HomePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));
        HomePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        HomePanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        HomePanel.setMinimumSize(new java.awt.Dimension(500, 396));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeBluejPanel.setBackground(new java.awt.Color(0, 0, 51));
        HomeBluejPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WlecomejLabel.setBackground(new java.awt.Color(255, 255, 255));
        WlecomejLabel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        WlecomejLabel.setForeground(new java.awt.Color(255, 255, 255));
        WlecomejLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busstation/Images/icons8_Enter_30px.png"))); // NOI18N
        WlecomejLabel.setText("Welcome to our Bus System !!");
        WlecomejLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WlecomejLabel.setIconTextGap(20);
        WlecomejLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WlecomejLabelMouseClicked(evt);
            }
        });
        HomeBluejPanel.add(WlecomejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 50));

        HomePanel.add(HomeBluejPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        HomePane.add(HomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 760, 430));

        jPanel1.add(HomePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        System.exit(0); // to close the frame!!
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void HomejPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomejPanelMouseClicked
        EmployeejPanel.setBackground(new Color(0, 0, 51));
        CustomerjPanel.setBackground(new Color(0, 0, 51));
        HomejPanel.setBackground(new Color(0, 51, 102));

        EmployeePanel.setVisible(false);
        EmployeePanelAfterLogin.setVisible(false);
        CustomerPanel.setVisible(false);
        CustomerAvailableTripsPanel.setVisible(false);
        CustomerTripDetailsPanel.setVisible(false);
        ThankYouPanel.setVisible(false);
        HomePanel.setVisible(true);

    }//GEN-LAST:event_HomejPanelMouseClicked
// check the names of panels !!
    private void SubHomejLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubHomejLabelMouseClicked
        EmployeejPanel.setBackground(new Color(0, 0, 51));
        CustomerjPanel.setBackground(new Color(0, 0, 51));
        HomejPanel.setBackground(new Color(0, 51, 102));

        EmployeePanel.setVisible(false);
        EmployeePanelAfterLogin.setVisible(false);
        CustomerPanel.setVisible(false);
        CustomerAvailableTripsPanel.setVisible(false);
        CustomerPanel.setVisible(false);
        CustomerTripDetailsPanel.setVisible(false);
        HomePanel.setVisible(true);
    }//GEN-LAST:event_SubHomejLabelMouseClicked

    private void EmployeejPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeejPanelMouseClicked
        HomejPanel.setBackground(new Color(0, 0, 51));
        CustomerjPanel.setBackground(new Color(0, 0, 51));
        EmployeejPanel.setBackground(new Color(0, 51, 102));

        NameField.setText("");
        PasswordField.setText("");
        ErrorName.setVisible(false);
        ErrorPassword.setVisible(false);
        EmployeePanelAfterLogin.setVisible(false);
        EmployeePanel.setVisible(true);//
        CustomerPanel.setVisible(false);
        CustomerAvailableTripsPanel.setVisible(false);
        CustomerTripDetailsPanel.setVisible(false);
        ThankYouPanel.setVisible(false);
        HomePanel.setVisible(false);

        NameField.requestFocusInWindow();

    }//GEN-LAST:event_EmployeejPanelMouseClicked

    private void HomejPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomejPanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_HomejPanelMouseReleased

    private void SubEmployeejLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubEmployeejLabelMouseClicked
        HomejPanel.setBackground(new Color(0, 0, 51));
        CustomerjPanel.setBackground(new Color(0, 0, 51));
        EmployeejPanel.setBackground(new Color(0, 51, 102));

        NameField.setText("");
        PasswordField.setText("");
        ErrorName.setVisible(false);
        ErrorPassword.setVisible(false);
        EmployeePanelAfterLogin.setVisible(false);
        EmployeePanel.setVisible(true);
        CustomerPanel.setVisible(false);
        CustomerAvailableTripsPanel.setVisible(false);
        CustomerTripDetailsPanel.setVisible(false);
        ThankYouPanel.setVisible(false);
        HomePanel.setVisible(false);

        NameField.requestFocusInWindow();
    }//GEN-LAST:event_SubEmployeejLabelMouseClicked

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed


    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        PasswordField.requestFocusInWindow();
    }//GEN-LAST:event_NameFieldActionPerformed

    private void SignInLabel_EmployeePaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInLabel_EmployeePaneMouseClicked
        if (!EA.Login(NameField.getText(), PasswordField.getText())) {
            ErrorPassword.setVisible(true);
            PasswordField.setText("");
        } else {
            EmployeePanel.setVisible(false);
            EmployeePanelAfterLogin.setVisible(true);
            EmployeePanelAfterLogin.requestFocusInWindow();

            DeletejPanelBox.setVisible(false);
            ShowTripjPanelBox.setVisible(false);
            EditTripjPanelBox.setVisible(false);
            NewjPanelBox.setVisible(true);

            NewTripjPanel.setBackground(new Color(0, 51, 102));
            ShowTripjPanel.setBackground(new Color(0, 0, 51));
            EditTripjPanel.setBackground(new Color(0, 0, 51));
            DeletejPanel.setBackground(new Color(0, 0, 51));
            LogOutjPanel.setBackground(new Color(0, 0, 51));

        }
    }//GEN-LAST:event_SignInLabel_EmployeePaneMouseClicked

    private void PasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldMouseClicked

    }//GEN-LAST:event_PasswordFieldMouseClicked

    private void SubCustomerjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubCustomerjLabelMouseClicked
        EmployeejPanel.setBackground(new Color(0, 0, 51));
        HomejPanel.setBackground(new Color(0, 0, 51));
        OneWayjPanel.setBackground(new Color(0, 0, 51));
        CustomerjPanel.setBackground(new Color(0, 51, 102));
        RoundWayjPanel.setBackground(new Color(0, 51, 102));
        round = true;
        errorcjLabel.setText("");
        EmployeePanel.setVisible(false);
        EmployeePanelAfterLogin.setVisible(false);
        CustomerPanel.setVisible(true);
        HomePanel.setVisible(false);
        CustomerAvailableTripsPanel.setVisible(false);
        CustomerTripDetailsPanel.setVisible(false);
        ThankYouPanel.setVisible(false);
        jComboBox4.setEnabled(true);
        jComboBox5.setEnabled(true);
        jComboBox6.setEnabled(true);
        ReturnjLabel.setEnabled(true);
    }//GEN-LAST:event_SubCustomerjLabelMouseClicked

    private void CustomerjPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerjPanelMouseClicked
        EmployeejPanel.setBackground(new Color(0, 0, 51));
        HomejPanel.setBackground(new Color(0, 0, 51));
        OneWayjPanel.setBackground(new Color(0, 0, 51));

        CustomerjPanel.setBackground(new Color(0, 51, 102));
        RoundWayjPanel.setBackground(new Color(0, 51, 102));
        errorcjLabel.setText("");
        round = true;

        EmployeePanel.setVisible(false);
        EmployeePanelAfterLogin.setVisible(false);
        CustomerPanel.setVisible(true);
        HomePanel.setVisible(false);
        CustomerAvailableTripsPanel.setVisible(false);
        CustomerTripDetailsPanel.setVisible(false);
        ThankYouPanel.setVisible(false);
        jComboBox4.setEnabled(true);
        jComboBox5.setEnabled(true);
        jComboBox6.setEnabled(true);
        ReturnjLabel.setEnabled(true);
    }//GEN-LAST:event_CustomerjPanelMouseClicked

    private void ExternaljRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExternaljRadioButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ExternaljRadioButtonActionPerformed

    private void DestinationjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationjComboBoxActionPerformed
        String Temp = (String) DestinationjComboBox.getSelectedItem();
    }//GEN-LAST:event_DestinationjComboBoxActionPerformed

    private void RoundWayjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoundWayjLabelMouseClicked
        RoundWayjPanel.setBackground(new Color(0, 51, 102));
        OneWayjPanel.setBackground(new Color(0, 0, 51));
        jComboBox4.setEnabled(true);
        jComboBox5.setEnabled(true);
        jComboBox6.setEnabled(true);
        ReturnjLabel.setEnabled(true);
        round = true;

    }//GEN-LAST:event_RoundWayjLabelMouseClicked

    private void OneWayjPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneWayjPanelMouseClicked


    }//GEN-LAST:event_OneWayjPanelMouseClicked

    private void RoundWayjPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoundWayjPanelMouseClicked

    }//GEN-LAST:event_RoundWayjPanelMouseClicked

    private void OneWayjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneWayjLabelMouseClicked
        OneWayjPanel.setBackground(new Color(0, 51, 102));
        RoundWayjPanel.setBackground(new Color(0, 0, 51));
        jComboBox4.setEnabled(false);
        jComboBox6.setEnabled(false);
        jComboBox5.setEnabled(false);
        ReturnjLabel.setEnabled(false);
        round = false;
    }//GEN-LAST:event_OneWayjLabelMouseClicked

    private void InternaljRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InternaljRadioButtonMouseClicked
        DestinationjComboBox1.setVisible(false);
        DestinationjComboBox.setVisible(true);
    }//GEN-LAST:event_InternaljRadioButtonMouseClicked

    private void ExternaljRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExternaljRadioButtonMouseClicked
        DestinationjComboBox.setVisible(false);
        DestinationjComboBox1.setVisible(true);
    }//GEN-LAST:event_ExternaljRadioButtonMouseClicked

    private void NewTripjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewTripjLabelMouseClicked
        DeletejPanel.setBackground(new Color(0, 0, 51));
        ShowTripjPanel.setBackground(new Color(0, 0, 51));
        EditTripjPanel.setBackground(new Color(0, 0, 51));
        LogOutjPanel.setBackground(new Color(0, 0, 51));
        NewTripjPanel.setBackground(new Color(0, 51, 102));

        DeletejPanelBox.setVisible(false);
        ShowTripjPanelBox.setVisible(false);
        EditTripjPanelBox.setVisible(false);
        NewjPanelBox.setVisible(true);
    }//GEN-LAST:event_NewTripjLabelMouseClicked

    private void NewTripjPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewTripjPanelMouseClicked

    }//GEN-LAST:event_NewTripjPanelMouseClicked

    private void EditTripjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditTripjLabelMouseClicked
        DeletejPanel.setBackground(new Color(0, 0, 51));
        ShowTripjPanel.setBackground(new Color(0, 0, 51));
        NewTripjPanel.setBackground(new Color(0, 0, 51));
        LogOutjPanel.setBackground(new Color(0, 0, 51));
        EditTripjPanel.setBackground(new Color(0, 51, 102));

        DeletejPanelBox.setVisible(false);
        ShowTripjPanelBox.setVisible(false);
        EditTripjPanelBox.setVisible(true);
        NewjPanelBox.setVisible(false);
        
        errorecjLabel.setText("");
        jLabel6.setVisible(false);
        jLabel4.setVisible(false);
        EditPricejTextField.setVisible(false);
        HoursjTextField1.setVisible(false);
        MinutesjTextField1.setVisible(false);
        EditjButton.setVisible(false);
                 EditTripsjList.enable(true);

        
        SelectjButton.setVisible(true);

        
        
                          DefaultListModel model = new DefaultListModel();
            JList list = new JList(model);
            model.removeAllElements();

     
                ArrayList<Ticket> Temp = EA.ShowAllTrips();

                for (int i = 0; i < Temp.size(); i++) {
                    model.addElement(EA.TripShowAllText(Temp.get(i)));
                }
                tlist = new ArrayList<>();
                tlist = Temp ;
            
           EditTripsjList.setModel(model);
    }//GEN-LAST:event_EditTripjLabelMouseClicked

    private void EditTripjPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditTripjPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EditTripjPanelMouseClicked

    private void ShowTripjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowTripjLabelMouseClicked
        DeletejPanel.setBackground(new Color(0, 0, 51));
        NewTripjPanel.setBackground(new Color(0, 0, 51));
        EditTripjPanel.setBackground(new Color(0, 0, 51));
        LogOutjPanel.setBackground(new Color(0, 0, 51));
        ShowTripjPanel.setBackground(new Color(0, 51, 102));

        DeletejPanelBox.setVisible(false);
        ShowTripjPanelBox.setVisible(true);
        EditTripjPanelBox.setVisible(false);
        NewjPanelBox.setVisible(false);

          DefaultListModel model = new DefaultListModel();
            JList list = new JList(model);
            model.removeAllElements();

     
                ArrayList<Ticket> Temp = EA.ShowAllTrips();

                for (int i = 0; i < Temp.size(); i++) {
                    model.addElement(EA.TripShowAllText(Temp.get(i)));
                }

            
           showTripsjList.setModel(model);

    }//GEN-LAST:event_ShowTripjLabelMouseClicked

    private void ShowTripjPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowTripjPanelMouseClicked

    }//GEN-LAST:event_ShowTripjPanelMouseClicked

    private void DeletejPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletejPanelMouseClicked

    }//GEN-LAST:event_DeletejPanelMouseClicked

    private void DeletejLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletejLabelMouseClicked
        NewTripjPanel.setBackground(new Color(0, 0, 51));
        ShowTripjPanel.setBackground(new Color(0, 0, 51));
        EditTripjPanel.setBackground(new Color(0, 0, 51));
        LogOutjPanel.setBackground(new Color(0, 0, 51));
        DeletejPanel.setBackground(new Color(0, 51, 102));

        DeletejPanelBox.setVisible(true);
        ShowTripjPanelBox.setVisible(false);
        EditTripjPanelBox.setVisible(false);
        NewjPanelBox.setVisible(false);
        
        
         DefaultListModel model = new DefaultListModel();
            JList list = new JList(model);
            model.removeAllElements();

     
                ArrayList<Ticket> Temp = EA.ShowAllTrips();

                for (int i = 0; i < Temp.size(); i++) {
                    model.addElement(EA.TripShowAllText(Temp.get(i)));
                }
                tlist = new ArrayList<>();
                tlist = Temp ;
            
           DeleteTripsjList.setModel(model);
    }//GEN-LAST:event_DeletejLabelMouseClicked

    private void EployeeSignInjLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EployeeSignInjLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EployeeSignInjLabel1MouseClicked

    private void WlecomejLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WlecomejLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_WlecomejLabelMouseClicked

    private void NewInternalDestinationjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewInternalDestinationjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewInternalDestinationjComboBoxActionPerformed

    private void NewInternaljRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewInternaljRadioButtonMouseClicked
        NewInternalDestinationjComboBox.setVisible(true);
    }//GEN-LAST:event_NewInternaljRadioButtonMouseClicked

    private void NewExternaljRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewExternaljRadioButtonMouseClicked
        NewInternalDestinationjComboBox.setVisible(false);
    }//GEN-LAST:event_NewExternaljRadioButtonMouseClicked

    private void NewExternaljRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewExternaljRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewExternaljRadioButtonActionPerformed

    private void MinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseClicked
        setState(Frame.ICONIFIED);// to minmize the frame!!
    }//GEN-LAST:event_MinimizeButtonMouseClicked

    private void MinibusjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinibusjRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinibusjRadioButtonActionPerformed

    private void DriverjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DriverjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DriverjTextFieldActionPerformed

    private void CustomerAvailableTripsjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerAvailableTripsjLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerAvailableTripsjLabelMouseClicked

    private void TripDetailsjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TripDetailsjLabelMouseClicked
        CustomerPanel.setVisible(false);
        CustomerAvailableTripsPanel.setVisible(false);
        CustomerTripDetailsPanel.setVisible(true);
        ThankYouPanel.setVisible(false);
    }//GEN-LAST:event_TripDetailsjLabelMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        if (round)
        {
        CA.BuyTicket(tlistarray.get(AvailableTripsjList.getAnchorSelectionIndex())[0].getTripno(), c);
        CA.BuyTicket(tlistarray.get(AvailableTripsjList.getAnchorSelectionIndex())[1].getTripno(), c);
        }
        else
        CA.BuyTicket(tlist.get(AvailableTripsjList.getAnchorSelectionIndex()).getTripno(), c);


        CustomerPanel.setVisible(false);
        CustomerTripDetailsPanel.setVisible(false);
        CustomerAvailableTripsPanel.setVisible(false);
        ThankYouPanel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SearchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchjButtonActionPerformed
        erroracjLabel.setText("");
        if (FromjComboBox.getSelectedItem().toString().equals(DestinationjComboBox.getSelectedItem().toString())) {
            errorcjLabel.setText("Must choose different destination");
        } //        else if (round)
        //        {
        //         if ( CA.SetDate(Integer.parseInt(jComboBox1.getSelectedItem().toString()), Integer.parseInt(jComboBox2.getSelectedItem().toString()), Integer.parseInt(jComboBox3.getSelectedItem().toString())).after(CA.SetDate(Integer.parseInt(jComboBox4.getSelectedItem().toString()), Integer.parseInt(jComboBox5.getSelectedItem().toString()), Integer.parseInt(jComboBox6.getSelectedItem().toString()))))
        //                {
        //                    errorcjLabel.setText("Return Date must be after Travel Date");
        //
        //                }
        //
        //        }
        else {

            CustomerPanel.setVisible(false);
            CustomerTripDetailsPanel.setVisible(false);
            CustomerAvailableTripsPanel.setVisible(true);
            ThankYouPanel.setVisible(false);
            DefaultListModel model = new DefaultListModel();
            JList list = new JList(model);
            model.removeAllElements();

            if (round) {
                ArrayList<Ticket[]> Temp = CA.ShowTrips(FromjComboBox.getSelectedItem().toString(), DestinationjComboBox.getSelectedItem().toString(), CA.SetDate(Integer.parseInt(jComboBox1.getSelectedItem().toString()), Integer.parseInt(jComboBox2.getSelectedItem().toString()), Integer.parseInt(jComboBox3.getSelectedItem().toString())), CA.SetDate(Integer.parseInt(jComboBox4.getSelectedItem().toString()), Integer.parseInt(jComboBox5.getSelectedItem().toString()), Integer.parseInt(jComboBox6.getSelectedItem().toString())));

                for (int i = 0; i < Temp.size(); i++) {
                    model.addElement(CA.TripShowText(Temp.get(i)));
                }
                tlistarray = new ArrayList<>();
                tlistarray = Temp;
            } else {
                ArrayList<Ticket> Temp = CA.ShowTrips(FromjComboBox.getSelectedItem().toString(), DestinationjComboBox.getSelectedItem().toString(), CA.SetDate(Integer.parseInt(jComboBox1.getSelectedItem().toString()), Integer.parseInt(jComboBox2.getSelectedItem().toString()), Integer.parseInt(jComboBox3.getSelectedItem().toString())));

                for (int i = 0; i < Temp.size(); i++) {
                    model.addElement(CA.TripShowText(Temp.get(i)));
                }
                tlist = new ArrayList<>();
                tlist = Temp;
            }

            AvailableTripsjList.setModel(model);

        }

    }//GEN-LAST:event_SearchjButtonActionPerformed

    private void NextjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextjButtonActionPerformed

        c = 0;
        jLabel8.setText("");
        jButton1.setBackground(new Color( 102,0, 0));
        
        if (AvailableTripsjList.isSelectionEmpty()) {
            erroracjLabel.setText("choose a trip first");
        } else {
            erroracjLabel.setText("");
            CustomerPanel.setVisible(false);
            CustomerAvailableTripsPanel.setVisible(false);
            CustomerTripDetailsPanel.setVisible(true);
            ThankYouPanel.setVisible(false);
            ReturnDateCustomerjLabel1.setVisible(false);
            ReturnTimeCustomerjLabel1.setVisible(false);

            if (round) {
                ReturnDateCustomerjLabel1.setVisible(true);
                ReturnTimeCustomerjLabel1.setVisible(true);
                DetailFromjLabel.setText(tlistarray.get(AvailableTripsjList.getAnchorSelectionIndex())[0].getFrom());
                DetailDestinationjLabel.setText(tlistarray.get(AvailableTripsjList.getAnchorSelectionIndex())[0].getTo());
                DetailTravelDatejLabel.setText(tlistarray.get(AvailableTripsjList.getAnchorSelectionIndex())[0].getDate().toString());
                DetailTravelTimejLabel.setText(tlistarray.get(AvailableTripsjList.getAnchorSelectionIndex())[0].getTime().toString());
                DetailStopsjLabel.setText(tlistarray.get(AvailableTripsjList.getAnchorSelectionIndex())[0].getStopType());
                DetailAvailableSeatjLabel.setText(String.valueOf(tlistarray.get(AvailableTripsjList.getAnchorSelectionIndex())[0].getNoOfAvilableSeats()));
                DetailPricejLabel.setText(String.valueOf(CA.PriceCalculation(tlistarray.get(AvailableTripsjList.getAnchorSelectionIndex()))));
                DetailReturnDatejLabel1.setText(tlistarray.get(AvailableTripsjList.getAnchorSelectionIndex())[1].getDate().toString());
                DetailReturnTimejLabel1.setText(tlistarray.get(AvailableTripsjList.getAnchorSelectionIndex())[1].getTime().toString());
            } else {
                DetailFromjLabel.setText(tlist.get(AvailableTripsjList.getAnchorSelectionIndex()).getFrom());
                DetailDestinationjLabel.setText(tlist.get(AvailableTripsjList.getAnchorSelectionIndex()).getTo());
                DetailTravelDatejLabel.setText(tlist.get(AvailableTripsjList.getAnchorSelectionIndex()).getDate().toString());
                DetailTravelTimejLabel.setText(tlist.get(AvailableTripsjList.getAnchorSelectionIndex()).getTime().toString());
                DetailStopsjLabel.setText(tlist.get(AvailableTripsjList.getAnchorSelectionIndex()).getStopType());
                DetailAvailableSeatjLabel.setText(String.valueOf(tlist.get(AvailableTripsjList.getAnchorSelectionIndex()).getNoOfAvilableSeats()));
                DetailPricejLabel.setText(String.valueOf(CA.PriceCalculation(tlist.get(AvailableTripsjList.getAnchorSelectionIndex()))));
            }
        }


    }//GEN-LAST:event_NextjButtonActionPerformed

    private void LogOutjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutjLabelMouseClicked
        NewTripjPanel.setBackground(new Color(0, 0, 51));
        ShowTripjPanel.setBackground(new Color(0, 0, 51));
        EditTripjPanel.setBackground(new Color(0, 0, 51));
        DeletejPanel.setBackground(new Color(0, 0, 51));
        LogOutjPanel.setBackground(new Color(0, 51, 102));

        EmployeePanel.setVisible(true);
        EmployeePanelAfterLogin.setVisible(false);
        NameField.setText("");
        PasswordField.setText("");
    }//GEN-LAST:event_LogOutjLabelMouseClicked

    private void LogOutjPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutjPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutjPanelMouseClicked

    private void BackjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackjButtonActionPerformed
        CustomerPanel.setVisible(false);
        CustomerTripDetailsPanel.setVisible(false);
        ThankYouPanel.setVisible(false);
        CustomerAvailableTripsPanel.setVisible(true);
    }//GEN-LAST:event_BackjButtonActionPerformed

    private void TripDetailsjLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TripDetailsjLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TripDetailsjLabel1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (Integer.parseInt(DetailAvailableSeatjLabel.getText()) != 0) {
            c++;
            DetailAvailableSeatjLabel.setText(String.valueOf(Integer.parseInt(DetailAvailableSeatjLabel.getText()) - 1));
            jLabel8.setText("No. of Tickets bought = " + c);
            jButton1.setBackground(new Color(0, 102, 0));

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletejButtonActionPerformed


         EA.DeleteTrip(tlist.get(DeleteTripsjList.getAnchorSelectionIndex()).getTripno());
         
                  DefaultListModel model = new DefaultListModel();
            JList list = new JList(model);
            model.removeAllElements();

     
                ArrayList<Ticket> Temp = EA.ShowAllTrips();

                for (int i = 0; i < Temp.size(); i++) {
                    model.addElement(EA.TripShowAllText(Temp.get(i)));
                }
                tlist = new ArrayList<>();
                tlist = Temp ;
            
           DeleteTripsjList.setModel(model);



    }//GEN-LAST:event_DeletejButtonActionPerformed

    private void NewExternalDestinationjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewExternalDestinationjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewExternalDestinationjComboBoxActionPerformed

    private void NewjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewjComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewjComboBox1ActionPerformed

    private void SaveNewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveNewjButtonActionPerformed

        String s_type;
        if (NonStopjRadioButton.isSelected()) {
            s_type = "NonStop";
        } else if (OneStopjRadioButton.isSelected()) {
            s_type = "OneStop";
        } else {
            s_type = "ManyStop";
        }

        String vehicle;
        if (BusjRadioButton.isSelected()) {
            vehicle = "Bus";
        } else if (LamosinejRadioButton.isSelected()) {
            vehicle = "Limousine";
        } else {
            vehicle = "MiniBus";
        }

        errorjLabel.setForeground(new Color(102, 0, 0));

        if (HoursjTextField.getText().equals("") || MinutesjTextField.getText().equals("") || PricejTextField.getText().equals("")) {
            errorjLabel.setText("unspecified fields");

        } else if (NewFromjComboBox.getSelectedItem().toString().equals(NewInternalDestinationjComboBox.getSelectedItem().toString())) {
            errorjLabel.setText("choose correct destination");
        } else if (!(Integer.parseInt(HoursjTextField.getText()) < 24 && Integer.parseInt(HoursjTextField.getText()) > 0) || !(Integer.parseInt(MinutesjTextField.getText()) < 60 && Integer.parseInt(MinutesjTextField.getText()) > 0)) {

            errorjLabel.setText("insert correct Time");
        } else {
            if (NewExternaljRadioButton.isSelected()) {
                EA.NewTrip(NewFromjComboBox.getSelectedItem().toString(), NewExternalDestinationjComboBox.getSelectedItem().toString(), CA.SetDate(Integer.parseInt(NewjComboBox1.getSelectedItem().toString()), Integer.parseInt(NewjComboBox2.getSelectedItem().toString()), Integer.parseInt(NewjComboBox3.getSelectedItem().toString())), CA.SetTime(Integer.parseInt(HoursjTextField.getText()), Integer.parseInt(MinutesjTextField.getText())), CA.SetVehicle(vehicle), s_type, DriverjTextField.getText(), Double.parseDouble(PricejTextField.getText()));
            } else {
                EA.NewTrip(NewFromjComboBox.getSelectedItem().toString(), NewInternalDestinationjComboBox.getSelectedItem().toString(), CA.SetDate(Integer.parseInt(NewjComboBox1.getSelectedItem().toString()), Integer.parseInt(NewjComboBox2.getSelectedItem().toString()), Integer.parseInt(NewjComboBox3.getSelectedItem().toString())), CA.SetTime(Integer.parseInt(HoursjTextField.getText()), Integer.parseInt(MinutesjTextField.getText())), CA.SetVehicle(vehicle), s_type, DriverjTextField.getText(), Double.parseDouble(PricejTextField.getText()));
            }
            errorjLabel.setForeground(new Color(0, 102, 0));
            errorjLabel.setText("Saved Sucessfully");

        }

    }//GEN-LAST:event_SaveNewjButtonActionPerformed

    private void LamosinejRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamosinejRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LamosinejRadioButtonActionPerformed

    private void NewjComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewjComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewjComboBox2ActionPerformed

    private void HoursjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoursjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoursjTextFieldActionPerformed

    private void DestinationjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationjComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinationjComboBox1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void EditjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditjButtonActionPerformed
        
       if (HoursjTextField1.getText().equals("") || MinutesjTextField1.getText().equals("") || EditPricejTextField.getText().equals("")) {
            errorecjLabel.setText("Information Messing");

        } else if (!(Integer.parseInt(HoursjTextField1.getText()) < 24 && Integer.parseInt(HoursjTextField1.getText()) > 0) || !(Integer.parseInt(MinutesjTextField1.getText()) < 60 && Integer.parseInt(MinutesjTextField1.getText()) > 0)) {
            errorecjLabel.setText("insert correct Time");
        } 
       
        else 
        {
            EA.EditTripPrice(Double.parseDouble(EditPricejTextField.getText()), tlist.get(EditTripsjList.getAnchorSelectionIndex()).getTripno());
            EA.EditTripTime(CA.SetTime((Integer.parseInt(HoursjTextField1.getText())), Integer.parseInt(MinutesjTextField1.getText())), tlist.get(EditTripsjList.getAnchorSelectionIndex()).getTripno());
        }


    }//GEN-LAST:event_EditjButtonActionPerformed

    private void SelectjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectjButtonActionPerformed
      
        if (! EditTripsjList.isSelectionEmpty())
        {
        jLabel6.setVisible(true);
        jLabel4.setVisible(true);
        EditPricejTextField.setVisible(true);
        HoursjTextField1.setVisible(true);
        MinutesjTextField1.setVisible(true);
        EditjButton.setVisible(true);
        
         EditPricejTextField.setText(String.valueOf(tlist.get(EditTripsjList.getAnchorSelectionIndex()).getPrice()));
         
         String time = tlist.get(EditTripsjList.getAnchorSelectionIndex()).getTime().toString();
         String [] timelist = time.split(":");
         HoursjTextField1.setText(timelist[0]);
         MinutesjTextField1.setText(timelist[1]);
         
         SelectjButton.setVisible(false);
         
         EditTripsjList.enable(false);
        }
        
        
    }//GEN-LAST:event_SelectjButtonActionPerformed

    public static void main(String args[]) {

        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new BusStation().setVisible(true);
                }
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailableSeatsCustomerjLabel;
    private javax.swing.JList<String> AvailableTripsjList;
    private javax.swing.JButton BackjButton;
    private javax.swing.JPanel BorderPanel;
    private javax.swing.JRadioButton BusjRadioButton;
    private javax.swing.JLabel CloseButton;
    private javax.swing.JPanel CustomerAvailableTripsBluejPanel;
    private javax.swing.JPanel CustomerAvailableTripsBluejPanel1;
    private javax.swing.JPanel CustomerAvailableTripsBluejPanel2;
    private javax.swing.JPanel CustomerAvailableTripsPanel;
    private javax.swing.JLabel CustomerAvailableTripsjLabel;
    private javax.swing.JPanel CustomerBluejPanel;
    private javax.swing.JLayeredPane CustomerPane;
    private javax.swing.JPanel CustomerPanel;
    private javax.swing.JPanel CustomerTripDetailsPanel;
    private javax.swing.JPanel CustomerjPanel;
    private javax.swing.JList<String> DeleteTripsjList;
    private javax.swing.JButton DeletejButton;
    private javax.swing.JLabel DeletejLabel;
    private javax.swing.JPanel DeletejPanel;
    private javax.swing.JPanel DeletejPanelBox;
    private javax.swing.JLabel DestinationCustomerjLabel;
    private javax.swing.JComboBox<String> DestinationjComboBox;
    private javax.swing.JComboBox<String> DestinationjComboBox1;
    private javax.swing.JLabel DestinationjLabel;
    private javax.swing.JLabel DetailAvailableSeatjLabel;
    private javax.swing.JLabel DetailCustomerjLabel;
    private javax.swing.JLabel DetailDestinationjLabel;
    private javax.swing.JLabel DetailFromjLabel;
    private javax.swing.JLabel DetailPricej;
    private javax.swing.JLabel DetailPricejLabel;
    private javax.swing.JLabel DetailReturnDatejLabel1;
    private javax.swing.JLabel DetailReturnTimejLabel1;
    private javax.swing.JLabel DetailStopsjLabel;
    private javax.swing.JLabel DetailTravelDatejLabel;
    private javax.swing.JLabel DetailTravelTimejLabel;
    private javax.swing.JTextField DriverjTextField;
    private javax.swing.JTextField EditPricejTextField;
    private javax.swing.JLabel EditTripjLabel;
    private javax.swing.JPanel EditTripjPanel;
    private javax.swing.JPanel EditTripjPanelBox;
    private javax.swing.JList<String> EditTripsjList;
    private javax.swing.JButton EditjButton;
    private javax.swing.JPanel EmployeeBluejPanel;
    private javax.swing.JPanel EmployeeBluejPanel1;
    private javax.swing.JLayeredPane EmployeePane;
    private javax.swing.JLayeredPane EmployeePaneAfterLogin;
    private javax.swing.JPanel EmployeePanel;
    private javax.swing.JPanel EmployeePanelAfterLogin;
    private javax.swing.JPanel EmployeejPanel;
    private javax.swing.JLabel EployeeSignInjLabel1;
    private javax.swing.JLabel ErrorName;
    private javax.swing.JLabel ErrorPassword;
    private javax.swing.JRadioButton ExternaljRadioButton;
    private javax.swing.JComboBox<String> FromjComboBox;
    private javax.swing.JLabel FromjLabel;
    private javax.swing.JPanel HomeBluejPanel;
    private javax.swing.JLayeredPane HomePane;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel HomejPanel;
    private javax.swing.JTextField HoursjTextField;
    private javax.swing.JTextField HoursjTextField1;
    private javax.swing.JRadioButton InternaljRadioButton;
    private javax.swing.JRadioButton LamosinejRadioButton;
    private javax.swing.JLabel LogOutjLabel;
    private javax.swing.JPanel LogOutjPanel;
    private javax.swing.JRadioButton ManyStopjRadioButton;
    private javax.swing.JRadioButton MinibusjRadioButton;
    private javax.swing.JLabel MinimizeButton;
    private javax.swing.JTextField MinutesjTextField;
    private javax.swing.JTextField MinutesjTextField1;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLable_EmployeePanel;
    private javax.swing.JLabel NewDestinationjLabel;
    private javax.swing.JLabel NewDriverjLabel;
    private javax.swing.JComboBox<String> NewExternalDestinationjComboBox;
    private javax.swing.JRadioButton NewExternaljRadioButton;
    private javax.swing.JComboBox<String> NewFromjComboBox;
    private javax.swing.JLabel NewFromjLabel;
    private javax.swing.JComboBox<String> NewInternalDestinationjComboBox;
    private javax.swing.JRadioButton NewInternaljRadioButton;
    private javax.swing.JLabel NewPricejLabel;
    private javax.swing.JLabel NewReturnTimejLabel;
    private javax.swing.JLabel NewStopjLabel;
    private javax.swing.JLabel NewTraveljLabel;
    private javax.swing.JLabel NewTripjLabel;
    private javax.swing.JPanel NewTripjPanel;
    private javax.swing.JLabel NewVehiclejLabel;
    private javax.swing.JComboBox<String> NewjComboBox1;
    private javax.swing.JComboBox<String> NewjComboBox2;
    private javax.swing.JComboBox<String> NewjComboBox3;
    private javax.swing.JPanel NewjPanelBox;
    private javax.swing.JButton NextjButton;
    private javax.swing.JRadioButton NonStopjRadioButton;
    private javax.swing.JRadioButton OneStopjRadioButton;
    private javax.swing.JLabel OneWayjLabel;
    private javax.swing.JPanel OneWayjPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLable_EmployeePanel;
    private javax.swing.JTextField PricejTextField;
    private javax.swing.JLabel ReturnDateCustomerjLabel1;
    private javax.swing.JLabel ReturnTimeCustomerjLabel1;
    private javax.swing.JLabel ReturnjLabel;
    private javax.swing.JLabel RoundWayjLabel;
    private javax.swing.JPanel RoundWayjPanel;
    private javax.swing.JButton SaveNewjButton;
    private javax.swing.JButton SearchjButton;
    private javax.swing.JButton SelectjButton;
    private javax.swing.JLabel ShowTripjLabel;
    private javax.swing.JPanel ShowTripjPanel;
    private javax.swing.JPanel ShowTripjPanelBox;
    private javax.swing.JPanel SidePane;
    private javax.swing.JLabel SignInLabel_EmployeePane;
    private javax.swing.JLabel SopsCustomerjLabel;
    private javax.swing.JLabel SubCustomerjLabel;
    private javax.swing.JLabel SubEmployeejLabel;
    private javax.swing.JLabel SubHomejLabel;
    private javax.swing.JPanel ThankYouPanel;
    private javax.swing.JLabel TravelDateCustomerjLabel;
    private javax.swing.JLabel TravelTimeCustomerjLabel;
    private javax.swing.JLabel TraveljLabel;
    private javax.swing.JLabel TripDetailsjLabel;
    private javax.swing.JLabel TripDetailsjLabel1;
    private javax.swing.JLabel WlecomejLabel;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel erroracjLabel;
    private javax.swing.JLabel errorcjLabel;
    private javax.swing.JLabel errorecjLabel;
    private javax.swing.JLabel errorjLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JList<String> showTripsjList;
    // End of variables declaration//GEN-END:variables
}
