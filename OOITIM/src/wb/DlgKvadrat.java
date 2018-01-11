package wb;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgKvadrat extends JDialog{
	
	private JTextField txtStranica;
	private DefaultComboBoxModel cmbModelIvica = new DefaultComboBoxModel();
	private DefaultComboBoxModel cmbModelUnutrasnjost = new DefaultComboBoxModel();
	
	public DlgKvadrat(Frame vlasnik, String naslov, boolean modal) {
		super(vlasnik, naslov, modal);
		setSize(400,300);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblDimenzijaStranice = new JLabel("Dimenzija stranice");
		GridBagConstraints gbc_lblDimenzijaStranice = new GridBagConstraints();
		gbc_lblDimenzijaStranice.insets = new Insets(0, 0, 5, 5);
		gbc_lblDimenzijaStranice.anchor = GridBagConstraints.EAST;
		gbc_lblDimenzijaStranice.gridx = 0;
		gbc_lblDimenzijaStranice.gridy = 0;
		panel.add(lblDimenzijaStranice, gbc_lblDimenzijaStranice);
		
		txtStranica = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(txtStranica, gbc_textField);
		txtStranica.setColumns(10);
		
		JLabel lblBojaIvice = new JLabel("Boja ivice");
		GridBagConstraints gbc_lblBojaIvice = new GridBagConstraints();
		gbc_lblBojaIvice.anchor = GridBagConstraints.EAST;
		gbc_lblBojaIvice.insets = new Insets(0, 0, 5, 5);
		gbc_lblBojaIvice.gridx = 0;
		gbc_lblBojaIvice.gridy = 1;
		panel.add(lblBojaIvice, gbc_lblBojaIvice);
		
		JComboBox cmbIvica = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		panel.add(cmbIvica, gbc_comboBox);
		
		JLabel lblBojaUnutrasnjosti = new JLabel("Boja unutrasnjosti");
		GridBagConstraints gbc_lblBojaUnutrasnjosti = new GridBagConstraints();
		gbc_lblBojaUnutrasnjosti.anchor = GridBagConstraints.EAST;
		gbc_lblBojaUnutrasnjosti.insets = new Insets(0, 0, 5, 5);
		gbc_lblBojaUnutrasnjosti.gridx = 0;
		gbc_lblBojaUnutrasnjosti.gridy = 2;
		panel.add(lblBojaUnutrasnjosti, gbc_lblBojaUnutrasnjosti);
		
		JComboBox cmbUnutrasnjost = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 2;
		panel.add(cmbUnutrasnjost, gbc_comboBox_1);
		
		JButton btnC = new JButton("Cancel");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.insets = new Insets(0, 0, 0, 5);
		gbc_btnC.gridx = 0;
		gbc_btnC.gridy = 4;
		panel.add(btnC, gbc_btnC);
		
		cmbModelIvica.addElement("Crvena");
		cmbModelIvica.addElement("Plava");
		cmbModelUnutrasnjost.addElement("Zelena");
		cmbModelUnutrasnjost.addElement("Zuta");
		
		cmbIvica.setModel(cmbModelIvica);
		cmbUnutrasnjost.setModel(cmbModelUnutrasnjost);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
			}
		});
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.gridx = 1;
		gbc_btnOk.gridy = 4;
		panel.add(btnOk, gbc_btnOk);
	}

}
