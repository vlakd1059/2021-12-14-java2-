package Exam01;

public class Music {
	// Model(모델)
	private String getMusicName; // 노래이름
	private String getSinger; // 가수이름
	private int getPlayTime; // 재생시간
	private String path; // 음악파일경로

	public Music(String getMusicName, String getSinger, int getPlayTime) {
		super();
		this.getMusicName = getMusicName;
		this.getSinger = getSinger;
		this.getPlayTime = getPlayTime;
	}
	// 생성자 오버로딩
	public Music(String getMusicName, String getSinger, int getPlayTime, String path) {
		super();
		this.getMusicName = getMusicName;
		this.getSinger = getSinger;
		this.getPlayTime = getPlayTime;
		this.path = path;
	}
	public String getPath() {
		return path;
	}

	public String GetMusicName() {
		return getMusicName;
	}

	public String GetSinger() {
		return getSinger;
	}

	public int GetPlayTime() {
		return getPlayTime;
	}
	
	

}
