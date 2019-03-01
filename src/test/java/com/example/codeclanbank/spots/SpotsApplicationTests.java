package com.example.codeclanbank.spots;

import com.example.codeclanbank.spots.models.Merchant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpotsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateMerchant(){
		Merchant merchant = new Merchant("Mels Novelty Hut",
				"Springfield");
		assertEquals( merchant.getName(), "Mels Novelty Hut");
	}

}
