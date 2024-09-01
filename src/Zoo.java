
import java.util.ListResourceBundle;

public class Zoo extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		
		return new Object[][] {
			{"hello","Hello a-Classe US"},
			{"open3","Open3 -Classe US"}
			
		};
	}
}