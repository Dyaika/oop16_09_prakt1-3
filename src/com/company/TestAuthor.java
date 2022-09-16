package com.company;

public class TestAuthor {
    public static void test(){
        Author a1 = new Author("Ivan Popov", "ivPopov@somewhere.com", 'M');
        System.out.println(a1);
        a1.setEmail("ivPopov@somewhere.ru");
        System.out.println(a1);
    }
}
