

import java.awt.Dimension;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class GameWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow frame = new GameWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 807);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{40, 50, 60, 40, 40, 40, 40, 40, 40, 40, 40, 0, 60, 50, 60, 0};
		gbl_contentPane.rowHeights = new int[]{40, 55, 40, 40, 40, 40, 40, 40, 40, 40, 40, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		Map<String, JButton> bmap=new HashMap<String, JButton>();
		
		Dice d = new Dice();
		Game g1 = new Game();		
		
		
		JButton button_1 = new JButton("1");
		button_1.setPreferredSize(new Dimension(50,50));
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button_100 = new JButton("100");
		button_100.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_100 = new GridBagConstraints();
		gbc_button_100.insets = new Insets(0, 0, 5, 5);
		gbc_button_100.gridx = 1;
		gbc_button_100.gridy = 1;
		contentPane.add(button_100, gbc_button_100);
		
		JButton button_99 = new JButton("99");
		button_99.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_99 = new GridBagConstraints();
		gbc_button_99.insets = new Insets(0, 0, 5, 5);
		gbc_button_99.gridx = 2;
		gbc_button_99.gridy = 1;
		contentPane.add(button_99, gbc_button_99);
		
		JButton button_98 = new JButton("98");
		button_98.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_98 = new GridBagConstraints();
		gbc_button_98.insets = new Insets(0, 0, 5, 5);
		gbc_button_98.gridx = 3;
		gbc_button_98.gridy = 1;
		contentPane.add(button_98, gbc_button_98);
		
		JButton button_97 = new JButton("97");
		button_97.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_97 = new GridBagConstraints();
		gbc_button_97.insets = new Insets(0, 0, 5, 5);
		gbc_button_97.gridx = 4;
		gbc_button_97.gridy = 1;
		contentPane.add(button_97, gbc_button_97);
		
		JButton button_96 = new JButton("96");
		button_96.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_96 = new GridBagConstraints();
		gbc_button_96.insets = new Insets(0, 0, 5, 5);
		gbc_button_96.gridx = 5;
		gbc_button_96.gridy = 1;
		contentPane.add(button_96, gbc_button_96);
		
		JButton button_95 = new JButton("95");
		button_95.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_95 = new GridBagConstraints();
		gbc_button_95.insets = new Insets(0, 0, 5, 5);
		gbc_button_95.gridx = 6;
		gbc_button_95.gridy = 1;
		contentPane.add(button_95, gbc_button_95);
		
		JButton button_94 = new JButton("94");
		button_94.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_94 = new GridBagConstraints();
		gbc_button_94.insets = new Insets(0, 0, 5, 5);
		gbc_button_94.gridx = 7;
		gbc_button_94.gridy = 1;
		contentPane.add(button_94, gbc_button_94);
		
		JButton button_93 = new JButton("93");
		button_93.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_93 = new GridBagConstraints();
		gbc_button_93.insets = new Insets(0, 0, 5, 5);
		gbc_button_93.gridx = 8;
		gbc_button_93.gridy = 1;
		contentPane.add(button_93, gbc_button_93);
		
		JButton button_92 = new JButton("92");
		button_92.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_92 = new GridBagConstraints();
		gbc_button_92.insets = new Insets(0, 0, 5, 5);
		gbc_button_92.gridx = 9;
		gbc_button_92.gridy = 1;
		contentPane.add(button_92, gbc_button_92);
		
		JButton button_91 = new JButton("91");
		button_91.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_91 = new GridBagConstraints();
		gbc_button_91.insets = new Insets(0, 0, 5, 5);
		gbc_button_91.gridx = 10;
		gbc_button_91.gridy = 1;
		contentPane.add(button_91, gbc_button_91);
		
		JButton button_81 = new JButton("81");
		button_81.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_81 = new GridBagConstraints();
		gbc_button_81.insets = new Insets(0, 0, 5, 5);
		gbc_button_81.gridx = 1;
		gbc_button_81.gridy = 2;
		contentPane.add(button_81, gbc_button_81);
		
		JButton button_82 = new JButton("82");
		button_82.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_82 = new GridBagConstraints();
		gbc_button_82.insets = new Insets(0, 0, 5, 5);
		gbc_button_82.gridx = 2;
		gbc_button_82.gridy = 2;
		contentPane.add(button_82, gbc_button_82);
		
		JButton button_83 = new JButton("83");
		button_83.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_83 = new GridBagConstraints();
		gbc_button_83.insets = new Insets(0, 0, 5, 5);
		gbc_button_83.gridx = 3;
		gbc_button_83.gridy = 2;
		contentPane.add(button_83, gbc_button_83);
		
		JButton button_84 = new JButton("84");
		button_84.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_84 = new GridBagConstraints();
		gbc_button_84.insets = new Insets(0, 0, 5, 5);
		gbc_button_84.gridx = 4;
		gbc_button_84.gridy = 2;
		contentPane.add(button_84, gbc_button_84);
		
		JButton button_85 = new JButton("85");
		button_85.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_85 = new GridBagConstraints();
		gbc_button_85.insets = new Insets(0, 0, 5, 5);
		gbc_button_85.gridx = 5;
		gbc_button_85.gridy = 2;
		contentPane.add(button_85, gbc_button_85);
		
		JButton button_86 = new JButton("86");
		button_86.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_86 = new GridBagConstraints();
		gbc_button_86.insets = new Insets(0, 0, 5, 5);
		gbc_button_86.gridx = 6;
		gbc_button_86.gridy = 2;
		contentPane.add(button_86, gbc_button_86);
		
		JButton button_87 = new JButton("87");
		button_87.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_87 = new GridBagConstraints();
		gbc_button_87.insets = new Insets(0, 0, 5, 5);
		gbc_button_87.gridx = 7;
		gbc_button_87.gridy = 2;
		contentPane.add(button_87, gbc_button_87);
		
		JButton button_88 = new JButton("88");
		button_88.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_88 = new GridBagConstraints();
		gbc_button_88.insets = new Insets(0, 0, 5, 5);
		gbc_button_88.gridx = 8;
		gbc_button_88.gridy = 2;
		contentPane.add(button_88, gbc_button_88);
		
		JButton button_89 = new JButton("89");
		button_89.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_89 = new GridBagConstraints();
		gbc_button_89.insets = new Insets(0, 0, 5, 5);
		gbc_button_89.gridx = 9;
		gbc_button_89.gridy = 2;
		contentPane.add(button_89, gbc_button_89);
		
		JButton button_90 = new JButton("90");
		button_90.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_90 = new GridBagConstraints();
		gbc_button_90.insets = new Insets(0, 0, 5, 5);
		gbc_button_90.gridx = 10;
		gbc_button_90.gridy = 2;
		contentPane.add(button_90, gbc_button_90);
		
		JButton button_80 = new JButton("80");
		button_80.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_80 = new GridBagConstraints();
		gbc_button_80.insets = new Insets(0, 0, 5, 5);
		gbc_button_80.gridx = 1;
		gbc_button_80.gridy = 3;
		contentPane.add(button_80, gbc_button_80);
		
		JButton button_79 = new JButton("79");
		button_79.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_79 = new GridBagConstraints();
		gbc_button_79.insets = new Insets(0, 0, 5, 5);
		gbc_button_79.gridx = 2;
		gbc_button_79.gridy = 3;
		contentPane.add(button_79, gbc_button_79);
		
		JButton button_78 = new JButton("78");
		button_78.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_78 = new GridBagConstraints();
		gbc_button_78.insets = new Insets(0, 0, 5, 5);
		gbc_button_78.gridx = 3;
		gbc_button_78.gridy = 3;
		contentPane.add(button_78, gbc_button_78);
		
		JButton button_77 = new JButton("77");
		button_77.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_77 = new GridBagConstraints();
		gbc_button_77.insets = new Insets(0, 0, 5, 5);
		gbc_button_77.gridx = 4;
		gbc_button_77.gridy = 3;
		contentPane.add(button_77, gbc_button_77);
		
		JButton button_76 = new JButton("76");
		button_76.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_76 = new GridBagConstraints();
		gbc_button_76.insets = new Insets(0, 0, 5, 5);
		gbc_button_76.gridx = 5;
		gbc_button_76.gridy = 3;
		contentPane.add(button_76, gbc_button_76);
		
		JButton button_75 = new JButton("75");
		button_75.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_75 = new GridBagConstraints();
		gbc_button_75.insets = new Insets(0, 0, 5, 5);
		gbc_button_75.gridx = 6;
		gbc_button_75.gridy = 3;
		contentPane.add(button_75, gbc_button_75);
		
		JButton button_74 = new JButton("74");
		button_74.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_74 = new GridBagConstraints();
		gbc_button_74.insets = new Insets(0, 0, 5, 5);
		gbc_button_74.gridx = 7;
		gbc_button_74.gridy = 3;
		contentPane.add(button_74, gbc_button_74);
		
		JButton button_73 = new JButton("73");
		button_73.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_73 = new GridBagConstraints();
		gbc_button_73.insets = new Insets(0, 0, 5, 5);
		gbc_button_73.gridx = 8;
		gbc_button_73.gridy = 3;
		contentPane.add(button_73, gbc_button_73);
		
		JButton button_72 = new JButton("72");
		button_72.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_72 = new GridBagConstraints();
		gbc_button_72.insets = new Insets(0, 0, 5, 5);
		gbc_button_72.gridx = 9;
		gbc_button_72.gridy = 3;
		contentPane.add(button_72, gbc_button_72);
		
		JButton button_71 = new JButton("71");
		button_71.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_71 = new GridBagConstraints();
		gbc_button_71.insets = new Insets(0, 0, 5, 5);
		gbc_button_71.gridx = 10;
		gbc_button_71.gridy = 3;
		contentPane.add(button_71, gbc_button_71);
		
		JLabel player1 = new JLabel("Player 1");
		GridBagConstraints gbc_player1 = new GridBagConstraints();
		gbc_player1.insets = new Insets(0, 0, 5, 5);
		gbc_player1.gridx = 12;
		gbc_player1.gridy = 3;
		contentPane.add(player1, gbc_player1);
		
		JLabel player1Score = new JLabel("0");
		GridBagConstraints gbc_player1Score = new GridBagConstraints();
		gbc_player1Score.insets = new Insets(0, 0, 5, 5);
		gbc_player1Score.gridx = 13;
		gbc_player1Score.gridy = 3;
		contentPane.add(player1Score, gbc_player1Score);
		
		JButton button_61 = new JButton("61");
		button_61.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_61 = new GridBagConstraints();
		gbc_button_61.insets = new Insets(0, 0, 5, 5);
		gbc_button_61.gridx = 1;
		gbc_button_61.gridy = 4;
		contentPane.add(button_61, gbc_button_61);
		
		JButton button_62 = new JButton("62");
		button_62.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_62 = new GridBagConstraints();
		gbc_button_62.insets = new Insets(0, 0, 5, 5);
		gbc_button_62.gridx = 2;
		gbc_button_62.gridy = 4;
		contentPane.add(button_62, gbc_button_62);
		
		JButton button_63 = new JButton("63");
		button_63.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_63 = new GridBagConstraints();
		gbc_button_63.insets = new Insets(0, 0, 5, 5);
		gbc_button_63.gridx = 3;
		gbc_button_63.gridy = 4;
		contentPane.add(button_63, gbc_button_63);
		
		JButton button_64 = new JButton("64");
		button_64.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_64 = new GridBagConstraints();
		gbc_button_64.insets = new Insets(0, 0, 5, 5);
		gbc_button_64.gridx = 4;
		gbc_button_64.gridy = 4;
		contentPane.add(button_64, gbc_button_64);
		
		JButton button_65 = new JButton("65");
		button_65.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_65 = new GridBagConstraints();
		gbc_button_65.insets = new Insets(0, 0, 5, 5);
		gbc_button_65.gridx = 5;
		gbc_button_65.gridy = 4;
		contentPane.add(button_65, gbc_button_65);
		
		JButton button_66 = new JButton("66");
		button_66.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_66 = new GridBagConstraints();
		gbc_button_66.insets = new Insets(0, 0, 5, 5);
		gbc_button_66.gridx = 6;
		gbc_button_66.gridy = 4;
		contentPane.add(button_66, gbc_button_66);
		
		JButton button_67 = new JButton("67");
		button_67.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_67 = new GridBagConstraints();
		gbc_button_67.insets = new Insets(0, 0, 5, 5);
		gbc_button_67.gridx = 7;
		gbc_button_67.gridy = 4;
		contentPane.add(button_67, gbc_button_67);
		
		JButton button_68 = new JButton("68");
		button_68.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_68 = new GridBagConstraints();
		gbc_button_68.insets = new Insets(0, 0, 5, 5);
		gbc_button_68.gridx = 8;
		gbc_button_68.gridy = 4;
		contentPane.add(button_68, gbc_button_68);
		
		JButton button_69 = new JButton("69");
		button_69.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_69 = new GridBagConstraints();
		gbc_button_69.insets = new Insets(0, 0, 5, 5);
		gbc_button_69.gridx = 9;
		gbc_button_69.gridy = 4;
		contentPane.add(button_69, gbc_button_69);
		
		JButton button_70 = new JButton("70");
		button_70.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_70 = new GridBagConstraints();
		gbc_button_70.insets = new Insets(0, 0, 5, 5);
		gbc_button_70.gridx = 10;
		gbc_button_70.gridy = 4;
		contentPane.add(button_70, gbc_button_70);
		
		JLabel player2 = new JLabel("Player 2");
		GridBagConstraints gbc_player2 = new GridBagConstraints();
		gbc_player2.insets = new Insets(0, 0, 5, 5);
		gbc_player2.gridx = 12;
		gbc_player2.gridy = 4;
		contentPane.add(player2, gbc_player2);
		
		JLabel player2Score = new JLabel("0");
		GridBagConstraints gbc_player2Score = new GridBagConstraints();
		gbc_player2Score.insets = new Insets(0, 0, 5, 5);
		gbc_player2Score.gridx = 13;
		gbc_player2Score.gridy = 4;
		contentPane.add(player2Score, gbc_player2Score);
		
		JButton button_60 = new JButton("60");
		button_60.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_60 = new GridBagConstraints();
		gbc_button_60.insets = new Insets(0, 0, 5, 5);
		gbc_button_60.gridx = 1;
		gbc_button_60.gridy = 5;
		contentPane.add(button_60, gbc_button_60);
		
		JButton button_59 = new JButton("59");
		button_59.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_59 = new GridBagConstraints();
		gbc_button_59.insets = new Insets(0, 0, 5, 5);
		gbc_button_59.gridx = 2;
		gbc_button_59.gridy = 5;
		contentPane.add(button_59, gbc_button_59);
		
		JButton button_58 = new JButton("58");
		button_58.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_58 = new GridBagConstraints();
		gbc_button_58.insets = new Insets(0, 0, 5, 5);
		gbc_button_58.gridx = 3;
		gbc_button_58.gridy = 5;
		contentPane.add(button_58, gbc_button_58);
		
		JButton button_57 = new JButton("57");
		button_57.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_57 = new GridBagConstraints();
		gbc_button_57.insets = new Insets(0, 0, 5, 5);
		gbc_button_57.gridx = 4;
		gbc_button_57.gridy = 5;
		contentPane.add(button_57, gbc_button_57);
		
		JButton button_56 = new JButton("56");
		button_56.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_56 = new GridBagConstraints();
		gbc_button_56.insets = new Insets(0, 0, 5, 5);
		gbc_button_56.gridx = 5;
		gbc_button_56.gridy = 5;
		contentPane.add(button_56, gbc_button_56);
		
		JButton button_55 = new JButton("55");
		button_55.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_55 = new GridBagConstraints();
		gbc_button_55.insets = new Insets(0, 0, 5, 5);
		gbc_button_55.gridx = 6;
		gbc_button_55.gridy = 5;
		contentPane.add(button_55, gbc_button_55);
		
		JButton button_54 = new JButton("54");
		button_54.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_54 = new GridBagConstraints();
		gbc_button_54.insets = new Insets(0, 0, 5, 5);
		gbc_button_54.gridx = 7;
		gbc_button_54.gridy = 5;
		contentPane.add(button_54, gbc_button_54);
		
		JButton button_53 = new JButton("53");
		button_53.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_53 = new GridBagConstraints();
		gbc_button_53.insets = new Insets(0, 0, 5, 5);
		gbc_button_53.gridx = 8;
		gbc_button_53.gridy = 5;
		contentPane.add(button_53, gbc_button_53);
		
		JButton button_52 = new JButton("52");
		button_52.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_52 = new GridBagConstraints();
		gbc_button_52.insets = new Insets(0, 0, 5, 5);
		gbc_button_52.gridx = 9;
		gbc_button_52.gridy = 5;
		contentPane.add(button_52, gbc_button_52);
		
		JButton button_51 = new JButton("51");
		button_51.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_51 = new GridBagConstraints();
		gbc_button_51.insets = new Insets(0, 0, 5, 5);
		gbc_button_51.gridx = 10;
		gbc_button_51.gridy = 5;
		contentPane.add(button_51, gbc_button_51);
		
		JButton button_41 = new JButton("41");
		button_41.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_41 = new GridBagConstraints();
		gbc_button_41.insets = new Insets(0, 0, 5, 5);
		gbc_button_41.gridx = 1;
		gbc_button_41.gridy = 6;
		contentPane.add(button_41, gbc_button_41);
		
		JButton button_42 = new JButton("42");
		button_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_42.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_42 = new GridBagConstraints();
		gbc_button_42.insets = new Insets(0, 0, 5, 5);
		gbc_button_42.gridx = 2;
		gbc_button_42.gridy = 6;
		contentPane.add(button_42, gbc_button_42);
		
		JButton button_43 = new JButton("43");
		button_43.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_43 = new GridBagConstraints();
		gbc_button_43.insets = new Insets(0, 0, 5, 5);
		gbc_button_43.gridx = 3;
		gbc_button_43.gridy = 6;
		contentPane.add(button_43, gbc_button_43);
		
		JButton button_44 = new JButton("44");
		button_44.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_44 = new GridBagConstraints();
		gbc_button_44.insets = new Insets(0, 0, 5, 5);
		gbc_button_44.gridx = 4;
		gbc_button_44.gridy = 6;
		contentPane.add(button_44, gbc_button_44);
		
		JButton button_45 = new JButton("45");
		button_45.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_45 = new GridBagConstraints();
		gbc_button_45.insets = new Insets(0, 0, 5, 5);
		gbc_button_45.gridx = 5;
		gbc_button_45.gridy = 6;
		contentPane.add(button_45, gbc_button_45);
		
		JButton button_46 = new JButton("46");
		button_46.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_46 = new GridBagConstraints();
		gbc_button_46.insets = new Insets(0, 0, 5, 5);
		gbc_button_46.gridx = 6;
		gbc_button_46.gridy = 6;
		contentPane.add(button_46, gbc_button_46);
		
		JButton button_47 = new JButton("47");
		button_47.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_47 = new GridBagConstraints();
		gbc_button_47.insets = new Insets(0, 0, 5, 5);
		gbc_button_47.gridx = 7;
		gbc_button_47.gridy = 6;
		contentPane.add(button_47, gbc_button_47);
		
		JButton button_48 = new JButton("48");
		button_48.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_48 = new GridBagConstraints();
		gbc_button_48.insets = new Insets(0, 0, 5, 5);
		gbc_button_48.gridx = 8;
		gbc_button_48.gridy = 6;
		contentPane.add(button_48, gbc_button_48);
		
		JButton button_49 = new JButton("49");
		button_49.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_49 = new GridBagConstraints();
		gbc_button_49.insets = new Insets(0, 0, 5, 5);
		gbc_button_49.gridx = 9;
		gbc_button_49.gridy = 6;
		contentPane.add(button_49, gbc_button_49);
		
		JButton button_50 = new JButton("50");
		button_50.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_50 = new GridBagConstraints();
		gbc_button_50.insets = new Insets(0, 0, 5, 5);
		gbc_button_50.gridx = 10;
		gbc_button_50.gridy = 6;
		contentPane.add(button_50, gbc_button_50);
		
		JButton button_40 = new JButton("40");
		button_40.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_40 = new GridBagConstraints();
		gbc_button_40.insets = new Insets(0, 0, 5, 5);
		gbc_button_40.gridx = 1;
		gbc_button_40.gridy = 7;
		contentPane.add(button_40, gbc_button_40);
		
		JButton button_39 = new JButton("39");
		button_39.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_39 = new GridBagConstraints();
		gbc_button_39.insets = new Insets(0, 0, 5, 5);
		gbc_button_39.gridx = 2;
		gbc_button_39.gridy = 7;
		contentPane.add(button_39, gbc_button_39);
		
		JButton button_38 = new JButton("38");
		button_38.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_38 = new GridBagConstraints();
		gbc_button_38.insets = new Insets(0, 0, 5, 5);
		gbc_button_38.gridx = 3;
		gbc_button_38.gridy = 7;
		contentPane.add(button_38, gbc_button_38);
		
		JButton button_37 = new JButton("37");
		button_37.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_37 = new GridBagConstraints();
		gbc_button_37.insets = new Insets(0, 0, 5, 5);
		gbc_button_37.gridx = 4;
		gbc_button_37.gridy = 7;
		contentPane.add(button_37, gbc_button_37);
		
		JButton button_36 = new JButton("36");
		button_36.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_36 = new GridBagConstraints();
		gbc_button_36.insets = new Insets(0, 0, 5, 5);
		gbc_button_36.gridx = 5;
		gbc_button_36.gridy = 7;
		contentPane.add(button_36, gbc_button_36);
		
		JButton button_35 = new JButton("35");
		button_35.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_35 = new GridBagConstraints();
		gbc_button_35.insets = new Insets(0, 0, 5, 5);
		gbc_button_35.gridx = 6;
		gbc_button_35.gridy = 7;
		contentPane.add(button_35, gbc_button_35);
		
		JButton button_34 = new JButton("34");
		button_34.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_34 = new GridBagConstraints();
		gbc_button_34.insets = new Insets(0, 0, 5, 5);
		gbc_button_34.gridx = 7;
		gbc_button_34.gridy = 7;
		contentPane.add(button_34, gbc_button_34);
		
		JButton button_33 = new JButton("33");
		button_33.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_33 = new GridBagConstraints();
		gbc_button_33.insets = new Insets(0, 0, 5, 5);
		gbc_button_33.gridx = 8;
		gbc_button_33.gridy = 7;
		contentPane.add(button_33, gbc_button_33);
		
		JButton button_32 = new JButton("32");
		button_32.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_32 = new GridBagConstraints();
		gbc_button_32.insets = new Insets(0, 0, 5, 5);
		gbc_button_32.gridx = 9;
		gbc_button_32.gridy = 7;
		contentPane.add(button_32, gbc_button_32);
		
		JButton button_31 = new JButton("31");
		button_31.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_31 = new GridBagConstraints();
		gbc_button_31.insets = new Insets(0, 0, 5, 5);
		gbc_button_31.gridx = 10;
		gbc_button_31.gridy = 7;
		contentPane.add(button_31, gbc_button_31);
		
		JLabel playerTurn = new JLabel("Player 1");
		GridBagConstraints gbc_playerTurn = new GridBagConstraints();
		gbc_playerTurn.insets = new Insets(0, 0, 5, 5);
		gbc_playerTurn.gridx = 12;
		gbc_playerTurn.gridy = 7;
		contentPane.add(playerTurn, gbc_playerTurn);
		
		JLabel winnerLabel = new JLabel("");
		GridBagConstraints gbc_winnerLabel = new GridBagConstraints();
		gbc_winnerLabel.insets = new Insets(0, 0, 5, 5);
		gbc_winnerLabel.gridx = 13;
		gbc_winnerLabel.gridy = 9;
		
		JLabel rollNumber = new JLabel("0");
		GridBagConstraints gbc_rollNumber = new GridBagConstraints();
		gbc_rollNumber.insets = new Insets(0, 0, 5, 5);
		gbc_rollNumber.gridx = 13;
		gbc_rollNumber.gridy = 8;
		contentPane.add(rollNumber, gbc_rollNumber);
		
		JButton btnRollDice = new JButton("Roll Dice");
		btnRollDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				g1.GamePlay();
				winnerLabel.setText(g1.winner);
				playerTurn.setText(g1.playerTurn);
				rollNumber.setText(String.valueOf(g1.num));
				player1Score.setText(String.valueOf(g1.player1.getPosition()));
				player2Score.setText(String.valueOf(g1.player2.getPosition()));
				
			}
		});
		GridBagConstraints gbc_btnRollDice = new GridBagConstraints();
		gbc_btnRollDice.insets = new Insets(0, 0, 5, 5);
		gbc_btnRollDice.gridx = 13;
		gbc_btnRollDice.gridy = 7;
		contentPane.add(btnRollDice, gbc_btnRollDice);
		
		JButton button_21 = new JButton("21");
		button_21.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_21 = new GridBagConstraints();
		gbc_button_21.insets = new Insets(0, 0, 5, 5);
		gbc_button_21.gridx = 1;
		gbc_button_21.gridy = 8;
		contentPane.add(button_21, gbc_button_21);
		
		JButton button_22 = new JButton("22");
		button_22.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_22 = new GridBagConstraints();
		gbc_button_22.insets = new Insets(0, 0, 5, 5);
		gbc_button_22.gridx = 2;
		gbc_button_22.gridy = 8;
		contentPane.add(button_22, gbc_button_22);
		
		JButton button_23 = new JButton("23");
		button_23.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_23 = new GridBagConstraints();
		gbc_button_23.insets = new Insets(0, 0, 5, 5);
		gbc_button_23.gridx = 3;
		gbc_button_23.gridy = 8;
		contentPane.add(button_23, gbc_button_23);
		
		JButton button_24 = new JButton("24");
		button_24.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_24 = new GridBagConstraints();
		gbc_button_24.insets = new Insets(0, 0, 5, 5);
		gbc_button_24.gridx = 4;
		gbc_button_24.gridy = 8;
		contentPane.add(button_24, gbc_button_24);
		
		JButton button_25 = new JButton("25");
		button_25.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_25 = new GridBagConstraints();
		gbc_button_25.insets = new Insets(0, 0, 5, 5);
		gbc_button_25.gridx = 5;
		gbc_button_25.gridy = 8;
		contentPane.add(button_25, gbc_button_25);
		
		JButton button_26 = new JButton("26");
		button_26.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_26 = new GridBagConstraints();
		gbc_button_26.insets = new Insets(0, 0, 5, 5);
		gbc_button_26.gridx = 6;
		gbc_button_26.gridy = 8;
		contentPane.add(button_26, gbc_button_26);
		
		JButton button_27 = new JButton("27");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_27.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_27 = new GridBagConstraints();
		gbc_button_27.insets = new Insets(0, 0, 5, 5);
		gbc_button_27.gridx = 7;
		gbc_button_27.gridy = 8;
		contentPane.add(button_27, gbc_button_27);
		
		JButton button_28 = new JButton("28");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_28.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_28 = new GridBagConstraints();
		gbc_button_28.insets = new Insets(0, 0, 5, 5);
		gbc_button_28.gridx = 8;
		gbc_button_28.gridy = 8;
		contentPane.add(button_28, gbc_button_28);
		
		JButton button_29 = new JButton("29");
		button_29.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_29 = new GridBagConstraints();
		gbc_button_29.insets = new Insets(0, 0, 5, 5);
		gbc_button_29.gridx = 9;
		gbc_button_29.gridy = 8;
		contentPane.add(button_29, gbc_button_29);
		
		JButton button_30 = new JButton("30");
		button_30.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_30 = new GridBagConstraints();
		gbc_button_30.insets = new Insets(0, 0, 5, 5);
		gbc_button_30.gridx = 10;
		gbc_button_30.gridy = 8;
		contentPane.add(button_30, gbc_button_30);
		
		JButton button_20 = new JButton("20");
		button_20.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_20 = new GridBagConstraints();
		gbc_button_20.insets = new Insets(0, 0, 5, 5);
		gbc_button_20.gridx = 1;
		gbc_button_20.gridy = 9;
		contentPane.add(button_20, gbc_button_20);
		
		JButton button_19 = new JButton("19");
		button_19.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_19 = new GridBagConstraints();
		gbc_button_19.insets = new Insets(0, 0, 5, 5);
		gbc_button_19.gridx = 2;
		gbc_button_19.gridy = 9;
		contentPane.add(button_19, gbc_button_19);
		
		JButton button_18 = new JButton("18");
		button_18.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_18 = new GridBagConstraints();
		gbc_button_18.insets = new Insets(0, 0, 5, 5);
		gbc_button_18.gridx = 3;
		gbc_button_18.gridy = 9;
		contentPane.add(button_18, gbc_button_18);
		
		JButton button_17 = new JButton("17");
		button_17.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.insets = new Insets(0, 0, 5, 5);
		gbc_button_17.gridx = 4;
		gbc_button_17.gridy = 9;
		contentPane.add(button_17, gbc_button_17);
		
		JButton button_16 = new JButton("16");
		button_16.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.insets = new Insets(0, 0, 5, 5);
		gbc_button_16.gridx = 5;
		gbc_button_16.gridy = 9;
		contentPane.add(button_16, gbc_button_16);
		
		JButton button_15 = new JButton("15");
		button_15.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 6;
		gbc_button_15.gridy = 9;
		contentPane.add(button_15, gbc_button_15);
		
		JButton button_14 = new JButton("14");
		button_14.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 7;
		gbc_button_14.gridy = 9;
		contentPane.add(button_14, gbc_button_14);
		
		JButton button_13 = new JButton("13");
		button_13.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 8;
		gbc_button_13.gridy = 9;
		contentPane.add(button_13, gbc_button_13);
		
		JButton button_12 = new JButton("12");
		button_12.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 9;
		gbc_button_12.gridy = 9;
		contentPane.add(button_12, gbc_button_12);
		
		JButton button_11 = new JButton("11");
		button_11.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 10;
		gbc_button_11.gridy = 9;
		contentPane.add(button_11, gbc_button_11);
		
		
		contentPane.add(winnerLabel, gbc_winnerLabel);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 10;
		contentPane.add(button_1, gbc_button_1);
		
		
		
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 10;
		contentPane.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_button_3.gridx = 3;
		gbc_button_3.gridy = 10;
		contentPane.add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 0, 5);
		gbc_button_4.gridx = 4;
		gbc_button_4.gridy = 10;
		contentPane.add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 0, 5);
		gbc_button_5.gridx = 5;
		gbc_button_5.gridy = 10;
		contentPane.add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_6.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 0, 5);
		gbc_button_6.gridx = 6;
		gbc_button_6.gridy = 10;
		contentPane.add(button_6, gbc_button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 0, 5);
		gbc_button_7.gridx = 7;
		gbc_button_7.gridy = 10;
		contentPane.add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 0, 5);
		gbc_button_8.gridx = 8;
		gbc_button_8.gridy = 10;
		contentPane.add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 0, 5);
		gbc_button_9.gridx = 9;
		gbc_button_9.gridy = 10;
		contentPane.add(button_9, gbc_button_9);
		
		JButton button_10 = new JButton("10");
		button_10.setPreferredSize(new Dimension(50, 50));
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 0, 5);
		gbc_button_10.gridx = 10;
		gbc_button_10.gridy = 10;
		contentPane.add(button_10, gbc_button_10);
		
		bmap.put("button_1", button_1);
		bmap.get("button_1").setText("hi");
		
		
	}
	
}