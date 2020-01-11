
/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import bot.penguee.Position;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class TestPosition {
	@Test
	public void testConstructor1() {
		int x = 500;
		int y = 700;
		Position mp = new Position(x, y);
		
		assertEquals(x, mp.x);
		assertEquals(y, mp.y);
		assertNull(mp.name);
	}

	@Test
	public void testConstructor2() {
		int x = 500;
		int y = 700;
		String myCustomName = "myCustomName";
		Position mp = new Position(x, y, myCustomName);

		assertEquals(x, mp.x);
		assertEquals(y, mp.y);
		assertEquals(myCustomName, mp.name);
	}

	@Test
	public void testConstructor3() {
		int x = 500;
		int y = 700;
		String myCustomName = "myCustomName";
		Position mp = new Position(x, y, myCustomName);
		Position mp2 = new Position(mp);

		assertNotNull(mp2.x);
		assertNotNull(mp2.y);
		assertNotNull(mp2.name);

		assertEquals(mp.x, mp2.x);
		assertEquals(mp.y, mp2.y);
		assertEquals(mp.name, mp2.name);
	}

	@Test
	public void testConstructor4() {
		int x = 500;
		int y = 700;
		Position mp = new Position(new Point(x, y));

		assertEquals(mp.x, x);
		assertEquals(mp.y, y);
		assertNull(mp.name);
	}

	@Test
	public void testConstructor5() {
		int x = -1;
		int y = -1;
		Position mp = new Position();

		assertEquals(mp.x, x);
		assertEquals(mp.y, y);
		assertNull(mp.name);
	}

	@Test
	public void testGetX() {
		int x = 500;
		int y = 700;
		Position mp = new Position(x, y);

		assertEquals(mp.getX(), x);
	}

	@Test
	public void testGetY() {
		int x = 500;
		int y = 700;
		Position mp = new Position(x, y);

		assertEquals(mp.getY(), y);
	}

	@Test
	public void testGetName() {
		int x = 500;
		int y = 700;
		String myCustomName = "myCustomName";
		Position mp = new Position(x, y, myCustomName);

		assertEquals(mp.getName(), myCustomName);
	}

	@Test
	public void testAdd() {
		int x = 500;
		int y = 700;
		int offsetX = 100;
		int offsetY = 200;
		Position mp = new Position(x, y);
		Position result = mp.add(offsetX, offsetY);
		assertEquals(mp.x + offsetX, result.x);
		assertEquals(mp.y + offsetY, result.y);
	}

	@Test
	public void testAdd2() {
		int x = 500;
		int y = 700;
		int offsetX = 100;
		int offsetY = 200;
		Position mp = new Position(x, y);
		Position offsetMP = new Position(offsetX, offsetY);
		Position result = mp.add(offsetMP);

		assertEquals(mp.x + offsetX, result.x);
		assertEquals(mp.y + offsetY, result.y);
	}

	@Test
	public void testSub() {
		int x = 500;
		int y = 700;
		int offsetX = 100;
		int offsetY = 200;
		Position mp = new Position(x, y);
		Position result = mp.sub(offsetX, offsetY);
		assertEquals(mp.x - offsetX, result.x);
		assertEquals(mp.y - offsetY, result.y);
	}

	@Test
	public void testSub2() {
		int x = 500;
		int y = 700;
		int offsetX = 100;
		int offsetY = 200;
		Position mp = new Position(x, y);
		Position offsetMP = new Position(offsetX, offsetY);
		Position result = mp.sub(offsetMP);

		assertEquals(mp.x - offsetX, result.x);
		assertEquals(mp.y - offsetY, result.y);
	}

	@Test
	public void testSetName() {
		int x = 500;
		int y = 700;
		String myCustomName = "myCustomName";
		String myCustomName2 = "myCustomName2";
		Position mp = new Position(x, y, myCustomName);
		mp.setName(myCustomName2);
		
		assertEquals(mp.name, myCustomName2);
	}
	
	@Test
	public void testEquals() {
		int x = 500;
		int y = 700;
		int offsetX = 100;
		int offsetY = 200;
		String myCustomName = "myCustomName";
		Position mp = new Position(x, y, myCustomName);
		Position mp_equal = new Position(x, y, myCustomName);
		Position mp2 = new Position(x+offsetX, y, myCustomName);
		Position mp3 = new Position(x, y + offsetY, myCustomName);
		Position mp4 = new Position(x+offsetX, y, myCustomName+"000");
		
		assertTrue(mp.equals(mp_equal));
		assertFalse(mp.equals(mp2));
		assertFalse(mp.equals(mp3));
		assertFalse(mp.equals(mp4));
	}

}