package theGame02;
/**
 * �������
 * */
public class HumanPlayer {
	/**��̬����,��ȭ���͵���Ϣ*/
	public static final int MassageTypeFist = 1;
	/** Ӯ�ñ���ʱ����Ϣ*/
	public static final int MassageTypeWin = 2;
	/** ���ʱ����Ϣ*/
	public static final int MassageTypelose = 3;
	
	
	
	//���ԣ����ơ�������������ȭ������ɫ��Ӧ����Ч������ɫ̨��
	private String name = null;
	private int score = 0;
	private int fist = 0;
	/**
	 * ��ɫ�ڳ�ȭ��ʱ����˵�ĸ��Ի�̨��
	 * */
	private String[] fistWords = {
			"���йⲨ~biubiubiu~~~",
			"���������ı���Ϊʲô��ô��~~",
			"������ϲ�����ཷ��",
			"����һȭ~",
			"hahaha"
	};
	
	private String[] winWords = {
			"����˭~~",
			"��ȭ���е���˼~~",
			"~~��~~~��~~~~",
			"ȫ������~~~",
			"���Ż�����Ÿ裬Ȼ���������,xixi"
	};
	
	private String[] loseWords = {
			"ͨ���ɹ���·������ʩ���С���",
			"�ȵ���ˮ��ȥ����֪��˭����Ӿ�ˣ�����",
			"������ǲ��ã����ʱ�����������綼û�ú�~0~",
			"���������ˣ�baqq���ϣ�����̣��ú�����һ���������ô��ʹڵ�qq",
			"���˽����Ҷ��ѣ����������Ҷ��壡����"
	};

	/**���ݴ������Ϣ���� �����ӡ��Ӧ���͵���Ϣ
	 * magType ��Ӧ��̬����
	 * */
	public void sendMassage(int msgType){
		int index = ((int)(Math.random() *1000)) % 5;
		String massage =  null;
				
		
		switch(msgType){
		case MassageTypeFist:
			massage = fistWords[index];
			break;
		case MassageTypeWin:
			massage = winWords[index];
			break;
		case MassageTypelose:
			massage = loseWords[index];
			break;
		}
		System.out.println(massage);
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFist() {
		
		return fist;
	}

	public void setFist(int fist) {
		this.fist = fist;
	}
	
	//���������ú͵õ����ơ���������������Ч����˵���Ի�̨�ʡ���ȭ
	
	
}
