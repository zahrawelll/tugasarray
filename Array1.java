import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        String mahasiswa[] = new String[100];
        int nilai[] = new int[100];
        Scanner aril = new Scanner(System.in);
        int i=0;
        int total=0;
        String inputdata;
        do{
            System.out.print("MASUKKAN NAMA MAHASISWA:");
            mahasiswa[i] = aril.nextLine();
            
            System.out.print("MASUKKAN NILAI MAHASISWA:");
            while (!aril.hasNextInt()) {
                System.out.print("Input tidak valid , masukkan nilai: ");
                aril.next();
                
            }
            nilai[i]=aril.nextInt();
            aril.nextLine();
            System.out.print("input data lagi?: (y/n)");
            inputdata = aril.nextLine();
            i++;
        }while(i<mahasiswa.length && inputdata.equalsIgnoreCase("Y"));
        

        System.out.println("daftar mahasiswa:");
        System.out.println("========================================:");
        System.out.printf("%-5s %-30s %-6s %s%n" , "NO", "NAMA MAHASISWA", "NILAI", "STATUS");
        System.out.println("========================================:");    
      
        for (int j = 0; j < i;j++ ) {
           
               String status;
               if (nilai[j] >= 60) {
                status = "lulus";
                } else {
                    status = "tidak lulus";
                    }
                    if (mahasiswa[j] != null) {


                System.out.printf("%-5d %-30s %-6d %s%n", (j + 1), mahasiswa[j], nilai[j], status);
                System.out.println("ratarata  nilai mahasiswa adalah: " + (int) total / nilai.length);
            aril.close();
            System.out.println("==============================================");
            double jumlah =0;
            for (int k = 0; k < nilai.length; k++) {
                for(double num : nilai);
                jumlah += nilai[k];
            }
            System.out.println("jumlah nilai:  " + jumlah);
            double ratarata = jumlah / i;
            System.out.println("ratarata nilai mahasiswa adalah: " + ratarata);

        }
    }
}

    }
