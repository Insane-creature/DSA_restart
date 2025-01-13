// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class practice {
//     public static void main(String[] args) {

//             Animal dog = new Dog();
//             dog.sound(); // Outputs: Dog barks
//             System.out.println(5);
//     }
    
// }

// String s = "*";
        

public class practice {
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            for(int i = 5; i >= j; i--){
                System.out.print("*");    
            }
            System.out.println();
            
        }

        // int i = 2;
        // System.out.println("*".repeat(i));    
        // for(int i = 1; i <= 5; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }    
        //     System.out.println();
        // }
    }
}
            