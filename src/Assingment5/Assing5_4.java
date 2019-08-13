package Assingment5;
/*String array will be given.
if a string is Prefix of an any other string in that array means count.*/
//***
public class Assing5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n[] = { "abcpqr", "abc", "xyx", "acxyz" };
		int ans = 0;
		for (int i = 0; i < n.length; i++) {
			String n1 = n[i];
			int count = 0;
			for (int j = 0; j < n.length; j++) {
				String n2 = n[j];

				if (n2.startsWith(n1)) {
					count++;
				}
			}
			if (count > 1) {
				ans++;
			}
		}
		System.out.println(ans);

	}

}
