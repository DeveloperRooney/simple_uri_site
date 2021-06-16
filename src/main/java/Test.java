import util.SiteTitle;

public class Test {

	public static void main(String[] args) {
		
		SiteTitle st = new SiteTitle();
		
		String title = "";
		
		try {
			title = st.getTitle("https://developer-rooney.tistory.com");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(title);
		
	}
}
