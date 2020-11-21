package com.company;

public class Book {
    public String Title;
    public String Author;
    public short YearPublished;
    public int NumberOfPages;
    public String CoverType;
}

class Excercise {
     public  static void main(String[] args)
    {
        Book First = new Book();
        First.Title = "Turbo C ";
        First.Author = "Robert Lafore";
        First.YearPublished = 1996;
        First.NumberOfPages = 872;
        First.CoverType = "H";
        System.out.println("MUZAMIL JAMIL CHANNA");
        System.out.println("Book Characteristics");
        System.out.print ("Title: ");
        System.out.println (First.Title);
        System.out.print ("Author:");
        System.out.println (First.Author);
        System.out.print("Year:");
        System.out.println (First.YearPublished);
        System.out.print ("Pages: ");
        System.out.println (First.NumberOfPages);
        System.out.print("Cover:");
        System.out.println (First.CoverType);
    }

}
