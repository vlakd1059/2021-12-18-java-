import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// 상속과 다형성
		// 상속 : 물려받는 것 (돈, 재산) -> 부모로부터
		// 프로그램에서 상속 : 물려받아서 확장(extends)시킨다.

		PtkJjajang ptkjjajang = new PtkJjajang();
		PjeJjajang pjejjajang = new PjeJjajang();
		PwjJjajang pwjjjajang = new PwjJjajang();
		PmsJjajang pmsjjajang = new PmsJjajang();

		PghJjajjang p1 = ptkjjajang; // 태경이 아버지타입으로 바뀜
		PghJjajjang p2 = pjejjajang;
		PghJjajjang p3 = pwjjjajang;
		PghJjajjang p4 = pmsjjajang;

		p1.makeJjajang();
		// double tall = 182.5 -> (int)182
		PtkJjajang newPtkJjajang = (PtkJjajang) p1; // 다운캐스팅 자식만의 고유특징을 가져오기위해 쓰는것
		newPtkJjajang.makeBingsu();

		p2.makeJjajang();
		p3.makeJjajang();
		p4.makeJjajang();

		// 데이터를 한번에 포용
		ArrayList<PghJjajjang> list = new ArrayList<PghJjajjang>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		CjiJjajang chCjiJjajang = new CjiJjajang();
		chCjiJjajang.makeJjajang();

	}
}
