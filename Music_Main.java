package Exam01;

import java.util.ArrayList;
import java.util.Scanner;
import javazoom.jl.player.MP3Player;

public class Music_Main {

	public static void main(String[] args) {
		//View(��)
		// ���Ǹ���Ʈ�� �� ArrayList
//		ArrayList<Music> musiclist = new ArrayList<Music>();
//		musiclist.add(new Music("��", "Rain", 100, "C://music/Rain - ��.mp3"));
//		musiclist.add(new Music("Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 "));
//		musiclist.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player(); // ������ ���������� ��������� ��ü
		// int index = 0; // �뷡 ��ġ����

		// ����� ����ϴ� ��ü ����
		MusicPlayer player = new MusicPlayer();
		while (true) {
			System.out.print("1. ��� 2. ���� 3. ������ 4. ������ 5.���� >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				// ��� -> "��, rain, 1��40��

				// mp3.play(musiclist.get(index).getPath()); // play(���) : ����޼ҵ�
				// controller �ҷ��ͼ� �����Ŵ

				show(player.musiclist, player.index);
				player.play();

			} else if (menu == 2) {
				// ����
				player.mp3.stop();
				System.out.println("������ �����մϴ�.");

			} else if (menu == 3) {
				// ������
				// ������ �� ���ķ� '�������� ������ ����� ���� �����ϴ�' ���

				boolean test1 = player.nextPlay();
				// index�� 2�� �Ѵ´ٸ� show()�� ���������� �ʾƾ���.
				if (test1 == true) {
					show(player.musiclist, player.index);
				} else {
					System.out.println("����� �뷡�� �����ϴ�.");
				}

			} else if (menu == 4) {
				// ������
				// index�� Ȱ���� ����� �� �������� ������ �������� �����ϴ� ���

				boolean test2 = player.beforePlay();
				if (test2 == true) {
					show(player.musiclist, player.index);
				} else {
					System.out.println("����� �뷡�� �����ϴ�.");
				}

			} else if (menu == 5) {
				// ����
				System.out.println("���α׷� ����");
				break;
			}
		}
	}

	private static void show(ArrayList<Music> musiclist, int index) {
		System.out.print(musiclist.get(index).GetMusicName() + " ");
		System.out.print(musiclist.get(index).GetSinger() + " ");
		if (musiclist.get(index).GetPlayTime() % 60 != 0) {
			System.out.println(
					(musiclist.get(index).GetPlayTime() / 60) + "��" + (musiclist.get(index).GetPlayTime() % 60) + "��");
		} else {
			System.out.println((musiclist.get(index).GetPlayTime() / 60) + "��");
		}
	}

}
