
public abstract class PghJjajjang { 
	// 메소드중 하나라도 추상메소드가 있는경우 클래스에 abstract 넣어야함
	// 추상메소드 특징 1.객체 생성X 2.

	public abstract void makeJjajang(); // 내용이 없는 메소드 ->추상메소드

	// private인 경우는 물려받지를 못함
	// private void makeJjajang() {
	// System.out.println("오이채 고명이 올라간 원조짜장 (계란없음)");
	// }

}
