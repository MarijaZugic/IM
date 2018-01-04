package wb;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VezbaWB extends JFrame{
	private ButtonGroup btng = new ButtonGroup();
	private DefaultListModel dlm = new DefaultListModel();
	private JTextField txtIme;
	private JTextField txtPrezime;
	private JTextField txtJMBG;
	
	public VezbaWB() {
		getContentPane().setSize(new Dimension(600, 400));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblPetar = new JLabel("Petar");
		lblPetar.setBounds(161, 25, 46, 14);
		panel.add(lblPetar);
		lblPetar.setVisible(false);
		
		JLabel lblPetrovic = new JLabel("Petrovic");
		lblPetrovic.setBounds(161, 59, 46, 14);
		panel.add(lblPetrovic);
		lblPetrovic.setVisible(false);
		
		JLabel lblNjegos = new JLabel("Njegos");
		lblNjegos.setBounds(161, 92, 46, 14);
		panel.add(lblNjegos);
		lblNjegos.setVisible(false);
		
		JToggleButton tBtnPrvo = new JToggleButton("1");
		tBtnPrvo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblPetar.setVisible(true);
				lblPetrovic.setVisible(false);
				lblNjegos.setVisible(false);
				
				dlm.addElement("Petar");
			}
		});
		tBtnPrvo.setBounds(10, 21, 121, 23);
		panel.add(tBtnPrvo);
		
		JToggleButton tBtnDrugo = new JToggleButton("2");
		tBtnDrugo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPetar.setVisible(false);
				lblPetrovic.setVisible(true);
				lblNjegos.setVisible(false);
				
				dlm.addElement("Petrovic");
			}
		});
		tBtnDrugo.setBounds(10, 55, 121, 23);
		panel.add(tBtnDrugo);
		
		JToggleButton tBtnTrece = new JToggleButton("3");
		tBtnTrece.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPetar.setVisible(false);
				lblPetrovic.setVisible(false);
				lblNjegos.setVisible(true);
				
				dlm.addElement("Njegos");
			}
		});
		tBtnTrece.setBounds(10, 88, 121, 23);
		panel.add(tBtnTrece);
		
		btng.add(tBtnPrvo);
		btng.add(tBtnDrugo);
		btng.add(tBtnTrece);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(245, 25, 162, 91);
		panel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(dlm);
		
		JLabel lblIme = new JLabel("Ime:");
		lblIme.setBounds(10, 143, 46, 14);
		panel.add(lblIme);
		
		JLabel lblPrezime = new JLabel("Prezime:");
		lblPrezime.setBounds(10, 168, 46, 14);
		panel.add(lblPrezime);
		
		JLabel lblJmbg = new JLabel("JMBG:");
		lblJmbg.setBounds(10, 193, 46, 14);
		panel.add(lblJmbg);
		
		txtIme = new JTextField();
		txtIme.setBounds(64, 140, 86, 20);
		panel.add(txtIme);
		txtIme.setColumns(10);
		
		txtPrezime = new JTextField();
		txtPrezime.setBounds(66, 165, 86, 20);
		panel.add(txtPrezime);
		txtPrezime.setColumns(10);
		
		txtJMBG = new JTextField();
		txtJMBG.setBounds(64, 190, 86, 20);
		panel.add(txtJMBG);
		txtJMBG.setColumns(10);
		
		JButton btnLicniPodaci = new JButton("Licni podaci");
		btnLicniPodaci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtIme.getText().length() == 0) {
					JOptionPane.showMessageDialog(panel, "Morate uneti ime", "Upozorenje", JOptionPane.WARNING_MESSAGE);
				} else if (txtPrezime.getText().length() == 0) {
					JOptionPane.showMessageDialog(panel, "Morate uneti prezime", "Upozorenje", JOptionPane.WARNING_MESSAGE);
				} else if (txtJMBG.getText().length() != 13) {
					JOptionPane.showMessageDialog(panel, "Morate uneti 13 brojeva", "Upozorenje", JOptionPane.WARNING_MESSAGE);
				} else {
					try {
						Double d = Double.parseDouble(txtJMBG.getText());
						
						String dan = txtJMBG.getText().substring(0, 2);
						String mesec = txtJMBG.getText().substring(2, 4);
						String godina = txtJMBG.getText().substring(4, 7);
						
						if (txtJMBG.getText().substring(4, 5).equals("0") 
							|| txtJMBG.getText().substring(4, 5).equals("1")) {
							
							godina = "2" + godina;
						} else {
							godina = "1" + godina;
						}
						
						String ispis = "Ime: " + txtIme.getText() 
										+ "\nPrezime: " + txtPrezime.getText()
										+ "\nDatum rodjenja: " + dan + "." 
										+ mesec + "." + godina + ".";
						
						JOptionPane.showMessageDialog(panel, ispis, "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
					} catch (NumberFormatException e2) {
						JOptionPane.showMessageDialog(panel, "JMBG sadrzi samo brojeve", "Obavestenje", JOptionPane.WARNING_MESSAGE);
					}
					
					
				}

			}
		});
		btnLicniPodaci.setBounds(280, 139, 89, 23);
		panel.add(btnLicniPodaci);
		
		
	}
}
