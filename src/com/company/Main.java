package com.company;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.* ;

/**
 * 块注释
 */
public class Main {

    /**
     * 打印对象
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj){
        System.out.println(String.format("{%d}, %s",index,obj.toString()));
    }

    /**
     * 控制流
     */
    public static void demoControlFlow(){
        String str = "Hello!";
        //foreach遍历数组
        for (char c:str.toCharArray()) {
            print(2,c);
        }

    }

    /**
     * String类
     */
    public static void demoString(){
        String str = "Hello NowCoder!";
        print(1,str.indexOf('e'));
        print(2,str.charAt(6));
        print(3,str.codePointAt(1));
        print(4,str.compareTo("Hello Mcode"));
        print(5,str.compareTo("Hello po"));
        print(6,str.compareToIgnoreCase("hello nowcoder!"));
        print(7,str.concat("@_@"));
        print(8,str.lastIndexOf('d'));
    }

    /**
     * 列表：List的用法
     */
    public static void demoList(){
        List<String> strList = new ArrayList<String>();
        for (int i=0;i<4;i++){
            strList.add(String.valueOf(i*i));
        }
        strList.add(String.valueOf(3));
        print(1,strList);

        Collections.sort(strList);
        print(2,strList);

        //匿名函数：第二个参数可实现逆序或者正序的排列
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(3,strList);

        //倒序排列
        Collections.reverse(strList);
        print(4,strList);
    }

    /**
     * 集合：Set的用法
     */
    public static void demoSet(){
        Set<String> strSet = new HashSet<String>();
        for(int i=0;i<3;i++){
            strSet.add(String.valueOf(i*i));
            strSet.add(String.valueOf(i*i));
            strSet.add(String.valueOf(i*i));
        }
        print(1,strSet);
        //批量加入到集合中
        strSet.addAll(Arrays.asList(new String[]{"A","B","C","A"}));
        print(2,strSet);
        //for遍历
        for (String s:strSet) {
            print(3,s);
        }
        print(4,strSet.size());
    }

    public static void demoKeyValue(){
        Map<String,String> map = new HashMap<String, String>();
        for(int i=0;i<4;i++){
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        print(1,map);

        for (Map.Entry<String,String> entry : map.entrySet()) {
            print(2,entry.getKey() + ":"+entry.getValue());
        }
    }

    /**
     * 异常处理
     */
    public static void demoException() {
        try {
            print(1,"Hello");
            int b=2;
            b=b/0;
            String a=null;
            a.indexOf('a');
        }catch (NullPointerException npe){
            print(3,"NPE");
        }catch (Exception e){
            print(4,"Exception");
        }finally {
            print(2,"finally");
        }
    }

    /**
     * Java通用的类
     */
    public static void demoCommon(){
        //随机数
        Random random = new Random();

        //日期类
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-d HH:mm:ss");
        print(1,date);
        print(2,date.getTime());
        print(3,df.format(date));
        print(4,DateFormat.getDateInstance(DateFormat.FULL).format(date));

        print(5,UUID.randomUUID());

        //数学类
        print( 6,Math.ceil(2.5));

    }



    public static void demoClass(){
        Animal animal = new Animal("Jim",12);
        animal.say();

        animal = new Human("Lei",23,"china");
        animal.say();
    }


    public static void GitTest(){
        System.out.println("更新测试");
    }



    //static：静态函数
    public static void main(String[] args) {
	    // write your code here
        //System.out.println("Hello World");

        //print(1,"Hello Nowcoder!");
        //demoControlFlow();
        //demoString();
        //demoList();
        //demoSet();
        //demoKeyValue();
        //demoException();
        //demoCommon();
        demoClass();
        GitTest();

        System.out.println("更新后提交");

    }


}
