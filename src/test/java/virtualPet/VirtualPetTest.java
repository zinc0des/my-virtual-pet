/**
 * 
 */
package virtualPet;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import org.junit.runners.JUnit4;


/**
 * @author WeCanCodeIT
 *
 */
@RunWith(JUnit4.class)
public class VirtualPetTest {
	/**
	 * Test method for {@link virtualPet.VirtualPet#setHunger(int)}.
	 */
	@Test
	public void testSetHunger() throws Exception {
		VirtualPet pet = new VirtualPet("Donkey");
		pet.setHunger(100);
		assertEquals(pet.getHunger(), 100);
	}

	/**
	 * Test method for {@link virtualPet.VirtualPet#setThirst(int)}.
	 */
	@Test
	public void testSetThirst() throws Exception {
		VirtualPet pet = new VirtualPet("Donkey");
		pet.setThirst(85);
		assertEquals(pet.getHunger(), 85);
	}

	/**
	 * Test method for {@link virtualPet.VirtualPet#setSleep(int)}.
	 */
	@Test
	public void testSetSleep() throws Exception {
		VirtualPet pet = new VirtualPet("Doogie");
		pet.setSleep(102);
		assertEquals(pet.getSleep(), 102);
	}

	/**
	 * Test method for {@link virtualPet.VirtualPet#setPlay(int)}.
	 */
	@Test
	public void testSetPlay() throws Exception {
		VirtualPet pet = new VirtualPet("Doogie");
		pet.setPlay(3);
		assertEquals(pet.getPlay(), 3);
	}
	/**
	 * Test method for {@link virtualPet.VirtualPet#feed()}.
	 */
	@Test
	public void testFeed() throws Exception {
		VirtualPet pet = new VirtualPet("Doogie");
		pet.setAge(10);
		pet.setThirst(10);
		pet.setHunger(10);
		pet.feed();
		assertTrue(pet.getHunger() < 10);
	}

	/**
	 * Test method for {@link virtualPet.VirtualPet#water()}.
	 */
	@Test
	public void testWater() throws Exception {
		VirtualPet pet = new VirtualPet("Doogie");
		pet.setAge(10);
		pet.setThirst(10);
		pet.setHunger(10);
		pet.water();
		assertTrue(pet.getThirst() < 10);
	}

	/**
	 * Test method for {@link virtualPet.VirtualPet#makeSleep()}.
	 */
	@Test
	public void testMakeSleep() throws Exception {
		VirtualPet pet = new VirtualPet("Doogie");
		pet.setAge(10);
		pet.setThirst(10);
		pet.setHunger(10);
		pet.setSleep(10);
		pet.makeSleep();
		assertTrue(pet.getSleep() < 10);
	}

	/**
	 * Test method for {@link virtualPet.VirtualPet#playWith()}.
	 */
	@Test
	public void testPlayWith() throws Exception {
		VirtualPet pet = new VirtualPet("Doogie");
		pet.setAge(10);
		pet.setThirst(10);
		pet.setHunger(10);
		pet.setPlay(10);
		pet.playWith();
		assertTrue(pet.getPlay() < 10);
	}

	/**
	 * Test method for {@link virtualPet.VirtualPet#setAge(int)}.
	 */
	@Test
	public void testSetAge() throws Exception {
		VirtualPet pet = new VirtualPet("Yeti");
		pet.setAge(20);
		assertEquals(pet.getAge(), 20);
	}

	/**
	 * Test method for {@link virtualPet.VirtualPet#getAge()}.
	 */
	@Test
	public void testGetAge() throws Exception {
		VirtualPet pet = new VirtualPet("Donkey");
		assertTrue(pet.getAge() == 0);
	}

	/**
	 * Test method for {@link virtualPet.VirtualPet#getVirtualPetName()}.
	 */
	@Test
	public void testGetVirtualPetName() throws Exception {
		VirtualPet pet = new VirtualPet("Donkey");
		assertEquals(pet.getVirtualPetName(), "Donkey");
	}

	/**
	 * Test method for {@link virtualPet.VirtualPet#setVirtualPetName(java.lang.String)}.
	 */
	@Test
	public void testSetVirtualPetName() throws Exception {
		VirtualPet pet = new VirtualPet("Doogie");
		pet.setVirtualPetName("Lori");
		assertEquals(pet.getVirtualPetName(), "Lori");
	}

	/**
	 * Test method for {@link virtualPet.VirtualPet#isAlive()}.
	 */
	@Test
	public void testIsAlive() throws Exception {
		VirtualPet pet = new VirtualPet("Doogie");
		pet.setAge(10);
		pet.setHunger(10);
		pet.setThirst(10);
		assertTrue(pet.isAlive());
		pet.setAge(101);
		assertFalse(pet.isAlive());
		pet.setAge(10);
		pet.setHunger(101);
		assertFalse(pet.isAlive());
		pet.setHunger(10);
		pet.setThirst(101);
		assertFalse(pet.isAlive());	
	}

}
