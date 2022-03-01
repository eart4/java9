package animals;

import java.lang.reflect.Constructor;

public class Dog {
    
       private String name ;
       private int age;
       private double weight;
      
        public Dog(String name, int age, double weight){
          setName(name);
          setAge(age);
          
        }

          
      


      

      public void setName(String name){
            if (name.isEmpty())
            System.out.println("Введенно некорректное имя");
            else{
            System.out.println("Имя записанно");
          this.name = name;
          
            }
      }

      public String getName() {
          return name;
      }

    public void setAge(int age) {
        if (age <= 0 && age >= 16 )
    
          System.out.println("Вы ввели неправельный возраст");
        else {
          System.out.println("Вы успешно ввели возраст");
        }

        this.age = age;
    }
      
       public int getAge() {
           return age;
       }
    }
    

