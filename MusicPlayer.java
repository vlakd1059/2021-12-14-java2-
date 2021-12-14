package Exam01;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	// controller(��Ʈ�ѷ�) : �������� ����� ����� Ŭ����

	ArrayList<Music> musiclist = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();
	int index = 0;

	public MusicPlayer() {
		musiclist.add(new Music("��", "Rain", 100, "C://music/Rain - ��.mp3"));
		musiclist.add(new Music("Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 "));
		musiclist.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
	}

	// ������ ���ֱ�(1��)
	public void play() {
		mp3.play(musiclist.get(index).getPath()); // play(���) : ����޼ҵ�
	}

	// �������� ������ ���(3��)
	public boolean nextPlay() {
		boolean test1 = true; // ����� ���� �ִ��� ������ �Ǻ�
		if (mp3.isPlaying()) {
			// ���� ������� �뷡�� �ִٸ� true
			// ���� ������� �뷡�� �ִٸ� false
			mp3.stop();
		}

		index++;

		if (index <= musiclist.size() - 1) {

			// index++;

			mp3.play(musiclist.get(index).getPath());
			// ispaying()-> ���� ��� ������ �Ǵ��ϴ� �޼ҵ�

			// stop()-> ���� ��� ���� �뷡�� �����ִ� �޼ҵ�
		} else {
			test1 = false;
			index = 2;
		}
		return test1;

	}

	public boolean beforePlay() {
		boolean test2 = true;
		// 4��
		if (mp3.isPlaying()) {
			// ���� ������� �뷡�� �ִٸ� true
			// ���� ������� �뷡�� �ִٸ� false
			mp3.stop();
		}

		if (index >= 0) {
			index--;
			if (index < 0) {
				test2 = false;
				index = 0;
			} else {

				// ispaying()-> ���� ��� ������ �Ǵ��ϴ� �޼ҵ�
				// stop()-> ���� ��� ���� �뷡�� �����ִ� �޼ҵ�
				mp3.play(musiclist.get(index).getPath());

			}
		}

		return test2;
	}

}
