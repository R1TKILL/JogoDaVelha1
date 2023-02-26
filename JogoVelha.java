package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JogoVelha {

	private JFrame frame;
	private final JButton[] position = new JButton[9];
	private JLabel lblJogador1;
	private JLabel lblVitorias1;
	private JLabel lblDerrotas1;
	private JLabel lblJogador2;
	private JLabel lblVitorias2;
	private JLabel lblDerrotas2;

	private boolean xo = false;
	private boolean[] clicks = new boolean[9];
	private int vitoriaX;
	private int derrotaX;
	int vitoriaO;
	int derrotaO;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoVelha window = new JogoVelha();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JogoVelha() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlHighlight);
		frame.setBounds(100, 100, 737, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		for(int i = 0; i < 9; i++) {
			clicks[i] = false;
		}
		
		position[0] = new JButton("");
		position[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(clicks[0] == false) {
					clicks[0] = true;
					simbolo(position[0]);
				}
			}
		});
		position[0].setBackground(SystemColor.controlHighlight);
		position[0].setFont(new Font("Purisa", Font.BOLD, 40));
		position[0].setBounds(41, 38, 97, 92);
		frame.getContentPane().add(position[0]);
		position[0].setBorder(null);
		
		position[1] = new JButton("");
		position[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(clicks[1] == false) {
					clicks[1] = true;
					simbolo(position[1]);
				}
			}
		});
		position[1].setBackground(SystemColor.controlHighlight);
		position[1].setFont(new Font("Purisa", Font.BOLD, 40));
		position[1].setBounds(160, 38, 97, 92);
		frame.getContentPane().add(position[1]);
		position[1].setBorder(null);
	
		position[2] = new JButton("");
		position[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(clicks[2] == false) {
					clicks[2] = true;
					simbolo(position[2]);
				}
			}
		});
		position[2].setBackground(SystemColor.controlHighlight);
		position[2].setFont(new Font("Purisa", Font.BOLD, 40));
		position[2].setBounds(279, 38, 97, 92);
		frame.getContentPane().add(position[2]);
		position[2].setBorder(null);
		
		position[3] = new JButton("");
		position[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(clicks[3] == false) {
					clicks[3] = true;
					simbolo(position[3]);
				}
			}
		});
		position[3].setBackground(SystemColor.controlHighlight);
		position[3].setFont(new Font("Purisa", Font.BOLD, 40));
		position[3].setBounds(41, 154, 97, 92);
		frame.getContentPane().add(position[3]);
		position[3].setBorder(null);
		
		position[4] = new JButton("");
		position[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(clicks[4] == false) {
					clicks[4] = true;
					simbolo(position[4]);
				}
			}
		});
		position[4].setBackground(SystemColor.controlHighlight);
		position[4].setFont(new Font("Purisa", Font.BOLD, 40));
		position[4].setBounds(160, 154, 97, 92);
		frame.getContentPane().add(position[4]);
		position[4].setBorder(null);
		
		position[5] = new JButton("");
		position[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(clicks[5] == false) {
					clicks[5] = true;
					simbolo(position[5]);
				}
			}
		});
		position[5].setBackground(SystemColor.controlHighlight);
		position[5].setFont(new Font("Purisa", Font.BOLD, 40));
		position[5].setBounds(279, 154, 97, 92);
		frame.getContentPane().add(position[5]);
		position[5].setBorder(null);
		
		position[6] = new JButton("");
		position[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(clicks[6] == false) {
					clicks[6] = true;
					simbolo(position[6]);
				}
			}
		});
		position[6].setBackground(SystemColor.controlHighlight);
		position[6].setFont(new Font("Purisa", Font.BOLD, 40));
		position[6].setBounds(41, 267, 97, 92);
		frame.getContentPane().add(position[6]);
		position[6].setBorder(null);
		
		position[7] = new JButton("");
		position[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(clicks[7] == false) {
					clicks[7] = true;
					simbolo(position[7]);
				}
			}
		});
		position[7].setBackground(SystemColor.controlHighlight);
		position[7].setFont(new Font("Purisa", Font.BOLD, 40));
		position[7].setBounds(160, 267, 97, 92);
		frame.getContentPane().add(position[7]);
		position[7].setBorder(null);
		
		position[8] = new JButton("");
		position[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(clicks[8] == false) {
					clicks[8] = true;
					simbolo(position[8]);
				}
			}
		});
		position[8].setBackground(SystemColor.controlHighlight);
		position[8].setFont(new Font("Purisa", Font.BOLD, 40));
		position[8].setBounds(279, 267, 97, 92);
		frame.getContentPane().add(position[8]);
		position[8].setBorder(null);

		lblJogador1 = new JLabel("Jogador 1");
		lblJogador1.setFont(new Font("Purisa", Font.BOLD, 24));
		lblJogador1.setBounds(504, 32, 163, 28);
		frame.getContentPane().add(lblJogador1);

		lblVitorias1 = new JLabel("Vitorias: " + vitoriaX);
		lblVitorias1.setFont(new Font("Purisa", Font.BOLD, 18));
		lblVitorias1.setBounds(438, 98, 132, 21);
		frame.getContentPane().add(lblVitorias1);
		
		lblDerrotas1 = new JLabel("Derrotas: " + derrotaX);
		lblDerrotas1.setFont(new Font("Purisa", Font.BOLD, 18));
		lblDerrotas1.setBounds(582, 98, 132, 21);
		frame.getContentPane().add(lblDerrotas1);
		
		lblJogador2 = new JLabel("Jogador 2");
		lblJogador2.setFont(new Font("Purisa", Font.BOLD, 24));
		lblJogador2.setBounds(504, 222, 163, 28);
		frame.getContentPane().add(lblJogador2);
		
		lblVitorias2 = new JLabel("Vitorias: " + vitoriaO);
		lblVitorias2.setFont(new Font("Purisa", Font.BOLD, 18));
		lblVitorias2.setBounds(438, 288, 132, 21);
		frame.getContentPane().add(lblVitorias2);
		
		lblDerrotas2 = new JLabel("Derrotas: " + derrotaO);
		lblDerrotas2.setFont(new Font("Purisa", Font.BOLD, 18));
		lblDerrotas2.setBounds(582, 288, 132, 21);
		frame.getContentPane().add(lblDerrotas2);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.BLACK);
		canvas.setBounds(24, 134, 379, 6);
		frame.getContentPane().add(canvas);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.BLACK);
		canvas_1.setBounds(24, 252, 379, 6);
		frame.getContentPane().add(canvas_1);
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(Color.BLACK);
		canvas_2.setBounds(147, 10, 7, 376);
		frame.getContentPane().add(canvas_2);
		
		Canvas canvas_2_1 = new Canvas();
		canvas_2_1.setBackground(Color.BLACK);
		canvas_2_1.setBounds(266, 10, 7, 376);
		frame.getContentPane().add(canvas_2_1);
	}
	
	private void simbolo(JButton btn) {
		if(xo) {
			btn.setText("O");
			xo = false;
		}
		else {
			btn.setText("X");
			xo = true;
		}		
		resultado();
	}
	
	private void resultado()
	{
		int cont = 0;	
		for(int i = 0; i < 9; i++) {
			if(clicks[i] == true) {
				cont++;
			}
		}
		
		if((position[0].getText().equals("X") && position[1].getText().equals("X") && position[2].getText().equals("X")) ||
				(position[3].getText().equals("X") && position[4].getText().equals("X") && position[5].getText().equals("X")) ||
				(position[6].getText().equals("X") && position[7].getText().equals("X") && position[8].getText().equals("X")) ||
				(position[0].getText().equals("X") && position[3].getText().equals("X") && position[6].getText().equals("X")) ||
				(position[1].getText().equals("X") && position[4].getText().equals("X") && position[7].getText().equals("X")) ||
				(position[2].getText().equals("X") && position[5].getText().equals("X") && position[8].getText().equals("X")) ||
				(position[2].getText().equals("X") && position[4].getText().equals("X") && position[6].getText().equals("X")) ||
				(position[0].getText().equals("X") && position[4].getText().equals("X") && position[8].getText().equals("X")))
		{
			JOptionPane.showMessageDialog(null, "Parábens o jogador 1 venceu.");
			vitoriaX++;
			derrotaO++;
			placar();
			clear();
		}		
		else if((position[0].getText().equals("O") && position[1].getText().equals("O") && position[2].getText().equals("O")) ||
				(position[3].getText().equals("O") && position[4].getText().equals("O") && position[5].getText().equals("O")) ||
				(position[6].getText().equals("O") && position[7].getText().equals("O") && position[8].getText().equals("O")) ||
				(position[0].getText().equals("O") && position[3].getText().equals("O") && position[6].getText().equals("O")) ||
				(position[1].getText().equals("O") && position[4].getText().equals("O") && position[7].getText().equals("O")) ||
				(position[2].getText().equals("O") && position[5].getText().equals("O") && position[8].getText().equals("O")) ||
				(position[2].getText().equals("O") && position[4].getText().equals("O") && position[6].getText().equals("O")) ||
				(position[0].getText().equals("O") && position[4].getText().equals("O") && position[8].getText().equals("O")))
		{
			JOptionPane.showMessageDialog(null, "Parábens o jogador 2 venceu.");
			vitoriaO++;
			derrotaX++;	
			placar();
			clear();
		}		
		else if (cont == 9) {
			JOptionPane.showMessageDialog(null, "Empatou.");
			vitoriaX++;
			vitoriaO++;
			placar();
			clear();
		}
	}
	
	private void clear() {
		for(int i = 0; i < 9; i++) {
			position[i].setText("");
			clicks[i] = false;
		}
	}
	
	private void placar() {
		lblVitorias1.setText("Vitorias = " + vitoriaX);	
		lblDerrotas2.setText("Derrotas = " + derrotaX);
		lblVitorias2.setText("Vitorias = " + vitoriaO);
		lblDerrotas2.setText("Derrota = " + derrotaO);
	}

}