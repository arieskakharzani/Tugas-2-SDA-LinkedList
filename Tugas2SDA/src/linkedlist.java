import java.util.LinkedList;

//Diketahui nama saya lengkap dengan spasi adalah sebuah LinkedList (ARIESKA KHARZANI)

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> nama = new LinkedList<String>();

        nama.add("A");
        nama.add("R");
        nama.add("I");
        nama.add("E");
        nama.add("S");
        nama.add("K");
        nama.add("A");
        nama.add("");
        nama.add("K");
        nama.add("H");
        nama.add("A");
        nama.add("R");
        nama.add("Z");
        nama.add("A");
        nama.add("N");
        nama.add("I");

        System.out.println("Nama Lengkap\t: "+nama);
        System.out.println("");

//1. add karakter lain yang anda inginkan
        nama.addFirst("Z");
        nama.addLast("S");

        System.out.println("1. Output add karakter baru\t: "+nama);

//2. sisipkan karakter lain yang anda inginkan
        nama.set(4,"A");
        nama.set(5,"N");
        nama.set(6,"A");
        nama.set(8,"G");
        nama.set(9,"R");
        nama.set(10,"A");
        nama.set(11,"N");
        nama.set(12,"D");
        nama.set(13,"E");

        System.out.println("2. Output sisip karakter\t: "+nama);

//3. hapus beberapa karakter yang anda inginkan
        nama.remove(0);
        nama.remove(5);
        nama.remove(12);
        nama.remove(13);

        System.out.println("3. Output remove karakter\t: "+nama);

//4. buat fungsi POP dan PUSH pada project anda
        nama.pop();
        System.out.println("4. Output POP\t: "+nama);

        nama.push("A");
        System.out.println("5. Output PUSH\t: "+nama);
    }
    
}
