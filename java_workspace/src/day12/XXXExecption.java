package day12;

public class XXXExecption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * PasswordException
		 * 
		 * 비밀번호 null일 수 없음 비밀번호 길이는 5이상 비밀번호 문자+숫자+특수문자;
		 */
		PasswordTest pt = new PasswordTest();
		String password = "sdddddddddddd";
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}

class PasswordTest {
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if (password == null)
			throw new PasswordException("비밀번호는 null일수 없습니다.");
		else if (password.length() < 5)
			throw new PasswordException("비밀번호는 5자리 이상이어야 합니다.");
		else if (password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		this.password = password;
	}
}