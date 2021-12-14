package Exam01;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	// controller(컨트롤러) : 실질적인 기능이 수행될 클래스

	ArrayList<Music> musiclist = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();
	int index = 0;

	public MusicPlayer() {
		musiclist.add(new Music("깡", "Rain", 100, "C://music/Rain - 깡.mp3"));
		musiclist.add(new Music("Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 "));
		musiclist.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
	}

	// 재생기능 빼주기(1번)
	public void play() {
		mp3.play(musiclist.get(index).getPath()); // play(경로) : 재생메소드
	}

	// 다음곡을 실행할 기능(3번)
	public boolean nextPlay() {
		boolean test1 = true; // 재생할 곡이 있는지 없는지 판별
		if (mp3.isPlaying()) {
			// 현재 재생중인 노래가 있다면 true
			// 현재 재생중인 노래가 있다면 false
			mp3.stop();
		}

		index++;

		if (index <= musiclist.size() - 1) {

			// index++;

			mp3.play(musiclist.get(index).getPath());
			// ispaying()-> 현재 재생 중인지 판단하는 메소드

			// stop()-> 현재 재생 중인 노래를 멈춰주는 메소드
		} else {
			test1 = false;
			index = 2;
		}
		return test1;

	}

	public boolean beforePlay() {
		boolean test2 = true;
		// 4번
		if (mp3.isPlaying()) {
			// 현재 재생중인 노래가 있다면 true
			// 현재 재생중인 노래가 있다면 false
			mp3.stop();
		}

		if (index >= 0) {
			index--;
			if (index < 0) {
				test2 = false;
				index = 0;
			} else {

				// ispaying()-> 현재 재생 중인지 판단하는 메소드
				// stop()-> 현재 재생 중인 노래를 멈춰주는 메소드
				mp3.play(musiclist.get(index).getPath());

			}
		}

		return test2;
	}

}
