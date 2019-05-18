import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SQLException {
        createFrame();
    }

    private static void createFrame() {
        JFrame menu = new JFrame("Анализ комментариев");
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setSize(400, 65);
        menu.setLocation(500, 200);
        menu.setResizable(false);
        final JPanel panel = new JPanel();
        panel.setBackground(new Color(232,255,224));
        JButton getButton = new JButton("Обновить данные");
        getButton.setBackground(new Color(189,234,152));
        JButton createButton = new JButton("Построить граф");
        createButton.setBackground(new Color(189,234,152));


        getButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new YouTubeData().run();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ParserConfigurationException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                } catch (XMLStreamException e1) {
                    e1.printStackTrace();
                }
            }
        });
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new GetData().run();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                } catch (XMLStreamException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(getButton);
        panel.add(createButton);
        menu.add(panel);
        menu.setVisible(true);
    }

}

