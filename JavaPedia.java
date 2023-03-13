
import java.util.Scanner;

public class JavaPedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n $$$$$$$$$$$$ Javapedia $$$$$$$$$$ ");
        System.out.println("Cate Persoane doresti sa introduci? ");

        int people=scan.nextInt();

        String[][] database=new String[people][3];
        scan.nextLine();
        for(int i=0;i<database.length;i++){
            System.out.println("\n Persoane: "+(i+1));
            System.out.print("\t Nume: ");
            database[i][0]= scan.nextLine();
            System.out.print("\t Data de nastere: ");
            database[i][1]= scan.nextLine();
            System.out.print("\t Ocupatie: ");
            database[i][2]=scan.nextLine();
            System.out.print("\n");
        }

        System.out.println("Informatiile introduse sunt: ");
        print2DArray(database);

        System.out.print("\nDespre cine vrei sa afli informatii? ");
        String name=scan.nextLine();
        System.out.print("\n");
        for(int i=0;i<database.length;i++){
            if(database[i][0].equals(name)){
                System.out.println("\tNume: "+database[i][0]);
                System.out.println("\tData nasterii: "+database[i][1]);
                System.out.println("\tOcupatie: "+database[i][2]);
            }
        }
       scan.close();
    }

    public static void print2DArray(String[][] array){
for(int i=0;i<array.length;i++){
    System.out.print("\t");
    for(int j=0;j<array[i].length;j++){
        System.out.print(array[i][j]+" ");      
    }
        System.out.print("\n");
}

    }
    
}
