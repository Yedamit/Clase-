package img;

public class segundo {
    public static void main(String[] args) {
        
        int salary = 1000;

        //bono

        salary = salary + 200;

        System.out.println(salary);


     salary = salary - 50;
     System.out.println(salary);


     // horas extra 30 peso cada uno 
     // cupon 45 pesos 

     salary = salary + (30*2) - 45;
     System.out.println(salary);
     // cadenas

     String employeName = "jaime tarazona";
     employeName = employeName + " beltran";
     System.out.println(employeName);

     employeName = "Alberto " + employeName;
     System.out.println("Mi nombre es " + employeName);
    }
}
