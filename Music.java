package Exam01;

public class Music {
	// Model(��)
	private String getMusicName; // �뷡�̸�
	private String getSinger; // �����̸�
	private int getPlayTime; // ����ð�
	private String path; // �������ϰ��

	public Music(String getMusicName, String getSinger, int getPlayTime) {
		super();
		this.getMusicName = getMusicName;
		this.getSinger = getSinger;
		this.getPlayTime = getPlayTime;
	}
	// ������ �����ε�
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
