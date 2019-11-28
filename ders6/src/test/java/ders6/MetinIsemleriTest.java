package ders6;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MetinIsemleriTest {

	@Test
	public void testBuyukHarf() 
	{
		String sonuc = MetinIsemleri
		.buyukHarf("okul");
		Assert.assertEquals("ALİ", sonuc);
		
	}

}
