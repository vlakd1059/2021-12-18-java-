import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ��Ӱ� ������
		// ��� : �����޴� �� (��, ���) -> �θ�κ���
		// ���α׷����� ��� : �����޾Ƽ� Ȯ��(extends)��Ų��.

		PtkJjajang ptkjjajang = new PtkJjajang();
		PjeJjajang pjejjajang = new PjeJjajang();
		PwjJjajang pwjjjajang = new PwjJjajang();
		PmsJjajang pmsjjajang = new PmsJjajang();

		PghJjajjang p1 = ptkjjajang; // �°��� �ƹ���Ÿ������ �ٲ�
		PghJjajjang p2 = pjejjajang;
		PghJjajjang p3 = pwjjjajang;
		PghJjajjang p4 = pmsjjajang;

		p1.makeJjajang();
		// double tall = 182.5 -> (int)182
		PtkJjajang newPtkJjajang = (PtkJjajang) p1; // �ٿ�ĳ���� �ڽĸ��� ����Ư¡�� ������������ ���°�
		newPtkJjajang.makeBingsu();

		p2.makeJjajang();
		p3.makeJjajang();
		p4.makeJjajang();

		// �����͸� �ѹ��� ����
		ArrayList<PghJjajjang> list = new ArrayList<PghJjajjang>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		CjiJjajang chCjiJjajang = new CjiJjajang();
		chCjiJjajang.makeJjajang();

	}
}
