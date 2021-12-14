package Exam01;

import java.util.ArrayList;
import java.util.Scanner;
import javazoom.jl.player.MP3Player;

public class Music_Main {

	public static void main(String[] args) {
		//View(뷰)
		// 음악리스트가 될 ArrayList
//		ArrayList<Music> musiclist = new ArrayList<Music>();
//		musiclist.add(new Music("깡", "Rain", 100, "C://music/Rain - 깡.mp3"));
//		musiclist.add(new Music("Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 "));
//		musiclist.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player(); // 음악을 실직적으로 재생시켜줄 객체
		// int index = 0; // 노래 위치정보

		// 기능을 담당하는 객체 생성
		MusicPlayer player = new MusicPlayer();
		while (true) {
			System.out.print("1. 재생 2. 정지 3. 다음곡 4. 이전곡 5.종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				// 재생 -> "깡, rain, 1분40초

				// mp3.play(musiclist.get(index).getPath()); // play(경로) : 재생메소드
				// controller 불러와서 실행시킴

				show(player.musiclist, player.index);
				player.play();

			} else if (menu == 2) {
				// 정지
				player.mp3.stop();
				System.out.println("음악을 정지합니다.");

			} else if (menu == 3) {
				// 다음곡
				// 마지막 곡 이후로 '다음곡을 누르면 재생할 곡이 없습니다' 출력

				boolean test1 = player.nextPlay();
				// index가 2를 넘는다면 show()를 실행실행되지 않아야함.
				if (test1 == true) {
					show(player.musiclist, player.index);
				} else {
					System.out.println("재생할 노래가 없습니다.");
				}

			} else if (menu == 4) {
				// 이전곡
				// index를 활용해 만들고 깡 이전곡을 누르면 이전곡이 없습니다 출력

				boolean test2 = player.beforePlay();
				if (test2 == true) {
					show(player.musiclist, player.index);
				} else {
					System.out.println("재생할 노래가 없습니다.");
				}

			} else if (menu == 5) {
				// 종료
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	private static void show(ArrayList<Music> musiclist, int index) {
		System.out.print(musiclist.get(index).GetMusicName() + " ");
		System.out.print(musiclist.get(index).GetSinger() + " ");
		if (musiclist.get(index).GetPlayTime() % 60 != 0) {
			System.out.println(
					(musiclist.get(index).GetPlayTime() / 60) + "분" + (musiclist.get(index).GetPlayTime() % 60) + "초");
		} else {
			System.out.println((musiclist.get(index).GetPlayTime() / 60) + "분");
		}
	}

}
