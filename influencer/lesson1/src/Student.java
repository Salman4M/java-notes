import java.util.Scanner;

public class Student {

    /*
    bu bir nov pythondaki class atribute-na benzeyir, Yeni attributelarin bir deyeri olur. butun attributelar
    class- aiddir. Hec bir obyekte aid ola bilmez,cunki obyekt yaratmir. Yeni deyisenlerin deyerleri statikdir
    Java-da bu o demekdir ki, Student classimizin 3 deyiseni var ve 3-u de clasimizin yaddasinda yer tutur
     */

    public static String name;
    public static String surname;
    public static int age;
    /*
    static olmayan methodun icerisinde static deyisen cagirmaq mumkundur. Amma eksini etmek mumkun deyil(
    yeni static methodda static olmayan deyisen istifade etmek mumkun deyil ) Eyni qayda pythonda da kecerlidi
    yeni initdeki (instance) attributelari class obyekti yaradib cagida bilirik,amma classin ozunden hemin
    attributelari cagira bilmirik.
    */
    public static void calculate(){
    }


/*
bu ise Student classinda bele deyisenler oldugunu amma classin yaddasinda yer tutmadigini gosterir.
Yeni her biri ayri bir yaddas sahesi tutur. Bu da pythondaki instance attribute-na benzeyir,( hansi ki
init metodunda teyin edirdik ve classi cagirdigimizda bu attributelarin deyerlerini classda teyin etmeliydik)
Yeni her student obyekti yaratdigimizda bu attributelar her obyektde userden gelen deyere uygun olacaq.
Yeni override deye bir sey bas vermeyecek (misal ucun iki ferqli student1 ve student2 obyektlerinin
attributelarinin deyerleri bir birile elaqesiz olacaq. Yaddasda tutduqlari yer muxtelif olur deyerler eyni olsa bele
deyek ki ikisinin de height-i 180 di. Bir biri ile elaqesizdirler). Yeni deyer dinamikdir
(digerinde ise adindan melum oldugu kimi staticdir)
 */

    public int number;
    public int height;
    public String address;


    public void PrintThemFunc(){
        System.out.println(number+ " " + height + " " +address);
    }

    /*
    indi ise bir classa aid metod istifade ederek icerisinde Student tipinde obyekt yaradib ve attributelarina
    avtomatik olaraq userden gelen deyerleri otururuk ve herdefe obyekten attribute-u cagirib tek tek deyer
    oturmeyimize ehtiyac qalmasin
     */
    public static Student TakeAndGiveBack(){
        Student new_obj = new Student();
        new_obj.number = new Scanner(System.in).nextInt();
        new_obj.height = new Scanner(System.in).nextInt();
        new_obj.address = new Scanner(System.in).nextLine();
        /*
        ayrica olaraq static metodda static olmayan obyektin attribute-ni  cagira bilmerik
        (amma eksini edebilerik)
        Non-static field 'height' cannot be referenced from a static context
        System.out.println(height);
         */

        return new_obj;
    }
    /*
    classin icinde static obyekt yaratmaq (Main9) Biz eyni adli classin ozunden de obyekt yarada bilerik
     */
//    public static Student s;
//    //
//    public static Student a = new Student();
//
//
//    public static void main(String[] args){
//        Student.s = new Student();
//        Student.s.number = 5;
//        System.out.println(Student.s.number);
//    }
/*
bele bir sey yoxlayaq.Static olmayan obyekt yaradaq ve bunu main9-da istifade etmeye calisaq
 */
//    public Student s = new Student();

}
