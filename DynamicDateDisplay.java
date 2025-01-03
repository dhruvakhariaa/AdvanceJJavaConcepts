import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DynamicDateDisplay {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dynamic Date Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        JLabel currentDateLabel = new JLabel("Current Date: ");
        JLabel dateDisplay = new JLabel(LocalDate.now().toString());
        dateDisplay.setFont(new Font("Arial", Font.BOLD, 16));

        JTextField dateInput = new JTextField(10);
        JButton updateButton = new JButton("Update Date");

        frame.add(currentDateLabel);
        frame.add(dateDisplay);
        frame.add(new JLabel("Enter new date (YYYY-MM-DD):"));
        frame.add(dateInput);
        frame.add(updateButton);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newDate = dateInput.getText();
                try {
                    // Validate the input date format
                    LocalDate parsedDate = LocalDate.parse(newDate, DateTimeFormatter.ISO_LOCAL_DATE);
                    dateDisplay.setText(parsedDate.toString());
                } catch (DateTimeParseException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid date format! Please use YYYY-MM-DD.", 
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}

