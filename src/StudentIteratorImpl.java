import java.util.List;

public class StudentIteratorImpl implements StudentIterator{
   private List<Student> list;
   private  int position = 0;
    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        //从集合中获取指定位置
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

}
