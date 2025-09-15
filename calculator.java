import java.awt.*;  
import java.awt.event.*;  
class calculator extends WindowAdapter implements ActionListener { 
    Frame f; 
    Label l1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    Button badd, bsub, bmult, bdiv, bmod, bcalc, bclr, bpts, bneg, bback;
    double num1, num2, result;
    int operation = 0; 
    calculator() {  
        f = new Frame("MY CALCULATOR");
        // Create Label
        l1 = new Label(); 
        l1.setBackground(Color.RED);
        l1.setBounds(20, 40, 300, 70);
        // Create Buttons
        b1 = new Button("1"); b2 = new Button("2"); b3 = new Button("3");
        b4 = new Button("4"); b5 = new Button("5"); b6 = new Button("6");
        b7 = new Button("7"); b8 = new Button("8"); b9 = new Button("9");
        b0 = new Button("0"); bpts = new Button("."); bneg = new Button("+/-");
        bback = new Button("←"); bclr = new Button("C");
        badd = new Button("+"); bsub = new Button("-");
        bmult = new Button("*"); bdiv = new Button("/"); bmod = new Button("%");
        bcalc = new Button("=");
        // Set Button Bounds
        int x = 20, y = 100, w = 50, h = 50;
        Button[] numButtons = {b7, b8, b9, b4, b5, b6, b1, b2, b3, b0};
        for (int i = 0; i < numButtons.length; i++) {
            numButtons[i].setBounds(x + (i % 3) * 60, y + (i / 3) * 60, w, h);
            f.add(numButtons[i]);}
        bpts.setBounds(140, y + 180, w, h);
        bneg.setBounds(20, y + 180, w, h);
        bback.setBounds(200, y - 60, w, h);
        bclr.setBounds(20, y - 60, w, h);
        badd.setBounds(200, y, w, h);
        bsub.setBounds(200, y + 60, w, h);
        bmult.setBounds(200, y + 120, w, h);
        bdiv.setBounds(200, y + 180, w, h);
        bmod.setBounds(140, y - 60, w, h);
        bcalc.setBounds(80, y + 240, 130, h);
        // Add Action Listeners
        Button[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bpts, bneg, bback, bclr, badd, bsub, bmult, bdiv, bmod, bcalc};
        for (Button btn : buttons) btn.addActionListener(this);
        // Add components to Frame
        f.add(l1);
        for (Button btn : buttons) f.add(btn);
        f.addWindowListener(this);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void windowClosing(WindowEvent e) {
        f.dispose();}
    public void actionPerformed(ActionEvent e) { 
        String command = e.getActionCommand();
        try {
            // Number buttons
            if (command.matches("\\d")) l1.setText(l1.getText() + command);
            // Decimal point
            if (command.equals(".")) l1.setText(l1.getText().contains(".") ? l1.getText() : l1.getText() + ".");// Negate
            if (command.equals("+/-")) l1.setText(l1.getText().startsWith("-") ? l1.getText().substring(1) : "-" + l1.getText());// Backspace
            if (command.equals("←")) {
                String text = l1.getText();
                l1.setText(text.isEmpty() ? "" : text.substring(0, text.length() - 1));
            }// Clear
            if (command.equals("C")) {
                num1 = num2 = result = 0;
                operation = 0;
                l1.setText("");
            }  // Operations
            if ("+-*/%".contains(command)) {
                num1 = Double.parseDouble(l1.getText());
                operation = "+-*/%".indexOf(command) + 1;
                l1.setText("");
            } // Calculate
            if (command.equals("=")) {
                num2 = Double.parseDouble(l1.getText());
                switch (operation) {
                    case 1: result = num1 + num2; break;
                    case 2: result = num1 - num2; break;
                    case 3: result = num1 * num2; break;
                    case 4: result = num1 / num2; break;
                    case 5: result = num1 % num2; break;
                    default: result = 0;    }
                l1.setText(String.valueOf(result));
            }   } catch (Exception ex) {
            l1.setText("Error"); }
    public static void main(String[] args) {
        new calculator();}}