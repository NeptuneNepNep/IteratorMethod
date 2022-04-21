public class Client {
    public static void main(String[] args) {
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        //添加元素
        aggregate.addStudent(new Student("小明","001"));
        aggregate.addStudent(new Student("小明","002"));
        aggregate.addStudent(new Student("小明","003"));
        aggregate.addStudent(new Student("小明","004"));

        //获取迭代器
        StudentIterator iterator = aggregate.getStudentIterator();
        //获取元素
        System.out.println(iterator.hasNext());
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());

        }

    }
}
