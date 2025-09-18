public class Main9 {

/*
classin icinde static obyekt yaratmaq
Static obyekt oldugu ucun metodun icerisinde onu cagiranda aid oldugu classin adini qeyd etmek lazim gelir
 */
//    public static Student s;
////ve ya
//    public static Student a = new Student();
//
    public static void main(String[] args){
//        Student s = new Student();
//        Main9.s.number = 5;
//        System.out.println(Main9.s.number);
/*
    hemin o static olmayan obyekti cagiraq bu zaman sonsuz dovre giririk cunki Student s obyektinin ozu bir obyekte
    beraberdir ve obyektin ozunu istifade edib obyekt yaratmaga calisanda bu artiq StackOverFlow erroru alir
 */
//            Student s = new Student();

/*
obyektler massive-i
Obyektlerden ibaret massive yaradiriq Student tipinde ve  3 obyekt yaradiriq
 */
        Student[] s = new Student[3];
//     Massive yarananda arxada o massivin tipinde olan bir classin obyekti yaranir. Onu da gormek ucun
//        s.getClass().getName(); //:[LStudent;
//        s[0] = new Student();
//        s[0].number = 4;
//        s[1] = new Student();
//        s[1].number = 5;
//        s[2] = new Student();
//        s[2].number = 6;
//        System.out.println(s[0].number);
//        System.out.println(s[0].number);
//        System.out.println(s[0].number);

//indi bele bir sey edek
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s[0]=s1; // s1-in ref-i her ikisine aid olmus olur. Ona gore birinde bas vermis deyisiklik her ikisine aiddir
        s[0].age=5;
        s[1]=s2; // bunda da eyni
        s[1].age=6;
        s[2]=s3; // bunda da eyni
        s[2].age=7;
        System.out.println(s[0].age); //:5
        System.out.println(s1.age);   //:5
        System.out.println(s3.age);   //:7




    }


}
