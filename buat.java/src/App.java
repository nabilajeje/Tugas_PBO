//inheritance dan encapsulation 
class ortu{
    int a;     //klo aksesnya privat hanya bisa di akses di kelas itu sendiri
    
    void print(){    //klo aksenya public bisa si wariskan sampe anak paling bawah
        System.out.println(a);
    }
}

class kk extends ortu{
    void test(){   //fungsi ini akan eror jk punya fungsi yg sama dgn class ortu
        System.out.println();
    }
    
//overriding
    //klo ttp mau punya fungsi yg sama dgn ortu 
    //harus menambahkan dekorator @override tp harus no modifier
    @Override
    void print(){
        System.out.println(a);
    }
//overloading
     void print(int angka){             //boleh membuat banyak fungsi dalam 1 class asalkan parameternya berbeda
        System.out.println("coba2");
    }

    void print(int angka, int asdh){

    }
}

class me extends kk{
    void test(){
        print();
    }
}

class bro extends me{
    void test(){
        print();
       
    }
}


//abstrac
abstract class mtk{     //pake sintak abstrac
    void kali(){}
    void bagi(){}
}

class diskrit extends mtk{
    @Override       //harus di override
    void kali(){

    }
}

public class App extends ortu {
    public static void main(String[] args) throws Exception {
    //overriding 
        //panggil fungsi ortu
        ortu ortu = new ortu();
        ortu.print();
        //panggil fungsi kk
        kk kk = new kk();
        kk.print();
    
    //overloading
        kk.print(5); //jk mau menjalankan bisa memilih parameter

    //abstrac
        //  mtk mtk = new mtk();   //pasti eror karna dia kelas abstrak jd tdk bisa dibikin objek nya
    }
}
