package com.bjpowernode.pojo;

public class Test {
    public static void main(String[] args) {




        Student s1 = new Student();
        s1.setNo("1002");
        s1.setName("王五");
//        s1.setScore(90);
        s1.setScore(100);
        //s1.print();


        Student s2 = new Student();
        s2.setNo("1003");
        s2.setName("赵六");
//        s1.setScore(90);
        s2.setScore(-90);
        //s2.print();



//创建学生对象 和赋值  将值拿到 和sum相加
//        int sum =0;
//        for(int i =1;i<=10;i++){
//            Student stu = new Student();
//            stu.setName("abc"+i);
//            stu.setNo("100"+i);
//            stu.setScore(i*10);
//            //拿到返回值 继续做其他操作
//            sum+=stu.getScore();
//            stu.print();
//        }
//        System.out.println(sum/10);
//
//        //创建对象赋值
//
//        Student[] stus = new Student[30];
//        for(int i=0;i<stus.length;i++){
//            Student stu = new Student();
//            stu.setName("abc"+i);
//            stu.setNo("100"+i);
//            stu.setScore((i+1)*10);
//            stus[i]=stu;
//        }
//        //获取平均值
//        int sum1=0;
//        for(int j=0;j<stus.length;j++){
////            Student ss1 = stus[j];
////            int sc = ss1.getScore();
////            sum1+=sc;
//            sum1+=stus[j].getScore();
//        }
//        System.out.println(sum1/stus.length);


        Student s = new Student();
        s.setNo("1001");
        s.setName("张三");
        //定义变量 将变量的值 赋值给 类中的某个特征
        s.setScore(90);

        //通过方法 对特征进行赋值
        //但是 对象还是可以通过.的方式 给特征赋值
        // 对象可以通过方法赋值 但是不能在直接.到特征
        //s.print();


        //查看其中某个属性的值
//        System.out.println(s.getName());
        //对表示对象的变量直接打印 结果 包名+类名@8位16进制数（地址）   16 0-15
        //toString() 对象的变量打印时  默认调用toString的方法
        System.out.println(s);


//        int a =1;
//        System.out.println(a);


















        Point p = new Point();
        p.x=0;
        p.y=0;
        Point p1 = new Point();
        p1.x=2;
        p1.y=2;

        Car c1 = new Car();
        c1.mark="宝马";
        c1.price=20;
        c1.speed=90;


        Person per = new Person();
        per.age=20;
        per.name="李四";
        per.height=170;








        Cat c = new Cat();
        c.age=1;
        c.length=20;
        c.nikeName="tom";

        Dog d = new Dog();
        d.age=2;
        d.height=40;
        d.name="旺财";




//        int a = 1;
//        System.out.println(a);















//        Info info = new Info();
//        info.name="张三";
//        info.age=13;
//        info.adress="北京";
    }
}
