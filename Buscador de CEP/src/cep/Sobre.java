package cep;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Desktop;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Buscador de CEP- Ver 1.0");
		lblNewLabel.setBounds(46, 47, 159, 28);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("@Author : Leonardo Medeiros");
		lblNewLabel_1.setBounds(46, 86, 208, 28);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("WEB Service :");
		lblNewLabel_2.setBounds(46, 125, 108, 28);
		getContentPane().add(lblNewLabel_2);

		JLabel lblWebService = new JLabel("republicavirtual.com.br");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/cep/");
			}
		});
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setForeground(SystemColor.textHighlight);
		lblWebService.setBounds(133, 125, 138, 28);
		getContentPane().add(lblWebService);

		JButton btnGitHub = new JButton("");
		btnGitHub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/LeonardoMedeiross");
			}
		});
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setBorder(null);
		btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/img/git48.png")));
		btnGitHub.setBackground(SystemColor.control);
		btnGitHub.setToolTipText("Github");
		btnGitHub.setBounds(46, 179, 48, 48);
		getContentPane().add(btnGitHub);

	}// final do construtor

	// esse é o método responsavel por fazer um link ir pro site
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
