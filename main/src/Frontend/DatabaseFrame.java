package Frontend;

import javax.swing.*;
import java.awt.*;

public class DatabaseFrame extends JFrame {
    private final PanelTop panelTop;
    private final PanelCenter panelCenter;
    private final PanelDown panelDown;
    private final ClientConnection clientConnection;

    public DatabaseFrame(ClientConnection clientConnection) {
        this.clientConnection=clientConnection;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        panelTop = new PanelTop();
        panelDown = new PanelDown();
        panelCenter = new PanelCenter(panelDown, clientConnection);


        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelDown, BorderLayout.SOUTH);

        this.setVisible(true);

    }

    public PanelTop getPanelTop() {
        return panelTop;
    }

    public PanelCenter getPanelCenter() {
        return panelCenter;
    }

    public PanelDown getPanelDown() {
        return panelDown;
    }
}
