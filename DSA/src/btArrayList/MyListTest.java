package btArrayList;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {
    private MyList<String> list;
    @BeforeEach
    void setUp() {
        list = new MyList<>();
    }
    @org.junit.jupiter.api.Test
    void add() {
        assertTrue(list.add("Java"));
        assertTrue(list.add("Python"));
        assertEquals(2, list.size());
        assertEquals("Java", list.get(0));
        assertEquals("Python", list.get(1));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Xóa phần tử ở giữa
        String removed = list.remove(1); // Xóa "Python"
        assertEquals("Python", removed);
        assertEquals(2, list.size());
        assertEquals("C++", list.get(1)); // "C++" bị đẩy sang trái

        // Kiểm tra ném ngoại lệ khi xóa index không tồn tại
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(5);
        });
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(0, list.size());
        list.add("Java");
        assertEquals(1, list.size());
    }

    @org.junit.jupiter.api.Test
    void testClone() {
        list.add("Java");
        list.add("Python");

        MyList<String> clonedList = (MyList<String>) list.clone();

        // Kiểm tra bản sao có dữ liệu giống bản gốc không
        assertEquals(list.size(), clonedList.size());
        assertEquals(list.get(0), clonedList.get(0));
        assertEquals(list.get(1), clonedList.get(1));

        // Kiểm tra tính độc lập (thay đổi bản sao không ảnh hưởng bản gốc)
        clonedList.add("C++");
        assertNotEquals(list.size(), clonedList.size());
    }

    @org.junit.jupiter.api.Test
    void contains() {
        list.add("Java");
        assertTrue(list.contains("Java"));
        assertFalse(list.contains("PHP"));
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        list.add("Java");
        list.add("Python");
        list.add("Java");

        assertEquals(0, list.indexOf("Java")); // Trả về vị trí đầu tiên tìm thấy
        assertEquals(1, list.indexOf("Python"));
        assertEquals(-1, list.indexOf("Ruby"));
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        assertTrue(list.add("Java"));
        assertTrue(list.add("Python"));
        assertEquals(2, list.size());
        assertEquals("Java", list.get(0));
        assertEquals("Python", list.get(1));
    }

    @org.junit.jupiter.api.Test
    void ensureCapacity() {
        for (int i = 0; i < 11; i++) {
            list.add("Element " + i);
        }
        assertEquals(11, list.size());
        assertEquals("Element 10", list.get(10));
    }

    @org.junit.jupiter.api.Test
    void get() {
        list.add("Java");
        assertEquals("Java", list.get(0));

        // Kiểm tra ném ngoại lệ khi get index không hợp lệ
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(-1);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(1);
        });
    }

    @org.junit.jupiter.api.Test
    void clear() {
        list.add("Java");
        list.add("Python");

        list.clear();

        assertEquals(0, list.size());
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(0);
        });
    }
}