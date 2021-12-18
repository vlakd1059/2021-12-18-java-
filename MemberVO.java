
public class MemberVO {
	// 클래스~~> 필드와 메소드로 나뉨

	private String name;
	private int age;

	@Override
	public String toString() { // 일일이 입력하지않아도 한번에 출력할수있는 기능
		return "MemberVO [name=" + name + ", age=" + age + "]";
	}

	public MemberVO(String name, int age) { // 이름과 나이를 입력해야만 객체를 생성할수있음.
		// 생성자의 역할
		// 1. 객체를 생성한다
		// 생성자의 특징
		// 1. 리턴타입x 2.클래스명과 동일

		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
