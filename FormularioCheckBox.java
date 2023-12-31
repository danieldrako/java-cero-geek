import javax.swing.*;
import javax.swing.event.*;

public class FormularioCheckBox extends JFrame implements ChangeListener {
    
    private JCheckBox check1, check2, check3;

    public FormularioCheckBox(){
        setLayout(null);
        check1 = new JCheckBox("Inglés");
        check1.setBounds(10, 10, 150, 30);
        check1.addChangeListener(this);
        add(check1);
        
        check2 = new JCheckBox("Frances");
        check2.setBounds(10, 50, 150, 30);
        check2.addChangeListener(this);
        add(check2);

        check3 = new JCheckBox("Aleman");
        check3.setBounds(10, 90, 150, 30);
        check3.addChangeListener(this);
        add(check3);
        
    }

    public void stateChanged(ChangeEvent e){
        String cad = "";
        if(check1.isSelected() == true){
            cad = cad + "Inglés-";
        }
        if(check2.isSelected() == true){
            cad = cad + "Frances-";
        }
        if(check3.isSelected() == true){
            cad = cad + "Aleman-";
        }
        setTitle(cad);
    }

    public static void main(String[] args) {
        FormularioCheckBox formulario1 = new FormularioCheckBox();
        formulario1.setBounds(0, 0, 300, 200);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(true);
    }
}
