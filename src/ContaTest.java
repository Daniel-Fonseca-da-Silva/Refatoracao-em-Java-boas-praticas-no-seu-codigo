import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class ContaTest {
	
	@Test
	public void aoSacarValorDeContaSaldoDeveSofrerSubtracao() {
		Conta c1 = new Conta(1500d);
		c1.sacar(500d);
		MatcherAssert.assertThat(c1.getSaldo(), (equalTo(1000d))); 
	}
	
}
