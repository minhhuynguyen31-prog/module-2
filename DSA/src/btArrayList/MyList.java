package btArrayList;

import org.w3c.dom.Node;

import java.util.Arrays;

public class MyList <E>{
    private int size =0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
       if(capacity>=0){
           elements=new Object[capacity];
       }else {
           throw new IllegalArgumentException("kich thuoc khong hop le"+capacity);
       }
    }
    public void add(E e, int index){
    if(index<0 || index>size){
        throw new IllegalArgumentException("Index: \" + index + \", Size: \" + size");
    }ensureCapacity(size+1);
    System.arraycopy(elements,index,elements,index+1,size-index);
    elements[index]=e;
    size++;
    }
    public E remove(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E oldValue=(E)elements[index];
        int numMoved = size-index-1;
        if(numMoved>0){
            System.arraycopy(elements,index+1,elements,index,numMoved);
        }
        elements[--size]=null;
        return oldValue;
    }
    public int size(){
        return size;
    }
    @SuppressWarnings("unchecked")
    public Object clone() {
        try {
            MyList<E> v = (MyList<E>) super.clone();
            v.elements = Arrays.copyOf(elements, size);
            return v;
        } catch (CloneNotSupportedException e) {
            // Vì chúng ta không implements Cloneable nên có thể dùng cách tạo thủ công dưới đây để an toàn:
            MyList<E> cloneList = new MyList<>(size);
            cloneList.elements = Arrays.copyOf(this.elements, this.size);
            cloneList.size = this.size;
            return cloneList;
        }
    }
    public boolean contains(E o){
        return indexOf(o)!=-1;
    }
    public int indexOf(E o){
        if(o==null){
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) return i;
            }
        }
        return -1 ;
    }
    public boolean add(E e){
        ensureCapacity(size+1);
        elements[size++]=e;
        return true;
    }
   public void ensureCapacity(int minCapacity){
    if(minCapacity<elements.length){
        int newSize=elements.length*2;
        if(newSize<minCapacity){
            newSize=minCapacity;
        }
        elements= Arrays.copyOf(elements,newSize);
    }
   }
   public E get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E)elements[index];
   }
   public void clear(){
       for (int i = 0; i < size; i++) {
           elements[i] = null;
       }
       size = 0;
   }

}
