package Serialization;

import java.io.*;
import java.util.Scanner;
public class Serialization_book implements Serializable{
    String b_name,a_name;
    int price;
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book name : ");
        b_name=sc.next();
        System.out.println("Enter Book Author : ");
        a_name=sc.next();
        System.out.println("Enter Book Price : ");
        price=sc.nextInt();
    }
    void display(){
        System.out.println("Book name : "+b_name);
        System.out.println("Book author name : "+a_name);
        System.out.println("Book price : "+price);
    }
    void writeToFile(Object a,String c) throws Exception{
        FileOutputStream z=new FileOutputStream(c);
        ObjectOutputStream x=new ObjectOutputStream(z);
        x.writeObject(a);
    }
    void readFromFile(String a)throws Exception{
        FileInputStream z=new FileInputStream(a);
        ObjectInputStream m=new ObjectInputStream(z);
        Serialization_book y=new Serialization_book();
        y=(Serialization_book) m.readObject();
        y.display();
    }
    void searchFromFile(){}
    public static void main(String[] args) {
        try{
            Serialization_book obj=new Serialization_book();
            obj.get();
            String q,w;
            int choice;
        do{
            Scanner ab=new Scanner(System.in);
            System.out.println("Enter the file name u want to Read/Write object state From/into that");
            String o=ab.next();
            System.out.println("Enter the below choice : ");
            System.out.println("1 store data to file");
            System.out.println("2 read data to file");
            System.out.println("3 search data to file");
            System.out.println("4 Exit");
             choice=ab.nextInt();
            switch (choice){
                case 1 : obj.writeToFile(obj,o);
                        break;
                case 2 : obj.readFromFile(o);
                        break;
                case 3 : obj.searchFromFile();
                        break;
                case 4 : break;
            }
                System.out.println("If u Want to repeat type yes otherwise type no");
                q=ab.next();
        }while (q.equals("yes"));
        }catch (Exception h){
            System.out.println(h);
        }
    }
}