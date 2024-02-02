package proyectoJPanelPlantas;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;

public class Ventana extends JFrame implements ActionListener {
	
	JLabel eti1, eti2, eti3;
	JTextField txtnombre, txtedad;
	JButton boton1;
	JPanel panel; 
	
	Ventana(){
		eti1=new JLabel("Elige opcion que te interesa");
		eti1.setForeground(Color.BLACK);//hola
		eti1.setBounds(105, 11, 200, 20);
		
		
		eti2=new JLabel("Proporciona la cantidad de plantas");
		eti2.setBounds(20, 135, 180, 20);
		
		

		eti3=new JLabel("Cual es la Comunidad ?");
		eti3.setBounds(24, 174, 132, 20);
		
		
		txtnombre = new JTextField();
		txtnombre.setBounds(197, 135, 37, 20);
		
		txtedad = new JTextField();
		txtedad.setBounds(150, 174, 153, 20);
		
		
		boton1 = new JButton("Aceptar");
		boton1.setForeground(Color.RED);
		boton1.setBounds(294,230, 80, 20);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		panel.add(eti1);
		panel.add(eti2);
		panel.add(eti3);
		panel.add(txtnombre);
		panel.add(txtedad);
		panel.add(boton1);
		
		
		setTitle("Encuentra aqui gastos y beneficios ");
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Horticolas");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBounds(20, 42, 68, 14);
		panel.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tomate");
		rdbtnNewRadioButton.setBounds(75, 38, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Pepino");
		rdbtnNewRadioButton_1.setBounds(76, 63, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Calabacin");
		rdbtnNewRadioButton_2.setBounds(76, 89, 109, 23);
		panel.add(rdbtnNewRadioButton_2);
		setSize (400, 300);
		setVisible(true);
		
		
		
		
	}

public static void main (String[]args) {
	Ventana f = new Ventana();
	
	rdbtnNewRadioButton = e;

	
	if (this.rdbtnNewRadioButton == true && txtnombre ==uno && txtedad==1) {
     	
     	System.out.println("Beneficio = 10 euros.");
     }
	
}

@Override
public void actionPerformed(ActionEvent e) {

}

       

}



