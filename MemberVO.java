
public class MemberVO {
	// Ŭ����~~> �ʵ�� �޼ҵ�� ����

	private String name;
	private int age;

	@Override
	public String toString() { // ������ �Է������ʾƵ� �ѹ��� ����Ҽ��ִ� ���
		return "MemberVO [name=" + name + ", age=" + age + "]";
	}

	public MemberVO(String name, int age) { // �̸��� ���̸� �Է��ؾ߸� ��ü�� �����Ҽ�����.
		// �������� ����
		// 1. ��ü�� �����Ѵ�
		// �������� Ư¡
		// 1. ����Ÿ��x 2.Ŭ������� ����

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
